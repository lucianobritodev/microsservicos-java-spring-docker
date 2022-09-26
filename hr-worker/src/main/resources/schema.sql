DROP  TABLE IF EXISTS TB_WORKER;

CREATE TABLE IF NOT EXISTS TB_WORKER(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(200) not null,
    daily_Income double precision not null
)