DROP TABLE IF EXISTS departments;
DROP TABLE IF EXISTS schedules;
DROP TABLE IF EXISTS doctors;
DROP TABLE IF EXISTS users ;
DROP TABLE  IF EXISTS appointments;
DROP TABLE  IF EXISTS comments;
drop table if exists permission_role;
drop table if exists permission;
drop table if exists user_role;
drop table if exists role;

/*==============================================================*/
/* Table: permission                                            */
/*==============================================================*/
create table permission
(
    id                   int not null,
    name                 varchar(0),
    description          varchar(0),
    url                  varchar(0),
    pid                  int,
    primary key (id)
);

/*==============================================================*/
/* Table: permission_role                                       */
/*==============================================================*/
create table permission_role
(
    id                   int not null,
    role_id              int,
    permission_id        int,
    primary key (id)
);

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
    id                   int not null,
    name                 varchar(25),
    primary key (id)
);

/*==============================================================*/
/* Table: role_user                                             */
/*==============================================================*/
create table user_role
(
    id                   int not null,
    user_id              int,
    role_id              int,
    primary key (id)
);

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

alter table permission_role add constraint FK_Reference_3 foreign key (permission_id)
    references permission (id) on delete restrict on update restrict;

alter table permission_role add constraint FK_Reference_4 foreign key (role_id)
    references role (id) on delete restrict on update restrict;

alter table user_role add constraint FK_Reference_1 foreign key (user_id)
    references users (id) on delete restrict on update restrict;

alter table user_role add constraint FK_Reference_2 foreign key (role_id)
    references role (id) on delete restrict on update restrict;

