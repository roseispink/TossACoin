--uzytkownicy
insert into user (blocked, name, surname, email, password, pesel, role, birth_date, phone_number) values ('false', 'Layney', 'Pharo', 'lpharo0@pcworld.com', '$2a$10$BF1oYBJi3Yyhb4lFggQijuUmZizAqBUDjmpACCEhS1q9ydAjx4iv', 78658411927, 'USER', '2003-06-15 12:14:25', 982151585);
insert into user (blocked, name, surname, email, password, pesel, role, birth_date, phone_number) values ('false', 'Lou', 'Longbone', 'llongbone1@quantcast.com', '$2a$10$BF1oYBJi3Yyhb4lFggQijuUmZizAqBUDjmpACCEhS1q9ydAjx4iv', 17766465358, 'USER', '1977-08-29 18:03:58', 582439097);
insert into user (blocked, name, surname, email, password, pesel, role, birth_date, phone_number) values ('false', 'Fernande', 'Chew', 'fchew2@123-reg.co.uk', '$2a$10$BF1oYBJi3Yyhb4lFggQijuUmZizAqBUDjmpACCEhS1q9ydAjx4iv', 17528824326, 'USER', '1979-12-06 22:46:25', 129884800);
insert into user (blocked, name, surname, email, password, pesel, role, birth_date, phone_number) values ('false', 'Sherlock', 'Sunners', 'ssunners3@oracle.com', '$2a$10$BF1oYBJi3Yyhb4lFggQijuUmZizAqBUDjmpACCEhS1q9ydAjx4iv', 80327863021, 'USER', '1972-10-17 09:41:06', 270006261);
insert into user (blocked, name, surname, email, password, pesel, role, birth_date, phone_number) values ('false', 'Iseabal', 'Covey', 'icovey4@amazon.de', '$2a$10$BF1oYBJi3Yyhb4lFggQijuUmZizAqBUDjmpACCEhS1q9ydAjx4iv', 70556733118, 'USER', '1984-09-05 13:44:13', 613780699);
insert into user (blocked, name, surname, email, password, pesel, role, birth_date, phone_number) values ('false', 'Evvie', 'Shellibeer', 'eshellibeer5@springer.com', '$2a$10$BF1oYBJi3Yyhb4lFggQijuUmZizAqBUDjmpACCEhS1q9ydAjx4iv', 59830799003, 'USER', '1976-01-07 11:17:31', 732919032);
insert into user (blocked, name, surname, email, password, pesel, role, birth_date, phone_number) values ('false', 'Elnar', 'Gething', 'egething6@marriott.com', '$2a$10$BF1oYBJi3Yyhb4lFggQijuUmZizAqBUDjmpACCEhS1q9ydAjx4iv', 73199412392, 'USER', '2002-07-26 04:47:15', 658405907);

--kategorie;
insert into category (name) values ('kot');
insert into category (name) values ('pies');
insert into category (name) values ('koń');
insert into category (name) values ('małe zwierze');
insert into category (name) values ('jedzenie');
insert into category (name) values ('operacja');
insert into category (name) values ('sprzęt');

--zbiorki;
insert into fundraising (available, categoryid, collected_money, description, fundraising_end, fundraising_start, goal, title, ownerid) values (true, 2, 1391, 'jeszcze nie ma', '2023-09-10 11:53:05', '2022-04-11 20:35:38', 7921, 'African bush squirrel', 7);
insert into fundraising (available, categoryid, collected_money, description, fundraising_end, fundraising_start, goal, title, ownerid) values (true, 8, 555, 'jeszcze nie ma', '2023-06-04 23:57:02', '2022-04-28 12:02:08', 6774, 'Euro wallaby', 5);
insert into fundraising (available, categoryid, collected_money, description, fundraising_end, fundraising_start, goal, title, ownerid) values (true, 3, 2456, 'dodać', '2023-10-12 13:39:43', '2022-11-22 03:48:10', 3488, 'Arctic hare', 3);
insert into fundraising (available, categoryid, collected_money, description, fundraising_end, fundraising_start, goal, title, ownerid) values (true, 5, 2354, 'dodać', '2023-06-29 19:36:48', '2023-01-27 04:41:23', 9214, 'Beaver, american', 3);
insert into fundraising (available, categoryid, collected_money, description, fundraising_end, fundraising_start, goal, title, ownerid) values (true, 3, 1661, 'jeszcze nie ma', '2022-12-14 19:40:09', '2022-04-25 03:27:17', 3071, 'Guerza', 1);
insert into fundraising (available, categoryid, collected_money, description, fundraising_end, fundraising_start, goal, title, ownerid) values (true, 7, 2527, 'trzeba zrobić', '2022-08-12 03:40:21', '2022-05-28 08:48:49', 7047, 'Raccoon dog', 2);
insert into fundraising (available, categoryid, collected_money, description, fundraising_end, fundraising_start, goal, title, ownerid) values (true, 4, 1144, 'jeszcze nie ma', '2022-10-24 02:06:34', '2023-01-12 13:25:51', 949, 'Eastern diamondback rattlesnake', 3);
insert into fundraising (available, categoryid, collected_money, description, fundraising_end, fundraising_start, goal, title, ownerid) values (true, 7, 262, 'trzeba zrobić', '2023-04-24 09:41:34', '2023-02-16 09:42:06', 8655, 'Turkey, common', 5);
insert into fundraising (available, categoryid, collected_money, description, fundraising_end, fundraising_start, goal, title, ownerid) values (true, 5, 511, 'dodać', '2023-02-13 01:01:06', '2022-04-20 14:04:34', 5838, 'Phalarope, grey', 5);
insert into fundraising (available, categoryid, collected_money, description, fundraising_end, fundraising_start, goal, title, ownerid) values (true, 8, 2804, 'dodać', '2022-11-09 23:19:41', '2023-02-24 18:49:38', 4633, 'Brown pelican', 5);
