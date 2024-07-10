package com.example.md3finalexam.controllers;

import com.example.md3finalexam.models.Product;
import com.example.md3finalexam.services.IProductService;
import com.example.md3finalexam.services.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductManagement", value = "/list-product")
public class ProductController extends HttpServlet {
    private IProductService productService = new ProductService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "1":
                break;
            default:
                List<Product> products = productService.findAll();
                req.setAttribute("products", products);
                req.getRequestDispatcher("/views/listProduct.jsp").forward(req, resp);
                break;
        }
    }
}
