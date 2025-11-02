package actions;

import java.util.List;

import org.apache.struts2.ActionSupport;

import dao.NewsDAO;
import models.News;

public class HomeAction extends ActionSupport {

    private List<News> newsList;

    @Override
    public String execute() {
        newsList = NewsDAO.getAll();
        return SUCCESS;
    }

    public List<News> getNewsList() {
        return newsList;
    }
}
