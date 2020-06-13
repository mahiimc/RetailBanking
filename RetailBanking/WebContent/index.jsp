<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="//code.jquery.com/jquery-2.1.4.min.js"></script>
    <script> 
        $(function(){
          $("#header").load("header.html"); 
          $("#footer").load("footer.html"); 
        });
    </script> 
    
</head>

<body>

    
    <div id="header"></div>
    <div id="footer"></div>

    <div class="con fluid container ">
        <h4 class="center">Login Here</h4>
        <span class="my-error-class">${message}</span>
        <form method="post" action ="login" id="login-form">
        <input type="hidden" name="source" value="login">
            <div class="form-group-row">
                <label for="username" class="col-sm-4 col-md-2 col-form-label">User&nbsp;Name</label>
                <div class="col-sm-8 col-md-10">
                    <input type="text" class="form-control" id="username" name="username" placeholder="Username"/>
                </div>
                </div>
                <label for="password" class="col-sm-4 col-md-2 col-form-label">Password</label>
                <div class="col-sm-8 col-md-10">
                    <input type="password" class="form-control" id="password" name="password" placeholder="Password"/>
                </div>
                <div class="col-sm-10 col-form-label">
                    <button type="submit" name="submit" class="btn btn-outline-dark">Sign in</button>
                  </div>
            </div>
        </form>

    </div>

    <script src="//code.jquery.com/jquery-2.1.4.min.js"></script>
    <script src="//cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/additional-methods.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery-2.1.4.js"><\/script>');</script>
    <script src="js/validate.js"></script>
    
    
</body>
</html>