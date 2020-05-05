INSERT INTO users VALUES(1, 'lw', '123', 'lw', '男');

INSERT INTO schedules (id,mon_am,mon_pm,tue_am,tue_pm,wed_am,wed_pm,thu_am,thu_pm,fri_am,fri_pm,sat_am,sat_pm,sun_am,sun_pm)
	VALUES(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

INSERT INTO departments values(1, '内科');

INSERT INTO doctors VALUES(1, 'jack001', '123456', 'jack', '男', '这是jack', 1, 1, 250);

INSERT INTO appointments VALUES(1, 1, 1, '2020-5-6', '2020-5-4', 0);
