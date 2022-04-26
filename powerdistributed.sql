-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 26, 2022 at 02:25 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `powerdistributed`
--

-- --------------------------------------------------------

--
-- Table structure for table `dailytransmission`
--

CREATE TABLE `dailytransmission` (
  `id` varchar(10) NOT NULL,
  `localsubid` varchar(15) NOT NULL,
  `quntity` double NOT NULL,
  `report-date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dailytransmission`
--

INSERT INTO `dailytransmission` (`id`, `localsubid`, `quntity`, `report-date`) VALUES
('sub123', '[value-2]', 0, '[value-4]'),
('lo456', '103', 31, '3-2-2005');

-- --------------------------------------------------------

--
-- Table structure for table `energyconsume`
--

CREATE TABLE `energyconsume` (
  `id` int(5) NOT NULL,
  `energyConsumeCode` varchar(10) NOT NULL,
  `quantity` double NOT NULL,
  `units` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `energyconsume`
--

INSERT INTO `energyconsume` (`id`, `energyConsumeCode`, `quantity`, `units`) VALUES
(90, 'sub123', 12, 1300),
(91, 'lo456', 31, 2340);

-- --------------------------------------------------------

--
-- Table structure for table `localsubstation`
--

CREATE TABLE `localsubstation` (
  `id` int(5) NOT NULL,
  `substaionCode` varchar(10) NOT NULL,
  `active` varchar(5) NOT NULL,
  `activeFrom` varchar(31) NOT NULL,
  `activeTo` varchar(31) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `localsubstation`
--

INSERT INTO `localsubstation` (`id`, `substaionCode`, `active`, `activeFrom`, `activeTo`) VALUES
(101, 'sub123', 'true', '34-3-1999', ''),
(102, 'sub234', 'true', '24-9-2005', ''),
(103, 'lo456', 'false', '9-3-1992', '19-4-2022'),
(104, 'lc844', 'true', '5-9-2009', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
