<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title> Insert title here </title>
</head>
<body>

	<s:url action="messaggio" var="formalMex">
		<s:param name="tipo">cortese</s:param>
	</s:url>
	<s:url action="messaggio" var="dailyMex">
		<s:param name="tipo">cordiale</s:param>
	</s:url>
	<s:url action="messaggio" var="idiomMex">
		<s:param name="tipo">locale</s:param>
	</s:url>
	
	<h4>Selezionare la categoria di saluto che si desidera:</h4>
	<p>
		
		<a href="${formalMex}" >Formale</a>	  <br/>
		
		<a href="${dailyMex}" >Informale</a>  <br/>
		
		<a href="${idiomMex}" >Dialetto</a>   <br/>
		
	</p>
</body>
</html>