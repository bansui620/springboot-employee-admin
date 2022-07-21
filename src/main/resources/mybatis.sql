/*
 Navicat Premium Data Transfer

 Source Server         : My
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : 127.0.0.1:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 21/07/2022 22:57:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int(0) NOT NULL COMMENT 'ID',
  `departmentName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '部门名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (101, '教学部');
INSERT INTO `department` VALUES (102, '市场部');
INSERT INTO `department` VALUES (103, '技术部');
INSERT INTO `department` VALUES (104, '运营部');
INSERT INTO `department` VALUES (105, '后勤部');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `lastName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '姓名',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
  `gender` int(0) DEFAULT NULL COMMENT '性别',
  `departmentId` int(0) DEFAULT NULL COMMENT '部门ID',
  `birth` date DEFAULT NULL COMMENT '生日',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1001, '伴随', '2002@qq.com', 1, 101, '2002-07-29');
INSERT INTO `employee` VALUES (1003, 'AA3', '24734674@qq.com', 0, 103, '2008-03-21');
INSERT INTO `employee` VALUES (1004, 'AA4', '24734674@qq.com', 1, 103, '2015-07-28');
INSERT INTO `employee` VALUES (1005, 'AA45', '24734674@qq.com', 0, 101, '2004-06-22');
INSERT INTO `employee` VALUES (1006, '伴随鸭', '20020620@qq.com', 1, 103, '2012-05-20');
INSERT INTO `employee` VALUES (1007, '花花', 'huahua@qq.com', 0, 102, '2007-07-19');

-- ----------------------------

