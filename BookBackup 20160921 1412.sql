-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.12-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema bookreviewsystem
--

CREATE DATABASE IF NOT EXISTS bookreviewsystem;
USE bookreviewsystem;

--
-- Definition of table `admintable`
--

DROP TABLE IF EXISTS `admintable`;
CREATE TABLE `admintable` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(45) DEFAULT NULL,
  `apass` varchar(45) DEFAULT NULL,
  `aemail` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `admintable`
--

/*!40000 ALTER TABLE `admintable` DISABLE KEYS */;
INSERT INTO `admintable` (`aid`,`aname`,`apass`,`aemail`) VALUES 
 (1,'snehal','12345','snehal@gmail.com');
/*!40000 ALTER TABLE `admintable` ENABLE KEYS */;


--
-- Definition of table `booktable`
--

DROP TABLE IF EXISTS `booktable`;
CREATE TABLE `booktable` (
  `bookid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `no_of_pages` int(11) DEFAULT NULL,
  `publication_house` varchar(45) DEFAULT NULL,
  `edition` int(11) DEFAULT NULL,
  `genre` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`bookid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `booktable`
--

/*!40000 ALTER TABLE `booktable` DISABLE KEYS */;
INSERT INTO `booktable` (`bookid`,`title`,`no_of_pages`,`publication_house`,`edition`,`genre`,`author`) VALUES 
 (1,'abc',123,'pppp',1,'adf','mayur'),
 (2,'pqe',45,'j',2,'sadf','tejas'),
 (3,'hhh',45,'7asdf',1,'adf','akshay'),
 (6,'C program',145,'adf',2,'Educational','Dinesh');
/*!40000 ALTER TABLE `booktable` ENABLE KEYS */;


--
-- Definition of table `reviewtable`
--

DROP TABLE IF EXISTS `reviewtable`;
CREATE TABLE `reviewtable` (
  `reviewid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `bookid` int(11) DEFAULT NULL,
  `reviews` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`reviewid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `reviewtable`
--

/*!40000 ALTER TABLE `reviewtable` DISABLE KEYS */;
INSERT INTO `reviewtable` (`reviewid`,`userid`,`bookid`,`reviews`) VALUES 
 (9,7,1,'very bad'),
 (10,7,1,'bad'),
 (12,8,2,'this review2'),
 (13,7,1,'this is my latest review');
/*!40000 ALTER TABLE `reviewtable` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `useremailid` varchar(45) DEFAULT NULL,
  `userpassword` varchar(45) DEFAULT NULL,
  `usersecurityquestion` varchar(45) DEFAULT NULL,
  `usersecurityanswer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`userid`,`username`,`useremailid`,`userpassword`,`usersecurityquestion`,`usersecurityanswer`) VALUES 
 (7,'dipak','dipak@gmail.com','12345','firstmobileno','8793322223'),
 (8,'Dinesh M','dinesh@gmail.com','55555','nickname','dinesh');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
