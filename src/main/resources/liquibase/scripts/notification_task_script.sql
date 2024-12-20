-- liquibase formatted sql

-- changeset kkatyshev:1


CREATE TABLE notification_task (
    id SERIAL,
    chat_id INT NOT NULL ,
    message TEXT NOT NULL,
    dateTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
)