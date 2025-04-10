<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="/css/styles.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h2>Login Form</h2>
	<form method="post" action="/loginForm">
	    <div class="form-group">
	        <label for="user_name">Username:</label>
	        <input type="text" id="user_name" name="user_name" class="form-control" required>
	    </div>
	    <div class="form-group">
	        <label for="password">Password:</label>
	        <input type="password" id="password" name="password" class="form-control" required>
	    </div>
	    <button type="submit" class="btn btn-primary">Login</button>
	</form>
	<!-- Error Message -->
	<c:if test="${not empty errorMessage}">
	
		<p style="color: red;">${errorMessage}</p>
	</c:if>	
    <p class="text-center mt-3">New user ? <a href="/registration">Register here</a></p>  
</body>
</html>
