CREATE TABLE addresses (
    id bigint NOT NULL AUTO_INCREMENT,
    user_id bigint NOT NULL,
    country varchar(100),
    city varchar(150),
    state varchar(100),
    zip_code varchar(50),
    neighborhood varchar(150),
    road varchar(150),
    house_number varchar(50),
    complement varchar(150),
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);
