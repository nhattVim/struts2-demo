<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:set var="title" value="'Đăng nhập'"/>
<%@ include file="/views/layouts/header.jsp" %>

<div class="d-flex justify-content-center align-items-center" style="min-height: 80vh;">
  <div class="card shadow-lg p-4" style="width: 100%; max-width: 420px;">
    <div class="text-center mb-4">
      <h3 class="fw-bold text-primary mb-4">Đăng nhập</h3>
      <p class="text-muted">
        Sử dụng tài khoản: <code>admin</code> / <code>123</code>
      </p>
    </div>

    <s:if test="hasActionErrors()">
      <div class="alert alert-danger">
        <s:actionerror />
      </div>
    </s:if>

    <s:form action="doLogin" method="post" theme="simple">
      <div class="mb-3">
        <label class="form-label fw-semibold">Tên đăng nhập</label>
        <s:textfield name="username" cssClass="form-control" placeholder="Nhập username..." />
      </div>
      <div class="mb-3">
        <label class="form-label fw-semibold">Mật khẩu</label>
        <s:password name="password" cssClass="form-control" placeholder="Nhập mật khẩu..." />
      </div>
      <div class="d-grid">
        <s:submit value="Đăng nhập" cssClass="btn btn-primary btn-lg" />
      </div>
    </s:form>

    <hr class="my-4">
    <p class="text-center text-muted small mb-0">
      © Struts2 Demo App
    </p>
  </div>
</div>

<%@ include file="/views/layouts/footer.jsp" %>
