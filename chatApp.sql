-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 05, 2016 at 08:58 PM
-- Server version: 5.5.47-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `chatApp`
--

-- --------------------------------------------------------

--
-- Table structure for table `contact_list`
--

CREATE TABLE IF NOT EXISTS `contact_list` (
  `u_id` int(11) NOT NULL,
  `friend_id` int(11) NOT NULL,
  PRIMARY KEY (`u_id`,`friend_id`),
  KEY `friend_id` (`friend_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact_list`
--

INSERT INTO `contact_list` (`u_id`, `friend_id`) VALUES
(2, 1),
(3, 1),
(10, 1),
(1, 2),
(3, 2),
(10, 2),
(14, 2),
(1, 3),
(2, 3),
(14, 3),
(1, 4),
(1, 5),
(2, 5),
(2, 6),
(1, 10),
(2, 10),
(14, 10),
(2, 11),
(2, 13),
(2, 14),
(3, 14),
(10, 14);

-- --------------------------------------------------------

--
-- Table structure for table `offline_messages`
--

CREATE TABLE IF NOT EXISTS `offline_messages` (
  `sender_id` int(11) NOT NULL,
  `reciever_id` int(11) NOT NULL,
  `message` tinytext NOT NULL,
  KEY `sender_id` (`sender_id`),
  KEY `reciever_id` (`reciever_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `offline_messages`
--

INSERT INTO `offline_messages` (`sender_id`, `reciever_id`, `message`) VALUES
(5, 5, 'hey everyone :)) '),
(6, 6, 'hey everyone :)) '),
(7, 7, 'hey everyone :)) '),
(13, 13, 'hey everyone :)) '),
(15, 15, 'hey everyone :)) '),
(5, 5, 'tatata'),
(6, 6, 'tatata'),
(7, 7, 'tatata'),
(13, 13, 'tatata'),
(15, 15, 'tatata'),
(5, 5, 'hhhhh'),
(6, 6, 'hhhhh'),
(7, 7, 'hhhhh'),
(13, 13, 'hhhhh'),
(15, 15, 'hhhhh'),
(5, 5, 'ey'),
(6, 6, 'ey'),
(7, 7, 'ey'),
(13, 13, 'ey'),
(15, 15, 'ey'),
(5, 5, 'hello'),
(6, 6, 'hello'),
(7, 7, 'hello'),
(13, 13, 'hello'),
(15, 15, 'hello'),
(5, 5, 'it''s me'),
(6, 6, 'it''s me'),
(7, 7, 'it''s me'),
(13, 13, 'it''s me'),
(15, 15, 'it''s me'),
(5, 5, 'hhhhhhhhhhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhhhhhhhhhh'),
(5, 5, 'hhhhhhhhh'),
(6, 6, 'hhhhhhhhh'),
(7, 7, 'hhhhhhhhh'),
(13, 13, 'hhhhhhhhh'),
(15, 15, 'hhhhhhhhh'),
(5, 5, 'asdasd'),
(6, 6, 'asdasd'),
(7, 7, 'asdasd'),
(13, 13, 'asdasd'),
(15, 15, 'asdasd'),
(5, 5, 'hhhhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhhhh'),
(5, 5, 'hello'),
(6, 6, 'hello'),
(7, 7, 'hello'),
(13, 13, 'hello'),
(15, 15, 'hello'),
(5, 5, 'it''s me'),
(6, 6, 'it''s me'),
(7, 7, 'it''s me'),
(13, 13, 'it''s me'),
(15, 15, 'it''s me'),
(5, 5, 'hhhhhhhhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhhhhhhhh'),
(5, 5, 'hello'),
(6, 6, 'hello'),
(7, 7, 'hello'),
(13, 13, 'hello'),
(15, 15, 'hello'),
(5, 5, 'it''s me'),
(6, 6, 'it''s me'),
(7, 7, 'it''s me'),
(13, 13, 'it''s me'),
(15, 15, 'it''s me'),
(5, 5, 'i wounder'),
(6, 6, 'i wounder'),
(7, 7, 'i wounder'),
(13, 13, 'i wounder'),
(15, 15, 'i wounder'),
(5, 5, '?'),
(6, 6, '?'),
(7, 7, '?'),
(13, 13, '?'),
(15, 15, '?'),
(5, 5, '?'),
(6, 6, '?'),
(7, 7, '?'),
(13, 13, '?'),
(15, 15, '?'),
(5, 5, 'ahmed'),
(6, 6, 'ahmed'),
(7, 7, 'ahmed'),
(13, 13, 'ahmed'),
(15, 15, 'ahmed'),
(5, 5, '??'),
(6, 6, '??'),
(7, 7, '??'),
(13, 13, '??'),
(15, 15, '??'),
(5, 5, '?'),
(6, 6, '?'),
(7, 7, '?'),
(13, 13, '?'),
(15, 15, '?'),
(5, 5, '?'),
(6, 6, '?'),
(7, 7, '?'),
(13, 13, '?'),
(15, 15, '?'),
(5, 5, 'hhhhhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhhhhh'),
(5, 5, 'asdas'),
(6, 6, 'asdas'),
(7, 7, 'asdas'),
(13, 13, 'asdas'),
(15, 15, 'asdas'),
(5, 5, 'hey'),
(6, 6, 'hey'),
(7, 7, 'hey'),
(13, 13, 'hey'),
(15, 15, 'hey'),
(5, 5, 'dasds'),
(6, 6, 'dasds'),
(7, 7, 'dasds'),
(13, 13, 'dasds'),
(15, 15, 'dasds'),
(5, 5, 'it''s me'),
(6, 6, 'it''s me'),
(7, 7, 'it''s me'),
(13, 13, 'it''s me'),
(15, 15, 'it''s me'),
(5, 5, 'hhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhh'),
(5, 5, 'hey'),
(6, 6, 'hey'),
(7, 7, 'hey'),
(13, 13, 'hey'),
(15, 15, 'hey'),
(5, 5, 'helllooo'),
(6, 6, 'helllooo'),
(7, 7, 'helllooo'),
(13, 13, 'helllooo'),
(15, 15, 'helllooo'),
(5, 5, 'it''s the admin'),
(6, 6, 'it''s the admin'),
(7, 7, 'it''s the admin'),
(13, 13, 'it''s the admin'),
(15, 15, 'it''s the admin'),
(5, 5, 'hhhhhhhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhhhhhhh'),
(5, 5, 'it''s me'),
(6, 6, 'it''s me'),
(7, 7, 'it''s me'),
(13, 13, 'it''s me'),
(15, 15, 'it''s me'),
(5, 5, 'hey bitches'),
(6, 6, 'hey bitches'),
(7, 7, 'hey bitches'),
(13, 13, 'hey bitches'),
(15, 15, 'hey bitches'),
(5, 5, 'asdasd'),
(6, 6, 'asdasd'),
(7, 7, 'asdasd'),
(13, 13, 'asdasd'),
(15, 15, 'asdasd'),
(5, 5, 'dDAweqwe'),
(6, 6, 'dDAweqwe'),
(7, 7, 'dDAweqwe'),
(13, 13, 'dDAweqwe'),
(15, 15, 'dDAweqwe'),
(5, 5, 'dasdasd'),
(6, 6, 'dasdasd'),
(7, 7, 'dasdasd'),
(13, 13, 'dasdasd'),
(15, 15, 'dasdasd'),
(5, 5, 'hhhhhhhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhhhhhhh'),
(5, 5, 'hey'),
(6, 6, 'hey'),
(7, 7, 'hey'),
(13, 13, 'hey'),
(15, 15, 'hey'),
(5, 5, 'ddaa'),
(6, 6, 'ddaa'),
(7, 7, 'ddaa'),
(13, 13, 'ddaa'),
(15, 15, 'ddaa'),
(5, 5, 'it''s me'),
(6, 6, 'it''s me'),
(7, 7, 'it''s me'),
(13, 13, 'it''s me'),
(15, 15, 'it''s me'),
(5, 5, 'hhhhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhhhh'),
(5, 5, 'i know'),
(6, 6, 'i know'),
(7, 7, 'i know'),
(13, 13, 'i know'),
(15, 15, 'i know'),
(5, 5, 'it''s you'),
(6, 6, 'it''s you'),
(7, 7, 'it''s you'),
(13, 13, 'it''s you'),
(15, 15, 'it''s you'),
(5, 5, 'aaaaaa'),
(6, 6, 'aaaaaa'),
(7, 7, 'aaaaaa'),
(13, 13, 'aaaaaa'),
(15, 15, 'aaaaaa'),
(5, 5, 'dddd'),
(6, 6, 'dddd'),
(7, 7, 'dddd'),
(13, 13, 'dddd'),
(15, 15, 'dddd'),
(5, 5, 'helllo'),
(6, 6, 'helllo'),
(7, 7, 'helllo'),
(13, 13, 'helllo'),
(15, 15, 'helllo'),
(5, 5, 'it''s me'),
(6, 6, 'it''s me'),
(7, 7, 'it''s me'),
(13, 13, 'it''s me'),
(15, 15, 'it''s me'),
(5, 5, 'hey'),
(6, 6, 'hey'),
(7, 7, 'hey'),
(13, 13, 'hey'),
(15, 15, 'hey'),
(5, 5, 'hello'),
(6, 6, 'hello'),
(7, 7, 'hello'),
(13, 13, 'hello'),
(15, 15, 'hello'),
(5, 5, 'it''s me'),
(6, 6, 'it''s me'),
(7, 7, 'it''s me'),
(13, 13, 'it''s me'),
(15, 15, 'it''s me'),
(5, 5, 'hhhhhhhhhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhhhhhhhhh'),
(5, 5, 'hhhhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhhhh'),
(5, 5, 'hhhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhhh'),
(5, 5, 'hhhh'),
(6, 6, 'hhhh'),
(7, 7, 'hhhh'),
(13, 13, 'hhhh'),
(15, 15, 'hhhh'),
(3, 3, 'hello'),
(5, 5, 'hello'),
(6, 6, 'hello'),
(7, 7, 'hello'),
(10, 10, 'hello'),
(12, 12, 'hello'),
(13, 13, 'hello'),
(14, 14, 'hello'),
(15, 15, 'hello'),
(3, 3, 'it''s me'),
(5, 5, 'it''s me'),
(6, 6, 'it''s me'),
(7, 7, 'it''s me'),
(10, 10, 'it''s me'),
(12, 12, 'it''s me'),
(13, 13, 'it''s me'),
(14, 14, 'it''s me'),
(15, 15, 'it''s me'),
(3, 3, 'hhhhhhhhhhhh'),
(5, 5, 'hhhhhhhhhhhh'),
(6, 6, 'hhhhhhhhhhhh'),
(7, 7, 'hhhhhhhhhhhh'),
(10, 10, 'hhhhhhhhhhhh'),
(12, 12, 'hhhhhhhhhhhh'),
(13, 13, 'hhhhhhhhhhhh'),
(14, 14, 'hhhhhhhhhhhh'),
(15, 15, 'hhhhhhhhhhhh'),
(3, 3, 'hello'),
(4, 4, 'hello'),
(5, 5, 'hello'),
(6, 6, 'hello'),
(7, 7, 'hello'),
(9, 9, 'hello'),
(10, 10, 'hello'),
(12, 12, 'hello'),
(13, 13, 'hello'),
(14, 14, 'hello'),
(15, 15, 'hello'),
(3, 3, ''),
(4, 4, ''),
(5, 5, ''),
(6, 6, ''),
(7, 7, ''),
(9, 9, ''),
(10, 10, ''),
(12, 12, ''),
(13, 13, ''),
(14, 14, ''),
(15, 15, ''),
(3, 3, 'it''s me'),
(4, 4, 'it''s me'),
(5, 5, 'it''s me'),
(6, 6, 'it''s me'),
(7, 7, 'it''s me'),
(9, 9, 'it''s me'),
(10, 10, 'it''s me'),
(12, 12, 'it''s me'),
(13, 13, 'it''s me'),
(14, 14, 'it''s me'),
(15, 15, 'it''s me'),
(3, 3, '???'),
(4, 4, '???'),
(5, 5, '???'),
(6, 6, '???'),
(7, 7, '???'),
(9, 9, '???'),
(10, 10, '???'),
(12, 12, '???'),
(13, 13, '???'),
(14, 14, '???'),
(15, 15, '???'),
(3, 3, '??????????'),
(4, 4, '??????????'),
(5, 5, '??????????'),
(6, 6, '??????????'),
(7, 7, '??????????'),
(9, 9, '??????????'),
(10, 10, '??????????'),
(12, 12, '??????????'),
(13, 13, '??????????'),
(14, 14, '??????????'),
(15, 15, '??????????'),
(3, 3, 'HEy booooooooooooys'),
(4, 4, 'HEy booooooooooooys'),
(5, 5, 'HEy booooooooooooys'),
(6, 6, 'HEy booooooooooooys'),
(7, 7, 'HEy booooooooooooys'),
(8, 8, 'HEy booooooooooooys'),
(9, 9, 'HEy booooooooooooys'),
(10, 10, 'HEy booooooooooooys'),
(12, 12, 'HEy booooooooooooys'),
(13, 13, 'HEy booooooooooooys'),
(14, 14, 'HEy booooooooooooys'),
(15, 15, 'HEy booooooooooooys');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(25) NOT NULL,
  `lastName` varchar(25) NOT NULL,
  `age` tinyint(10) NOT NULL,
  `email` varchar(35) NOT NULL,
  `password` char(32) NOT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`u_id`, `firstName`, `lastName`, `age`, `email`, `password`, `status`) VALUES
(1, 'Hazem', 'Taha', 0, 'hazem@mail.com', '123', 0),
(2, 'Ahmed', 'Mohamed', 0, 'ahmed@mail.com', '123', 0),
(3, 'Mostaf', 'Ashour', 0, 'sasa@mail.com', '123', 0),
(4, 'Mahmoud', 'Elsherief', 0, 'mahmoud@mail.com', '123', 0),
(5, 'Amr', 'Elmarooty', 0, 'amr@mail.com', '123', 0),
(6, 'Karem', 'Akram', 0, 'karem@mail.com', '123', 0),
(7, 'Andro', 'George', 0, 'andro@mail.com', '123', 0),
(8, 'Asmaa', 'Gaafar', 0, 'asmaa@mail.com', '123', 0),
(9, 'Amira', 'Ismail', 0, 'amira@mail.com', '123', 0),
(10, 'Zahra', 'Mosaab', 0, 'zahra@mail.com', '123', 0),
(11, 'Amer', 'Ahmed', 0, 'amir@mail.com', '123', 0),
(12, 'Serag', 'Karam', 0, 'serag@mail.com', '123', 0),
(13, 'Mohab', 'Amgad', 0, 'mohab@mail.com', '123', 0),
(14, 'Mina', 'Akram', 22, 'minaAk@mail.com', '123', 0),
(15, 'mahmoud', 'elshamy', 32, 'moda@mail.com', '123', 0);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `contact_list`
--
ALTER TABLE `contact_list`
  ADD CONSTRAINT `contact_list_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `users` (`u_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `contact_list_ibfk_2` FOREIGN KEY (`friend_id`) REFERENCES `users` (`u_id`) ON DELETE CASCADE;

--
-- Constraints for table `offline_messages`
--
ALTER TABLE `offline_messages`
  ADD CONSTRAINT `offline_messages_ibfk_1` FOREIGN KEY (`sender_id`) REFERENCES `users` (`u_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `offline_messages_ibfk_2` FOREIGN KEY (`reciever_id`) REFERENCES `users` (`u_id`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
