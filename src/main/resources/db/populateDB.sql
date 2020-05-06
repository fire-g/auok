INSERT INTO users (id, account, password, name, sex) VALUES (1, 'lw', '123456', 'lw', '男');
INSERT INTO users (id, account, password, name, sex) VALUES(2, 'lc', '123456', 'lc', '男');


INSERT INTO schedules (id,mon_am,mon_pm,tue_am,tue_pm,wed_am,wed_pm,thu_am,thu_pm,fri_am,fri_pm,sat_am,sat_pm,sun_am,sun_pm)
	VALUES(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

INSERT INTO departments values(1, '内科');
INSERT INTO departments values(2, '外科');

INSERT INTO doctors (id,account,password,name,sex,introduction,department_id,schedule_id,max_patient) 
	VALUES(1, 'jack001', '123456', 'jack', '男', '专治疑难杂症', 1, 1, 250);
INSERT INTO doctors (id,account,password,name,sex,introduction,department_id,schedule_id,max_patient) 
	VALUES(2, 'tom001', '123456', 'tom', '男', '优秀的医生', 2, 1, 250);


INSERT INTO appointments (doctor_id, user_id, dest_date, date, is_completed) 
	VALUES (1, 1, '2020-5-6', '2020-5-4', 0);
INSERT INTO appointments (doctor_id, user_id, dest_date, date, is_completed) 
	VALUES (1, 2, '2020-4-7', '2020-4-1', 0);
INSERT INTO appointments (doctor_id, user_id, dest_date, date, is_completed) 
	VALUES (1, 2, '2020-6-7', '2020-6-1', 0);
