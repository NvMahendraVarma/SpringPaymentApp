<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Internal Styles -->
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Arial', sans-serif;
        }

        .form-container {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            margin: 20px auto;
            max-width: 600px;
        }

        .form-container h2 {
            color: #28a745;
            margin-bottom: 20px;
            text-align: center;
        }

        .form-group label {
            color: #495057;
            font-weight: bold;
        }

        .form-control {
            border-radius: 5px;
            border: 1px solid #ced4da;
            padding: 10px;
            width: 100%;
            box-sizing: border-box;
        }

        .form-control:focus {
            border-color: #28a745;
            box-shadow: 0 0 5px rgba(40, 167, 69, 0.5);
        }

        .btn-primary {
            background-color: #28a745;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 5px;
            width: 100%;
            color: white;
            cursor: pointer;
        }

        .btn-primary:hover {
            background-color: #218838;
        }

        p.text-center a {
            color: #28a745;
            font-weight: bold;
        }

        p.text-center a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <div class="form-container">
        <h2>Login</h2>
        <form method="post" action="/loginForm">
            <div class="form-group mb-3">
                <label for="user_name">Username:</label>
                <input type="text" id="user_name" name="user_name" class="form-control" required>
            </div>
            <div class="form-group mb-3">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>

        <!-- Error Message -->
        <c:if test="${not empty errorMessage}">
            <p style="color: red;" class="mt-3 text-center">${errorMessage}</p>
        </c:if>

        <p class="text-center mt-3">New user? <a href="/registration">Register here</a></p>  
    </div>

</body>
</html>
