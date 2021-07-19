-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 22, 2020 at 05:50 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schoolmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `qualification` varchar(100) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `fid` varchar(100) NOT NULL,
  `gmarks` varchar(100) NOT NULL,
  `xiimarks` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `aadhar` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`name`, `email`, `fname`, `dob`, `gender`, `qualification`, `Address`, `fid`, `gmarks`, `xiimarks`, `phone`, `aadhar`) VALUES
('Gopal Pradhan', 'gp@gmail.com', 'Aashtha Pradhan', '04/11/1989', 'Male', 'PHD', 'Banarhat', '22854256996', '80%', '98%', '6296002855', '123456987456'),
('Ashok Jha', 'ak@gmail.in', 'MK jha', '04/12/1960', 'Male', 'PHD', 'BIHAR ', '22852274453', '85%', '83%', '6296002855', '123654789632');

-- --------------------------------------------------------

--
-- Table structure for table `facultyattendence`
--

CREATE TABLE `facultyattendence` (
  `fid` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `firsthalf` varchar(100) NOT NULL,
  `secondhalf` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `facultyattendence`
--

INSERT INTO `facultyattendence` (`fid`, `date`, `firsthalf`, `secondhalf`) VALUES
('22854256996', 'Sat Jun 27 18:11:07 IST 2020', 'ABSENT', 'PRESENT');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('rahuljha3246@gmail.com', 'Rahul@18'),
('admin', 'admin'),
('biswasoraon716@gmail.com', 'bis'),
('biswasoraon716@gmail.com', 'bis'),
('biswasoraon716@gmail.com', 'bis'),
('biswasoraon716@gmail.com', 'bis'),
('biswasoraon716@gmail.com', 'bis'),
('biswasoraon716@gmail.com', 'bis'),
('biswasoraon716@gmail.com', 'bis'),
('bisw', 'bis'),
('bisw', 'bis');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `Email` varchar(100) NOT NULL,
  `r-password` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`Email`, `r-password`, `password`) VALUES
('rahuljha3246@gmail.com', 'Rahul@18', 'Rahul@18'),
('admin', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `student1`
--

CREATE TABLE `student1` (
  `sname` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `address` varchar(200) NOT NULL,
  `sid` varchar(100) NOT NULL,
  `class` varchar(100) NOT NULL,
  `adhar` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student1`
--

INSERT INTO `student1` (`sname`, `email`, `fname`, `dob`, `gender`, `address`, `sid`, `class`, `adhar`, `phone`) VALUES
('Rahul Jha', 'rt@gmail.com', 'Mati Kant Jha', '04/11/2000', 'Male', 'Banarhat', '45295959550', '10', '123654879845', '236845212');

-- --------------------------------------------------------

--
-- Table structure for table `student2`
--

CREATE TABLE `student2` (
  `name` varchar(20) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `stream` varchar(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `sid` varchar(100) NOT NULL,
  `class` varchar(100) NOT NULL,
  `xmarks` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `aadhar` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student2`
--

INSERT INTO `student2` (`name`, `Email`, `fname`, `dob`, `gender`, `stream`, `address`, `sid`, `class`, `xmarks`, `phone`, `aadhar`) VALUES
('Rahul Jha', 'pl@gmail.in', 'MK Jha', '04/11/1999', 'Male', 'SCIENCE', 'Banarhat', '45691282672', '11', '72%', '1236547896', '1236547896789'),
('Manish Goswami', 'Mg@gmail.com', 'Kishore Goswami', '09/02/1999', 'Male', 'SCIENCE', 'Banarhat', '45697090599', '11', '83%', '6398521470', '1236547896'),
('Rani Sah', 'rs @gmail.com', 'Rani Sah', '04/12/1999', 'Female', 'SCIENCE', 'Banarhat', '45695978677', '11', '79%', '32145987232', '1236547896');

-- --------------------------------------------------------

--
-- Table structure for table `xattendence`
--

CREATE TABLE `xattendence` (
  `sid` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `firsthalf` varchar(100) NOT NULL,
  `secondhalf` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `xattendence`
--

INSERT INTO `xattendence` (`sid`, `date`, `firsthalf`, `secondhalf`) VALUES
('45295959550', 'Sat Jun 27 17:01:35 IST 2020', 'ABSENT', 'PRESENT'),
('45295959550', 'Sat Jun 27 17:05:34 IST 2020', 'ABSENT', 'PRESENT'),
('45295959550', 'Sat Jun 27 17:05:45 IST 2020', 'ABSENT', 'PRESENT'),
('45295959550', 'Sat Jun 27 17:05:49 IST 2020', 'ABSENT', 'PRESENT'),
('45295959550', 'Sat Jun 27 17:05:51 IST 2020', 'ABSENT', 'PRESENT'),
('45295959550', 'Sat Jun 27 21:25:19 IST 2020', 'PRESENT', 'PRESENT');

-- --------------------------------------------------------

--
-- Table structure for table `xiiattendence`
--

CREATE TABLE `xiiattendence` (
  `sid` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `firsthalf` varchar(100) NOT NULL,
  `secondhalf` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `xiiattendence`
--

INSERT INTO `xiiattendence` (`sid`, `date`, `firsthalf`, `secondhalf`) VALUES
('45691282672', 'Sun Jun 28 18:21:45 IST 2020', 'PRESENT', 'PRESENT'),
('45697090599', 'Sun Jun 28 18:21:54 IST 2020', 'ABSENT', 'PRESENT'),
('45695978677', 'Sun Jun 28 18:22:03 IST 2020', 'PRESENT', 'PRESENT');

-- --------------------------------------------------------

--
-- Table structure for table `xiiresult`
--

CREATE TABLE `xiiresult` (
  `name` varchar(100) NOT NULL,
  `sid` varchar(100) NOT NULL,
  `class` varchar(100) NOT NULL,
  `school` varchar(100) NOT NULL,
  `stream` varchar(100) NOT NULL,
  `english` varchar(100) NOT NULL,
  `hindi` varchar(100) NOT NULL,
  `math` varchar(100) NOT NULL,
  `physics` varchar(100) NOT NULL,
  `chemistry` varchar(100) NOT NULL,
  `biology` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `xiiresult`
--

INSERT INTO `xiiresult` (`name`, `sid`, `class`, `school`, `stream`, `english`, `hindi`, `math`, `physics`, `chemistry`, `biology`) VALUES
('Rahul Jha', '45691282672', '11', 'ADARSH VIDYA MANDIR H SCHOOL', 'SCIENCE', '78', '81', '76', '76', '67', '76');

-- --------------------------------------------------------

--
-- Table structure for table `xresult`
--

CREATE TABLE `xresult` (
  `sname` varchar(100) NOT NULL,
  `roll_no` varchar(100) NOT NULL,
  `class` varchar(100) NOT NULL,
  `school` varchar(100) NOT NULL,
  `english` varchar(100) NOT NULL,
  `hindi` varchar(100) NOT NULL,
  `math` varchar(100) NOT NULL,
  `science` varchar(100) NOT NULL,
  `geography` varchar(100) NOT NULL,
  `history` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `xresult`
--

INSERT INTO `xresult` (`sname`, `roll_no`, `class`, `school`, `english`, `hindi`, `math`, `science`, `geography`, `history`) VALUES
('Rahul Jha', '45295959550', '10', 'DPS', '78', '89', '78', '98', '88', '63');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
