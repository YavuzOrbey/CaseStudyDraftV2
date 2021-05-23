<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calendar</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Oswald&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Merriweather:wght@300;400;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
    <style>
        body{

        }

        .main-area{
            background: #6D6262; 
            padding: 10px;
        }
        .calendar-header{
            height: 50px;
            background: #D83E3E;
            text-align: center;
            color: white;
            border-top-left-radius: 10px;
            border-top-right-radius: 10px;
        }
        .col-md{
            background: white;
            border: 1px solid black;
        }
        .out-of-month{
            background-color: gray;
        }
    </style>
</head>
<body>
    <nav class='navbar navbar-expand-lg bg-dark d-flex justify-content-end'>
        <div class='d-flex flex-row justify-content-evenly'>
          <form class="d-flex h-100">
            <!-- HTML INPUT REGEX only lets you search for lower case characters between 5 and 10 characters long-->
            <input class="form-control me-2 h-auto" id='search' type="search" pattern="[a-z]{5,10}" placeholder="Search" aria-label="Search">
            <button class="btn" id='search-button' type="submit"><i class="fas fa-search text-white"></i></button>
          </form>
          <ul class='navbar-nav me-auto mb-2 mb-lg-0 bg-transparent '>
            <li class="nav-item"><a class="nav-link link-light fs-5" href="calendar.html">Dashboard</a></li>
            <li class="nav-item"><a class="nav-link link-light fs-5" href="landing.html">Home</a></li>
            <li class="nav-item"><a class="nav-link link-light fs-5" href="login.html">Login</a></li>
            <li class="nav-item"><a class="nav-link link-light fs-5" href="register.html">Register</a></li>
          </ul>  
        </div>
      </nav>
      <div class='d-flex secondary-nav'>
        <div class="dropdown">
          <button class="dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false"
          style="background-color: transparent; border: none;">Recipes & Ingredients</button>
          <ul class="dropdown-menu bg-light vh-100 p-5" aria-labelledby="dropdownMenuButton1">
            <p>All of these send you to the same spot for now: the show all recipes page. I wanted a BIG opening menu like this because it mimics KhanAcademy's dropdown. Hopefully I will have enough content to add into it  </p>
            <li class='row '>
              <div class='col-md-3'>
                <h6>Recipes</h6>
                <ul class='list-unstyled'>
                  <li ><a href="viewTable.html" class='link-secondary text-decoration-none'>Browse</a></li>
                  <li ><a href="viewTable.html" class='link-secondary text-decoration-none'>Search</a></li>
                </ul>
              </div>
              <div class='col-md-3'>
                <h6>Ingredients</h6>
                <ul class='col-md-3 list-unstyled'>
    
                  <li ><a href="viewTable.html" class='link-secondary text-decoration-none'>Browse</a></li>
                  <li ><a href="viewTable.html" class='link-secondary text-decoration-none'>Search</a></li>
                </ul>
              </div>
                
            </li>
            </ul> 
        </div>
      </div>
    <div class="container">
        <div class="calendar-header">
            <i class="fas fa-arrow-circle-left" style="float: left; "></i>
            <h4>March 2021</h4>
            <i class="fas fa-arrow-circle-right" style="float: right;"></i>
        </div>
        <div class="main-area">
            <div class='container'>
			<c:forEach items="${theMonth}" var="week">
				<div class="row ">
            	<c:forEach items="${week}" var="day">

	                <div class="col-12 col-md  m-1 ${day%2==0 ? "out-of-month":"" }">
	                    <h4>${day}</h4>    
	                    <p>
	                       ${day}
	                    </p>
	                </div>
                </c:forEach>
            	</div>
            </c:forEach>
        </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</body>
</html>