--------------------------------------------------------
--  File created - Wednesday-June-02-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table SIM_CARD
--------------------------------------------------------

  CREATE TABLE SIM_CARD (SIM_ID NUMBER, OPERATOR_CODE NUMBER, COUNTRY_NAME VARCHAR2(50), DEVICE_STATUS VARCHAR2(50))
REM INSERTING into SIM_CARD
SET DEFINE OFF;
Insert into SIM_CARD (SIM_ID,OPERATOR_CODE,COUNTRY_NAME,DEVICE_STATUS) values (1,11,'Egypt','WAITING_FOR_ACTIVATION');
Insert into SIM_CARD (SIM_ID,OPERATOR_CODE,COUNTRY_NAME,DEVICE_STATUS) values (2,12,'Italy','ACTIVE');
Insert into SIM_CARD (SIM_ID,OPERATOR_CODE,COUNTRY_NAME,DEVICE_STATUS) values (3,13,'Malysia','DEACTIVATED');
Insert into SIM_CARD (SIM_ID,OPERATOR_CODE,COUNTRY_NAME,DEVICE_STATUS) values (4,14,'Egypt','DEACTIVATED');
Insert into SIM_CARD (SIM_ID,OPERATOR_CODE,COUNTRY_NAME,DEVICE_STATUS) values (5,15,'England','WAITING_FOR_ACTIVATION');
Insert into SIM_CARD (SIM_ID,OPERATOR_CODE,COUNTRY_NAME,DEVICE_STATUS) values (7,17,'USA','WAITING_FOR_ACTIVATION');
--------------------------------------------------------
--  DDL for Index TABLE1_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX TABLE1_PK ON SIM_CARD (SIM_ID)
--------------------------------------------------------
--  Constraints for Table SIM_CARD
--------------------------------------------------------

  ALTER TABLE SIM_CARD ADD CONSTRAINT TABLE1_PK PRIMARY KEY (SIM_ID) ENABLE
  ALTER TABLE SIM_CARD MODIFY (SIM_ID NOT NULL ENABLE)
