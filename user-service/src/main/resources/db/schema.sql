DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` VARCHAR (36) NOT NULL,
  `open_id` VARCHAR (36) NOT NULL COMMENT '名称',
  `password` VARCHAR (64) NOT NULL COMMENT '名称',
  `nickname` varchar(36) NOT NULL COMMENT '名称',
  `image_url` varchar(256) NOT NULL COMMENT '图片',
  `coupon_num` BIGINT(20) DEFAULT 0 COMMENT '优惠券数量',
  `coffee_num` BIGINT(20) DEFAULT 0 COMMENT '成长咖啡数量',
  `bean_num` BIGINT(20) DEFAULT 0 COMMENT '豆子数量',
  `created_by` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_modified_by` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (`id`)
) ENGINE = innodb
  DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id`   VARCHAR(36)  NOT NULL COMMENT '创建时间',
  `value` VARCHAR(20) NOT NULL COMMENT '创建时间',
  `created_by` TIMESTAMP NULL DEFAULT current_timestamp COMMENT '创建时间',
  `last_modified_by` TIMESTAMP NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
  PRIMARY KEY (`id`),
  CONSTRAINT `authority_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE = innodb
  DEFAULT CHARSET = utf8;

INSERT INTO user
VALUES ('806f0ac6-a3e4-42a1-8dfc-1a3e56002881', 'Opiddfjhkhu1huhdsskfh212121212', '$2a$10$lZtZ84C7opaUODCAdYzhwuNOuGqpSVjZLiM/gcZiAqEDDI/Vfq/Vu',
'Qiang', 'http://baidu.com',0,0,0, '2017-11-28 10:00:00','2017-11-28 10:00:00');

INSERT INTO authority
VALUES ('1', '806f0ac6-a3e4-42a1-8dfc-1a3e56002881', 'default','2017-11-28 10:00:00','2017-11-28 10:00:00');