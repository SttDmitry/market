CREATE TABLE `orders_item` (
                               `id` int NOT NULL AUTO_INCREMENT,
                               `quantity` int NOT NULL,
                               `item_price` decimal(10,0) NOT NULL,
                               `total_price` decimal(10,0) NOT NULL,
                               `product_id` int NOT NULL,
                               `user_id` int NOT NULL,
                               PRIMARY KEY (`id`),
                               KEY `products_fkey_idx` (`product_id`),
                               KEY `users_fkey_idx` (`user_id`),
                               CONSTRAINT `products_fkey` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`),
                               CONSTRAINT `users_fkey` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;