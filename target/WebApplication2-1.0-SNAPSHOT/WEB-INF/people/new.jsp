<%-- 
    Document   : new.jsp
    Created on : 07.11.2018, 01:39:13
    Author     : kochetkov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <form method="POST" action="/WebApplication2/people">
            <div class="form-group row">
                <label class="col-sm-2 col-form-label" for="name">Name:</label>
                <div class="col-sm-6">
                  <input class="form-control form-control-lg" id="name" type="text" placeholder="first and last" name="person[name]" value=""/>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label" for="name">Weight(kg):</label>
                <div class="col-sm-6">
                    <input class="form-control form-control-lg" id="name" type="text" placeholder="100" name="person[weight]" value=""/>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label" for="name">Height(m):</label>
                <div class="col-sm-6">
                    <input class="form-control form-control-lg" id="name" type="text" placeholder="200" name="person[height]" value=""/>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label" for="name">Date(dd.mm.yyyy):</label>
                <div class="col-sm-6">
                    <input class="form-control form-control-lg" id="name" type="text" placeholder="15.12.1876" name="person[date]" value=""/>
                </div>
            </div>
            <button class="btn btn-primary" type="submit">Submit</button>&nbsp;
            <button class="btn btn-danger" type="button" id="locale_button">Local Variant</button>&nbsp;
            <button class="btn btn-success" type="button" id="reset_button">Reset</button>
        </form>
    </body>
</html>
