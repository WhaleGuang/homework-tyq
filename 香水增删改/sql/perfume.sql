use master
go

if exists(select * from sysdatabases where name='PerfumeDB')drop database PerfumeDB


create database PerfumeDB
on
(
	name = 'PerfumeDB',
	filename='F:\第二学年学习\IDEA\课堂练习\香水增删改\sql\日志文件\PerfumeDB.mdf'
)
log on
(
	name = 'PerfumeDB_2',
	filename='F:\第二学年学习\IDEA\课堂练习\香水增删改\sql\日志文件\PerfumeDB_2.ldf'
)
go

use PerfumeDB
go

create table Perfume
(
	id int primary key identity(1,1),
    name nvarchar(20) not null,--名字
    brand nvarchar(20) not null,--品牌
    price float not null--价钱
)
go


insert into Perfume values('小蹴鞠','香奈儿',123.45),
						  ('小黑裙','兰蔻',6868.8),
						  ('美兰','LV',6666),
						  ('女人香','圣罗兰',43563.99),
						  ('少女的芳香','法兰林卡',432.6),
						  ('野菊','SK-II',2998.67)
go

select * from Perfume
go