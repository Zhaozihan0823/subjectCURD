/*
Navicat MySQL Data Transfer

Source Server         : database
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2020-02-02 23:08:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stuID` int(10) NOT NULL,
  `stuname` varchar(15) DEFAULT NULL,
  `classname` varchar(10) DEFAULT NULL,
  `score` int(5) DEFAULT NULL,
  PRIMARY KEY (`stuID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('2017001', '张三', '操作系统', '88');
INSERT INTO `student` VALUES ('2017002', '李四', '计算机网络', '92');
INSERT INTO `student` VALUES ('2017003', '王五', '算法', '77');
INSERT INTO `student` VALUES ('2017004', '刘明', '编译原理', '82');
INSERT INTO `student` VALUES ('2017005', '李立', '数字逻辑', '94');
INSERT INTO `student` VALUES ('2017006', '马冬梅', '操作系统', '86');
INSERT INTO `student` VALUES ('2017007', '朱玉峰', '计算机网络', '92');
INSERT INTO `student` VALUES ('2017008', '杰克', '数字逻辑', '85');
INSERT INTO `student` VALUES ('2017009', '史密斯', '编译原理', '77');

-- ----------------------------
-- Table structure for `stuser`
-- ----------------------------
DROP TABLE IF EXISTS `stuser`;
CREATE TABLE `stuser` (
  `stuID` int(10) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `logincount` int(11) DEFAULT '0',
  `lastDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stuser
-- ----------------------------
INSERT INTO `stuser` VALUES ('2017001', '123456', '0', null);
INSERT INTO `stuser` VALUES ('2017002', 'tiger', '0', null);

-- ----------------------------
-- Table structure for `sub`
-- ----------------------------
DROP TABLE IF EXISTS `sub`;
CREATE TABLE `sub` (
  `classno` int(5) NOT NULL DEFAULT '0',
  `classname` varchar(15) DEFAULT NULL,
  `clabegain` date DEFAULT NULL,
  `teacher` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`classno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sub
-- ----------------------------
INSERT INTO `sub` VALUES ('202001', '操作系统', '2020-01-17', '于明');
INSERT INTO `sub` VALUES ('202002', '算法', '2020-02-08', '李艳');
INSERT INTO `sub` VALUES ('202003', '编译原理', '2020-02-26', '李宏');
INSERT INTO `sub` VALUES ('202004', '数字逻辑', '2020-01-15', '赵旭');
INSERT INTO `sub` VALUES ('202005', '计算机网络', '2020-01-17', '张贤');
