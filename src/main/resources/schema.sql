DROP TABLE IF EXISTS licenses;
CREATE TABLE licenses (

  id        VARCHAR(100) PRIMARY KEY NOT NULL,

  bookid   TEXT NOT NULL,

  licenseType      TEXT NOT NULL,

  productName      TEXT NOT NULL,

  licenseMax       INT   NOT NULL,

  licenseAllocated INT,

  comment           VARCHAR(100));
  
 INSERT INTO licenses (id,  bookid, licenseType, productName, licenseMax, licenseAllocated,comment)

VALUES ('f3831f8c-c338-4ebe-a82a-e2fc1d1ff78a', 'e254f8c-c442-4ebe-a82a-e2fc1d1ff78a', 'user','customer-crm-co', 100,5,'first');


 INSERT INTO licenses (id,  bookid, licenseType, productName, licenseMax, licenseAllocated,comment)

VALUES ('t9876f8c-c338-4abc-zf6a-ttt1', 'e254f8c-c442-4ebe-a82a-e2fc1d1ff78a', 'user','suitability-plus', 200,189,'sec');


 INSERT INTO licenses (id,  bookid, licenseType, productName, licenseMax, licenseAllocated,comment)

VALUES ('38777179-7094-4200-9d61-edb101c6ea84', '442adb6e-fa58-47f3-9ca2-ed1fecdfe86c', 'user','HR-PowerSuite', 100,4,'third');

