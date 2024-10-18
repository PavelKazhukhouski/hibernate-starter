CREATE DATABASE example_db;

CREATE TABLE engine
(
    id          SERIAL PRIMARY KEY,
    horse_power INT,
    volume      INT
);

CREATE TABLE cars
(
    id        SERIAL PRIMARY KEY,
    name      VARCHAR(25),
    year      INT,
    color     VARCHAR(25),
    price     INT,
    skorost   DOUBLE PRECISION,

    engine_id INT,

    FOREIGN KEY (engine_id) REFERENCES engine (id)
);
