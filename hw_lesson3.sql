select car_brand,
       car_color,
       car_price
from car
where (car_color = 'white' or car_color = 'black')
  and car_price < 15000;


select
    car_brand,
    car_price
from car
where  car_color = 'black' and car_price < 10000;

select
    order_id,
    client_name,
    o.car_brand,
    car_price
from "order" as o
         left join car
                   on o.car_brand = car.car_brand;
