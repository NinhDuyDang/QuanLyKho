-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: db_quanlyxuatnhapkho
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `chitietnhapkhos`
--

DROP TABLE IF EXISTS `chitietnhapkhos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietnhapkhos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `don_gia` bigint DEFAULT NULL,
  `ma_nhap_kho` bigint DEFAULT NULL,
  `ma_san_pham` bigint DEFAULT NULL,
  `so_luong` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietnhapkhos`
--

LOCK TABLES `chitietnhapkhos` WRITE;
/*!40000 ALTER TABLE `chitietnhapkhos` DISABLE KEYS */;
INSERT INTO `chitietnhapkhos` VALUES (1,800000,1,8,10),(2,100000,1,3,20),(3,1500000,1,1,5),(4,200000,2,7,40),(5,800000,2,8,3),(6,900000,3,8,5),(7,100000,4,4,20),(8,2400000,4,2,20),(9,3400000,4,5,5),(10,3000000,4,6,7);
/*!40000 ALTER TABLE `chitietnhapkhos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitietxuatkhos`
--

DROP TABLE IF EXISTS `chitietxuatkhos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietxuatkhos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `don_gia` bigint DEFAULT NULL,
  `ma_san_pham` bigint DEFAULT NULL,
  `ma_xuat_kho` bigint DEFAULT NULL,
  `so_luong` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietxuatkhos`
--

LOCK TABLES `chitietxuatkhos` WRITE;
/*!40000 ALTER TABLE `chitietxuatkhos` DISABLE KEYS */;
INSERT INTO `chitietxuatkhos` VALUES (1,140000,3,1,4),(2,2000000,1,2,1),(3,2000000,1,3,1),(4,500000,7,4,10),(5,500000,7,5,10),(6,500000,7,6,10),(7,1400000,8,7,2),(8,1400000,8,8,3),(9,140000,3,9,3),(10,1720000,10,10,1);
/*!40000 ALTER TABLE `chitietxuatkhos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dathangs`
--

DROP TABLE IF EXISTS `dathangs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dathangs` (
  `ma_dat_hang` bigint NOT NULL AUTO_INCREMENT,
  `ma_khach_hang` bigint DEFAULT NULL,
  `ma_san_pham` bigint DEFAULT NULL,
  `ngay_dat` varchar(255) DEFAULT NULL,
  `so_luong` int DEFAULT NULL,
  `tong_tien` bigint DEFAULT NULL,
  PRIMARY KEY (`ma_dat_hang`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dathangs`
--

LOCK TABLES `dathangs` WRITE;
/*!40000 ALTER TABLE `dathangs` DISABLE KEYS */;
INSERT INTO `dathangs` VALUES (7,4,2,'2024-01-15',4,12000000),(9,4,1,'2024-01-17',1,2000000);
/*!40000 ALTER TABLE `dathangs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhacungcaps`
--

DROP TABLE IF EXISTS `nhacungcaps`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhacungcaps` (
  `ma_nha_cung_cap` bigint NOT NULL AUTO_INCREMENT,
  `dia_chi` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `so_dien_thoai` varchar(255) DEFAULT NULL,
  `ten_nha_cung_cap` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ma_nha_cung_cap`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhacungcaps`
--

LOCK TABLES `nhacungcaps` WRITE;
/*!40000 ALTER TABLE `nhacungcaps` DISABLE KEYS */;
INSERT INTO `nhacungcaps` VALUES (1,'Số 69A Hai Bà Trưng,Phường Cửa Nam,Quận Hoàn Kiếm, Thành Phố Hà Nội','congtytnhhxuantung@gmail.com','0915573040','Lốp Xuân Tùng'),(2,'55B Nguyễn Hoàng, Mỹ Đình 2, Hà Nội','ninhdang55b@gmail.com','0986364343','Ninhdang');
/*!40000 ALTER TABLE `nhacungcaps` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhapkhos`
--

DROP TABLE IF EXISTS `nhapkhos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhapkhos` (
  `ma_nhap_kho` bigint NOT NULL AUTO_INCREMENT,
  `ma_nha_cung_cap` bigint DEFAULT NULL,
  `ma_nhan_vien` bigint DEFAULT NULL,
  `ngay_nhap` varchar(255) DEFAULT NULL,
  `tong_so_tien` bigint DEFAULT NULL,
  PRIMARY KEY (`ma_nhap_kho`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhapkhos`
--

LOCK TABLES `nhapkhos` WRITE;
/*!40000 ALTER TABLE `nhapkhos` DISABLE KEYS */;
INSERT INTO `nhapkhos` VALUES (1,1,1,'2023-12-05',17500000),(2,2,2,'2023-12-31',10400000),(3,1,1,'2024-01-03',4500000),(4,1,1,'2024-01-15',88000000);
/*!40000 ALTER TABLE `nhapkhos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanphams`
--

DROP TABLE IF EXISTS `sanphams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanphams` (
  `ma_san_pham` bigint NOT NULL AUTO_INCREMENT,
  `gia_nhap` bigint DEFAULT NULL,
  `gia_xuat` bigint DEFAULT NULL,
  `hang_san_pham` varchar(255) DEFAULT NULL,
  `loai_san_pham` varchar(255) DEFAULT NULL,
  `so_luong` int DEFAULT NULL,
  `so_luong_trong_kho` int DEFAULT NULL,
  `ten_san_pham` varchar(255) DEFAULT NULL,
  `thong_tin_san_pham` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ma_san_pham`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanphams`
--

LOCK TABLES `sanphams` WRITE;
/*!40000 ALTER TABLE `sanphams` DISABLE KEYS */;
INSERT INTO `sanphams` VALUES (1,1500000,2000000,'Michelin','Lốp',0,2,'185/60R15','Thông số: 185/60R15. Sử dụng cho xe Honda, Mazda'),(2,2400000,3000000,'Bridgestone','Lốp',0,16,'185/65R16','Thông số: 185/60R15. Sử dụng cho xe Toyota, Mazda'),(3,100000,140000,'Castrol','Dầu',0,13,'10W40','Thông số: 10W40. Sử dụng cho xe Honda, Mazda'),(4,100000,200000,'Total','Dầu',0,20,'15W40','Thông số: 15W40. Sử dụng cho xe Porsche, Mazda'),(5,3400000,3700000,'Varta','Ắc quy',0,5,'12V - 100AH','Thông số: 12V - 100AH. Sử dụng cho xe Huyndai, Mazda'),(6,3000000,3500000,'Platinum','Ắc quy',0,7,'12V - 150AH','Thông số: 12V - 150AH. Sử dụng cho xe Huyndai, Mercedes'),(7,200000,500000,'Bosch','Phụ tùng',0,10,'Gạt mưa','Sử dụng cho mọi loại xe'),(8,900000,2000000,'TPMS Yoelbaer','Phụ tùng',0,13,'Cảm biến áp suất lốp ','Sử dụng cho những xe hỗ trợ cảm biến'),(9,1300000,1700000,'Michelin','Lốp',0,16,'185/65R16','Thông số: 185/60R15. Sử dụng cho xe Toyota, Mazda'),(10,1430000,1720000,'Bridgestone','Lốp',0,1,'185/60R15','Thông số: 185/60R15. Sử dụng cho xe Honda, Mazda'),(11,90000,130000,'Total','Dầu',0,7,'10W40','Thông số: 10W40. Sử dụng cho xe Honda, Mazda'),(12,110000,170000,'Castrol','Dầu',0,4,'15W40','Thông số: 15W40. Sử dụng cho xe Porsche, Mazda'),(13,2500000,3000000,'Platinum','Ắc quy',0,5,'12V - 100AH','Thông số: 12V - 100AH. Sử dụng cho xe Huyndai, Mazda'),(14,1950000,2550000,'Varta','Ắc quy',0,6,'12V - 150AH','Thông số: 12V - 150AH. Sử dụng cho xe Huyndai, Mercedes');
/*!40000 ALTER TABLE `sanphams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taikhoans`
--

DROP TABLE IF EXISTS `taikhoans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `taikhoans` (
  `ma_tai_khoan` bigint NOT NULL AUTO_INCREMENT,
  `cccd` varchar(255) DEFAULT NULL,
  `chuc_vu` varchar(255) DEFAULT NULL,
  `diem_thuong` int DEFAULT NULL,
  `ho_ten` varchar(255) DEFAULT NULL,
  `luong` bigint DEFAULT NULL,
  `mat_khau` varchar(255) DEFAULT NULL,
  `ngay_sinh` varchar(255) DEFAULT NULL,
  `ngay_vao_lam` varchar(255) DEFAULT NULL,
  `que_quan` varchar(255) DEFAULT NULL,
  `re_mat_khau` varchar(255) DEFAULT NULL,
  `role` smallint DEFAULT NULL,
  `so_dien_thoai` varchar(255) DEFAULT NULL,
  `ten_tai_khoan` varchar(255) DEFAULT NULL,
  `tien_nhap` bigint DEFAULT NULL,
  `tien_xuat` bigint DEFAULT NULL,
  PRIMARY KEY (`ma_tai_khoan`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taikhoans`
--

LOCK TABLES `taikhoans` WRITE;
/*!40000 ALTER TABLE `taikhoans` DISABLE KEYS */;
INSERT INTO `taikhoans` VALUES (1,'001202007035','Admin',0,'Ninh Duy Dang',0,'$2a$10$eg/ivjs3IvdCeNpbWxrVbuKAZQcG2cPlF0oUUcLtJIF3foYqKbvQe','2002-07-18',NULL,'Hà Nội','$2a$10$eg/ivjs3IvdCeNpbWxrVbuKAZQcG2cPlF0oUUcLtJIF3foYqKbvQe',0,'0982944425','admin',28700000,120400000),(2,'','Kế toán',0,'Đỗ Trung Hiếu',NULL,'$2a$10$VuHo03AYJEUudXE/gObZ4e8WOI7aZ3qGKL9HTuqk7vANXBJhE40vi','2001-06-11',NULL,'','$2a$10$VuHo03AYJEUudXE/gObZ4e8WOI7aZ3qGKL9HTuqk7vANXBJhE40vi',2,'0988436048','hieudt',NULL,NULL),(3,NULL,'Khách hàng',0,'Nguyễn Khoa Đoàn',NULL,'$2a$10$DYAjQU2DICpixqLBbu2pY.faii564bFn9pF9bXSLHjnpQIQOn5nJC',NULL,NULL,NULL,NULL,1,'0965672833','doannk',NULL,NULL),(4,NULL,'Khách hàng',0,'Phạm Ngọc Hải ',NULL,'$2a$10$BJPZshs.4qJHAvsVAob/pu3fqTq2koyi9cRVDdiIEXsrItzIuvxee',NULL,NULL,NULL,NULL,1,'0776463573','haipn',NULL,NULL),(5,NULL,'Khách hàng',0,'Cao Bích Ngọc',NULL,'$2a$10$SMe.YIvdyAZGMRgD.r0wSeJ7nTMrNCH/d6c2SX02loNMZkQENTlvC',NULL,NULL,NULL,'$2a$10$SMe.YIvdyAZGMRgD.r0wSeJ7nTMrNCH/d6c2SX02loNMZkQENTlvC',1,'0934535937','ngoccb',NULL,NULL);
/*!40000 ALTER TABLE `taikhoans` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuatkhos`
--

DROP TABLE IF EXISTS `xuatkhos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xuatkhos` (
  `ma_xuat_kho` bigint NOT NULL AUTO_INCREMENT,
  `ma_khach_hang` bigint DEFAULT NULL,
  `ma_nhan_vien` bigint DEFAULT NULL,
  `ngay_nhap` varchar(255) DEFAULT NULL,
  `tong_so_tien` bigint DEFAULT NULL,
  PRIMARY KEY (`ma_xuat_kho`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuatkhos`
--

LOCK TABLES `xuatkhos` WRITE;
/*!40000 ALTER TABLE `xuatkhos` DISABLE KEYS */;
INSERT INTO `xuatkhos` VALUES (1,3,1,'2024-01-01',560000),(2,4,1,'2024-01-02',2000000),(3,3,2,'2024-01-02',2000000),(4,4,1,'2024-01-02',5000000),(5,4,1,'2024-01-02',5000000),(6,4,1,'2024-01-02',5000000),(7,3,1,'2024-01-02',2800000),(8,3,1,'2024-01-02',4200000),(9,3,1,'2024-01-11',420000),(10,3,1,'2024-01-17',1720000);
/*!40000 ALTER TABLE `xuatkhos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-17 19:52:16
