<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/7/2024
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Management</title>
</head>
<body>
<h1>Product Management</h1>
<div class="button-container">
    <button >Add New Product</button>
    <button >View Best Selling Products</button>
    <button >View Monthly Orders</button>
    <button >View Yearly Orders</button>
</div>
<div >
        <table>
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


</body>
</html>
