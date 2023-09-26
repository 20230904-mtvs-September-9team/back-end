-- 가수 테이블 생성
CREATE TABLE artist (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- 음원 테이블 생성
CREATE TABLE song (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    artist_id INT,
    FOREIGN KEY (artist_id) REFERENCES artist(id)
);

-- DB 생성
create database db_imagitaion;
create user user_imagitaion@localhost identified by '1234';
grant all privileges on db_imagitaion.* to user_imagitaion@localhost;
