

--Insert Trigger for Accountant

CREATE TRIGGER accountantTrigger on accountant
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO

--Insert Trigger for chief Accountant

CREATE TRIGGER chiefAccountTrigger on chiefAccount
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO



--Insert Trigger for chief Accountant Audit

CREATE TRIGGER chiefAccountAuditTrigger on chiefAccountAudit
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO


--Insert Trigger for Comissary In Control

CREATE TRIGGER comissaryInControlTrigger on comissaryInControl
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO


--Insert Trigger for Driver Agents

CREATE TRIGGER driverAgentTrigger on driverAgent
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO

--Insert Trigger for General Manager

CREATE TRIGGER generalManagerTrigger on generalManager
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO

--Insert Trigger for Garduan

CREATE TRIGGER guardianTrigger on guardian
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO

--Insert Trigger for Human Resources Manager

CREATE TRIGGER humanResourcesManagerTrigger on humanResourcesManager
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO

--Insert Trigger for information Processor


CREATE TRIGGER informationProcessorTrigger on informationProcessor
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO

--Insert Trigger for Manager Assistant

CREATE TRIGGER managerAssistantTrigger on managerAssistant
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO



--Insert Trigger for Sales Manager

CREATE TRIGGER salesManagerTrigger on salesManager
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO


--Insert Trigger for Secretary Agent


CREATE TRIGGER secretaryAgentTrigger on secretaryAgent
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO



--Insert Trigger for Secretary Agent

CREATE TRIGGER secretaryAuditTrigger on secretaryAudit
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO


--Insert Trigger for Secretary Finances

CREATE TRIGGER secretaryFinancesTrigger on secretaryFinances
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO


--Insert Trigger for Steed Agent

CREATE TRIGGER steedAgentTrigger on steedAgent
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO


--Insert Trigger for Trade Agent

CREATE TRIGGER tradeAgentTrigger on tradeAgent
FOR INSERT
AS
INSERT INTO general
  select  tc , name , surname , gender , post , department , cell , email , password , startDate ,salary From inserted
GO
