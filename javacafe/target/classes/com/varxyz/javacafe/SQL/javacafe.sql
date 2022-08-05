CREATE TABLE CateGoryTable (
	categoryname 		VARCHAR(15) 	PRIMARY KEY
)

SELECT * FROM CateGoryTable

CREATE TABLE CafeTable (
	cafeid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name 				VARCHAR(15) 	NOT NULL,
	price				BIGINT			NOT NULL,
	stock				BIGINT			NOT NULL,
	highCateGory		VARCHAR(15)		NOT	NULL,
	lowCateGory			VARCHAR(15)		NOT	NULL,
	imgUrl				VARCHAR(500)	NOT NULL,
	CONSTRAINT CafeTable_highCateGory_FK
		FOREIGN KEY (highCateGory) REFERENCES CateGoryTable(categoryname)
)
SELECT * FROM CafeTable WHERE highCateGory = "음료"
SELECT * FROM CafeTable
SELECT * FROM CafeTable WHERE lowCateGory = "커피"
DROP TABLE CafeTable