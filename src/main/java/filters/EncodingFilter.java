package filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class EncodingFilter implements Filter {

    private String encoding = "UTF-8";

    @Override
    public void init(FilterConfig filterConfig) {
        String enc = filterConfig.getInitParameter("encoding");
        if (enc != null)
            encoding = enc;
        System.out.println("[EncodingFilter] Initialized with encoding = " + encoding);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        long start = System.currentTimeMillis();

        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);

        if (request instanceof HttpServletRequest req) {
            String uri = req.getRequestURI();
            String method = req.getMethod();
            String query = req.getQueryString();

            System.out.printf("[EncodingFilter - BEFORE] %s %s%s%n",
                    method, uri, query != null ? "?" + query : "");
        }

        chain.doFilter(request, response);

        if (request instanceof HttpServletRequest req && response instanceof HttpServletResponse res) {
            long duration = System.currentTimeMillis() - start;
            System.out.printf("[EncodingFilter - AFTER] %s %s (Status: %d, Duration: %d ms)%n\n",
                    req.getMethod(), req.getRequestURI(), res.getStatus(), duration);
        }
    }

    @Override
    public void destroy() {
        System.out.println("[EncodingFilter] Destroyed.");
    }
}
