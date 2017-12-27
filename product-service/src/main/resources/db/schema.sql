DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `cname` varchar(32) NOT NULL COMMENT '城市名称',
  `ename` varchar(64) NOT NULL COMMENT '城市英文名称',
  `status` int(3) NOT NULL COMMENT '城市状态',
  `created_by` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_modified_by` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
)ENGINE = innodb DEFAULT CHARSET = utf8;

INSERT INTO city(id, cname, ename, status) values (1, '北京', 'Beijing', 1);
INSERT INTO city(id, cname, ename, status) values (2, '上海', 'Shanghai', 1);
INSERT INTO city(id, cname, ename, status) values (3, '广州', 'Guangzhou', 1);
INSERT INTO city(id, cname, ename, status) values (4, '深圳', 'Shenzhen', 0);

DROP TABLE IF EXISTS `catalog`;

CREATE TABLE `catalog` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL COMMENT '名称',
  `icon` varchar(255) NOT NULL COMMENT '图片',
  `status` int(3) NOT NULL COMMENT '状态',
  `created_by` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_modified_by` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
)ENGINE = innodb DEFAULT CHARSET = utf8;

INSERT INTO catalog(id, name, icon) values (1, '防弹家族', '1234567889');
INSERT INTO catalog(id, name, icon) values (2, '天生的粉', '1234567889');
INSERT INTO catalog(id, name, icon) values (3, '热咖啡', '1234567889');
INSERT INTO catalog(id, name, icon) values (4, '冷萃系列', '1234567889');
INSERT INTO catalog(id, name, icon) values (5, '冰咖啡', '1234567889');
INSERT INTO catalog(id, name, icon) values (6, '雪昔系列', '1234567889');
INSERT INTO catalog(id, name, icon) values (7, '茶饮热巧', '1234567889');


DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `catalog_id` BIGINT(20) NOT NULL,
  `name` varchar(32) NOT NULL COMMENT '名称',
  `icon` varchar(255) NOT NULL COMMENT '图片',
  `status` int(3) NOT NULL COMMENT '状态',
  `created_by` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_modified_by` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (`id`),
   CONSTRAINT `FK_oyt6r2g6hwbyee5adel4yj59e` FOREIGN KEY (`catalog_id`) REFERENCES `catalog` (`id`)
)ENGINE = innodb DEFAULT CHARSET = utf8;

INSERT INTO product(id, catalog_id, name, icon, status) values (1,1, '坚果防弹咖啡', '1234567889',1);
INSERT INTO product(id, catalog_id, name, icon, status) values (2,1, '牛油果元气弹', '1234567889',1);
INSERT INTO product(id, catalog_id, name, icon, status) values (3,2, '纤盈粉粉椰', '1234567889',1);
INSERT INTO product(id, catalog_id, name, icon, status) values (4,2, '黑枸杞暖暖椰', '1234567889',1);
INSERT INTO product(id, catalog_id, name, icon, status) values (5,3, '热美式', '1234567889', 1);
INSERT INTO product(id, catalog_id, name, icon, status) values (6,4, '抹茶雪昔', '1234567889', 1);
INSERT INTO product(id, catalog_id, name, icon, status) values (7,5, '冰摩卡', '1234567889', 1);
