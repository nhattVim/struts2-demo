<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:set var="title" value="'Giới thiệu'"/>
<%@ include file="/views/layouts/header.jsp" %>

<div class="container mt-4">
  <h2>Về chúng tôi</h2>
  <p>Website này được xây dựng bằng <strong>Apache Struts 2</strong> và <strong>Bootstrap 5</strong>.</p>
  <p>Mục đích: demo kiến trúc MVC với interceptor, layout và bảo mật đăng nhập.</p>
</div>

<%@ include file="/views/layouts/footer.jsp" %>
