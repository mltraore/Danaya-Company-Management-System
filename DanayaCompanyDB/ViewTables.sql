

use DanayaDB
GO
CREATE VIEW VWI_Calisan_Maasi_Zam_YOK
AS
SELECT name,surname,department,post,salary
FROM general ORDER BY post
GO




use DanayaDB
GO
CREATE VIEW VWI_Calisan_Maasi_Zam_VAR(name,surname,department,post,salary)
AS
SELECT name,surname,department,post,SUM(CONVERT(money,(salary+salary*0.15)))
FROM general
ORDER BY post
GO


