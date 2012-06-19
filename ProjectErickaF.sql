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
  `province` int(11) NOT NULL,
  `city` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `country` (`country`),
  KEY `province` (`province`),
  KEY `city` (`city`),
  CONSTRAINT `address_ibfk_1` FOREIGN KEY (`country`) REFERENCES `country` (`id`),
  CONSTRAINT `address_ibfk_2` FOREIGN KEY (`province`) REFERENCES `province` (`id`),
  CONSTRAINT `address_ibfk_3` FOREIGN KEY (`city`) REFERENCES `city` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `address` */

insert  into `address`(`id`,`detail`,`country`,`province`,`city`) values (5,'11, Calle 26 Res. Digna I, Los Tres Ojos',163,31,11);

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `province` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `province` (`province`),
  CONSTRAINT `city_ibfk_1` FOREIGN KEY (`province`) REFERENCES `province` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=latin1;

/*Data for the table `city` */

insert  into `city`(`id`,`name`,`province`) values (1,'Azua de Compostela',1),(2,'Estebanía',1),(3,'Guayabal',1),(4,'Las Charcas',1),(5,'Las Yayas de Viajama',1),(6,'Padre Las Casas',1),(7,'Peralta',1),(8,'Pueblo Viejo',1),(9,'Sabana Yegua',1),(10,'Tábara Arriba',1),(11,'Santo Domingo Este',31),(12,'Boca Chica',31),(13,'Los Alcarrizos',31),(14,'Pedro Brand',31),(15,'San Antonio de Guerra',31),(16,'Santo Domingo Norte',31),(17,'Santo Domingo Oeste',31),(18,'Neiba',2),(19,'Galván',2),(20,'Los Ríos',2),(21,'Tamayo',2),(22,'Villa Jaragua',2),(23,'Barahona',3),(24,'Cabral',3),(25,'El Peñón',3),(26,'Enriquillo',3),(27,'Fundación',3),(28,'Jaquimeyes',3),(29,'La Ciénaga',3),(30,'Las Salinas',3),(31,'Paraíso',3),(32,'Polo',3),(33,'Vicente Noble',3),(34,'Dajabón',4),(35,'El Pino',4),(36,'Loma de Cabrera',4),(37,'Partido',4),(38,'Restauración',4),(39,'San Francisco de Macorís',6),(40,'Arenoso',6),(41,'Castillo',6),(42,'Eugenio María de Hostos',6),(43,'Las Guáranas',6),(44,'Pimentel',6),(45,'Villa Riva',6),(46,'El Seibo',8),(47,'Miches',8),(48,'Comendador',7),(49,'Bánica',7),(50,'El Llano',7),(51,'Hondo Valle',7),(52,'Juan Santiago',7),(53,'Pedro Santana',7),(54,'Moca',9),(55,'Cayetano Germosén',9),(56,'Gaspar Hernández',9),(57,'Jamao al Norte',9),(58,'Hato Mayor del Rey',10),(59,'El Valle\r\n',10),(60,'Sabana de la Mar',10),(61,'Salcedo',11),(62,'Tenares',11),(63,'Villa Tapia',11),(64,'Jimaní',12),(65,'Cristóbal',12),(66,'Duvergé',12),(67,'La Descubierta',12),(68,'Mella',12),(69,'Postrer Río',12),(70,'Higüey',13),(71,'San Rafael del Yuma',13),(72,'La Romana',14),(73,'Guaymate',14),(74,'Villa Hermosa',14),(75,'La Concepción de La Vega',15),(76,'Constanza',15),(77,'Jarabacoa',15),(78,'Jima Abajo',15),(79,'Nagua',16),(80,'Cabrera',16),(81,'El Factor',16),(82,'Río San Juan',16),(83,'Bonao',17),(84,'Maimón',17),(85,'Piedra Blanca',17),(86,'Montecristi',18),(87,'Castañuela',18),(88,'Guayubín',18),(89,'Las Matas de Santa Cruz',18),(90,'Pepillo Salcedo',18),(91,'Villa Vásquez',18),(92,'Monte Plata',19),(93,'Bayaguana',19),(94,'Peralvillo',19),(95,'Sabana Grande de Boyá',19),(96,'Yamasá',19),(97,'Pedernales',20),(98,'Oviedo',20),(99,'Baní',21),(100,'Nizao',21),(101,'Puerto Plata',22),(102,'Altamira',22),(103,'Guananico',22),(104,'Imbert',22),(105,'Los Hidalgos',22),(106,'Luperón',22),(107,'Sosúa',22),(108,'Villa Isabela',22),(109,'Villa Montellano',22),(110,'Samaná',23),(111,'Las Terrenas',23),(112,'Sánchez',23),(113,'San Cristóbal',25),(114,'Bajos de Haina',25),(115,'Cambita Garabito',25),(116,'Los Cacaos',25),(117,'Sabana Grande de Palenque',25),(118,'San Gregorio de Nigua',25),(119,'Villa Altagracia',25),(120,'Yaguate',25),(121,'San José de Ocoa',26),(122,'Rancho Arriba',26),(123,'Sabana Larga',26),(124,'San Juan de la Maguana',27),(125,'Bohechío',27),(126,'El Cercado',27),(127,'Juan de Herrera',27),(128,'Las Matas de Farfán',27),(129,'Vallejuelo',27),(130,'San Pedro de Macorís',28),(131,'Consuelo',28),(132,'Guayacanes',28),(133,'San José de Los Llanos',28),(134,'Quisqueya',28),(136,'Ramón Santana',28),(137,'Cotuí',24),(138,'Cevicos',24),(139,'Fantino',24),(140,'La Mata',24),(141,'Santiago',29),(142,'Bisonó',29),(143,'Jánico',29),(144,'Licey al Medio',29),(145,'Puñal',29),(146,'Sabana Iglesia',29),(147,'San José de las Matas',29),(148,'Tamboril',29),(149,'Villa González',29),(150,'San Ignacio de Sabaneta',30),(151,'Los Almácigos',30),(152,'Monción',30),(153,'Mao',32),(154,'Esperanza',32),(156,'Laguna Salada',32);

/*Table structure for table `country` */

DROP TABLE IF EXISTS `country`;

CREATE TABLE `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=215 DEFAULT CHARSET=latin1;

/*Data for the table `country` */

insert  into `country`(`id`,`name`) values (1,'Afganistán'),(2,'Albania'),(3,'Alemania'),(4,'Andorra'),(5,'Angola'),(6,'Antigua y Barbuda'),(7,'Antillas Holandesas'),(8,'Arabia Saudí'),(9,'Argelia'),(10,'Argentina'),(11,'Armenia'),(12,'Aruba'),(13,'Australia'),(14,'Austria'),(15,'Azerbaiyán'),(16,'Bahamas'),(17,'Bahrein'),(18,'Bangladesh'),(19,'Barbados'),(20,'Bélgica'),(21,'Belice'),(22,'Benín'),(23,'Bermudas'),(24,'Bielorrusia'),(25,'Bolivia'),(26,'Botswana'),(27,'Bosnia'),(28,'Brasil'),(29,'Brunei'),(30,'Bulgaria'),(31,'BurkinaFaso'),(32,'Burundi'),(33,'Bután'),(34,'Cabo Verde'),(35,'Camboya'),(36,'Camerún'),(37,'Canadá'),(38,'Chad'),(39,'Chile'),(40,'China'),(41,'Chipre'),(42,'Colombia'),(43,'Comoras'),(44,'Congo'),(45,'Corea del Norte'),(46,'Corea del Sur'),(47,'Costa de Marfil'),(48,'Costa Rica'),(49,'Croacia'),(50,'Cuba'),(51,'Dinamarca'),(52,'Dominica'),(53,'Dubai'),(54,'Ecuador'),(55,'Egipto'),(56,'El Salvador'),(57,'Emiratos Árabes Unidos'),(58,'Eritrea'),(59,'Eslovaquia'),(60,'Eslovenia'),(61,'España'),(62,'Estados Unidos de América'),(63,'Estonia'),(64,'Etiopía'),(65,'Fiyi'),(66,'Filipinas'),(67,'Finlandia'),(68,'Francia'),(69,'Gabón'),(70,'Gambia'),(71,'Georgia'),(72,'Ghana'),(73,'Grecia'),(74,'Guam'),(75,'Guatemala'),(76,'Guayana Francesa'),(77,'Guinea-Bissau'),(78,'Guinea Ecuatorial'),(79,'Guinea'),(80,'Guyana'),(81,'Granada'),(82,'Haití'),(83,'Honduras'),(84,'HongKong'),(85,'Hungría'),(86,'Holanda'),(87,'India'),(88,'Indonesia'),(89,'Irak'),(90,'Irán'),(91,'Irlanda'),(92,'Islandia'),(93,'Islas Caimán'),(94,'Islas Marshall'),(95,'Islas Pitcairn'),(96,'Islas Salomón'),(97,'Israel'),(98,'Italia'),(99,'Jamaica'),(100,'Japón'),(101,'Jordania'),(102,'Kazajstán'),(103,'Kenia'),(104,'Kirguistán'),(105,'Kiribati'),(106,'Kósovo'),(107,'Kuwait'),(108,'Laos'),(109,'Lesotho'),(110,'Letonia'),(111,'Líbano'),(112,'Liberia'),(113,'Libia'),(114,'Liechtenstein'),(115,'Lituania'),(116,'Luxemburgo'),(117,'Macedonia'),(118,'Madagascar'),(119,'Malasia'),(120,'Malawi'),(121,'Maldivas'),(122,'Malí'),(123,'Malta'),(124,'Marianas del Norte'),(125,'Marruecos'),(126,'Mauricio'),(127,'Mauritania'),(128,'México'),(129,'Micronesia'),(130,'Mónaco'),(131,'Moldavia'),(132,'Mongolia'),(133,'Montenegro'),(134,'Mozambique'),(135,'Myanmar'),(136,'Namibia'),(137,'Nauru'),(138,'Nepal'),(139,'Nicaragua'),(140,'Níger'),(141,'Nigeria'),(142,'Noruega'),(143,'NuevaZelanda'),(144,'Omán'),(145,'OrdendeMalta'),(146,'Países Bajos'),(147,'Pakistán'),(148,'Palestina'),(149,'Palau'),(150,'Panamá'),(151,'Papúa Nueva Guinea'),(152,'Paraguay'),(153,'Perú'),(154,'Polonia'),(155,'Portugal'),(156,'Puerto Rico'),(157,'Qatar'),(158,'Reino Unido'),(159,'República Centro africana'),(160,'República Checa'),(161,'República del Congo'),(162,'República Democrática del Congo'),(163,'República Dominicana'),(164,'Ruanda'),(165,'Rumania'),(166,'Rusia'),(167,'Sáhara Occidental'),(168,'SaintKitts-Nevis'),(169,'Samoa Americana'),(170,'Samoa'),(171,'San Marino'),(172,'Santa Lucía'),(173,'Santo Tomé y Príncipe'),(174,'San Vicente y las Granadinas'),(175,'Senegal'),(176,'Serbia'),(177,'Seychelles'),(178,'SierraLeona'),(179,'Singapur'),(180,'Siria'),(181,'Somalia'),(182,'SriLanka'),(183,'Sudáfrica'),(184,'Sudán'),(185,'Suecia'),(186,'Suiza'),(187,'Suazilandia'),(188,'Tailandia'),(189,'Taiwán'),(190,'Tanzania'),(191,'Tayikistán'),(192,'Tíbet'),(193,'TimorOriental'),(194,'Togo'),(195,'Tonga'),(196,'Trinidad y Tobago'),(197,'Túnez'),(198,'Turkmenistán'),(199,'Turquía'),(200,'Tuvalu'),(201,'Ucrania'),(202,'Uganda'),(203,'Uruguay'),(204,'Uzbequistán'),(205,'Vanuatu'),(206,'Vaticano'),(207,'Venezuela'),(208,'Vietnam'),(209,'WallisyFutuna'),(210,'Yemen'),(211,'Yibuti'),(212,'Zambia'),(213,'Zaire'),(214,'Zimbabue');

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

/*Data for the table `customer` */

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `laptop` */

insert  into `laptop`(`id`,`price`,`stock`,`brand`,`model`,`color`,`processor`,`RAM`,`HDD`,`OS`,`Screen`,`VideoCard`,`BuiltInCamera`,`WirelessConectivity`,`MediaRecording`,`MediaCardReader`,`OtherFeatures`) values (4,'24500.00',4,'DELL','PRECISION M70','Gray','Intel Pentium M 2.13GHz','2.00 GB DDR2','60.0 GB HDD','Windows 7 Ultimate','15.4\" 1920x1200 Res.','NVIDIA Quadro™ FX Go1400','\0','Intel PRO/Wireless 2200 802.11b/g, 54Mbps; Dell Wireless 1370 802.11b/g; Dell Wireless 1470 802.11a/b/g','CD-RW/DVD Combo;','-','-');

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

/*Data for the table `laptoppurchasedetail` */

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

/*Data for the table `laptopsaledetail` */

/*Table structure for table `moneyinput` */

DROP TABLE IF EXISTS `moneyinput`;

CREATE TABLE `moneyinput` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` decimal(12,2) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `moneyinput` */

/*Table structure for table `moneyoutput` */

DROP TABLE IF EXISTS `moneyoutput`;

CREATE TABLE `moneyoutput` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` decimal(12,2) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `moneyoutput` */

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

/*Data for the table `productpurchase` */

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

/*Data for the table `productsale` */

/*Table structure for table `province` */

DROP TABLE IF EXISTS `province`;

CREATE TABLE `province` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `country` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `country` (`country`),
  CONSTRAINT `province_ibfk_1` FOREIGN KEY (`country`) REFERENCES `country` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

/*Data for the table `province` */

insert  into `province`(`id`,`name`,`country`) values (1,'Azua',163),(2,'Bahoruco',163),(3,'Barahona',163),(4,'Dajabón',163),(5,'Distrito Nacional',163),(6,'Duarte',163),(7,'Elías Piña',163),(8,'El Seibo',163),(9,'Espaillat',163),(10,'Hato Mayor',163),(11,'Hermanas Mirabal',163),(12,'Independencia',163),(13,'La Altagracia',163),(14,'La Romana',163),(15,'La Vega',163),(16,'María Trinidad Sánchez',163),(17,'Monseñor Nouel',163),(18,'Montecristi',163),(19,'Monte Plata',163),(20,'Pedernales',163),(21,'Peravia',163),(22,'Puerto Plata',163),(23,'Samaná',163),(24,'Sánchez Ramírez',163),(25,'San Cristóbal',163),(26,'San José de Ocoa',163),(27,'San Juan',163),(28,'San Pedro de Macorís',163),(29,'Santiago',163),(30,'Santiago Rodríguez',163),(31,'Santo Domingo',163),(32,'Valverde',163);

/*Table structure for table `salesperson` */

DROP TABLE IF EXISTS `salesperson`;

CREATE TABLE `salesperson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) DEFAULT NULL,
  `firstmidname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `phone` varchar(13) DEFAULT NULL,
  `cellphone` varchar(13) DEFAULT NULL,
  `address` int(11) NOT NULL,
  `nickname` varchar(255) NOT NULL,
  `password` varchar(32) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `address` (`address`),
  CONSTRAINT `salesperson_ibfk_1` FOREIGN KEY (`address`) REFERENCES `address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `salesperson` */

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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

/*Data for the table `smartphone` */

insert  into `smartphone`(`id`,`price`,`stock`,`Brand`,`Model`,`Name`,`Color`,`StorageCapacity`,`NetworkStandards`,`TouchCapability`,`GPSCapability`,`WiFiCapability`,`BluetoothCapability`,`InfraredCapability`,`QWERTYKeyboard`,`ScreenWidth`,`ScreenHeight`,`Camera`,`VideoRecording`,`FlashCapability`,`OperativeSystem`,`OSVersion`,`Processor`,`RAM`,`OtherFeatures`) values (10,'13500.00',52,'Blackberry','Bold 9700','Hola','Negro','2 GB','GSM/GPRS/EDGE/UMTS/3G HSDPA','\0','','','','\0','','480','360','5 MP 2x Digital Zoom','Video Recording','','BlackBerry OS','6.0.0','624 MHz','512 MB','Trackpad'),(11,'13500.00',52,'Blackberry','Bold 9700','UpdatedName','Negro','2 GB','GSM/GPRS/EDGE/UMTS/3G HSDPA','\0','','','','\0','','480','360','5 MP 2x Digital Zoom','Video Recording','','BlackBerry OS','6.0.0','624 MHz','512 MB','Trackpad'),(12,'13500.00',52,'Blackberry','Bold 9700','Bold 3','Negro','2 GB','GSM/GPRS/EDGE/UMTS/3G HSDPA','\0','','','','\0','','480','360','5 MP 2x Digital Zoom','Video Recording','','BlackBerry OS','6.0.0','624 MHz','512 MB','Trackpad');

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

/*Data for the table `smartphonechange` */

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

/*Data for the table `smartphonepurchasedetail` */

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

/*Data for the table `smartphonerepairment` */

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

/*Data for the table `smartphonesaledetail` */

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

/*Data for the table `supplier` */

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

/*Data for the table `technician` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
