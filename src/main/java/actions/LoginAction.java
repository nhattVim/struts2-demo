package actions;

import org.apache.struts2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.parameter.StrutsParameter;

import jakarta.servlet.http.HttpServletRequest;

public class LoginAction extends ActionSupport {

    private String username;
    private String password;

    @Override
    public String input() {
        return INPUT;
    }

    @Override
    public String execute() {
        HttpServletRequest request = ServletActionContext.getRequest();

        if ("admin".equals(username) && "123".equals(password)) {
            request.getSession().setAttribute("user", username);
            return SUCCESS;
        } else {
            addActionError("Sai username/password");
            return ERROR;
        }
    }

    public String getUsername() {
        return username;
    }

    @StrutsParameter(depth = 1)
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    @StrutsParameter(depth = 1)
    public void setPassword(String password) {
        this.password = password;
    }
}
