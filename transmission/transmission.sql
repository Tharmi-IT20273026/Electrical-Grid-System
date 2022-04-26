-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2022 at 03:02 AM
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
-- Database: `transmission`
--

-- --------------------------------------------------------

--
-- Table structure for table `daily`
--

CREATE TABLE `daily` (
  `daiTransId` int(11) NOT NULL,
  `transSubId` int(11) NOT NULL,
  `reportDate` date NOT NULL,
  `quantity` decimal(12,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `daily`
--

INSERT INTO `daily` (`daiTransId`, `transSubId`, `reportDate`, `quantity`) VALUES
(101, 200, '2022-04-13', '20.20'),
(102, 201, '2022-04-13', '12.60'),
(103, 202, '2022-04-13', '5.30'),
(104, 203, '2022-04-18', '11.00');

-- --------------------------------------------------------

--
-- Table structure for table `juncture`
--

CREATE TABLE `juncture` (
  `juncId` int(11) NOT NULL,
  `plantId` int(11) NOT NULL,
  `transSubId` int(11) NOT NULL,
  `lineId` int(11) NOT NULL,
  `active` varchar(64) NOT NULL,
  `activeFrom` varchar(50) NOT NULL,
  `activeTo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `juncture`
--

INSERT INTO `juncture` (`juncId`, `plantId`, `transSubId`, `lineId`, `active`, `activeFrom`, `activeTo`) VALUES
(21, 12, 101, 5, 'YES', 'Galle', 'Colombo'),
(22, 13, 123, 6, 'NO', 'Galle', 'Gampaha'),
(23, 15, 321, 12, 'YES', 'Kandy', 'Trinco');

-- --------------------------------------------------------

--
-- Table structure for table `line`
--

CREATE TABLE `line` (
  `lineId` int(11) NOT NULL,
  `unitId` int(11) NOT NULL,
  `lineType` varchar(64) NOT NULL,
  `rangMin` decimal(20,2) NOT NULL,
  `rangeMax` decimal(20,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `line`
--

INSERT INTO `line` (`lineId`, `unitId`, `lineType`, `rangMin`, `rangeMax`) VALUES
(5, 12, 'Non-metalic', '2000.00', '35000.00'),
(12, 21, 'Non-metalic', '2000.00', '35000.00'),
(21, 23, 'Non-metalic', '2000.00', '3000.00');

-- --------------------------------------------------------

--
-- Table structure for table `transmission`
--

CREATE TABLE `transmission` (
  `transSubId` int(10) NOT NULL,
  `substationCode` varchar(10) NOT NULL,
  `active` varchar(50) NOT NULL,
  `activeFrom` varchar(50) NOT NULL,
  `activeTo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transmission`
--

INSERT INTO `transmission` (`transSubId`, `substationCode`, `active`, `activeFrom`, `activeTo`) VALUES
(101, 'S35', 'NO', 'Galle', 'Gampaha'),
(203, 'S21', 'YES', 'Kandy', 'Batti'),
(512, 'S32', 'NO', 'Galle', 'Chilao');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `juncture`
--
ALTER TABLE `juncture`
  ADD PRIMARY KEY (`juncId`);

--
-- Indexes for table `line`
--
ALTER TABLE `line`
  ADD PRIMARY KEY (`lineId`);

--
-- Indexes for table `transmission`
--
ALTER TABLE `transmission`
  ADD PRIMARY KEY (`transSubId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `juncture`
--
ALTER TABLE `juncture`
  MODIFY `juncId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `line`
--
ALTER TABLE `line`
  MODIFY `lineId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `transmission`
--
ALTER TABLE `transmission`
  MODIFY `transSubId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=513;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
