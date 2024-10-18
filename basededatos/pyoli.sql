-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-06-2022 a las 03:02:33
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pyoli`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos1`
--

CREATE TABLE `datos1` (
  `TipoVehiculo` varchar(100) NOT NULL,
  `PLACA` varchar(100) NOT NULL,
  `NOMBRE` varchar(300) NOT NULL,
  `TELEFONO` varchar(100) NOT NULL,
  `DIAEN` varchar(25) NOT NULL,
  `MESEN` varchar(50) NOT NULL,
  `AÑOEN` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `datos1`
--

INSERT INTO `datos1` (`TipoVehiculo`, `PLACA`, `NOMBRE`, `TELEFONO`, `DIAEN`, `MESEN`, `AÑOEN`) VALUES
('MOTO', 'DAY05G', 'ALEJANDRA', '3124584969', '20', '6', '2022');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `informe`
--

CREATE TABLE `informe` (
  `tipovehiculo` varchar(50) NOT NULL,
  `PLACA` varchar(80) NOT NULL,
  `NOMBRE` varchar(300) NOT NULL,
  `TELEFONO` varchar(100) NOT NULL,
  `DIAEI` varchar(115) NOT NULL,
  `MESEI` varchar(115) NOT NULL,
  `AÑOEI` varchar(80) NOT NULL,
  `DIAS` varchar(80) NOT NULL,
  `MESSA` varchar(80) NOT NULL,
  `AÑOSA` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `informe`
--

INSERT INTO `informe` (`tipovehiculo`, `PLACA`, `NOMBRE`, `TELEFONO`, `DIAEI`, `MESEI`, `AÑOEI`, `DIAS`, `MESSA`, `AÑOSA`) VALUES
('MOTO', 'FCL39F', 'SAMUEL CELIS', '3229169092', '20', '6', '2022', '21', '6', '2022'),
('MOTO', 'WOP52C', 'marquez', '312458962', '20', '6', '2022', '21', '6', '2020'),
('MOTO', 'FCL39F', 'SAMUEL CELIS', '3229169092', '20', '6', '2022', '21', '6', '2022'),
('MOTO', 'WOP52C', 'marquez', '312458962', '20', '6', '2022', '21', '6', '2020'),
('MOTO', 'DAY05G', 'ALEJANDRA', '3124584969', '20', '6', '2022', '', '', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
