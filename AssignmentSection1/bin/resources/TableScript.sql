drop table Trainee cascade constraints;
CREATE TABLE Trainee (
   EmployeeID number(4) primary key,
   Name Varchar2(20),
   City Varchar2(20),
   phoneNumber number,
   Stream Varchar2(20)
   );
   
insert into Trainee values(1000,'Smith Jones','London',7896541230,'JEE');
insert into Trainee values(1001,'Quincy Jones','Sydney',9874563210,'IVS');
select * from Trainee;
