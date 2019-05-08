USE KOYOTA

CREATE TABLE TB_CR (
	CR_CD BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	CR_NM VARCHAR(50) NOT NULL,
        CR_MRC VARCHAR(50) NOT NULL,
	CR_COR VARCHAR(50) NOT NULL,
	CR_ANO VARCHAR(20) NOT NULL,
	CR_KM FLOAT NOT NULL,
	PRIMARY KEY(CR_CD)
);
CREATE TABLE TB_CR_USR (
	CR_USR_CD BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	CR_USR_USR_CD BIGINT UNSIGNED NOT NULL,
	CR_USR_CR_CD BIGINT UNSIGNED NOT NULL,
	PRIMARY KEY(CR_USR_CD),
	FOREIGN KEY CR_USR_USR_FK (CR_USR_USR_CD) REFERENCES TB_USR (USR_CD) ON DELETE RESTRICT ON UPDATE CASCADE,
	FOREIGN KEY CR_USR_CR_FK (CR_USR_CR_CD) REFERENCES TB_CR (CR_CD) ON DELETE RESTRICT ON UPDATE CASCADE
);
CREATE TABLE TB_AUT_USR (
	AUT_USR_CD BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	AUT_USR_USR_CD BIGINT UNSIGNED NOT NULL,
	AUT_USR_AUT_CD BIGINT UNSIGNED NOT NULL,
	PRIMARY KEY(AUT_USR_CD),
	FOREIGN KEY AUT_USR_USR_FK (AUT_USR_USR_CD) REFERENCES TB_USR (USR_CD) ON DELETE RESTRICT ON UPDATE CASCADE,
	FOREIGN KEY AUT_USR_AUT_FK (AUT_USR_AUT_CD) REFERENCES TB_AUT (AUT_CD) ON DELETE RESTRICT ON UPDATE CASCADE
);
CREATE TABLE TB_AUT (
	AUT_CD BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	AUT_NM VARCHAR(25),
	PRIMARY KEY(AUT_CD)
);
CREATE TABLE TB_USR (
	USR_CD BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	USR_NM VARCHAR(50) NOT NULL,
	USR_SBN VARCHAR(50),
	USR_CPF VARCHAR(60) NOT NULL,
	USR_TF VARCHAR(20) NOT NULL,
	PRIMARY KEY(USR_CD)
);