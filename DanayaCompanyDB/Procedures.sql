use DanayaDB
GO

CREATE proc   General_Managers
AS
SELECT *FROM  general
WHERE post = 'GManager'
GO


CREATE proc   Manager_Assistants
AS
SELECT *FROM  general
WHERE post = 'ManagerAs'
GO



CREATE proc   Human_Resources_Managers
AS
SELECT *FROM  general
WHERE post = 'HRManager'
GO



CREATE proc   Information_Processors
AS
SELECT *FROM  general
WHERE post = 'InfoProcessor'
GO


CREATE proc   Trade_Agents
AS
SELECT *FROM  general
WHERE post = 'TradeAgent'
GO


CREATE proc   Steed_Agents
AS
SELECT *FROM  general
WHERE post = 'SteedAgent'
GO



CREATE proc   Driver_Agents
AS
SELECT *FROM  general
WHERE post = 'DriverAgent'
GO


CREATE proc   Chief_Account_Audits
AS
SELECT *FROM  general
WHERE post = 'CAccountAudit'
GO



CREATE proc   Chief_In_Controls
AS
SELECT *FROM  general
WHERE post = 'CInControl'
GO

CREATE proc   Secretary_Audits
AS
SELECT *FROM  general
WHERE post = 'SecretaryAudit'
GO

CREATE proc   Chief_Accountants
AS
SELECT *FROM  general
WHERE post = 'CAccountant'
GO



CREATE proc   Accountants
AS
SELECT *FROM  general
WHERE post = 'Accountant'
GO



CREATE proc   Secretary_Agents
AS
SELECT *FROM  general
WHERE post = 'SecretaryAgent'
GO



CREATE proc   Guardians
AS
SELECT *FROM  general
WHERE post = 'Guardian'
GO