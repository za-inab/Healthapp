-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: user
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user_table`
--

DROP TABLE IF EXISTS `user_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_table` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Age` varchar(45) DEFAULT NULL,
  `Blood_Group` varchar(45) DEFAULT NULL,
  `IQ` varchar(45) NOT NULL,
  `Weight` varchar(45) DEFAULT NULL,
  `Height` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_table`
--

LOCK TABLES `user_table` WRITE;
/*!40000 ALTER TABLE `user_table` DISABLE KEYS */;
INSERT INTO `user_table` VALUES (1,'Kaynat','19','O+','95','47','160'),(2,'Zainab','19','O-','95','52','165'),(3,'Urooj','18','A+','98','43','155'),(4,'Fatima','18','A+','98','43','155'),(5,'Nimra','20','AB-','95','45','149'),(6,'Jameel','13','O-','100','37','130'),(7,'Kiran','32','O+','101','63','167'),(8,'Helen','34','O-','98','66','180'),(9,'john','55','B+','96','80','189'),(10,'Sadia','12','B-','92','30','135'),(11,'hamza',NULL,NULL,'1234',NULL,NULL),(12,'Nawal',NULL,NULL,'98',NULL,NULL),(13,'Nawal',NULL,NULL,'98',NULL,NULL),(14,'Sobia',NULL,NULL,'100',NULL,NULL),(15,'Sobia',NULL,NULL,'100',NULL,NULL),(16,'Sobia',NULL,NULL,'100',NULL,NULL),(17,'Sobia',NULL,NULL,'100',NULL,NULL),(18,'hira','20',NULL,'88','45','150'),(19,'kj,k','12','O','123','12','12'),(20,'Noor','13','O','100','54','133'),(21,'test123','33','33','2','33','66'),(22,'test234','22','22','22','22','22'),(23,'test345','22','22','22','22','22'),(24,'test456','22','22','22','22','22'),(25,'test567','33','33','4','22','22'),(26,'Miraal','32','3','232','32','32'),(27,'anaya','24','32','2322','32','323'),(28,'Kinza','13','12','123','23','21');
/*!40000 ALTER TABLE `user_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-09 20:34:35
