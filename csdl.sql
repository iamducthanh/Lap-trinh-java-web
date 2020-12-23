use WEBTINTUC
go
create table role(
	id bigint not null IDENTITY(1,1) primary key,
	name nvarchar(255) not null,
	code nvarchar(255) not null,
	createddate timestamp null,
	modifieddate time null,
	createdby nvarchar(255) null,
	modifiedby nvarchar(255) null
);

create table users(
	id bigint not null identity(1,1) primary key,
	username nvarchar(255) not null,
	password nvarchar(255) not null,
	fullname nvarchar(150) null,
	roleid bigint not null foreign key references role(id),
	status int not null,
	createddate timestamp null,
	modifieddate time null,
	createdby nvarchar(255) null,
	modifiedby nvarchar(255) null
);

create table category(
	id bigint not null identity(1,1) primary key,
	name nvarchar(100),
	code nvarchar(100),
	createddate timestamp null,
	modifieddate time null,
	createdby nvarchar(255) null,
	modifiedby nvarchar(255) null
);

create table news(
	id bigint not null identity(1,1) primary key,
	title nvarchar(255) null,
	thumbnail nvarchar(255) null,
	shortdescription text null,
	content text null,
	createddate timestamp null,
	modifieddate time null,
	createdby nvarchar(255) null,
	modifiedby nvarchar(255) null,
	categoryid bigint not null foreign key references category(id)
);

create table comment(
	id bigint not null identity(1,1) primary key,
	newsid bigint not null foreign key references news(id),
	userid bigint not null foreign key references users(id),
	content text not null,
	createddate timestamp null,
	modifieddate time null,
	createdby nvarchar(255) null,
	modifiedby nvarchar(255) null,
)

insert into category(code,name) values('the-thao',N'Thể thao');
insert into category(code,name) values('the-gioi',N'Thế giới');
insert into category(code,name) values('chinh-tri',N'Chính trị');
insert into category(code,name) values('thoi-su',N'Thời sự');
insert into category(code,name) values('goc-nhin',N'Góc nhìn');



