-- To get the H2 console work, disable security and comment whole Security
-- Config file
insert into user values(100001, sysdate(), 'Mani');
insert into user values(100002, sysdate(), 'Kanta');
insert into user values(100003, sysdate(), 'Mani Kanta');

insert into post values(110001, 'My first post', 100001);
insert into post values(110002, 'My second post', 100001);