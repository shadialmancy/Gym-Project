create table C_taker(
First_name varchar(10),
Last_name varchar(10),
user_nam varchar(20) foreign key references Register(UserName),
course_id int not null primary key,
course_name varchar(15),
Attendance int)