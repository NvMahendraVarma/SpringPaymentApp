<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>

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

        .form-container h1 {
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
        <h1>Registration</h1>        
        <form action="/registerUser" method="post">
            <div class="form-group mb-3">
                <label for="username">Username :</label>
                <input type="text" name="username" class="form-control" required>
            </div>
            <div class="form-group mb-3">
                <label for="password">Password :</label>
                <input type="password" name="password" class="form-control" required>
            </div>
            <div class="form-group mb-3">
                <label for="first_name">Firstname :</label>
                <input type="text" id="first_name" name="firstName" class="form-control" required>
            </div>
            <div class="form-group mb-3">
                <label for="last_name">Lastname :</label>
                <input type="text" id="last_name" name="lastName" class="form-control" required>
            </div>
            <div class="form-group mb-3">
                <label for="phone">Phone :</label>
                <input type="text" id="phone" name="phone" class="form-control" required>
            </div>
            <div class="form-group mb-3">
                <label for="email">Email :</label>
                <input type="text" name="email" class="form-control" required>
            </div>
            <div class="form-group mb-3">
                <label for="address">Address :</label>
                <input type="text" id="address" name="address" class="form-control" required>
            </div>
            <div class="form-group mb-3">
                <label for="wallet_pin">Wallet pin :</label>
                <input type="text" id="wallet_pin" name="walletPin" class="form-control" required>
            </div>
            <div class="mb-3">
                <button type="submit" class="btn btn-primary">Register</button>
            </div>
        </form>

        <p class="text-center mt-3">Already have an account? <a href="/login">Login here</a></p>  
    </div>

</body>
</html>
