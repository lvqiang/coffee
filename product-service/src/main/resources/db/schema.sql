DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `cname` varchar(32) NOT NULL COMMENT '城市名称',
  `ename` varchar(64) NOT NULL COMMENT '城市英文名称',
  `status` int(3) NOT NULL COMMENT '城市状态',
  `create_date` datetime COMMENT '创建时间',
  `update_date` datetime COMMENT '更新时间'
);

INSERT INTO city(id, cname, ename, status) values (1, '北京', 'Beijing', 1);
INSERT INTO city(id, cname, ename, status) values (2, '上海', 'Shanghai', 1);
INSERT INTO city(id, cname, ename, status) values (3, '广州', 'Guangzhou', 1);
INSERT INTO city(id, cname, ename, status) values (4, '深圳', 'Shenzhen', 0);
