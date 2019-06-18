<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품목록조회화면</title>
</head>
<body>
<c:url var="action_mapping" value="/selectList.do"></c:url>
<form:form commandName="productVO" action="${action_mapping}">
	<div><spring:message code="product.id"/>: <form:input path="id" maxlength="10"/></div>
	<div><spring:message code="product.name"/>: <form:input path="name" /></div>
	<div><spring:message code="product.country"/>: <form:input path="country" /></div>
	<div><spring:message code="product.price"/>: <form:input path="price" /></div>
	<div><spring:message code="product.volume"/>: <form:input path="volume" /></div>
	<input type="submit" value="조회"/>
</form:form>
</body>
</html>