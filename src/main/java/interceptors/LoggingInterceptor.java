package interceptors;

import org.apache.struts2.ActionInvocation;
import org.apache.struts2.interceptor.Interceptor;

public class LoggingInterceptor implements Interceptor {

    @Override
    public void destroy() {
    }

    @Override
    public void init() {
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        String actionName = invocation.getProxy().getActionName();
        System.out.println("LoggingInterceptor - before action: " + actionName);

        String result = invocation.invoke();

        System.out.println("LoggingInterceptor - after action: " + actionName + " -> " + result);
        return result;
    }
}
