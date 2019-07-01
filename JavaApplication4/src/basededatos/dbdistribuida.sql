-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-07-2019 a las 00:29:45
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbdistribuida`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `matricula` int(11) NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `apellidopat` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `apellidomat` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `id_colonia` int(11) NOT NULL,
  `calle` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `numero` int(11) NOT NULL,
  `codigopostal` int(11) NOT NULL,
  `correoelectronico` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `id_sexo` int(11) NOT NULL,
  `edad` int(11) NOT NULL,
  `id_horario` int(11) NOT NULL,
  `curp` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `foto_archivo` longblob NOT NULL,
  `boleta` float NOT NULL,
  `id_status` int(11) NOT NULL,
  `id_especial` int(11) NOT NULL,
  `id_grupo` int(11) NOT NULL,
  `id_salon` int(11) NOT NULL,
  `id_certificacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calendario`
--

CREATE TABLE `calendario` (
  `id_calendario` int(11) NOT NULL,
  `id_grupo` int(11) DEFAULT NULL,
  `id_dia` int(11) DEFAULT NULL,
  `id_materia` int(11) DEFAULT NULL,
  `horario` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cede`
--

CREATE TABLE `cede` (
  `id_cede` int(11) NOT NULL,
  `nombrecede` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_colonia` int(11) DEFAULT NULL,
  `calle` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `codigo_postal` int(11) DEFAULT NULL,
  `correo` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_director` int(11) DEFAULT NULL,
  `id_salon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colonia`
--

CREATE TABLE `colonia` (
  `id_colonia` int(11) NOT NULL,
  `colonia` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `id_estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dia`
--

CREATE TABLE `dia` (
  `id_dia` int(11) NOT NULL,
  `dia` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `director`
--

CREATE TABLE `director` (
  `id_director` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `apellidopat` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `apellidomat` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` int(11) NOT NULL,
  `correo` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `id_colonia` int(11) NOT NULL,
  `calle` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `numero` int(11) NOT NULL,
  `codigo-postal` int(11) NOT NULL,
  `id_sexo` int(11) NOT NULL,
  `edad` int(11) NOT NULL,
  `horario` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE `docente` (
  `id_docente` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `apellidopat` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `apellidomat` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `id_turno` int(11) NOT NULL,
  `id_sex` int(11) NOT NULL,
  `curp` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `id_colonia` int(11) NOT NULL,
  `calle` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `numero` int(11) NOT NULL,
  `codigo-postal` int(11) NOT NULL,
  `correo` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` int(11) NOT NULL,
  `id_salon` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especial`
--

CREATE TABLE `especial` (
  `id_mad` int(11) NOT NULL,
  `id_alumno` int(11) NOT NULL,
  `id_materia` int(11) NOT NULL,
  `id_docente` int(11) NOT NULL,
  `calificacion` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE `estado` (
  `id_estado` int(11) NOT NULL,
  `estado` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo`
--

CREATE TABLE `grupo` (
  `id_grupo` int(11) NOT NULL,
  `grupo` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario clase`
--

CREATE TABLE `horario clase` (
  `id_horario` int(11) NOT NULL,
  `id_dia` int(11) NOT NULL,
  `id_mes` int(11) NOT NULL,
  `hora` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL,
  `materia` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mes`
--

CREATE TABLE `mes` (
  `id_mes` int(11) NOT NULL,
  `mes` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sexo`
--

CREATE TABLE `sexo` (
  `id_sexo` int(11) NOT NULL,
  `sexo` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `status`
--

CREATE TABLE `status` (
  `id_status` int(11) NOT NULL,
  `status` enum('No aprobado','Aprobado') COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno docente`
--

CREATE TABLE `turno docente` (
  `id_turno` int(11) NOT NULL,
  `turno` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `horario` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `usuario` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `contraseña` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `apellido_paterno` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `apellido_materno` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`matricula`),
  ADD KEY `id_colonia` (`id_colonia`),
  ADD KEY `id_sexo` (`id_sexo`,`id_status`,`id_especial`),
  ADD KEY `id_grupo` (`id_grupo`,`id_salon`,`id_certificacion`),
  ADD KEY `id_status` (`id_status`),
  ADD KEY `id_salon` (`id_salon`),
  ADD KEY `id_especial` (`id_especial`),
  ADD KEY `id_certificacion` (`id_certificacion`),
  ADD KEY `id_horario` (`id_horario`);

--
-- Indices de la tabla `calendario`
--
ALTER TABLE `calendario`
  ADD PRIMARY KEY (`id_calendario`),
  ADD KEY `id_grupo` (`id_grupo`),
  ADD KEY `id_dia` (`id_dia`),
  ADD KEY `id_materia` (`id_materia`);

--
-- Indices de la tabla `cede`
--
ALTER TABLE `cede`
  ADD PRIMARY KEY (`id_cede`),
  ADD KEY `id_colonia` (`id_colonia`),
  ADD KEY `id_director` (`id_director`),
  ADD KEY `id_salon` (`id_salon`);

--
-- Indices de la tabla `colonia`
--
ALTER TABLE `colonia`
  ADD PRIMARY KEY (`id_colonia`),
  ADD KEY `id_estado` (`id_estado`);

--
-- Indices de la tabla `dia`
--
ALTER TABLE `dia`
  ADD PRIMARY KEY (`id_dia`);

--
-- Indices de la tabla `director`
--
ALTER TABLE `director`
  ADD PRIMARY KEY (`id_director`),
  ADD KEY `id_colonia` (`id_colonia`,`id_sexo`),
  ADD KEY `id_sexo` (`id_sexo`);

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`id_docente`),
  ADD KEY `id_turno` (`id_turno`,`id_sex`,`id_colonia`),
  ADD KEY `id_salon` (`id_salon`),
  ADD KEY `id_sex` (`id_sex`),
  ADD KEY `id_colonia` (`id_colonia`);

--
-- Indices de la tabla `especial`
--
ALTER TABLE `especial`
  ADD PRIMARY KEY (`id_mad`),
  ADD KEY `id_alumno` (`id_alumno`,`id_materia`,`id_docente`),
  ADD KEY `id_materia` (`id_materia`);

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`id_estado`);

--
-- Indices de la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD PRIMARY KEY (`id_grupo`);

--
-- Indices de la tabla `horario clase`
--
ALTER TABLE `horario clase`
  ADD PRIMARY KEY (`id_horario`),
  ADD KEY `id_dia` (`id_dia`,`id_mes`),
  ADD KEY `id_mes` (`id_mes`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`id_materia`);

--
-- Indices de la tabla `mes`
--
ALTER TABLE `mes`
  ADD PRIMARY KEY (`id_mes`);

--
-- Indices de la tabla `sexo`
--
ALTER TABLE `sexo`
  ADD PRIMARY KEY (`id_sexo`);

--
-- Indices de la tabla `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`id_status`);

--
-- Indices de la tabla `turno docente`
--
ALTER TABLE `turno docente`
  ADD PRIMARY KEY (`id_turno`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `matricula` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `colonia`
--
ALTER TABLE `colonia`
  MODIFY `id_colonia` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `dia`
--
ALTER TABLE `dia`
  MODIFY `id_dia` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `director`
--
ALTER TABLE `director`
  MODIFY `id_director` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `docente`
--
ALTER TABLE `docente`
  MODIFY `id_docente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `especial`
--
ALTER TABLE `especial`
  MODIFY `id_mad` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `estado`
--
ALTER TABLE `estado`
  MODIFY `id_estado` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `grupo`
--
ALTER TABLE `grupo`
  MODIFY `id_grupo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `horario clase`
--
ALTER TABLE `horario clase`
  MODIFY `id_horario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `id_materia` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `mes`
--
ALTER TABLE `mes`
  MODIFY `id_mes` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sexo`
--
ALTER TABLE `sexo`
  MODIFY `id_sexo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `status`
--
ALTER TABLE `status`
  MODIFY `id_status` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `turno docente`
--
ALTER TABLE `turno docente`
  MODIFY `id_turno` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD CONSTRAINT `alumno_ibfk_1` FOREIGN KEY (`id_sexo`) REFERENCES `sexo` (`id_sexo`),
  ADD CONSTRAINT `alumno_ibfk_2` FOREIGN KEY (`id_status`) REFERENCES `status` (`id_status`),
  ADD CONSTRAINT `alumno_ibfk_4` FOREIGN KEY (`id_grupo`) REFERENCES `grupo` (`id_grupo`),
  ADD CONSTRAINT `alumno_ibfk_5` FOREIGN KEY (`id_especial`) REFERENCES `especial` (`id_mad`),
  ADD CONSTRAINT `alumno_ibfk_6` FOREIGN KEY (`id_certificacion`) REFERENCES `tipo_certificado` (`id_certificado`),
  ADD CONSTRAINT `alumno_ibfk_7` FOREIGN KEY (`id_colonia`) REFERENCES `colonia` (`id_colonia`),
  ADD CONSTRAINT `alumno_ibfk_8` FOREIGN KEY (`id_horario`) REFERENCES `horario clase` (`id_horario`);

--
-- Filtros para la tabla `calendario`
--
ALTER TABLE `calendario`
  ADD CONSTRAINT `calendario_ibfk_1` FOREIGN KEY (`id_grupo`) REFERENCES `grupo` (`id_grupo`),
  ADD CONSTRAINT `calendario_ibfk_2` FOREIGN KEY (`id_dia`) REFERENCES `dia` (`id_dia`),
  ADD CONSTRAINT `calendario_ibfk_3` FOREIGN KEY (`id_materia`) REFERENCES `materia` (`id_materia`);

--
-- Filtros para la tabla `cede`
--
ALTER TABLE `cede`
  ADD CONSTRAINT `cede_ibfk_1` FOREIGN KEY (`id_colonia`) REFERENCES `colonia` (`id_colonia`),
  ADD CONSTRAINT `cede_ibfk_2` FOREIGN KEY (`id_director`) REFERENCES `director` (`id_director`),
  ADD CONSTRAINT `cede_ibfk_3` FOREIGN KEY (`id_salon`) REFERENCES `salon` (`id_salon`);

--
-- Filtros para la tabla `colonia`
--
ALTER TABLE `colonia`
  ADD CONSTRAINT `colonia_ibfk_1` FOREIGN KEY (`id_estado`) REFERENCES `estado` (`id_estado`);

--
-- Filtros para la tabla `director`
--
ALTER TABLE `director`
  ADD CONSTRAINT `director_ibfk_1` FOREIGN KEY (`id_sexo`) REFERENCES `sexo` (`id_sexo`),
  ADD CONSTRAINT `director_ibfk_2` FOREIGN KEY (`id_colonia`) REFERENCES `colonia` (`id_colonia`);

--
-- Filtros para la tabla `docente`
--
ALTER TABLE `docente`
  ADD CONSTRAINT `docente_ibfk_1` FOREIGN KEY (`id_sex`) REFERENCES `sexo` (`id_sexo`),
  ADD CONSTRAINT `docente_ibfk_3` FOREIGN KEY (`id_colonia`) REFERENCES `colonia` (`id_colonia`),
  ADD CONSTRAINT `docente_ibfk_4` FOREIGN KEY (`id_turno`) REFERENCES `turno docente` (`id_turno`);

--
-- Filtros para la tabla `especial`
--
ALTER TABLE `especial`
  ADD CONSTRAINT `especial_ibfk_1` FOREIGN KEY (`id_materia`) REFERENCES `materia` (`id_materia`);

--
-- Filtros para la tabla `horario clase`
--
ALTER TABLE `horario clase`
  ADD CONSTRAINT `horario clase_ibfk_1` FOREIGN KEY (`id_mes`) REFERENCES `mes` (`id_mes`),
  ADD CONSTRAINT `horario clase_ibfk_2` FOREIGN KEY (`id_dia`) REFERENCES `dia` (`id_dia`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
