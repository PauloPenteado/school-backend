CREATE DATABASE  IF NOT EXISTS `school`;
USE `school`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Leslie','Andrews','leslie@luv2code.com','(581) 785-8426'),
	(2,'Emma','Baumgarten','emma@luv2code.com','(581) 775-1236'),
	(3,'Avani','Gupta','avani@luv2code.com','(581) 905-7562'),
	(4,'Yuri','Petrov','yuri@luv2code.com','(581) 795-4856'),
	(5,'Juan','Vega','juan@luv2code.com','(581) 765-8472');

