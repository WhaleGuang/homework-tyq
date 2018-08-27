use master
go

if exists(select * from sysdatabases where name='PerfumeDB')drop database PerfumeDB


create database PerfumeDB
on
(
	name = 'PerfumeDB',
	filename='F:\�ڶ�ѧ��ѧϰ\IDEA\������ϰ\��ˮ��ɾ��\sql\��־�ļ�\PerfumeDB.mdf'
)
log on
(
	name = 'PerfumeDB_2',
	filename='F:\�ڶ�ѧ��ѧϰ\IDEA\������ϰ\��ˮ��ɾ��\sql\��־�ļ�\PerfumeDB_2.ldf'
)
go

use PerfumeDB
go

create table Perfume
(
	id int primary key identity(1,1),
    name nvarchar(20) not null,--����
    brand nvarchar(20) not null,--Ʒ��
    price float not null--��Ǯ
)
go


insert into Perfume values('С���','���ζ�',123.45),
						  ('С��ȹ','��ޢ',6868.8),
						  ('����','LV',6666),
						  ('Ů����','ʥ����',43563.99),
						  ('��Ů�ķ���','�����ֿ�',432.6),
						  ('Ұ��','SK-II',2998.67)
go

select * from Perfume
go