package com.example.md3finalexam.repositories;

import com.example.md3finalexam.models.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        if (connection == null) {
            throw new RuntimeException("Database connection is null");
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, name_product, price, discount, stock FROM product");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name_product");
                double price = resultSet.getLong("price");
                double discount = resultSet.getDouble("discount");
                int stock = resultSet.getInt("stock");
                Product product = new Product(id, name, price, discount, stock);
                products.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;

    }
}
