package interceptors;

import org.apache.struts2.ActionInvocation;
import org.apache.struts2.interceptor.Interceptor;

public class LoggingInterceptor implements Interceptor {

    @Override
    public void init() {
        System.out.println("[LoggingInterceptor] Initialized.");
    }

    @Override
    public void destroy() {
        System.out.println("[LoggingInterceptor] Destroyed.");
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        String actionName = invocation.getProxy().getActionName();
        String namespace = invocation.getProxy().getNamespace();
        String method = invocation.getProxy().getMethod();
        Object action = invocation.getAction();

        long start = System.currentTimeMillis();
        System.out.printf("[LoggingInterceptor - BEFORE] namespace=%s, action=%s, method=%s, class=%s%n",
                namespace, actionName, method, action.getClass().getSimpleName());

        String result = invocation.invoke();

        long duration = System.currentTimeMillis() - start;
        System.out.printf("[LoggingInterceptor - AFTER] action=%s -> result=%s (Duration: %d ms)%n",
                actionName, result, duration);

        return result;
    }
}
