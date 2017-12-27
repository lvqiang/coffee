DROP TABLE IF EXISTS `coupon_member`;

CREATE TABLE `coupon_member` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR (36) NOT NULL,
  `name` varchar(32) NOT NULL COMMENT '城市名称',
  `coupon_type` int(3) NOT NULL COMMENT '城市状态',
  `consume_type` int(3) NOT NULL COMMENT '城市状态',
  `fee` int(11) NOT NULL COMMENT '城市状态',
  `min_fee` int(11) NOT NULL COMMENT '城市状态',
  `min_cup` int(11) NOT NULL COMMENT '城市状态',
  `expire_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '城市名称',
  `status` int(3) NOT NULL COMMENT '城市状态',
  `created_by` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_modified_by` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
);

INSERT INTO coupon_member values (1, 'openid-1', '满50减20', 1,1,20,50,0,'2018-10-01 10:00:00',1, '2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);
INSERT INTO coupon_member values (2, 'openid-1', '满50减20', 1,1,20,50,0,'2018-10-01 10:00:00',1, '2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);
INSERT INTO coupon_member values (3, 'openid-1', '满2杯减20', 2,1,20,0,2,'2018-10-01 10:00:00',1, '2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);

