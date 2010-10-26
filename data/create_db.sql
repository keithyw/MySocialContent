use `mysql`;

create database `msc_db`;
grant all privileges on msc_db.* to 'msc_user'@'localhost' identified by '1fukyou';
flush privileges;
