/*SQL запросы можно поместить в файл hw_lesson3.sql
        Схема нашей бд состоит из двух таблиц
        Car(car_brand, color, price)
        Order(order_number, car_brand, client_name)
        Задание 1.
        Написать sql запрос, который выведет бренд автомобиля и цвет и цену который имеет цвет белый или черный и имеет цену менее 15000.
        Задание 2.
        Написать sql запрос, который выведет общую стоимость черных автомобилей в разрезе бренда, но на сумму не больше 10000.
        Вывести только бренд и общую стоимость.
        Например в таблице есть:
        bmw,black,10000
        bmw,red,5000
        bmw,black,25000
        ford,black,1500
        ford,green,7500
        lada,black,700
        lada,silver,500
        lexus,black,18000
        lexus,black,24000
        В результате мы должны получить это:
        ford,1500
        lada,700
        Задание 3.
        Написать sql запрос, который выведет Номер заказа, имя клиента, бренд автомобиля и цену
        Задание 4.
        В вашем проекте создайте таблицы для сущностей. пока можете создавать их через интерфейс идеи, если сможете,
        то с помощью запроса (пока не принципиально).
        И добавьте методы для получения списка всех сущностей из бд и методы для получения одной записи по ID.
        Аналогично тому как делали на занятии.
        Для того, чтобы создать таблицы Car и Order выполните в консоле postgres эти два запроса:

        create table if not exists car
        (
        id        serial not null primary key,
        car_brand varchar,
        color     varchar,
        price     int
        );
        create table if not exists order
        (
        id           serial not null primary key,
        order_number int,
        car_brand    varchar,
        client_name  varchar
        );
        А чтобы наполнить данными, выполните эти запросы:
        insert into car (car_brand, color, price)
        values ('bmw', 'black', 1000),
        ('lada', 'red', 500),
        ('lexus', 'green', 5000);

        insert into order (order_number, car_brand, client_name)
        values (100, 'bmw', 'vova'),
        (101, 'lada', 'sergey');*/

package com.p0n0marenk0;

import entity.Car;

public class Main {


    public static void main(String[] args) {

    }
}
