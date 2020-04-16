<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
	
<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
		
<meta name=”viewport” content=”width=device-width, initial-scale=1.0">
<link rel=”stylesheet” href=”css/bootstrap.css”>
<link rel=”stylesheet” href=”css/bootstrap-responsive.css”>
<link rel="stylesheet" href="/stylesheet.css" />
<head>
<link href="https://fonts.googleapis.com/css2?family=Miriam+Libre&family=Quattrocento+Sans&family=Source+Sans+Pro&display=swap" rel="stylesheet">
<title>Bruce's Diner</title>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Bruce's Diner</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="/">Home</a></li>
      <li><a href="/login">Login</a></li>
      <li><a href="/order">Order Form</a></li>
      <li><a href="/vieworders">View Orders</a></li>
      <li><a href="/logout">Logout</a></li>
      
    </ul>
  </div>
	<div class=div1>
	 <br>
	 <br>
	 <br>
	 <br>
	 <br>
	  <div class=center>
	    <h1 align="center">Bruce's Diner</h1>
			<br>
	    	<h3 align="center">I'd like to order</h3>
	    	</div>
	    	<div align="center">
	    	<div class="centered">
	    		<form action="/submit" method="post">
	    		<select name = "menu">
	    		<option value = "blt sandwich">BLT Sandwich</option>
	    		<option value = "pepperoni pizza slice">Pepperoni Pizza Slice</option>
	    		<option value = "chicken alfredo">Chicken Alfredo</option>
	    		<option value = "ramen noodle bowl">Ramen Noodle Bowl</option>
	 			</select>
	 			<select name="quantity">
   				<option value='1'>1</option>
  				<option value='2'>2</option>
   				<option value='3'>3</option>
  				<option value='4'>4</option>
				</select>
	    		<a class="btn btn-primary" href="/vieworders" role="button" "onclick="alert"(Success!)">Order It</a>
	 			</form>
	  		</div>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	  <br>
	</div>
	<footer align="center">
	<p>Bruce's Diner | (314) 555-1212 | 123 Main St, Anywhere, US 54321</p></footer>
</body>
</html>