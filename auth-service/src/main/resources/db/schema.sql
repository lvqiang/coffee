DROP TABLE IF EXISTS `authority`;

CREATE TABLE `authority` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL COMMENT '城市名称',
  `value` varchar(64) NOT NULL COMMENT '城市英文名称',
  `created_by` varchar(50) NOT NULL  COMMENT '创建时间',
  `created_date` BIGINT(20) NOT NULL  COMMENT '创建时间',
  `last_modified_by` varchar(50) NOT NULL  COMMENT '更新时间',
  `last_modified_date` BIGINT(20) NOT NULL  COMMENT '更新时间',
  PRIMARY KEY (`id`)
);

INSERT INTO authority values (1, '普通user权限', 'user-authority','2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL COMMENT '名称',
  `value` varchar(255) NOT NULL COMMENT '图片',
  `created_by` varchar(50) NOT NULL  COMMENT '创建时间',
  `created_date` BIGINT(20) NOT NULL COMMENT '创建时间',
  `last_modified_by` varchar(50) NOT NULL COMMENT '更新时间',
  `last_modified_date` BIGINT(20) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
);

INSERT INTO role values (1, '普通用户', 'ROLE_USER', '2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);

CREATE TABLE `role_authorities` (
  `role_id` BIGINT(20) NOT NULL,
  `authorities_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`role_id`,`authorities_id`),
  CONSTRAINT `FK_j89g87bvih4d6jbxjcssrybks` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO role_authorities VALUES ('1', '1');

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '名称',
  `password` varchar(60) NOT NULL COMMENT '名称',
  `openid` varchar(64) NOT NULL COMMENT '图片',
  `created_by` varchar(50) NOT NULL  COMMENT '创建时间',
  `created_date` BIGINT(20) NOT NULL COMMENT '创建时间',
  `last_modified_by` varchar(50) NOT NULL COMMENT '更新时间',
  `last_modified_date` BIGINT(20) NOT NULL COMMENT '更新时间',
   PRIMARY KEY (`id`)
);

INSERT INTO user values (1,'rainbow', '$2a$10$XOVs4Z1YtPKqKwQVywG9j.xLAqXYRQLGZMGMrZDNbtl6pUC0Weteq', 'Oididfiknanf1212121', '2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);


CREATE TABLE `user_roles` (
  `user_id` BIGINT(20) NOT NULL,
  `roles_id` BIGINT(20) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user_roles` VALUES ('1', '1');


CREATE TABLE `user_profile` (
  `id` BIGINT(20) NOT NULL,
  `nickname` varchar(256) NOT NULL COMMENT '图片',
  `image_url` varchar(256) NOT NULL COMMENT '图片',
  `coupon_num` BIGINT(20) NOT NULL COMMENT '优惠券数量',
  `coffee_num` BIGINT(20) NOT NULL COMMENT '成长咖啡数量',
  `bean_num` BIGINT(20) NOT NULL COMMENT '豆子数量',
  `created_by` varchar(50) NOT NULL  COMMENT '创建时间',
  `created_date` BIGINT(20) NOT NULL COMMENT '创建时间',
  `last_modified_by` varchar(50) NOT NULL COMMENT '更新时间',
  `last_modified_date` BIGINT(20) NOT NULL COMMENT '更新时间',
   PRIMARY KEY (`id`)
);

INSERT INTO user_profile values (1,'Qiang', '',6,2,21, '2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);

CREATE TABLE `user_address` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL,
  `name` varchar(32) NOT NULL COMMENT '送货人姓名',
  `cellphone` varchar(32) NOT NULL COMMENT '送货人手机',
  `address` varchar(256) NOT NULL COMMENT '地址',
  `address_detail` varchar(1024) NOT NULL COMMENT '详细地址',
  `lng` decimal(10,7) NOT NULL COMMENT '地址经度',
  `lat` decimal(10,7) NOT NULL COMMENT '地址纬度',
  `tag` varchar(2) NOT NULL COMMENT '标签',
  `created_by` varchar(50) NOT NULL  COMMENT '创建时间',
  `created_date` BIGINT(20) NOT NULL COMMENT '创建时间',
  `last_modified_by` varchar(50) NOT NULL COMMENT '更新时间',
  `last_modified_date` BIGINT(20) NOT NULL COMMENT '更新时间',
   PRIMARY KEY (`id`)
);

INSERT INTO user_address values (1,1,'吕', '18519214533','星科大厦','C座', '25.8402790','-18.0930560','公司','2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);
INSERT INTO user_address values (2,1,'吕', '18519214533','新山林语','三区1-2-601','11.5166667','3.8666667', '家','2017-11-28 10:00:00',1511839975, '2017-11-28 10:00:00',1511839975);