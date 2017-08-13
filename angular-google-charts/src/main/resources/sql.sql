create table video(
	videoId bigint primary key auto_increment, 
	videoName varchar(1024), 
	categoryId bigint, 
	like_count varchar(1024), 
	dislike_count varchar(1024),
	CONSTRAINT fk_category FOREIGN KEY (categoryId)
    REFERENCES category(categoryId)
);

create table category(
	categoryId bigint primary key auto_increment, 
	categoryName varchar(1024)
);

insert into category(categoryName) values
	('Java'),
	('AngularJS 1'),
	('AngularJS 2'),
	('AngularJS 4'),
	('Mysql'),
	('Postgres');
	
insert into video(videoName, categoryId, like_count, dislike_count) values
	('Java chap 1', 1, 25, 2),
	('Java chap 2', 1, 25, 4),
	('AngularJS chap 1', 2, 25, 2),
	('AngularJS chap 2', 2, 50, 3),
	('Mysql chap 1', 5, 15, 0),
	('Mysql chap 3', 5, 12, 0),
	('Postgres chap 1', 6, 40, 10),
	('Postgres chap 2', 6, 50, 10);
