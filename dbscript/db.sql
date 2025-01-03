create database dbdatapoo20242;
use dbdatapoo20242;

create table tperson(
idPerson char(36) not null,
firstName varchar(70) not null,
surName varchar(40) not null,
dni char(8) not null,
birthDate date not null,
gender bool not null,/*true => Masculino, false => Femenino*/
createdAt datetime not null,
updatedAt datetime not null,
primary key(idPerson)
) engine=innodb;

create table tlanguaje
(
idLanguaje char(36) not null,
name varchar(70) not null,
createdAt datetime not null,
updatedAt datetime not null,
primary key(idLanguaje)
) engine=innodb;

create table tfavoritelanguaje
(
idFavoriteLanguaje char(13) not null,
idPerson char(36) not null,
idLanguaje char(36) not null,
createdAt datetime not null,
updatedAt datetime not null,
foreign key(idPerson) references tperson(idPerson)
on delete cascade on update cascade,
foreign key(idLanguaje) references tlanguaje(idLanguaje),
primary key(idFavoriteLanguaje)
) engine=innodb;