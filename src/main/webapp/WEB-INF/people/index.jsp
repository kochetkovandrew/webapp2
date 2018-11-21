<%-- 
    Document   : index
    Created on : 07.11.2018, 03:56:16
    Author     : kochetkov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/WebApplication2/stylesheets/style.css"/>
        <link rel="stylesheet" href="/WebApplication2/stylesheets/jquery.dataTables.min.css"/>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"/>
        <link rel="javascript" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"/>
        <link rel="stylesheet" href="http://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css"/>
        <link rel="javascript" href="http://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"/>
        <script src="/WebApplication2/javascripts/jquery-3.3.1.min.js"></script>
        <script src="/WebApplication2/javascripts/jquery.dataTables.min.js"></script>
        <script src="/WebApplication2/javascripts/index.js"></script>
        <title>BMI Form (Web Version 2018)</title>
    </head>
    <body>
        <h1>BMI Form (Web Version 2018)</h1>
        
        <p id="local_message"></p>
        <a class="btn btn-primary" href="/WebApplication2/people/new" role="button">New Person</a>
        <hr/>
        <table class="display" id="people_index">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Weight</th>
                    <th>Height</th>
                    <th>BMI</th>
                    <!-- <th>Date</th>
                    <th></th>-->
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${people}" var="person">
                <tr>
                    <td><c:out value="${person.get(\"name\")}"/></td>
                    <td><c:out value="${person.get(\"weight\")}"/></td>  
                    <td><c:out value="${person.get(\"height\")}"/></td>  
                    <td><c:out value="${person.bmiString()}"/></td>  
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
