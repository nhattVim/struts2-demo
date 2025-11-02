
package actions;

import org.apache.struts2.ActionSupport;
import org.apache.struts2.interceptor.parameter.StrutsParameter;

import dao.NewsDAO;
import models.News;

public class NewsDetailAction extends ActionSupport {

    private int id;
    private News news;

    @Override
    public String execute() {
        news = NewsDAO.getById(id);
        if (news == null)
            return ERROR;
        return SUCCESS;
    }

    @StrutsParameter
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNewsTitle() {
        return (news != null) ? news.getTitle() : "";
    }

    public String getNewsImage() {
        return (news != null) ? news.getImage() : "";
    }

    public String getNewsSummary() {
        return (news != null) ? news.getSummary() : "";
    }

    public String getNewsContent() {
        return (news != null) ? news.getContent() : "";
    }
}
