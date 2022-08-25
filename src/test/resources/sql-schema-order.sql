DROP TABLE `order_items`;
DROP TABLE `orders`;
DROP TABLE `items`;
DROP TABLE `customers`;
CREATE TABLE IF NOT EXISTS `customers`
(
   `id` INT (11) NOT NULL AUTO_INCREMENT,
   `first_name` VARCHAR (40) NULL DEFAULT NULL,
   `surname` VARCHAR (40) NULL DEFAULT NULL,
   PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `items`
(
   `item_id` INT (11) NOT NULL AUTO_INCREMENT,
   `item_name` VARCHAR (40) NULL DEFAULT NULL,
   `item_price` DOUBLE NULL DEFAULT NULL,
   PRIMARY KEY (`item_id`)
);
CREATE TABLE IF NOT EXISTS `orders`
(
   `order_id` INT (11) UNIQUE NOT NULL AUTO_INCREMENT,
   `fk_customer_id` INT NOT NULL,
   PRIMARY KEY (`order_id`),
   CONSTRAINT `fk_customer_id` FOREIGN KEY (`fk_customer_id`) REFERENCES customers (`id`)
);
CREATE TABLE IF NOT EXISTS `orders_items`
(
   `order_item_id` INT (11) UNIQUE NOT NULL AUTO_INCREMENT,
   `unit_price` DOUBLE NOT NULL,
   `quantity` INT NOT NULL,
   `fk_order_id` INT NOT NULL,
   `fk_item_id` INT NOT NULL,
   PRIMARY KEY (`order_item_id`),
   CONSTRAINT `fk_order_id` FOREIGN KEY (`fk_order_id`) REFERENCES `orders` (`order_id`) ON DELETE CASCADE,
   CONSTRAINT `fk_item_id` FOREIGN KEY (`fk_item_id`) REFERENCES `items` (`item_id`) ON DELETE CASCADE
);