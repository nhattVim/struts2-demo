package interceptors;

import jakarta.servlet.http.HttpServletRequest;

import org.apache.struts2.ActionInvocation;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.Interceptor;

public class AuthInterceptor implements Interceptor {

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        String user = (String) request.getSession().getAttribute("user");

        // Nếu chưa đăng nhập và action không phải login/doLogin
        String actionName = invocation.getProxy().getActionName();
        if (user == null && !actionName.equals("login") && !actionName.equals("doLogin")) {
            System.out.println("AuthInterceptor: Unauthorized access to " + actionName);
            return "login";
        }

        return invocation.invoke();
    }
}
