<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css">
        <!-- External Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Oswald&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Merriweather:wght@300;400;700&display=swap" rel="stylesheet">
</head>
<body>
<%@include file="../inc/nav.jsp" %>
  <div class="container d-flex justify-content-center ">
    <div id="form" class="p-5 shadow">
      <form action="/login" method="POST">
        <h3>Login</h3>
        <div class="mb-3">
          <label for="email" class="form-label">Email</label>
          <input type="email" class="form-control" id="email">
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Password</label>
          <input type="password" class="form-control" id="password">
        </div>
        <div class='row justify-content-between mb-3'>
          <div class="form-check col-md-6">
            <input class="form-check-input" type="checkbox" value="" >
            <label class="form-check-label" >
              Remember me
            </label>
          </div>
          <div class="col-md-6"><a href='#'>Forgot your password?</a></div>
        </div>
          <div class='row justify-content-between mb-3'>
            <div class="btn col-md-6"><a href='register.html'>Create an account</a> </div>
            <button type="submit" style="background: #4B042B; color: white" class="btn col-md-6">Log in</button>
          
          </div>
      </form>
  </div>

  </div> 
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</body>
</html>