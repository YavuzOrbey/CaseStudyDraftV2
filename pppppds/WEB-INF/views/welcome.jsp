<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles/style.css" />
</head>
<body>
        ${pageContext.request.contextPath}
    <div class="container"> 
        <form action="displayroute">

            <div class="field">
                <label for="name">Your Name</label>
                <input id="name" name="name" type="text" placeholder="Enter Your Name" />
            </div>
            <div class="btn">
                <input id="sub" name="submit" type="submit" value="Submit Name" />
            </div>
        </form>
    </div>
</body>
</html>