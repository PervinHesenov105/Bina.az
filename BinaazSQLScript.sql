create table category(
id int primary key auto_increment,
category_name varchar(20));

insert into category(category_name) values ('yeni tikili'),('kohne tikili'),('qaraj'),
('ofis'),('torpaq'),('menzil');


create table agentlik(
id int primary key auto_increment,
agent_name varchar(30));

insert into agentlik(agent_name) values ('Baku Home'),('Villa 21'),('ProHome'),('Asfan');

create table elan(
id int primary key auto_increment,
name varchar(70) unique,
price int,
location varchar(90),
contact varchar(13),
agentlik_id int,
category_id int,
constraint fk_ai foreign key(agentlik_id) references agentlik(id),
constraint fk_ci foreign key(category_id) references category(id));


insert into elan values (1,'Yasamal 2 otaq',90000,'Baku','+994557887924',2,1),
(2,'Nerimanov 138 kv',200000,'Baku','+994557007200',1,4),
(3,'Neftciler qaraj',50000,'Baku','+9945572341',null,3);



