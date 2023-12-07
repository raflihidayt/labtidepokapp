-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 07 Des 2023 pada 10.50
-- Versi Server: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `datadepok`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `datadepok`
--

CREATE TABLE IF NOT EXISTS `datadepok` (
  `id` int(8) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `rating` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `datadepok`
--

INSERT INTO `datadepok` (`id`, `nama`, `alamat`, `rating`) VALUES
(111, 'Depok City', 'Jawa Barat, Indonesia', 5),
(113, 'Masjid Dian Almahri', 'Jl. Meruyung Raya, Meruyung', 4),
(114, 'Depok Town Square', 'Jl. Margonda Raya No.1', 4),
(115, 'Kampus D Gunadarma', 'JL. Margonda Raya No 100. Pondok Cina, Depok ', 5);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
