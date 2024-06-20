create table "product_category"(
                                 id serial primary key,
                                 name_category varchar(100)
);
create table "product"(
                        id serial primary key,
                        name varchar(100) not null ,
                        description varchar(255),
                        count integer not null ,
                        category int ,
                        price integer not null ,
                        date_start date not null ,
                        date_delete date
);