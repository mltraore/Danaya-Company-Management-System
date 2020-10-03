
--GENERAL TABLE

CREATE TABLE general
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--MANAGERS

--General Manager Table
CREATE TABLE generalManager
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--Manager Assistant Table
CREATE TABLE managerAssistant
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--Sales Manager Table
CREATE TABLE salesManager
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--Human Resources Manager Table
CREATE TABLE humanResourcesManager
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO


--INFORMATION OFFICE

--Information Processor Table
CREATE TABLE informationProcessor
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--TRADES

--Trade Agents Table
CREATE TABLE tradeAgent
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--STEEDS

--Steed Agents Table
CREATE TABLE steedAgent
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--DRIVERS

--Driver Agents Table
CREATE TABLE driverAgent
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--AUDIT

--Chief Accountant Audit Table
CREATE TABLE chiefAccountAudit
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--Comissary In Control Table
CREATE TABLE comissaryInControl
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--Secretary Audit Table
CREATE TABLE secretaryAudit
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--FINANCES

--Chief Accountant 
CREATE TABLE chiefAccount
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--Accountant
CREATE TABLE accountant
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--Secretary Finances 
CREATE TABLE secretaryFinances
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--SECURITY

--Security Agents
CREATE TABLE  secretaryAgent
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO

--Guardian
CREATE TABLE guardian
(
    Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(15) not NULL,
    surname NVARCHAR(15) NOT NULL,
    gender  NVARCHAR(7)  NOT NULL,
    post    NVARCHAR(15) NOT NULL,
    department NVARCHAR(15) NOT NULL,
    cell  NVARCHAR(15) NOT NULL,
    email NVARCHAR(50) not NULL UNIQUE,
    password NVARCHAR(15) NOT NULL,
    startDate DATE,
    salary FLOAT,
    picture IMAGE
);
GO