<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:set var="title" value="'Trang chủ'"/>
<%@ include file="/views/layouts/header.jsp" %>

<div class="container mt-4">
  <h2 class="mb-4">📰 Tin mới nhất</h2>
  <p>Đây là trang home, bạn truy cập được vào trang này vì đã đăng nhập, hãy thử Logout và tìm cách vào trang này</p>
  <div class="row">
    <s:iterator value="newsList">
      <div class="col-md-4 mb-3">
        <div class="card h-100">
          <img src="<s:property value='image'/>" class="card-img-top" alt="">
          <div class="card-body">
            <h5 class="card-title"><s:property value="title" /></h5>
            <p class="card-text text-muted"><s:property value="summary" /></p>
            <s:url var="detailUrl" action="newsDetail">
              <s:param name="id" value="%{id}" />
            </s:url>
            <a href="<s:property value='%{#detailUrl}'/>" class="btn btn-primary btn-sm">Xem thêm</a>
          </div>
        </div>
      </div>
    </s:iterator>
  </div>
</div>

<%@ include file="/views/layouts/footer.jsp" %>
