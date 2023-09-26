-- 가수 테이블 생성
CREATE TABLE IF NOT EXISTS Artist (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- 음원 테이블 생성
CREATE TABLE IF NOT EXISTS Song (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL
);


-- 선택 정보를 저장할 테이블 생성
CREATE TABLE IF NOT EXISTS Selection (
    id INT AUTO_INCREMENT PRIMARY KEY,
    selected_artist VARCHAR(255) NOT NULL,
    selected_song VARCHAR(255) NOT NULL
);



-- DB 생성
create database db_imagitaion;
create user user_imagitaion@localhost identified by '1234';
grant all privileges on db_imagitaion.* to user_imagitaion@localhost;

