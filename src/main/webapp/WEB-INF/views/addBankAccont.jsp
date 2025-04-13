<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Link Bank Account</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

    <!-- Internal Styles -->
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Arial', sans-serif;
        }

        .header {
            background-color: #28a745;
            color: white;
            padding: 20px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        .header h1 {
            margin: 0;
        }

        #userSection {
            display: flex;
            justify-content: space-between;
            align-items: center;
            width: 100%;
        }

        #welcomeUser {
            flex-grow: 1;
            text-align: left;
        }

        #logoutButton {
            margin-left: auto;
        }

        .logout {
            background-color: red;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        .logout:hover {
            background-color: #800000;
        }

        .form-container {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            margin: 20px auto;
            max-width: 800px;
        }

        .form-container h2 {
            color: #28a745;
            margin-bottom: 20px;
            text-align: center;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group label {
            color: #495057;
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }

        .form-control {
            width: 100%;
            padding: 10px;
            border: 1px solid #ced4da;
            border-radius: 5px;
            font-size: 16px;
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
            margin-top: 10px;
        }

        .btn-primary:hover {
            background-color: #218838;
        }

        .message {
            margin-top: 20px;
            padding: 15px;
            border-radius: 5px;
        }

        .alert-success {
            background-color: #d4edda;
            color: #155724;
            border: 1px solid #c3e6cb;
        }

        .alert-danger {
            background-color: #f8d7da;
            color: #721c24;
            border: 1px solid #f5c6cb;
        }
    </style>
</head>
<body>
    <%@ include file="header.jsp" %>

    <div class="container">
        <div class="form-container">
            <h2>Link Your Bank Account</h2>
            
            <%-- Display success/error messages if available --%>
            <% if (request.getAttribute("message") != null) { %>
                <div class="message alert <%= request.getAttribute("messageType") %>">
                    <%= request.getAttribute("message") %>
                </div>
            <% } %>
            
            <form method="post" action="${pageContext.request.contextPath}/link">
			    
			    <div class="form-group">
			        <label>Bank Account Number:</label>
			        <input type="text" class="form-control" name="accountNumber" required>
			    </div>
			    
			    <div class="form-group">
			        <label>IFSC Code:</label>
			        <input type="text" class="form-control" name="ifscCode" required>
			    </div>
			    
			    <div class="form-group">
			        <label>Bank Account PIN:</label>
			        <input type="password" class="form-control" name="pinCode" required>
			    </div>
			    
			    <button type="submit" class="btn btn-primary">Link Account</button>
			</form>
        </div>
    </div>
</body>
</html>