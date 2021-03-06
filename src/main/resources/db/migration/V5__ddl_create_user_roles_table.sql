CREATE TABLE `users_roles` (
                               `user_id` int NOT NULL,
                               `role_id` int NOT NULL,
                               PRIMARY KEY (`user_id`,`role_id`),
                               KEY `FK_ROLE_idx` (`role_id`),
                               CONSTRAINT `FK_ROLE` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
                               CONSTRAINT `FK_USER_05` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
