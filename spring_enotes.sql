create database spring_enotes;

use spring_enotes;

--
-- Table structure for table `user_dtls`
--

DROP TABLE IF EXISTS `user_dtls`;

CREATE TABLE `user_dtls` (
  `id` int NOT NULL AUTO_INCREMENT,
  `about` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `user_dtls` VALUES (1,'Software Developer','abhi@gmail.com','Abhishek Pandey','$2a$10$cOnam6ZZqd3WvqYNVCOg4OKNXBEYgU6kBZ2V3ORrm3c3ubrtyqPcK','ROLE_USER'),(2,'Software Developer','abhitesh@gmail.com','Abhitesh Kumar','$2a$10$CipGoezqvSS692scTz3/GulRmwzq5J3Yr3rkVz8u23jvaRC3gsXxe','ROLE_USER');

--
-- Table structure for table `notes`
--

DROP TABLE IF EXISTS `notes`;

CREATE TABLE `notes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `user_id` int NOT NULL,
  `create_dt` date NOT NULL,
  `update_dt` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgxls9fooxlej7mxmcm43orijo` (`user_id`),
  CONSTRAINT `FKgxls9fooxlej7mxmcm43orijo` FOREIGN KEY (`user_id`) REFERENCES `user_dtls` (`id`) ON DELETE CASCADE
);

INSERT INTO `notes` VALUES (1,'Spring Boot is a project that is built on the top of the Spring Framework. It provides an easier and faster way to set up, configure, and run both simple and web-based applications.','What is Spring Boot',1,'2022-02-27','2022-02-27'),(2,'It simplifies integration with other Java frameworks like JPA/Hibernate ORM, Struts, etc.','Why should we use Spring Boot Framework ??',1,'2022-02-27','2022-03-07'),(4,'Java is a programming language.','What is Java ?',2,'2022-03-10','2022-03-10'),(5,'Spring Boot helps developers create applications that just run. Specifically, it lets you create standalone applications that run on their own, without relying on an external web server.','Why used spring boot ??',2,'2022-03-10','2022-03-10');