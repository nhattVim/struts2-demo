
package actions;

import org.apache.struts2.ActionSupport;
import org.apache.struts2.interceptor.parameter.StrutsParameter;

public class ContactAction extends ActionSupport {

    private String name;
    private String email;
    private String message;

    @Override
    public String execute() {
        if (name == null || email == null || message == null) {
            return INPUT;
        }

        System.out.println("📩 Contact from " + name + " (" + email + "): " + message);
        addActionMessage("Cảm ơn bạn đã liên hệ! Chúng tôi sẽ phản hồi sớm nhất.");

        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    @StrutsParameter
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @StrutsParameter
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    @StrutsParameter
    public void setMessage(String message) {
        this.message = message;
    }
}
