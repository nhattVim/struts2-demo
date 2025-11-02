<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:set var="title" value="'Chi tiết tin tức'"/>
<%@ include file="/views/layouts/header.jsp" %>

<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-lg-8">

      <!-- Tiêu đề -->
      <h1 class="mb-3 fw-bold text-center">
        <s:property value="newsTitle"/>
      </h1>

      <!-- Ảnh minh họa -->
      <div class="text-center mb-4">
        <img src="<s:property value='newsImage'/>" alt="Ảnh minh họa" 
             class="img-fluid rounded shadow-sm" style="max-height: 400px; object-fit: cover;">
      </div>

      <!-- Tóm tắt -->
      <p class="lead text-secondary text-center mb-4">
        <s:property value="newsSummary"/>
      </p>

      <!-- Nội dung chính -->
      <div class="fs-5 lh-lg" style="white-space: pre-line; text-align: justify;">
        <s:property value="newsContent"/>
      </div>

      <!-- Nút quay lại -->
      <div class="text-center mt-5">
        <a href="home.action" class="btn btn-outline-primary px-4 py-2">
          ← Quay lại Trang chủ
        </a>
      </div>

    </div>
  </div>
</div>

<%@ include file="/views/layouts/footer.jsp" %>
