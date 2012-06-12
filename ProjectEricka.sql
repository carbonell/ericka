/*
SQLyog Ultimate v9.02 
MySQL - 5.5.20-log : Database - ericka
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ericka` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `ericka`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `detail` varchar(255) DEFAULT NULL,
  `country` int(11) NOT NULL,
  `city` int(11) NOT NULL,
  `sector` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `country` (`country`),
  KEY `city` (`city`),
  KEY `sector` (`sector`),
  CONSTRAINT `address_ibfk_1` FOREIGN KEY (`country`) REFERENCES `country` (`id`),
  CONSTRAINT `address_ibfk_2` FOREIGN KEY (`city`) REFERENCES `city` (`id`),
  CONSTRAINT `address_ibfk_3` FOREIGN KEY (`sector`) REFERENCES `sector` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `country` */

DROP TABLE IF EXISTS `country`;

CREATE TABLE `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) DEFAULT NULL,
  `firstmidname` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `phone` varchar(13) DEFAULT NULL,
  `cellphone` varchar(13) DEFAULT NULL,
  `address` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `address` (`address`),
  CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`address`) REFERENCES `address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `laptop` */

DROP TABLE IF EXISTS `laptop`;

CREATE TABLE `laptop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `price` decimal(12,2) NOT NULL,
  `stock` int(11) NOT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `model` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `processor` varchar(255) DEFAULT NULL,
  `RAM` varchar(255) DEFAULT NULL,
  `HDD` varchar(255) DEFAULT NULL,
  `OS` varchar(255) DEFAULT NULL,
  `Screen` varchar(255) DEFAULT NULL,
  `VideoCard` varchar(255) DEFAULT NULL,
  `BuiltInCamera` bit(1) DEFAULT NULL,
  `WirelessConectivity` varchar(255) DEFAULT NULL,
  `MediaRecording` varchar(255) DEFAULT NULL,
  `MediaCardReader` varchar(255) DEFAULT NULL,
  `OtherFeatures` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `laptoppurchasedetail` */

DROP TABLE IF EXISTS `laptoppurchasedetail`;

CREATE TABLE `laptoppurchasedetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productpurchase` int(11) NOT NULL,
  `Laptop` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `cost` decimal(12,2) DEFAULT NULL,
  `taxes` decimal(4,2) DEFAULT NULL,
  `discount` decimal(4,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `productpurchase` (`productpurchase`),
  KEY `Laptop` (`Laptop`),
  CONSTRAINT `laptoppurchasedetail_ibfk_1` FOREIGN KEY (`productpurchase`) REFERENCES `productpurchase` (`id`),
  CONSTRAINT `laptoppurchasedetail_ibfk_2` FOREIGN KEY (`Laptop`) REFERENCES `laptop` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `laptopsaledetail` */

DROP TABLE IF EXISTS `laptopsaledetail`;

CREATE TABLE `laptopsaledetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productsale` int(11) NOT NULL,
  `laptop` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` decimal(12,2) DEFAULT NULL,
  `taxes` decimal(4,2) DEFAULT NULL,
  `discount` decimal(4,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `productsale` (`productsale`),
  KEY `laptop` (`laptop`),
  CONSTRAINT `laptopsaledetail_ibfk_1` FOREIGN KEY (`productsale`) REFERENCES `productsale` (`id`),
  CONSTRAINT `laptopsaledetail_ibfk_2` FOREIGN KEY (`laptop`) REFERENCES `laptop` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `moneyinput` */

DROP TABLE IF EXISTS `moneyinput`;

CREATE TABLE `moneyinput` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` decimal(12,2) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `moneyoutput` */

DROP TABLE IF EXISTS `moneyoutput`;

CREATE TABLE `moneyoutput` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` decimal(12,2) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `productpurchase` */

DROP TABLE IF EXISTS `productpurchase`;

CREATE TABLE `productpurchase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `supplier` int(11) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `supplier` (`supplier`),
  CONSTRAINT `productpurchase_ibfk_1` FOREIGN KEY (`supplier`) REFERENCES `supplier` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `productsale` */

DROP TABLE IF EXISTS `productsale`;

CREATE TABLE `productsale` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer` int(11) NOT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `customer` (`customer`),
  CONSTRAINT `productsale_ibfk_1` FOREIGN KEY (`customer`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `sector` */

DROP TABLE IF EXISTS `sector`;

CREATE TABLE `sector` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `smartphone` */

DROP TABLE IF EXISTS `smartphone`;

CREATE TABLE `smartphone` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `price` decimal(12,2) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `Brand` varchar(255) DEFAULT NULL,
  `Model` varchar(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Color` varchar(255) DEFAULT NULL,
  `StorageCapacity` varchar(255) DEFAULT NULL,
  `NetworkStandards` varchar(255) DEFAULT NULL,
  `TouchCapability` bit(1) DEFAULT NULL,
  `GPSCapability` bit(1) DEFAULT NULL,
  `WiFiCapability` bit(1) DEFAULT NULL,
  `BluetoothCapability` bit(1) DEFAULT NULL,
  `InfraredCapability` bit(1) DEFAULT NULL,
  `QWERTYKeyboard` bit(1) DEFAULT NULL,
  `ScreenWidth` varchar(255) DEFAULT NULL,
  `ScreenHeight` varchar(255) DEFAULT NULL,
  `Camera` varchar(255) DEFAULT NULL,
  `VideoRecording` varchar(255) DEFAULT NULL,
  `FlashCapability` bit(1) DEFAULT NULL,
  `OperativeSystem` varchar(255) DEFAULT NULL,
  `OSVersion` varchar(255) DEFAULT NULL,
  `Processor` varchar(255) DEFAULT NULL,
  `RAM` varchar(255) DEFAULT NULL,
  `OtherFeatures` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `smartphonechange` */

DROP TABLE IF EXISTS `smartphonechange`;

CREATE TABLE `smartphonechange` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `reason` varchar(255) DEFAULT NULL,
  `smartphonesaledetail` int(11) NOT NULL,
  `smartphonegiven` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `smartphonesaledetail` (`smartphonesaledetail`),
  KEY `smartphonegiven` (`smartphonegiven`),
  CONSTRAINT `smartphonechange_ibfk_1` FOREIGN KEY (`smartphonegiven`) REFERENCES `smartphone` (`id`),
  CONSTRAINT `smartphonechange_ibfk_2` FOREIGN KEY (`smartphonesaledetail`) REFERENCES `smartphonesaledetail` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `smartphonepurchasedetail` */

DROP TABLE IF EXISTS `smartphonepurchasedetail`;

CREATE TABLE `smartphonepurchasedetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productpurchase` int(11) NOT NULL,
  `Smartphone` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `cost` decimal(12,2) DEFAULT NULL,
  `taxes` decimal(4,2) DEFAULT NULL,
  `discount` decimal(4,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `productpurchase` (`productpurchase`),
  KEY `Smartphone` (`Smartphone`),
  CONSTRAINT `smartphonepurchasedetail_ibfk_1` FOREIGN KEY (`productpurchase`) REFERENCES `productpurchase` (`id`),
  CONSTRAINT `smartphonepurchasedetail_ibfk_2` FOREIGN KEY (`Smartphone`) REFERENCES `smartphone` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `smartphonerepairment` */

DROP TABLE IF EXISTS `smartphonerepairment`;

CREATE TABLE `smartphonerepairment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Smartphone` int(11) NOT NULL,
  `problem` varchar(255) DEFAULT NULL,
  `technician` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Smartphone` (`Smartphone`),
  KEY `technician` (`technician`),
  CONSTRAINT `smartphonerepairment_ibfk_1` FOREIGN KEY (`Smartphone`) REFERENCES `smartphone` (`id`),
  CONSTRAINT `smartphonerepairment_ibfk_2` FOREIGN KEY (`technician`) REFERENCES `technician` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `smartphonesaledetail` */

DROP TABLE IF EXISTS `smartphonesaledetail`;

CREATE TABLE `smartphonesaledetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productsale` int(11) NOT NULL,
  `smartphone` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` decimal(12,2) DEFAULT NULL,
  `taxes` decimal(4,2) DEFAULT NULL,
  `discount` decimal(4,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `productsale` (`productsale`),
  KEY `smartphone` (`smartphone`),
  CONSTRAINT `smartphonesaledetail_ibfk_1` FOREIGN KEY (`productsale`) REFERENCES `productsale` (`id`),
  CONSTRAINT `smartphonesaledetail_ibfk_2` FOREIGN KEY (`smartphone`) REFERENCES `smartphone` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `supplier` */

DROP TABLE IF EXISTS `supplier`;

CREATE TABLE `supplier` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` int(11) NOT NULL,
  `agentName` varchar(255) DEFAULT NULL,
  `phone` varchar(13) DEFAULT NULL,
  `cellphone` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `address` (`address`),
  CONSTRAINT `supplier_ibfk_1` FOREIGN KEY (`address`) REFERENCES `address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `technician` */

DROP TABLE IF EXISTS `technician`;

CREATE TABLE `technician` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) DEFAULT NULL,
  `firstmidname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `phone` varchar(13) DEFAULT NULL,
  `cellphone` varchar(13) DEFAULT NULL,
  `address` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `address` (`address`),
  CONSTRAINT `technician_ibfk_1` FOREIGN KEY (`address`) REFERENCES `address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
