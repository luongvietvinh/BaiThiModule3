<%--
  Created by IntelliJ IDEA.
  User: Admind
  Date: 31/12/2021
  Time: 10:13 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <title>Title</title>
</head>
<body>
<form method="post">
    <div class="form-group">
        <label>nhap name</label>
        <input type="text" class="form-control" name="name" aria-describedby="emailHelp" placeholder="enter name">
    </div>
    <div class="form-group">
        <label>nhap giá</label>
        <input type=text class="form-control" name="price"
               placeholder="nhap giá">
    </div>
    <div class="form-group">
        <label>nhap soluong</label>
        <input type="text" class="form-control" name="soluong" placeholder="enter so luong">
    </div>
    <div class="form-group">
        <label>nhap mau sac</label>
        <input type="text" class="form-control" name="mausac"
               placeholder="enter mau sac">
    </div>
    <div class="form-group">
        <label>nhap depcription</label>
        <input type="text" class="form-control" name="depcription"  placeholder="enter depcription">
    </div>

    <div class="form-group">
        <label>chon lop</label>
        <select name="idCategory">
            <c:forEach items="${categorys}" var="p">
                <option value="${p.idcategory}">
                    <p>${p.name}</p>
                </option>
            </c:forEach>
        </select>

    </div>
    <%--    <div class="form-check">--%>
    <%--        <input type="checkbox" class="form-check-input" id="exampleCheck1">--%>
    <%--        <label class="form-check-label" for="exampleCheck1">Check me out</label>--%>
    <%--    </div>--%>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>

