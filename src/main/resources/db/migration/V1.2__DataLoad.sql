INSERT INTO `employee` VALUES 
	(1,'Leslie','Andrews','leslie@luv2code.com','(581) 785-8426'),
	(2,'Emma','Baumgarten','emma@luv2code.com','(581) 775-1236'),
	(3,'Avani','Gupta','avani@luv2code.com','(581) 905-7562'),
	(4,'Yuri','Petrov','yuri@luv2code.com','(581) 795-4856'),
	(5,'Juan','Vega','juan@luv2code.com','(581) 765-8472');
	
INSERT INTO student(first_name, last_name, email, phone) VALUES 
	('Andrei','Colombe','',''),
	('Elisa','Santos','lisantos@gmail.com','(425) 425-4236'),
	('Isabelle','Laflamme','belle.isa@hotmail.com','(471) 905-4278'),
	('Yuri','Petrov','yuri@luv2code.com','(581) 795-4856'),
	('Juan','Vega','juan@luv2code.com','(581) 765-8472'),
    ('Marina','Ferreri','marina.ferreri@hotmail.it',''),
    ('Denis','Berenger','denis.ber@gmail.com','(581) 772-8752');	
    
    
INSERT INTO course(name, description, is_available) VALUES 
	('Bachata Dominicaine','',true),
    ('Bachata Sensuelle','',true),
    ('Kizomba','',true),
    ('Lady Styling Bachara Choréo','',true),
    ('Salsa','',true),
    ('Salsa Cubaine','',true),
    ('Salsa Lady Styling','',true),
    ('Salsa Men Styling','',true),
    ('Zouk','',false);

INSERT INTO plan(name, detail_1, detail_2, detail_3, price) VALUES 
	('Débutant 1','1 cours','Niveau Débutant','Pas à Pas', 89.00),
    ('Débutant 2 ou plus','1 cours','Niveau Débutant 2 ou plus','Pas à Pas', 119.00),
	('Débutant ILLIMITÉ','Accès limité pour TOUS les cours niveau débutant 1','','', 129.00),
	('ILLIMITÉ TOTAL','TOUS les cours','N importe quel niveau','', 189.00);    
	
INSERT INTO schedule(course_id, instructor_id, level, day, hour, minutes) VALUES
	(1,1,'Debutant 1', 1, 17,45),
	(2,2,'Debutant 2', 1, 19,45),
	(3,4,'Debutant 3', 3, 18,45);
	
INSERT INTO weekday(name) VALUES 
	('dimanche'),
	('lundi'),
	('mardi'),
	('mercredi'),
	('jeudi'),
	('vendredi'),
	('samedi');