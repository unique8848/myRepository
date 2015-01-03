-- MySQL dump 10.13  Distrib 5.6.21, for osx10.8 (x86_64)
--
-- Host: localhost    Database: kf
-- ------------------------------------------------------
-- Server version	5.6.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `KF_FUNC`
--

DROP TABLE IF EXISTS `KF_FUNC`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `KF_FUNC` (
  `ID` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `FUNC_NO` char(20) NOT NULL,
  `FUNC_NAME` char(30) NOT NULL,
  `PARENT_ID` smallint(5) unsigned NOT NULL,
  `FUNC_SN` smallint(5) unsigned DEFAULT NULL,
  `FUNC_DESC` char(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `KF_FUNC`
--

LOCK TABLES `KF_FUNC` WRITE;
/*!40000 ALTER TABLE `KF_FUNC` DISABLE KEYS */;
INSERT INTO `KF_FUNC` VALUES (21,'func_1','Function1',0,1,'This function is designed to populate ktw\'s framework.'),(22,'func_2','Function2',0,2,'This function is designed to populate ktw\'s framework.'),(23,'func_3','Function3',0,3,'This function is designed to populate ktw\'s framework.'),(24,'func_4','Function4',0,4,'This function is designed to populate ktw\'s framework.'),(25,'func_5','Function5',0,5,'This function is designed to populate ktw\'s framework.'),(26,'func_6','Function6',0,6,'This function is designed to populate ktw\'s framework.'),(27,'func_7','Function7',0,7,'This function is designed to populate ktw\'s framework.'),(28,'func_8','Function8',0,8,'This function is designed to populate ktw\'s framework.'),(29,'func_9','Function9',0,9,'This function is designed to populate ktw\'s framework.');
/*!40000 ALTER TABLE `KF_FUNC` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `KF_ORG`
--

DROP TABLE IF EXISTS `KF_ORG`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `KF_ORG` (
  `ID` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `PARENT_ID` smallint(5) unsigned NOT NULL,
  `ORG_SN` char(20) NOT NULL,
  `ORG_NAME` char(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `KF_ORG`
--

LOCK TABLES `KF_ORG` WRITE;
/*!40000 ALTER TABLE `KF_ORG` DISABLE KEYS */;
INSERT INTO `KF_ORG` VALUES (1,0,'org_0','org_0'),(2,1,'org_1','org_1'),(3,1,'org_2','org_2'),(4,1,'org_3','org_3'),(5,1,'org_4','org_4'),(6,1,'org_5','org_5'),(7,1,'org_6','org_6'),(8,1,'org_7','org_7'),(9,1,'org_8','org_8'),(10,1,'org_9','org_9'),(11,1,'org_10','org_10'),(12,1,'org_11','org_11'),(13,1,'org_12','org_12'),(14,1,'org_13','org_13'),(15,1,'org_14','org_14'),(16,1,'org_15','org_15'),(17,1,'org_16','org_16'),(18,1,'org_17','org_17'),(19,1,'org_18','org_18'),(20,1,'org_19','org_19');
/*!40000 ALTER TABLE `KF_ORG` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `KF_USER`
--

DROP TABLE IF EXISTS `KF_USER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `KF_USER` (
  `ID` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `ORG_ID` smallint(5) unsigned NOT NULL,
  `USER_NAME` char(20) NOT NULL,
  `USER_PWD` char(50) NOT NULL,
  `LOGIN_NAME` char(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `KF_USER`
--

LOCK TABLES `KF_USER` WRITE;
/*!40000 ALTER TABLE `KF_USER` DISABLE KEYS */;
INSERT INTO `KF_USER` VALUES (1,1,'???','123456','???'),(2,1,'userName0','123456','userName0'),(3,2,'userName1','123456','userName1'),(4,3,'userName2','123456','userName2'),(5,4,'userName3','123456','userName3'),(6,5,'userName4','123456','userName4'),(7,6,'userName5','123456','userName5'),(8,7,'userName6','123456','userName6'),(9,8,'userName7','123456','userName7'),(10,9,'userName8','123456','userName8'),(11,1,'userName9','123456','userName9'),(12,2,'userName10','123456','userName10'),(13,2,'userName11','123456','userName11'),(14,2,'userName12','123456','userName12'),(15,2,'userName13','123456','userName13'),(16,2,'userName14','123456','userName14'),(17,2,'userName15','123456','userName15'),(18,2,'userName16','123456','userName16'),(19,2,'userName17','123456','userName17'),(20,2,'userName18','123456','userName18'),(21,2,'userName19','123456','userName19'),(22,3,'userName20','123456','userName20'),(23,3,'userName21','123456','userName21'),(24,3,'userName22','123456','userName22'),(25,3,'userName23','123456','userName23'),(26,3,'userName24','123456','userName24'),(27,3,'userName25','123456','userName25'),(28,3,'userName26','123456','userName26'),(29,3,'userName27','123456','userName27'),(30,3,'userName28','123456','userName28'),(31,3,'userName29','123456','userName29'),(32,4,'userName30','123456','userName30'),(33,4,'userName31','123456','userName31'),(34,4,'userName32','123456','userName32'),(35,4,'userName33','123456','userName33'),(36,4,'userName34','123456','userName34'),(37,4,'userName35','123456','userName35'),(38,4,'userName36','123456','userName36'),(39,4,'userName37','123456','userName37'),(40,4,'userName38','123456','userName38'),(41,4,'userName39','123456','userName39'),(42,5,'userName40','123456','userName40'),(43,5,'userName41','123456','userName41'),(44,5,'userName42','123456','userName42'),(45,5,'userName43','123456','userName43'),(46,5,'userName44','123456','userName44'),(47,5,'userName45','123456','userName45'),(48,5,'userName46','123456','userName46'),(49,5,'userName47','123456','userName47'),(50,5,'userName48','123456','userName48'),(51,5,'userName49','123456','userName49'),(52,6,'userName50','123456','userName50'),(53,6,'userName51','123456','userName51'),(54,6,'userName52','123456','userName52'),(55,6,'userName53','123456','userName53'),(56,6,'userName54','123456','userName54'),(57,6,'userName55','123456','userName55'),(58,6,'userName56','123456','userName56'),(59,6,'userName57','123456','userName57'),(60,6,'userName58','123456','userName58'),(61,6,'userName59','123456','userName59'),(62,7,'userName60','123456','userName60'),(63,7,'userName61','123456','userName61'),(64,7,'userName62','123456','userName62'),(65,7,'userName63','123456','userName63'),(66,7,'userName64','123456','userName64'),(67,7,'userName65','123456','userName65'),(68,7,'userName66','123456','userName66'),(69,7,'userName67','123456','userName67'),(70,7,'userName68','123456','userName68'),(71,7,'userName69','123456','userName69'),(72,8,'userName70','123456','userName70'),(73,8,'userName71','123456','userName71'),(74,8,'userName72','123456','userName72'),(75,8,'userName73','123456','userName73'),(76,8,'userName74','123456','userName74'),(77,8,'userName75','123456','userName75'),(78,8,'userName76','123456','userName76'),(79,8,'userName77','123456','userName77'),(80,8,'userName78','123456','userName78'),(81,8,'userName79','123456','userName79'),(82,9,'userName80','123456','userName80'),(83,9,'userName81','123456','userName81'),(84,9,'userName82','123456','userName82'),(85,9,'userName83','123456','userName83'),(86,9,'userName84','123456','userName84'),(87,9,'userName85','123456','userName85'),(88,9,'userName86','123456','userName86'),(89,9,'userName87','123456','userName87'),(90,9,'userName88','123456','userName88'),(91,9,'userName89','123456','userName89'),(92,1,'userName90','123456','userName90'),(93,1,'userName91','123456','userName91'),(94,1,'userName92','123456','userName92'),(95,1,'userName93','123456','userName93'),(96,1,'userName94','123456','userName94'),(97,1,'userName95','123456','userName95'),(98,1,'userName96','123456','userName96'),(99,1,'userName97','123456','userName97'),(100,1,'userName98','123456','userName98'),(101,1,'userName99','123456','userName99');
/*!40000 ALTER TABLE `KF_USER` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-01-04  2:12:09
