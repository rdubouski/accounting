-- phpMyAdmin SQL Dump
-- version 4.9.10
-- https://www.phpmyadmin.net/
--
-- Хост: localhost
-- Время создания: Фев 12 2024 г., 05:13
-- Версия сервера: 5.5.57-MariaDB
-- Версия PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `accountingDB`
--

-- --------------------------------------------------------

--
-- Структура таблицы `list_extinguishers`
--

CREATE TABLE `list_extinguishers` (
  `id` bigint(20) NOT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `date_load` date DEFAULT NULL,
  `date_reload` date DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL,
  `place` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `list_extinguishers`
--

INSERT INTO `list_extinguishers` (`id`, `brand`, `date_load`, `date_reload`, `department`, `number`, `place`) VALUES
(1, 'ОУ-3', '2020-09-01', '2025-09-01', 'СЗПГоК', '1', 'Кабинет СЗПГК'),
(2, 'ОУ-3', '2019-04-01', '2024-04-01', 'СЗПГоК', '2', 'Бокс №2'),
(3, 'ОУ-9', '2021-05-01', '2026-05-01', 'СЗПГоК', '3', 'Мастерская СЗПГК'),
(4, 'ОУ-9', '2021-05-01', '2026-05-01', 'СЗПГоК', '4', 'Мастерская СЗПГК');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `list_extinguishers`
--
ALTER TABLE `list_extinguishers`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
