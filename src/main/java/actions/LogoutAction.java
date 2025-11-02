package actions;

import org.apache.struts2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import jakarta.servlet.http.HttpServletRequest;

public class LogoutAction extends ActionSupport {

    @Override
    public String execute() {
        HttpServletRequest request = ServletActionContext.getRequest();
        request.getSession().invalidate();
        return SUCCESS;
    }
}
