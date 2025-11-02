<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:set var="title" value="'Liên hệ'"/>
<%@ include file="/views/layouts/header.jsp" %>

<div class="container mt-4">
  <h2>Liên hệ với chúng tôi</h2>

  <s:if test="hasActionMessages()">
    <div class="alert alert-success"><s:actionmessage/></div>
  </s:if>

  <s:form action="contact" method="post" cssClass="mt-3" theme="simple">
    <div class="mb-3">
      <label class="form-label">Họ tên</label>
      <s:textfield name="name" cssClass="form-control" />
    </div>
    <div class="mb-3">
      <label class="form-label">Email</label>
      <s:textfield name="email" cssClass="form-control" />
    </div>
    <div class="mb-3">
      <label class="form-label">Nội dung</label>
      <s:textarea name="message" cssClass="form-control" rows="4"/>
    </div>
    <s:submit value="Gửi liên hệ" cssClass="btn btn-primary" />
  </s:form>
</div>

<%@ include file="/views/layouts/footer.jsp" %>
