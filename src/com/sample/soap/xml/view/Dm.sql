mysql> use springboot;

mysql> create table employee(
ID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
FirstName varchar(75),
LastName varchar(75) NOT NULL,
Address varchar(55),
City varchar(55),
Email varchar(55) NOT NULL UNIQUE,
Mobile int(12) NOT NULL UNIQUE);

mysql> desc employee;
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| ID        | int(11)     | NO   | PRI | NULL    | auto_increment |
| FirstName | varchar(75) | YES  |     | NULL    |                |
| LastName  | varchar(75) | NO   |     | NULL    |                |
| Address   | varchar(55) | YES  |     | NULL    |                |
| City      | varchar(55) | YES  |     | NULL    |                |
| Email     | varchar(55) | YES  | UNI | NULL    |                |
| Mobile    | int(20)     | YES  | UNI | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+
7 rows in set (0.01 sec)

insert into employee values(1, 'Manu', 'Lahariya', 'sec49', 'Noida', 'm@gmail.com', 1234567890);
insert into employee (ID, FirstName, LastName, Address, City, Email, Mobile) values (2, 'Manul', 'Lahariya', 'sec49', 'Noida', 'm1@gmail.com', 1234567891);
insert into employee (FirstName, LastName, Address, City, Email, Mobile) values ('Ruchi', 'Rawat', 'sec49', 'Noida', 'r1@gmail.com', 1234567999);
insert into employee (FirstName, LastName, Address, City, Email, Mobile) values ('Shraddha', 'Lahariya', 'Sec50', 'BNDA', 'r3@gmail.com', 1234599999);

mysql> select * from employee;
+----+-----------+----------+---------+------+--------------+-----------+
| ID | FirstName | LastName | Address | City | Email        | Mobile    |
+----+-----------+----------+---------+------+--------------+-----------+
|  1 | Roo6      | L        | Sec49   | BNDA | r1@gmail.com | 644681423 |
|  2 | Manul     | Lsdfs    | Sec49   | BNDA | r2@gmail.com | 644681424 |
|  3 | Ruchi     | Rawat    | Sec49   | BNDA | r3@gmail.com | 644681425 |
|  6 | Shraddha  | L        | Sec49   | BNDA | r4@gmail.com | 644681426 |
|  7 | Sushma    | Lohiya   | Sec50   | BNDA | r5@gmail.com | 644681427 |
|  8 | Sushma    | L        | Sec51   | HPP  | r6@gmail.com | 644681428 |
+----+-----------+----------+---------+------+--------------+-----------+
6 rows in set (0.07 sec)

mysql>
