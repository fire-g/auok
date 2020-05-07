INSERT INTO users (id, account, password, name, sex) VALUES (1, 'lw', '123456', 'lw', '男');
INSERT INTO users (id, account, password, name, sex) VALUES(2, 'lc', '123456', 'lc', '男');


INSERT INTO schedules (id,mon_am,mon_pm,tue_am,tue_pm,wed_am,wed_pm,thu_am,thu_pm,fri_am,fri_pm,sat_am,sat_pm,sun_am,sun_pm)
	VALUES(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

INSERT INTO departments(name) values('内科');
INSERT INTO departments(name) values('外科');
INSERT INTO departments(name) values('儿科');
INSERT INTO departments(name) values('妇科');
INSERT INTO departments(name) values('眼科');
INSERT INTO departments(name) values('耳鼻喉科');
INSERT INTO departments(name) values('口腔科');
INSERT INTO departments(name) values('中医科');
INSERT INTO departments(name) values('针灸推拿科');
INSERT INTO departments(name) values('呼吸内科');
INSERT INTO departments(name) values('消化内科');
INSERT INTO departments(name) values('泌尿内科');
INSERT INTO departments(name) values('心内科');
INSERT INTO departments(name) values('普外科');
INSERT INTO departments(name) values('产科');

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

INSERT INTO `user_role` VALUES ('1','1', '1');
INSERT INTO `user_role` VALUES ('2','1', '2');