create table produtos(

	id bigint not null auto_increment,
	nome varchar(100) not null,
	marca varchar(100) not null,
	quantidade varchar(100) not null,
    caixa varchar(100) not null,
    valor varchar(100) not null,
	primary key(id)
);