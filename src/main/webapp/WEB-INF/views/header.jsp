<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="header">
    <h1>Payment Application</h1>
    <div id="userSection">
        <div id="welcomeUser">
            Welcome, <%= session.getAttribute("username") != null ? session.getAttribute("username") : "User" %>
        </div>
	    <form method="post" action="/logout" >
        	<button type="submit" class="btn btn-primary">logout</button>
		</form>
    </div>
</div>