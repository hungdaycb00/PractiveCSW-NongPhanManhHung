CREATE DATABASE  IF NOT EXISTS `ABCShop`;
USE `ABCShop`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employeedb`;

CREATE TABLE `Product` (
                            `id` int(11) NOT NULL AUTO_INCREMENT,
                            `name` varchar(45) DEFAULT NULL,
                            `price` double DEFAULT NULL,
                            `quantity` integer DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `Product` VALUES (1,'IPhone 10',1000,10),
                              (2,'IPhone 11',1500,100),
                              (3,'IPhone 12',990,200),
                              (4,'Samsung S9',800,300),
                              (5,'Samsung S10',999,250);