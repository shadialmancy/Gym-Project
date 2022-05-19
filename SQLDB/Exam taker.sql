create table Exam_t(
First_Name varchar(10),
Last_Name varchar(10),
UserName varchar(20) foreign key references Register(UserName),
Course_id int foreign key references Course(Course_id),
Grade varchar(5),
Exam_Date date)
alter table Exam_t
add Course_Name varchar(20)