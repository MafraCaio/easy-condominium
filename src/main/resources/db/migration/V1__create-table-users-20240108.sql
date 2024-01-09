create table users(
    id bigint not null auto_increment,
    name varchar(250) not null,
    email varchar(250) not null unique,
    phone varchar(26) not null,
    document_type varchar(10) not null,
    document varchar(25) not null unique,
    type varchar(15),
    google_uid varchar(500) not null,

    primary key(id)
)