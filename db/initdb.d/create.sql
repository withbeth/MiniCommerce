CREATE TABLE `item`
(
    id                  BIGINT NOT NULL AUTO_INCREMENT,
    shop_id             BIGINT,
    name                VARCHAR(64),
    price               INT,
    discount_percentage INT,
    stock               INT,
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `order_items.sql`
(
    id           BIGINT NOT NULL AUTO_INCREMENT,
    item_id      BIGINT,
    quantity     INT,
    price        INT,
    shop_id      BIGINT,
    order_status VARCHAR(64),
    order_id     BIGINT,
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `orders`
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    customer_account_id BIGINT,
    order_status        VARCHAR(30),
    created_at          TIMESTAMP,
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `shop`
(
    id       BIGINT NOT NULL AUTO_INCREMENT,
    city     VARCHAR(64),
    province VARCHAR(64),
    name     VARCHAR(64),
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
