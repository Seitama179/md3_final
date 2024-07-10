<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/7/2024
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap" rel="stylesheet">
    <style>

        .add-phone-btn {
            margin-bottom: 20px;
        }

        table.table-bordered tbody tr td, table.table-bordered thead tr th {
            border: 1px solid #c5c9ce;
            text-align: center;
            vertical-align: middle;
        }

    </style>

</head>
<body>
<div class="container mt-5">
<h1>Product Management</h1>
<div class="button-container">
    <button >Add New Product</button>
    <button >View Best Selling Products</button>
    <button >View Monthly Orders</button>
    <button >View Yearly Orders</button>
</div>
<div >
        <table class="table table-hover table-bordered">
            <thead>
            <tr>
                <th>No.</th>
                <th>Product Name</th>
                <th>Price</th>
                <th>Discount</th>
                <th>Stock</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="product" items="${products}" varStatus="status">
                <tr>
                    <td>${status.count}</td>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>${product.discount}</td>
                    <td>${product.stock}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous">
</script>

</body>
</html>
