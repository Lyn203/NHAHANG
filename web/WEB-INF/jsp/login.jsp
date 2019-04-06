<%-- 
    Document   : login
    Created on : Dec 2, 2017, 5:41:55 PM
    Author     : NSH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<!DOCTYPE html>

<html lang="en"> 
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/ConfigCSS/style.css"/>">

    </head>
    <body style="background-image: url(<c:url value="/resource/images/gtkg.jpg"/>); background-size: 110% 154% ">
        <section class="container" style="padding-top: 50px">
            <div class="login">
                <h1>DHQ Restaurent</h1>
                <s:form action="XulyDangNhap.htm" commandName="login" method="get">
                    <p><s:input type="text" path="user" name="login" placeholder="Username"/></p>                    
                    <p><s:input type="password" path="password" name="password" placeholder="Password"/></p>     
                    <p class="remember_me">
                        <label>
                            <input type="checkbox" name="remember_me" id="remember_me">
                            Remember?
                        </label>
                    </p>                    
                    <p class="submit"><input type="submit"></p>                    
                </s:form>
            </div>

            <div class="login-help">
                <p><a href="index.html">Forgot your password?</a></p>
            </div>
        </section>
    </body>
</html>

