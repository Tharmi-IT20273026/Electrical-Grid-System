-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2022 at 04:06 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `generation`
--

-- --------------------------------------------------------

--
-- Table structure for table `energy`
--

CREATE TABLE `energy` (
  `ID` int(11) NOT NULL,
  `Type` text NOT NULL,
  `Volt` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `energy`
--

INSERT INTO `energy` (`ID`, `Type`, `Volt`) VALUES
(2, 'Kinetic energy', 9),
(3, 'Electromagnetic energy', 7),
(5, 'light energy', 1),
(4, 'Kinetric energy', 7);

-- --------------------------------------------------------

--
-- Table structure for table `source`
--

CREATE TABLE `source` (
  `ID` int(11) NOT NULL,
  `Name` varchar(11) NOT NULL,
  `Type` varchar(11) NOT NULL,
  `Place` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `source`
--

INSERT INTO `source` (`ID`, `Name`, `Type`, `Place`) VALUES
(9, 'Wind', 'solar elect', 'colombo'),
(3, 'Sunlight', 'current ele', 'jaffna');

-- --------------------------------------------------------

--
-- Table structure for table `transformar`
--

CREATE TABLE `transformar` (
  `ID` int(11) NOT NULL,
  `en_id` int(11) NOT NULL,
  `date` int(11) NOT NULL,
  `Active` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transformar`
--

INSERT INTO `transformar` (`ID`, `en_id`, `date`, `Active`) VALUES
(9, 2, 21, 'true'),
(15, 3, 30, 'false');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
