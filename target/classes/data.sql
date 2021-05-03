 
INSERT INTO signon(username,password) VALUES('j2ee','j2ee');
INSERT INTO signon(username,password)  VALUES('ACID','ACID');

INSERT INTO account(userid,email,firstname,lastname,status,addr1,addr2,city,state,zip,country,phone) VALUES('j2ee','yourname@yourdomain.com','ABC', 'XYX', 'OK', '901 San Antonio Road', 'MS UCUP02-206', 'Palo Alto', 'CA', '94303', 'USA',  '555-555-5555');
INSERT INTO account(userid,email,firstname,lastname,status,addr1,addr2,city,state,zip,country,phone) VALUES('ACID','acid@yourdomain.com','ABC', 'XYX', 'OK', '901 San Antonio Road', 'MS UCUP02-206', 'Palo Alto', 'CA', '94303', 'USA',  '555-555-5555');

INSERT INTO profile(userid,banneropt,favcategory,langpref,mylistopt) VALUES('j2ee',1,'english','DOGS',1);
INSERT INTO profile(userid,banneropt,favcategory,langpref,mylistopt) VALUES('ACID',1,'english','CATS',1);