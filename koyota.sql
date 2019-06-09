-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: koyota
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_autorizacao`
--

DROP TABLE IF EXISTS `tb_autorizacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_autorizacao` (
  `AUT_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `AUT_NOME` varchar(20) NOT NULL,
  PRIMARY KEY (`AUT_ID`),
  UNIQUE KEY `UNI_AUT_NOME` (`AUT_NOME`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_autorizacao`
--

LOCK TABLES `tb_autorizacao` WRITE;
/*!40000 ALTER TABLE `tb_autorizacao` DISABLE KEYS */;
INSERT INTO `tb_autorizacao` VALUES (2,'ROLE_ADMIN'),(1,'ROLE_USUARIO');
/*!40000 ALTER TABLE `tb_autorizacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_carro`
--

DROP TABLE IF EXISTS `tb_carro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_carro` (
  `CAR_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `CAR_NOME` varchar(100) NOT NULL,
  `CAR_KM` varchar(500) NOT NULL,
  `CAR_CATEGORIA` varchar(20) DEFAULT NULL,
  `CAR_MODELO` varchar(20) DEFAULT NULL,
  `CAR_ANO` int(4) DEFAULT NULL,
  `CAR_FABRICANTE` varchar(20) DEFAULT NULL,
  `CAR_COR` varchar(20) DEFAULT NULL,
  `CAR_DISPONIVEL` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`CAR_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_carro`
--

LOCK TABLES `tb_carro` WRITE;
/*!40000 ALTER TABLE `tb_carro` DISABLE KEYS */;
INSERT INTO `tb_carro` VALUES (1,'Teste','cat Teste','12','mod Teste',2101,'fab teste','amarelo',1),(3,'Palio','225000','popular','classico',2005,'FIAT','preto',1),(4,'Corsa','190000','popular','classico',1999,'Chevrolet','verde',1),(5,'Fiesta','10000','sem-novo','classico',2010,'Ford','branco',1),(6,'Versa','130000','semi-novo','classico',2017,'Nissan','branco',1),(7,'Gol','225000','popular','classico',1997,'Volkswagen','cinza',1),(8,'Ix35','0','novo','classico',2018,'Hyundai','preto',1),(9,'Ecosport','150000','semi-novo','classico',2015,'Ford','beige',1),(10,'Civic','0','novo','classico',2017,'Honda','preto',1),(11,'Fusca','10000','semi-novo','classico',2016,'Volkswagen','preto',1),(12,'Premio','300000','popular','classico',1995,'FIAT','Vermelho',1),(13,'Audi A3','0','novo','classico',2016,'Audi','Branco',1),(14,'Audi A4','0','novo','classico',2017,'Audi','Branco',1),(15,'Paraty','280000','popular','classico',1997,'Volkswagen','Cinza',1),(16,'Honda Fit','10000','Semi-novo','classico',2008,'Honda','Cinza',1),(17,'Fox','20000','Semi-novo','classico',2013,'Volkswagen','Branco',1),(18,'Peugeot 308','160000','Semi-novo','classico',2012,'Peugeot','Branco',1),(19,'Lancer','50000','Semi-novo','classico',2014,'Mitsubishi','preto',1),(20,'F-pace','20000','Semi-novo','classico',2014,'Jaguar','Branco',1),(21,'Onix','0','novo','classico',2017,'Chevrolete','preto',1),(22,'C-180','0','novo','classico',2015,'Mercedes-benz','Preto',1),(23,'Chevette','300000','popular','classico',1992,'Chevrolet','Cinza',1);
/*!40000 ALTER TABLE `tb_carro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_reserva`
--

DROP TABLE IF EXISTS `tb_reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_reserva` (
  `RESERVA_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `RSV_USR_ID` bigint(20) NOT NULL,
  `RSV_CAR_ID` bigint(20) NOT NULL,
  `DATA_INICIO` varchar(25) NOT NULL,
  `DATA_FIM` varchar(25) NOT NULL,
  PRIMARY KEY (`RESERVA_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_reserva`
--

LOCK TABLES `tb_reserva` WRITE;
/*!40000 ALTER TABLE `tb_reserva` DISABLE KEYS */;
INSERT INTO `tb_reserva` VALUES (7,2,2,'2019-05-01','2019-05-22'),(8,2,1,'2019-05-03','2019-05-17'),(9,2,1,'2019-05-01','2019-05-24'),(10,2,2,'2019-05-01','2019-05-29'),(11,1,2,'2019-05-03','2019-05-30'),(12,1,1,'2019-05-01','2019-05-23'),(13,1,1,'2019-05-08','2019-05-24'),(14,1,1,'2019-05-02','2019-05-31');
/*!40000 ALTER TABLE `tb_reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuario`
--

DROP TABLE IF EXISTS `tb_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_usuario` (
  `USR_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `USR_NOME` varchar(20) NOT NULL,
  `USR_SENHA` varchar(50) NOT NULL,
  `USR_CPF` varchar(25) NOT NULL,
  `USR_TELEFONE` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`USR_ID`),
  UNIQUE KEY `UNI_USUARIO_NOME` (`USR_NOME`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuario`
--

LOCK TABLES `tb_usuario` WRITE;
/*!40000 ALTER TABLE `tb_usuario` DISABLE KEYS */;
INSERT INTO `tb_usuario` VALUES (1,'teste','{MD5}698dc19d489c4e4db73e28a713eab07b','123123123123',NULL),(2,'admin','{MD5}21232f297a57a5a743894a0e4a801fc3','123123123123',NULL);
/*!40000 ALTER TABLE `tb_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuario_autorizacao`
--

DROP TABLE IF EXISTS `tb_usuario_autorizacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_usuario_autorizacao` (
  `USR_ID` bigint(20) unsigned NOT NULL,
  `AUT_ID` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`USR_ID`,`AUT_ID`),
  KEY `AUT_AUTORIZACAO_FK` (`AUT_ID`),
  CONSTRAINT `tb_usuario_autorizacao_ibfk_1` FOREIGN KEY (`USR_ID`) REFERENCES `tb_usuario` (`USR_ID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `tb_usuario_autorizacao_ibfk_2` FOREIGN KEY (`AUT_ID`) REFERENCES `tb_autorizacao` (`AUT_ID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuario_autorizacao`
--

LOCK TABLES `tb_usuario_autorizacao` WRITE;
/*!40000 ALTER TABLE `tb_usuario_autorizacao` DISABLE KEYS */;
INSERT INTO `tb_usuario_autorizacao` VALUES (1,1),(2,1),(2,2);
/*!40000 ALTER TABLE `tb_usuario_autorizacao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-09 17:21:00
