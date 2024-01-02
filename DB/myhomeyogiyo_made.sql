use myhomeyogiyo;
CREATE TABLE user (
    userId VARCHAR(20) PRIMARY KEY,
    name VARCHAR(30), -- Adjusted the length of the 'name' field
    password VARCHAR(20) NOT NULL,
    birthYear INT,
    sex CHAR(1),
    emailAccount VARCHAR(50), -- Adjusted the length of the 'emailAccount' field
    emailDomain VARCHAR(50), -- Adjusted the length of the 'emailDomain' field
    type INT CHECK (type IN (0, 1)), -- Adjusted the CHECK constrain
    profileImg VARCHAR(100),
    accessToken VARCHAR(1000) null,
    refreshToken VARCHAR(1000) null,
    createdTime DATETIME DEFAULT NOW(), 
    updatedTime DATETIME DEFAULT NULL,
    deletedTime DATETIME DEFAULT NULL
);

show columns from houseinfo;

CREATE TABLE comment(
	commentNo INT auto_increment PRIMARY KEY, 
    subject VARCHAR(50), 
    content VARCHAR(500), 
	createdTime DATETIME DEFAULT NOW(), 
    userId VARCHAR(20),
    aptCode bigint, 
	FOREIGN KEY (userId) REFERENCES user(userId),
    FOREIGN KEY (aptCode) REFERENCES houseinfo(aptCode)
);

CREATE TABLE search_keyword(
	keywordNo INT auto_increment PRIMARY KEY, 
    keyword VARCHAR(50), 
	createdTime DATETIME DEFAULT NOW(), 
    userId VARCHAR(20),
	FOREIGN KEY (userId) REFERENCES user(userId)
);

CREATE TABLE notice(
	noticeNo INT auto_increment PRIMARY KEY, 
    subject VARCHAR(50), 
    content VARCHAR(500), 
    createdTime DATETIME DEFAULT NOW(), 
    updatedTime DATETIME DEFAULT NULL,
    deletedTime DATETIME DEFAULT NULL,
    userId VARCHAR(20),
	FOREIGN KEY (userId) REFERENCES user(userId)
);


CREATE TABLE user_houseinfo_like(
    createdTime DATETIME DEFAULT NOW(), 
    updatedTime DATETIME DEFAULT NULL,
    deletedTime DATETIME DEFAULT NULL,
    userId VARCHAR(20),
    aptCode bigint, 
	FOREIGN KEY (userId) REFERENCES user(userId),
    FOREIGN KEY (aptCode) REFERENCES houseinfo(aptCode), 
    PRIMARY KEY(userId, aptCode)
);

CREATE TABLE user_comment_like(
    createdTime DATETIME DEFAULT NOW(), 
    updatedTime DATETIME DEFAULT NULL,
    deletedTime DATETIME DEFAULT NULL,
    userId VARCHAR(20),
    commentNo INT, 
	FOREIGN KEY (userId) REFERENCES user(userId),
    FOREIGN KEY (commentNo) REFERENCES comment(commentNo), 
    PRIMARY KEY(userId, commentNo)
);




