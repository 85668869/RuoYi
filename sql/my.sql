
drop table if exists zz_test;
drop table if exists information;

CREATE TABLE `zz_test` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '姓名',
  `age` int(4) DEFAULT NULL COMMENT '年龄',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='测试'



CREATE TABLE `information` (
  `ID1` int(10) NOT NULL AUTO_INCREMENT,
  `id` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `num` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `hls` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `sx` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `sex` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `born` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `pay` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `level` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `con` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `conphone` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `phone` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `mobile` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `st` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `ct` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `dt` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `idcard` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `unit` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `unitphone` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `home` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `score1` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `score2` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `date1` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `date2` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `date3` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `letter` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `fzzt` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `fxsj` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `czsj` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `djsj` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `schooling` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `electric` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `ceyi` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `fang` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `zipai` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `shou` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `burn` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `ton` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `check` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `pic` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `pic2` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '新照片',
  `picdb` longblob,
  `rcmd` varchar(5) COLLATE utf8mb4_bin DEFAULT NULL,
  `time` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `intro` text COLLATE utf8mb4_bin,
  `sg` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `tz` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `xy` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `ej` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `bsl` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `lsz` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `lsy` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `jsz` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `jsy` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `hbz` text COLLATE utf8mb4_bin,
  `admin` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `ip` text COLLATE utf8mb4_bin,
  `tj` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `djr` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `xx` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `bx` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `nf` int(10) DEFAULT NULL,
  `lastlogin` timestamp NULL DEFAULT NULL,
  `ipshow` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `homephone` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `lb1` int(10) DEFAULT NULL,
  `lb2` int(10) DEFAULT NULL,
  `lb3` int(10) DEFAULT NULL,
  `xiang` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `mail` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `xingp` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `mingp` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `mingzu` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `chushengdi` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `jtphone` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `shouyigx` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `shouyitel` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `youbian` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `wage` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `lmphone` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `leibie` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `shouyi` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `lcpic` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `kspic` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `lcmov` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `ksmov` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL,
  `cz` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `ny` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `ls` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `xlfilename` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `idzfilename` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `idffilename` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `sms` int(11) NOT NULL DEFAULT '0' COMMENT '短信通知数量',
  `sms_date` varchar(20) COLLATE utf8mb4_bin NOT NULL DEFAULT '1970-01-01' COMMENT '短信通知日期',
  `uemail` int(10) NOT NULL DEFAULT '0',
  `uemail_date` varchar(20) COLLATE utf8mb4_bin NOT NULL DEFAULT '1970-01-01' COMMENT '邮件通知日期',
  `zs_sms` int(11) NOT NULL DEFAULT '0',
  `zs_sms_date` varchar(20) COLLATE utf8mb4_bin NOT NULL DEFAULT '1970-01-01' COMMENT '知识更新短信发送时间',
  `zs_email` int(10) NOT NULL DEFAULT '0' COMMENT '知识更新email',
  `zs_email_date` varchar(20) COLLATE utf8mb4_bin NOT NULL DEFAULT '1970-01-01',
  PRIMARY KEY (`ID1`),
  KEY `id` (`id`),
  KEY `idcard` (`idcard`)
) ENGINE=InnoDB AUTO_INCREMENT=5892 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='学员信息'

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('学员', '3', '1', '/biz/information', 'C', '0', 'biz:information:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '学员菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('学员查询', @parentId, '1',  '#',  'F', '0', 'biz:information:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('学员新增', @parentId, '2',  '#',  'F', '0', 'biz:information:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('学员修改', @parentId, '3',  '#',  'F', '0', 'biz:information:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('学员删除', @parentId, '4',  '#',  'F', '0', 'biz:information:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
