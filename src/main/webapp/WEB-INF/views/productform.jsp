<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Product</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/styles.css' />">
</head>
<body>
    <h1 class="center">Add Product</h1>
    <form action="addproduct" method="post">
        Name: <input type="text" name="name"><br>
        Price: <input type="text" name="price"><br>
        Category: <input type="text" name="category"><br>
        <input type="submit" value="Add Product">
    </form>
</body>
</html>