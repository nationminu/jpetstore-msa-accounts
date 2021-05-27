 
INSERT INTO signon(username,password,role,enabled) VALUES('j2ee','$2a$10$Jy7jbIAlU35OnRhzPN5l3u9KWjE6VBWZ7eLN5xH10pFb3FYOZ1Hoe','USER',true);
INSERT INTO signon(username,password,role,enabled)  VALUES('ACID','$2a$10$x/4hk//y1cR/IGp92KYC4.jVP6oc574.WHvjmtN795YkICRfM9GVm','USER',true);

INSERT INTO account(userid,email,firstname,lastname,status,addr1,addr2,city,state,zip,country,phone) VALUES('j2ee','yourname@yourdomain.com','ABC', 'XYX', 'OK', '901 San Antonio Road', 'MS UCUP02-206', 'Palo Alto', 'CA', '94303', 'USA',  '555-555-5555');
INSERT INTO account(userid,email,firstname,lastname,status,addr1,addr2,city,state,zip,country,phone) VALUES('ACID','acid@yourdomain.com','ABC', 'XYX', 'OK', '901 San Antonio Road', 'MS UCUP02-206', 'Palo Alto', 'CA', '94303', 'USA',  '555-555-5555');

INSERT INTO profile(userid,banneropt,langpref,favcategory,mylistopt) VALUES('j2ee',1,'english','DOGS',1);
INSERT INTO profile(userid,banneropt,langpref,favcategory,mylistopt) VALUES('ACID',1,'english','CATS',1);