create database if not exists users;

use users;

drop table if exists users;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(64) NOT NULL,
  `first_name` varchar(64) NOT NULL,
  `email` varchar(64) NOT NULL,
  `user_type` varchar(64) NOT NULL,
  `username` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (1,'Doe','John','john.doe@foo.com', 'admin', 'admin', 'admin');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (2,'Public','Mary','mary.public@foo.com', 'admin', 'admin01', 'admin01');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (3,'Queue','Susan','susan.queue@foo.com', 'resercher', 'resercher01', '12345');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (4,'Williams','David','david.williams@foo.com', 'resercher', 'resercher02', '12345');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (5,'Johnson','Lisa','lisa.johnson@foo.com', 'resercher', 'resercher03', '12345');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (6,'Smith','Paul','paul.smith@foo.com', 'resercher', 'resercher04', '12345');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (7,'Adams','Carl','carl.adams@foo.com', 'resercher', 'resercher05', '12345');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (8,'Brown','Bill','bill.brown@foo.com', 'reviewer', 'reviewer01', '12345');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (9,'Thomas','Susan','susan.thomas@foo.com', 'reviewer', 'reviewer02', '12345');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (10,'Davis','John','john.davis@foo.com', 'reviewer', 'reviewer03', '12345');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (11,'Fowler','Mary','mary.fowler@foo.com', 'reviewer', 'reviewer04', '12345');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `user_type`, `username`, `password`) VALUES (12,'Waters','David','david.waters@foo.com', 'reviewer', 'reviewer05', '12345');

--
-- DEFINE STORED PROCEDURES
-- 

