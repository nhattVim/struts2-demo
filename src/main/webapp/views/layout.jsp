<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title><s:property value="%{title}"/> - Demo Struts2</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
  <style>
    body { padding-top: 60px; }
    .container { max-width: 900px; }
  </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
  <div class="container">
    <a class="navbar-brand" href="<s:url action='home'/>">Struts2 Demo</a>
    <div class="collapse navbar-collapse">
      <ul class="navbar-nav ms-auto">
        <li class="nav-item"><a class="nav-link" href="<s:url action='home'/>">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="about.action">Giới thiệu</a></li>
        <li class="nav-item"><a class="nav-link" href="contact.action">Liên hệ</a></li>
        <s:if test="#session.user != null">
            <li class="nav-item"><a class="nav-link" href="<s:url action='logout'/>">Logout (<s:property value="#session.user"/>)</a></li>
        </s:if>
        <s:else>
            <li class="nav-item"><a class="nav-link" href="<s:url action='login'/>">Login</a></li>
        </s:else>
      </ul>
    </div>
  </div>
</nav>

<div class="container">
  <s:if test="hasActionErrors()">
    <div class="alert alert-danger">
      <s:actionerror/>
    </div>
  </s:if>

  <div class="content">
    <%-- Include the view body --%>
    <jsp:include page="${page}" />
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
