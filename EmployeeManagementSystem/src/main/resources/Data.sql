insert into role(role_id,name) values(1,'User');
insert into role(role_id,name) values(2,'Admin');

commit;

insert into users(user_id,password,username) values(1,'$2a$12$u5rYDUQsFgPOGot0yBjbxus.w9IARzy3gSLeEMXTDcChDjLC0nTEa','User');
insert into users(user_id,password,username) values(2,'$2a$12$9dmDGJSJZWr9N8YJbCxuB.6BbOg4ICnV5ul.JYSWTfnjFaxYQG3lu','Admin');

commit;

insert into user_roles values(1,1);
insert into user_roles values(2,2);

commit;

insert into employee(id,first_name,last_name,email) values(1,'Suresh','Reddy','sureshreddy@test.com');
insert into employee(id,first_name,last_name,email) values(2,'Murali','Mohan','muralimohan@test.com');
insert into employee(id,first_name,last_name,email) values(3,'Daniel','Danson','danieldanson@test.com');
insert into employee(id,first_name,last_name,email) values(4,'Tanya','Gupta','tanyagupta@test.com');
insert into employee(id,first_name,last_name,email) values(5,'Soukarya','Datta','soukaryadatta@test.com');

commit;