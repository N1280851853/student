/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 26/05/2023 08:59:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `sex` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `age` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `birthday` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `college` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `telephone` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `grade` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '小红', '女', '22', '2002-1-1', '物联网1班', '153111', 90);
INSERT INTO `student` VALUES (2, '小橙', '女', '21', '2002-2-2', '物联网1班', '153222', 90);
INSERT INTO `student` VALUES (3, '小黄', '女', '20', '2002-3-3', '物联网1班', '153222', 90);
INSERT INTO `student` VALUES (4, '小绿', '女', '19', '2002-4-4', '物联网1班', '153222', 90);
INSERT INTO `student` VALUES (5, '小青', '女', '18', '2002-5-5', '物联网1班', '153222', 90);
INSERT INTO `student` VALUES (6, '小蓝', '女', '17', '2002-6-6', '物联网1班', '153222', 90);
INSERT INTO `student` VALUES (7, '小紫', '女', '16', '2002-7-7', '物联网1班', '153222', 90);

SET FOREIGN_KEY_CHECKS = 1;
