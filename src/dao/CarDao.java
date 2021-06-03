package dao;

import entity.Car;
import utils.PostgresUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarDao {

    private static final String SELECT_ALL = "SELECT * FROM car";

    public void create(Car car) {

    }

    public void delete(Car car) {

    }

    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();
        try (Connection connection = PostgresUtils.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_ALL);
        ) {
            while (resultSet.next()) {
                Car car = new Car();
                car.setColor(resultSet.getString("car_color"));
                car.setId(resultSet.getInt("car_id"));
                car.setBrand(resultSet.getString("car_brand"));
                cars.add(car);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cars;
    }

    }