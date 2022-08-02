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
	CONSTRAINT CafeTable_highCateGory_FK
		FOREIGN KEY (highCateGory) REFERENCES CateGoryTable(categoryname)
)
SELECT * FROM CateGoryTable
SELECT * FROM CafeTable
DROP TABLE CafeTable