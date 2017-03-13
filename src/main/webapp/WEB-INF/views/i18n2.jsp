<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<title>Title</title>
</head>
<body>
<fmt:message key="i18n.password"></fmt:message><br>
<spring:message code="i18n.password" />
<br><br>
<a href="i18n">I18N PAGE</a>
<br><br>
<a href="i18n2?locale=zh_CN">中文</a>
<br><br>
<a href="i18n2?locale=en_US">英文</a>
</body>
</html>
