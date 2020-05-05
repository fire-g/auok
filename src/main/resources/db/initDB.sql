DROP TABLE departments IF EXISTS;
DROP TABLE schedules IF EXISTS;
DROP TABLE doctors IF EXISTS;
DROP TABLE users IF EXISTS;
DROP TABLE appointments IF EXISTS;
DROP TABLE comments IF EXISTS;

CREATE TABLE departments (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  PRIMARY KEY (id)
 );


CREATE TABLE schedules (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  mon_am TINYINT(1) NOT NULL,
  mon_pm TINYINT(1) NOT NULL,
  tue_am TINYINT(1) NOT NULL,
  tue_pm TINYINT(1) NOT NULL,
  wed_am TINYINT(1) NOT NULL,
  wed_pm TINYINT(1) NOT NULL,
  thu_am TINYINT(1) NOT NULL,
  thu_pm TINYINT(1) NOT NULL,
  fri_am TINYINT(1) NOT NULL,
  fri_pm TINYINT(1) NOT NULL,
  sat_am TINYINT(1) NOT NULL,
  sat_pm TINYINT(1) NOT NULL,
  sun_am TINYINT(1) NOT NULL,
  sun_pm TINYINT(1) NOT NULL,
  PRIMARY KEY (id)
 );

CREATE TABLE doctors (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  account VARCHAR(45) NOT NULL,
  password VARCHAR(45) NOT NULL,
  name VARCHAR(45) NOT NULL,
  sex VARCHAR(4) NOT NULL,
  introduction VARCHAR(45) NOT NULL,
  department_id INT UNSIGNED NOT NULL,
  schedule_id INT UNSIGNED NOT NULL,
  max_patient INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT doctors_departments
    FOREIGN KEY (department_id)
    REFERENCES departments (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT doctors_schedules
    FOREIGN KEY (schedule_id)
    REFERENCES schedules (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE users (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  account VARCHAR(45) NOT NULL,
  password VARCHAR(45) NOT NULL,
  name VARCHAR(45) NOT NULL,
  sex VARCHAR(4) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE appointments (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  doctor_id INT UNSIGNED NOT NULL,
  user_id INT UNSIGNED NOT NULL,
  dest_date Date NOT NULL,
  date DATE NOT NULL,
  is_completed TINYINT(1) NULL,
  PRIMARY KEY (id),
  CONSTRAINT appointments_users
    FOREIGN KEY (user_id)
    REFERENCES users (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT appointments_doctors
    FOREIGN KEY (doctor_id)
    REFERENCES doctors (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE comments (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  content VARCHAR(100) NOT NULL,
  doctor_id INT UNSIGNED NOT NULL,
  user_id INT UNSIGNED NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT comments_doctors
    FOREIGN KEY (doctor_id)
    REFERENCES doctors (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT comments_users
    FOREIGN KEY (user_id)
    REFERENCES users (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

