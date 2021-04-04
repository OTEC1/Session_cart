<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div  style="margin-left: auto; width:100px; margin-right: auto; margin-top: 100px">
		<form action="send"  method="post">
			<table>
			<tr>
			<td>
			
				<input name="m1"/>
			</td>
			</tr>
			
			
			<tr>
			<td>
			
				<input type="submit"/>
			</td>
			</tr>
			
			
			<tr>
			<td>
			
			<h5 align="center">${ID}</h5>
			</td>
			</tr>
			</table>
		</form>	
		
		<div  style="margin-left: auto; margin-right: auto;">
		    <form action="send"  method="get">
				<input type="submit"  value="View Cart"/>
				<br/>
			</form>
		</div>
		

</div>


</body>
</html>