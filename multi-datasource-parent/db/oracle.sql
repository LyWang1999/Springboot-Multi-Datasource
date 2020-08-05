/*
 Navicat Premium Data Transfer

 Source Server         : C##KULUO
 Source Server Type    : Oracle
 Source Server Version : 120200
 Source Host           : localhost:1521
 Source Schema         : C##KULUO

 Target Server Type    : Oracle
 Target Server Version : 120200
 File Encoding         : 65001

 Date: 05/08/2020 16:22:33
*/


-- ----------------------------
-- Table structure for STUDENT
-- ----------------------------
DROP TABLE "C##KULUO"."STUDENT";
CREATE TABLE "C##KULUO"."STUDENT" (
  "ID" NUMBER(11,0) VISIBLE NOT NULL,
  "NAME" VARCHAR2(10 BYTE) VISIBLE,
  "SEX" NUMBER(1,0) VISIBLE,
  "AGE" NUMBER(3,0) VISIBLE,
  "DEPARTMENT_ID" NUMBER(11,0) VISIBLE
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Primary Key structure for table STUDENT
-- ----------------------------
ALTER TABLE "C##KULUO"."STUDENT" ADD CONSTRAINT "SYS_C007364" PRIMARY KEY ("ID");
