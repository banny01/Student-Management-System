-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.31 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             10.3.0.5771
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for sms
CREATE DATABASE IF NOT EXISTS `sms` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `sms`;

-- Dumping structure for table sms.course
CREATE TABLE IF NOT EXISTS `course` (
  `courseID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `start_date` date NOT NULL,
  `status` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`courseID`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Dumping data for table sms.course: 2 rows
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` (`courseID`, `name`, `start_date`, `status`) VALUES
	(1, 'Maths', '2022-07-28', 'Deactive'),
	(3, 'Science', '2022-07-29', 'Active'),
	(4, 'Computer Science', '2022-07-29', 'Active');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;

-- Dumping structure for table sms.courseregistration
CREATE TABLE IF NOT EXISTS `courseregistration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `courseID` int(11) DEFAULT NULL,
  `studentID` int(11),
  PRIMARY KEY (`id`),
  KEY `FKgj19enwptmqpmycck9uwlgsik` (`courseID`),
  KEY `FK3elilxiq2ks01bvefl6221yq9` (`studentID`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Dumping data for table sms.courseregistration: 1 rows
/*!40000 ALTER TABLE `courseregistration` DISABLE KEYS */;
INSERT INTO `courseregistration` (`id`, `courseID`, `studentID`) VALUES
	(1, 1, 1),
	(4, 3, 1),
	(5, 1, 4),
	(6, 1, 5),
	(7, 4, 1);
/*!40000 ALTER TABLE `courseregistration` ENABLE KEYS */;

-- Dumping structure for table sms.student
CREATE TABLE IF NOT EXISTS `student` (
  `studentID` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `date_of_birth` date NOT NULL,
  `contact` varchar(10) NOT NULL DEFAULT '',
  `email` varchar(150) NOT NULL DEFAULT '',
  `gender` varchar(6) NOT NULL DEFAULT '',
  `address` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`studentID`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Dumping data for table sms.student: 2 rows
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`studentID`, `first_name`, `last_name`, `date_of_birth`, `contact`, `email`, `gender`, `address`) VALUES
	(1, 'Krishan', 'Chamara', '1995-05-30', '0710347725', 'n.d.krishankola@gmail.com', 'Male', 'sasas'),
	(4, 'Ashan', 'Dammika', '2004-06-24', '0710214488', 'dsd', 'Male', 'dsdsd'),
	(5, 'test', 'test', '2001-07-18', '0714448899', 'scxc', 'Female', 'cxcx');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
