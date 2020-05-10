INSERT INTO users (id, account, password, name, sex) VALUES (1, 'lw', '$2a$10$jtLVRmMpViw.hbvl74hyJuPz.BBvHlllqpcjrgpP5OUykvlUcCMm2', 'lw', '男');
INSERT INTO users (id, account, password, name, sex) VALUES(2, 'lc', '$2a$10$jtLVRmMpViw.hbvl74hyJuPz.BBvHlllqpcjrgpP5OUykvlUcCMm2', 'lc', '男');


INSERT INTO schedules (id,mon_am,mon_pm,tue_am,tue_pm,wed_am,wed_pm,thu_am,thu_pm,fri_am,fri_pm,sat_am,sat_pm,sun_am,sun_pm)
	VALUES(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

INSERT INTO departments(name,introduction) values('内科','内科');
INSERT INTO departments(name,introduction) values('外科','外科');
INSERT INTO departments(name,introduction) values('儿科','儿科');
INSERT INTO departments(name,introduction) values('妇科','儿科');
INSERT INTO departments(name,introduction) values('眼科','儿科');
INSERT INTO departments(name,introduction) values('耳鼻喉科','儿科');
INSERT INTO departments(name,introduction) values('口腔科','儿科');
INSERT INTO departments(name,introduction) values('中医科','儿科');
INSERT INTO departments(name,introduction) values('针灸推拿科','儿科');
INSERT INTO departments(name,introduction) values('呼吸内科','儿科');
INSERT INTO departments(name,introduction) values('消化内科','儿科');
INSERT INTO departments(name,introduction) values('泌尿内科','儿科');
INSERT INTO departments(name,introduction) values('心内科','儿科');
INSERT INTO departments(name,introduction) values('普外科','儿科');
INSERT INTO departments(name,introduction) values('产科','儿科');

INSERT INTO doctors (id,account,password,name,sex,introduction,department_id,schedule_id,max_patient) 
	VALUES(1, 'jack001', '123456', 'jack', '男', '专治疑难杂症', 1, 1, 250);
INSERT INTO doctors (id,account,password,name,sex,introduction,department_id,schedule_id,max_patient) 
	VALUES(2, 'tom001', '123456', 'tom', '男', '优秀的医生', 2, 1, 250);


INSERT INTO appointments (doctor_id, user_id, dest_date, date, is_completed) 
	VALUES (1, 1, '2020-5-6', '2020-5-4', 0);
INSERT INTO appointments (doctor_id, user_id, dest_date, date, is_completed) 
	VALUES (1, 2, '2020-5-5', '2020-4-1', 0);
INSERT INTO appointments (doctor_id, user_id, dest_date, date, is_completed) 
	VALUES (1, 2, '2020-4-20', '2020-4-1', 0);

INSERT INTO `role` VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `role` VALUES ('2', 'ROLE_USER');
INSERT INTO `role` VALUES ('3', 'ROLE_DOCTOR');

/**权限表**/
INSERT INTO `permission` VALUES (1,'个人中心','权限描述','/personal',1);
INSERT INTO `permission` VALUES (2,'个人信息','权限描述','/personal/info',1);
INSERT INTO `permission` VALUES (3,'我的预约','权限描述','/personal/appointment',1);
INSERT INTO `permission` VALUES (4,'科室管理','权限描述','/personal/hospital',1);
INSERT INTO `permission` VALUES (5,'我的患者','权限描述','/personal/patient',1);
INSERT INTO `permission` VALUES (6,'权限管理','权限描述','/personal/authority',1);
INSERT INTO `permission` VALUES (7,'上班管理','上班管理','/personal/work',1);
INSERT INTO `permission` VALUES (8,'数据分析','权限描述','/personal/data',1);
INSERT INTO `permission` VALUES (9,'留言管理','权限描述','/personal/comment',1);
INSERT INTO `permission` VALUES (10,'医生管理','医生管理','/personal/doctor',1);

/**管理员具有所有权限**/
INSERT INTO `role_permission` VALUES (1,1);
INSERT INTO `role_permission` VALUES (1,2);
INSERT INTO `role_permission` VALUES (1,3);
INSERT INTO `role_permission` VALUES (1,4);
INSERT INTO `role_permission` VALUES (1,5);
INSERT INTO `role_permission` VALUES (1,6);
INSERT INTO `role_permission` VALUES (1,7);
INSERT INTO `role_permission` VALUES (1,8);
INSERT INTO `role_permission` VALUES (1,9);
/**医生用户**/
INSERT INTO `role_permission` VALUES (3,1);
INSERT INTO `role_permission` VALUES (3,2);
INSERT INTO `role_permission` VALUES (3,3);
INSERT INTO `role_permission` VALUES (3,5);
INSERT INTO `role_permission` VALUES (3,8);
INSERT INTO `role_permission` VALUES (3,9);
/**普通用户**/
INSERT INTO `role_permission` VALUES (2,1);
INSERT INTO `role_permission` VALUES (2,2);
INSERT INTO `role_permission` VALUES (2,3);
INSERT INTO `role_permission` VALUES (2,9);

INSERT INTO `user_role` VALUES (1,1, 1);
INSERT INTO `user_role` VALUES (2,2,2);