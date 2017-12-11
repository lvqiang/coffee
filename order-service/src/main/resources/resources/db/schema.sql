DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL,
  `origin_fee` int(11) NOT NULL COMMENT '城市状态',
  `total_fee` int(11) NOT NULL COMMENT '城市状态',
  `deliver_fee` int(11) NOT NULL COMMENT '城市状态',
  `coupon_fee` int(11) NOT NULL COMMENT '城市状态',
  `deliver_name` varchar(32) NOT NULL COMMENT '城市名称',
  `deliver_cellphone` varchar(32) NOT NULL COMMENT '城市名称',
  `deliver_address` varchar(1024) NOT NULL COMMENT '城市名称',
  `deliver_time` varchar(50) NOT NULL COMMENT '城市名称',
  `status` int(3) NOT NULL COMMENT '城市状态',
  `created_by` varchar(50) NOT NULL  COMMENT '创建时间',
  `created_date` BIGINT(20) NOT NULL  COMMENT '创建时间',
  `last_modified_by` varchar(50) NOT NULL  COMMENT '更新时间',
  `last_modified_date` BIGINT(20) NOT NULL  COMMENT '更新时间',
  PRIMARY KEY (`id`)
);

INSERT INTO order values (1, 1,35,22,5,18,'lvqiang','18519214533','2017-12-10 10:00:00',30, '2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);
INSERT INTO order values (2, 1,22,22,0,0,'lvqiang','18519214533','2018-10-01 10:00:00',30, '2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);


DROP TABLE IF EXISTS `order`;

CREATE TABLE `order_item` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `order_id` BIGINT(20) NOT NULL,
  `fee` int(11) NOT NULL COMMENT '城市状态',
  `name` varchar(32) NOT NULL COMMENT '城市名称',
  `num` int(11) NOT NULL COMMENT '城市状态',
  `created_by` varchar(50) NOT NULL  COMMENT '创建时间',
  `created_date` BIGINT(20) NOT NULL  COMMENT '创建时间',
  `last_modified_by` varchar(50) NOT NULL  COMMENT '更新时间',
  `last_modified_date` BIGINT(20) NOT NULL  COMMENT '更新时间',
  PRIMARY KEY (`id`)
);

INSERT INTO order_item values (1, 1,35,'防弹咖啡',1, '2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);
INSERT INTO order_item values (2, 2,22,'热咖啡榛果拿铁',1, '2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);
