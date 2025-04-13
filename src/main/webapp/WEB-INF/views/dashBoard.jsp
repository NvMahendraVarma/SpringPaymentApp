<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard Page</title>

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

        .form-group label {
            color: #495057;
            font-weight: bold;
        }

        .form-group p {
            color: #495057;
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
        }

        .btn-primary:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <%@ include file="header.jsp" %>

    <div class="container">
        <!-- Account Overview -->
        <div class="form-container">
            <h2>Account Overview</h2>
            <div class="form-group">
                <label>Primary Bank Account No:</label>
                <p>1234567890</p>
            </div>
            <div class="form-group">
                <label>Account Balance:</label>
                <p>$10,000</p>
            </div>
            <div class="form-group">
                <label>Wallet Balance:</label>
                <p>$500</p>
            </div>
            <form method="post" action="/sendMoney">
                <button type="submit" class="btn btn-primary">Send Money</button>
            </form>
        </div>

        <!-- Bank Account Details -->
        <div class="form-container">
            <h2>Bank Account Details</h2>
            <div class="form-group">
                <label>Bank Name:</label>
                <p>Example Bank</p>
            </div>
            <div class="form-group">
                <label>Account Number:</label>
                <p>1234567890</p>
            </div>
            <div class="form-group">
                <label>Current Balance:</label>
                <p>$10,000</p>
            </div>
            <div class="form-group">
                <label>IFSC Code:</label>
                <p>EXMP123456</p>
            </div>
            <div class="form-group">
                <label>Branch:</label>
                <p>Main Branch</p>
            </div>
            <form method="post" action="/addBankAccount">
                <button type="submit" class="btn btn-primary">Add Bank Account</button>
            </form>
        </div>

        <!-- Recent Transactions -->
        <div class="form-container">
            <h2>Recent Transactions</h2>
            <div class="form-group">
                <label>Recent 10 Transactions:</label>
                <p>No transactions found.</p>
            </div>
            <form method="post" action="/detailedStatement">
                <button type="submit" class="btn btn-primary">Detailed Statement</button>
            </form>
        </div>
    </div>
</body>
</html>
