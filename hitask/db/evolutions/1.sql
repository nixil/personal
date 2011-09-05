# Initial schema

# --- !Ups
CREATE TABLE task (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    status varchar(50) NOT NULL,
    date datetime NOT NULL,
    PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE task;