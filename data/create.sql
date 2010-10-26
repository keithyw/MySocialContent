drop table if exists `users`;

create table `users`
(
	`id` bigint not null auto_increment,
	`first_name` varchar(50) not null,
	`last_name` varchar(50) not null,
	`email` varchar(150) not null unique,
	`username` varchar(50) not null unique,
	`password` varchar(100) not null,
	primary key(`id`)
);