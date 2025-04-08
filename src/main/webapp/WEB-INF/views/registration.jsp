<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration</h1>		
		<form action="/registerUser" method="post">
	    <input type="text" name="username" placeholder="Username" required/>
	    <input type="password" name="password" placeholder="Password" required/>
	    <input type="text" name="firstName" placeholder="First Name" required/>
	    <input type="text" name="lastName" placeholder="Last Name" required/>
	    <input type="text" name="phone" placeholder="Phone" required/>
	    <input type="email" name="email" placeholder="Email" required/>
	    <input type="text" name="address" placeholder="Address" required/>
    	<button type="submit">Register</button>
	</form>
		
    
</body>
</html>