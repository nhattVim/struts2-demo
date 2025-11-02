<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:set var="title" value="'Đăng nhập'"/>
<%@ include file="/views/layouts/header.jsp" %>

<div class="card">
  <div class="card-body">
    <p>Đây là trang Login. Vì chưa đăng nhập nên dù truy cập trang nào bạn cũng sẽ redirect về trang này. Thử đăng nhập bằng username <code>admin</code> password <code>123</code>.</p>
    <h4 class="card-title">Login</h4>
    <s:form action="doLogin" method="post" theme="simple">
      <div class="mb-3">
        <label class="form-label">Username</label>
        <s:textfield name="username" cssClass="form-control" />
      </div>
      <div class="mb-3">
        <label class="form-label">Password</label>
        <s:password name="password" cssClass="form-control" />
      </div>
      <s:submit value="Login" cssClass="btn btn-primary" />
    </s:form>
  </div>
</div>

<%@ include file="/views/layouts/footer.jsp" %>
