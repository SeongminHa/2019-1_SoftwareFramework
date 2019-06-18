<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품등록결과화면</title>
</head>
<body>
<h1>상품이 등록되었습니다!</h1>
<a href='<c:url value="/insert.do" />'>상품등록</a>
<a href='<c:url value="/update.do" />'>상품수정</a>
<a href='<c:url value="/delete.do" />'>상품삭제</a>
<a href='<c:url value="/select.do" />'>상품개별조회</a>
<a href='<c:url value="/selectList.do" />'>상품목록조회</a>
<a href='<c:url value="/selectLike.do" />'>상품검색</a>
</body>
</html>

