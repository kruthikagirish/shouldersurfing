/*
SQLyog - Free MySQL GUI v5.19
Host - 5.5.17 : Database - Graphical_authentication_system
*********************************************************************
Server version : 5.5.17
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `Graphical_authentication_system`;

USE `Graphical_authentication_system`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `m_admin` */

DROP TABLE IF EXISTS `m_admin`;

CREATE TABLE `m_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adminid` varchar(50) DEFAULT NULL,
  `adminname` varchar(50) DEFAULT NULL,
  `adminpass` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `m_admin` */

insert into `m_admin` (`id`,`adminid`,`adminname`,`adminpass`,`gender`,`email`,`phone`,`city`) values (1,'admin','admin','111','female','graphicalauthenticationsystem@gmail.com','7411850833','Bengaluru');

/*Table structure for table `m_user` */

DROP TABLE IF EXISTS `m_user`;

CREATE TABLE `m_user` (
  `u_no` int(10) NOT NULL AUTO_INCREMENT,
  `u_id` varchar(100) DEFAULT NULL,
  `u_txtpwd` varchar(100) DEFAULT NULL,
  `u_name` varchar(50) DEFAULT NULL,
  `u_gender` varchar(10) DEFAULT NULL,
  `u_email` varchar(100) DEFAULT NULL,
  `u_phone` varchar(20) DEFAULT NULL,
  `u_city` varchar(50) DEFAULT NULL,
  `random_image1` varchar(100) DEFAULT NULL,
  `random_image2` varchar(100) DEFAULT NULL,
  `random_image3` varchar(100) DEFAULT NULL,
  `selectedlocation1` varchar(100) DEFAULT NULL,
  `selectedlocation2` varchar(100) DEFAULT NULL,
  `selectedlocation3` varchar(100) DEFAULT NULL,
  `hash_key` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`u_no`),
  KEY `FK_m_user` (`u_name`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

/*Data for the table `m_user` */

insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (1,'manu','manu','manu','male','manohar7789@gmail.com','9916119479','Bangalore','Image4','Image2','Image3','3,2','4,5','2,6','0229ff05d15cf653309f63c4d32c3167');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (2,'shanu','111','Shanu','female','manohar@celestialv.com','9916119479','Bengaluruu','Image1','Image5','Image3','4,3','6,8','3,6','12c00b1cb809f16542bb7a99baa88251');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (3,'mmm','123','mmm','male','manohar@celestialv.com','9916119479','Bangalore','Image3','Image5','Image2','3,4','5,6','2,4','1d40eb6a0c7e41c9c426f83e20e9aa65');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (4,'abc','111','abc','male','manohar@celestialv.com','9916119479','Bangalore','Image3','Image2','Image4','3,3','3,6','5,3','8c43f3161f8a4fe227f5fcc3ec23823a');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (13,'xyz','123','xyz','male','manohar7789@gmail.com','9916119479','Bangalore','Image2','Image5','Image4',NULL,NULL,NULL,NULL);
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (14,'manoj','123','manoj','male','manohar@celestialv.com','9999999999','Bangalore','Image5','Image2','Image3','4,3','3,5','6,4','9966318590f0207f22630d793d503d05');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (15,'sss','123','sss','male','manohar@celestialv.com','9999999999','Bangalore','Image5','Image4','Image3','3,5','4,5','2,3','0d5b2788a9b4603f7999253fbe9ba118');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (16,'manohar','123','manohar','male','manohar7789@gmail.com','9916119479','Bangalore','Image2','Image4','Image3','5,2','4,5','2,3','9ffa204a55b8de4e921ebf92f3168511');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (17,'shalini','123','shalini','female','manohar7789@gmail.com','9916119479','Bangalore','Image1','Image3','Image4','3,5','5,4','3,6','591bbebc44af728b603b7fb112d1b8b3');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (18,'shhhhh','123','shhhhh','female','manohar7789@gmail.com','9916119479','Bangalore','Image5','Image3','Image1','3,5','6,4','1,5','5a181d6a1fca14f2379ae7eeb63b67ab');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (19,'kkkkk','123','kkkkkk','male','manohar7789@gmail.com','9916119479','Bangalore','Image4','Image1','Image3','3,4','5,5','2,2','f66cfa68fccd6f7365c1ade41e606936');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (20,'john','123','john','male','manohar7789@gmail.com','9916119479','Bangalore','Image3','Image2','Image5','2,3','1,2','3,6','2872ca7861806f0e1ee74c501b61fb4d');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (21,'johny','123','johny','male','manohar7789@gmail.com','9916119479','Bangalore','Image1','Image3','Image5','4,5','2,2','5,4','abcb9ac7e3f6d097c61afdbe9e07a407');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (22,'shumstabrez','123','shumstabrez','male','manohar7789@gmail.com','9620032388','Bangalore','Image3','Image4','Image5','2,3','5,5','2,6','87c551c9638dcd79f2227edb39248def');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (23,'keerthy','123','keerthy','male','manohar7789@gmail.com','9916119479','Bangalore','Image2','Image5','Image1','4,4','2,5','5,3','b8876fb1dfc1c36a896a0f61b094c213');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (24,'pavan','123','pavan','male','manohar7789@gmail.com','9035787963','Bengaluru','Image3','Image5','Image1','5,4','2,4','5,3','48ae53f7455e1a9ea077274d64d82138');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (25,'vivek','123','vivek','male','manohar@celestialv.com','9916119479','Bangalore','Image3','Image2','Image4','3,2','2,6','5,7','2f26102e887c49f40847a5f2136f7431');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (26,'Robert','123','Robert','male','manohar@celestialv.com','9916119479','Bangalore','Image1','Image5','Image2','4,5','2,7','5,4','068c7e728987889da59aeeac02338f7f');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (27,'priya','priya','priya','female','priyankasrisha.m93@gmail.com','8754666066','Bangalore','Image2','Image1','Image5','4,2','4,4','5,4','9cbd7d4383e6f1511e053f1fec43bdc2');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (28,'priyanka','priyanka','priyanka','female','bindhugopal856@gmail.com','8754666066','Bangalore','Image2','Image4','Image5','4,3','5,5','5,6','f70619f67be30ef330fd1a4ce29eac0d');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (29,'test4','test4','test4','female','priyankasrisha.m93@gmail.com','8754666066','Bangalore','Image3','Image1','Image2','4,3','5,4','5,5','b792c0c130de9300735a3e69fce027a9');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (30,'kaviya','kaviya','kaviya','female','lakshmikavyabalaji@gmail.com','8754666066','Bangalore','Image5','Image3','Image2','4,3','5,5','5,5','760d3a54e7388ec43c6c792f50708d16');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (31,'ssssss','123','ssssss','male','manohar@celestialv.com','9916119479','bangalore','Image3','Image2','Image4','4,3',NULL,NULL,NULL);
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (32,'don','345','don','male','manohar@celestialv.com','9916119479','bangalore','Image5','Image2','Image1','3,4','2,6','5,3','65fb770da73ccd846ea0bd003a69d28d');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (33,'gggg','123','gggg','male','manohar@celestialv.com','9916119479','bangalore','Image1','Image2','Image5','3,5','2,4','5,6','933c7bc6cc65e51f568eac792140e016');
insert into `m_user` (`u_no`,`u_id`,`u_txtpwd`,`u_name`,`u_gender`,`u_email`,`u_phone`,`u_city`,`random_image1`,`random_image2`,`random_image3`,`selectedlocation1`,`selectedlocation2`,`selectedlocation3`,`hash_key`) values (34,'harrypotter','123','harrypotter','male','manohar@celestialv.com','9988009988','hassan','Image4','Image3','Image5','3,4','4,5','2,6','f1d9f9a9cf5e9d67a47c23e758485bc5');

/*Table structure for table `m_user_otp` */

DROP TABLE IF EXISTS `m_user_otp`;

CREATE TABLE `m_user_otp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(50) DEFAULT NULL,
  `image1` varchar(50) DEFAULT NULL,
  `image2` varchar(50) DEFAULT NULL,
  `image3` varchar(50) DEFAULT NULL,
  `randomrow1` int(11) DEFAULT NULL,
  `randomcol1` int(11) DEFAULT NULL,
  `randomrow2` int(11) DEFAULT NULL,
  `randomcol2` int(11) DEFAULT NULL,
  `randomrow3` int(11) DEFAULT NULL,
  `randomcol3` int(11) DEFAULT NULL,
  `horizantal_image` int(11) DEFAULT NULL,
  `vertical_image` int(11) DEFAULT NULL,
  `m_locations` varchar(50) DEFAULT NULL,
  `hash_key` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `m_user_otp` */

insert into `m_user_otp` (`id`,`uid`,`image1`,`image2`,`image3`,`randomrow1`,`randomcol1`,`randomrow2`,`randomcol2`,`randomrow3`,`randomcol3`,`horizantal_image`,`vertical_image`,`m_locations`,`hash_key`) values (3,'robert','Image1','Image5','Image2',4,2,1,6,1,1,6,28,NULL,NULL);
insert into `m_user_otp` (`id`,`uid`,`image1`,`image2`,`image3`,`randomrow1`,`randomcol1`,`randomrow2`,`randomcol2`,`randomrow3`,`randomcol3`,`horizantal_image`,`vertical_image`,`m_locations`,`hash_key`) values (4,'priyanka','Image2','Image4','Image5',1,6,4,1,3,5,6,28,NULL,NULL);
insert into `m_user_otp` (`id`,`uid`,`image1`,`image2`,`image3`,`randomrow1`,`randomcol1`,`randomrow2`,`randomcol2`,`randomrow3`,`randomcol3`,`horizantal_image`,`vertical_image`,`m_locations`,`hash_key`) values (5,'test4','Image3','Image1','Image2',3,3,1,3,4,5,6,28,NULL,NULL);
insert into `m_user_otp` (`id`,`uid`,`image1`,`image2`,`image3`,`randomrow1`,`randomcol1`,`randomrow2`,`randomcol2`,`randomrow3`,`randomcol3`,`horizantal_image`,`vertical_image`,`m_locations`,`hash_key`) values (6,'kaviya','Image5','Image3','Image2',2,6,1,4,1,3,6,28,NULL,NULL);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
