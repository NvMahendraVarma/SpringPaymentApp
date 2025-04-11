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
		        <label for="user_name">Username :</label>
		        <input type="text" id="user_name" name="username" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="password">Password :</label>
		        <input type="password" name="password" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="first_name">Firstname :</label>
		        <input type="text" id="first_name" name="firstName" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="last_name">Lastname :</label>
		        <input type="text" id="last_name" name="lastName" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="phone">Phone :</label>
		        <input type="text" id="phone" name="phone" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="email">Email :</label>
		        <input type="text" id="email" name="email" class="form-control" required>
		    </div>
		    <div class="form-group">
		        <label for="user_name">Address</label>
		        <input type="text" id="" name="username" class="form-control" required>
		    </div>
		    <div>
		    	<label for="user_name">Wallet pin :</label>
		        <input type="text" id="wallet_pin" name="walletPin" class="form-control" required>
		    </div>
		    <div>
		    	<button type="submit" class="btn btn-primary">Register</button>
		    </div>
		</form>
	<p class="text-center mt-3">Already have an account ?<a href="/login">Login here</a></p>	
</body>
</html>