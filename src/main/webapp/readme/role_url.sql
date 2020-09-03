/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : rbac

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2020-08-16 15:53:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `role_url`
-- ----------------------------
DROP TABLE IF EXISTS `role_url`;
CREATE TABLE `role_url` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `rid` int(10) DEFAULT NULL,
  `uid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_url
-- ----------------------------
INSERT INTO `role_url` VALUES ('1', '1', '1');
INSERT INTO `role_url` VALUES ('2', '2', '2');
INSERT INTO `role_url` VALUES ('3', '2', '1');
