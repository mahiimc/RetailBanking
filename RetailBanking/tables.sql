create table BankEmployee (
emp_id number ,
emp_name varchar2(36) NOT NULL,
emp_username varchar2(36) NOT NULL,
emp_password varchar2(50) NOT NULL,
emp_role number NOT NULL,
CONSTRAINT id_constarint primary key(emp_id)
);

CREATE TABLE ROLES (
id number ,
role varchar2(20)

)
alter table  ROLES add constraint role_id_constraint primary key(id);
create sequence emp_id_seq
 START WITH 100
 INCREMENT BY 1;
 
 create sequence role_seq
 start with 1
 increment by 1;

 insert into ROLES values(role_seq.NEXTVAL,'cashier');
 insert into ROLES values(role_seq.NEXTVAL,'cus_ac_exec');
 insert into ROLES values(role_seq.NEXTVAL,'teller');

 insert into BankEmployee values(emp_id_seq.NEXTVAL,'Test User','test','test',2);
 insert into BankEmployee values(emp_id_seq.NEXTVAL,'Mahesh Chary','mahesh','mahesh',1);
 insert into BankEmployee values(emp_id_seq.NEXTVAL,'Yeshwanth','yeshwanth','Yeshwanth123@',3);
 update  BankEmployee set emp_password = 'Testing@123' where 1=1;
 select * from BANKEMPLOYEE;
 
 