<!-- JSP가 생성할 문서의 MIME 타입과 문자 코드를 지정한다. -->
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Home </title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime }. </P>
<P>  서버상의  현재 시간은  ${serverTime }입니다.</P>
</body>
</html>
