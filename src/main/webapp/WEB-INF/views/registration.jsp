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
			<div class="form-group">
		        <label for="user_name">Username:</label>
		        <input type="text" id="user_name" name="username" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="user_name">Password:</label>
		        <input type="password" name="password" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="user_name">Firstname:</label>
		        <input type="text" id="user_name" name="username" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="user_name">Lastname:</label>
		        <input type="text" id="user_name" name="username" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="user_name">phone:</label>
		        <input type="text" id="user_name" name="username" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="user_name">Username:</label>
		        <input type="text" id="user_name" name="username" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="user_name">Username:</label>
		        <input type="text" id="user_name" name="username" class="form-control" required>
		    </div>
	    <input type="password"  placeholder="Password" required/>
	    <input type="text" name="firstName" placeholder="First Name" required/>
	    <input type="text" name="lastName" placeholder="Last Name" required/>
	    <input type="text" name="phone" placeholder="Phone" required/>
	    <input type="email" name="email" placeholder="Email" required/>
	    <input type="text" name="address" placeholder="Address" required/>
    	<button type="submit">Register</button>
	</form>
	<p class="text-center mt-3">Already have an account ?<a href="/login">Login here</a></p>	
    
</body>
</html>