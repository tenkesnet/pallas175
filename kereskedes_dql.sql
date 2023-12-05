show search_path;
set search_path = kereskedes;
--select mezőnevek from táblanevek where feltételek group by csoportosítás having csoportosítás szűrés order by rendezés;

select rendszam,tipus_nev,ar from autok, tipusok where autok.tipusok_id = tipusok.id ;

select rendszam,tipus_nev,ar from autok, tipusok where autok.tipusok_id = tipusok.id order by ar desc;

--8.feladat
select rendszam,tipus_nev,ar from autok,tipusok where autok.tipusok_id = tipusok.id and ar > 1350000;

--9. feladat
select tipus_nev,ar,auto_csop_nev from autok,tipusok,auto_csop 
	where 
		autok.tipusok_id = tipusok.id 
		and autok.auto_csop_id = auto_csop.id 
		and ar > 1350000
	order by auto_csop_nev asc, ar desc;
	

select * from tipusok;
select * from autok;

--10.
select rendszam,tipus_nev,auto_csop_nev  from autok, tipusok, auto_csop where auto_csop_nev <> 'EXTRA' and autok.tipusok_id = tipusok.id and tipusok.auto_csop_id = auto_csop.id ;

--12
select rendszam,futott_km,ar from autok , rendeles where rendeles.rendszam_id = autok.id  and  rendeles.fizetes = 'N';

-- 15. Irassa ki az összes olyan autó rendszámát, típusát és a futott kilométert, amelyek a 20-as részleghez tartoznak!

select rendszam,tipus_nev, futott_km from autok,tipusok,reszleg where autok.tipusok_id = tipusok.id and autok.reszleg_id = reszleg.id and reszleg.reszleg_kod =20;

-- 23. Irassa ki az ALKALMAZOTT táblából azokat a dolgozókat, akik a 20-as vagy 50-es kódú részlegben dolgoznak!
select alkalmazott.*,reszleg_kod e from alkalmazott , reszleg where alkalmazott.reszleg_id = reszleg.id and  (reszleg.reszleg_kod =20 or reszleg.reszleg_kod =50);

-- Irassa ki azokat a dolgozókat, akiknek fizetése 50000 és 100000 Ft közötti!

select * from alkalmazott where fizetes between 50000 and 100000;

--52. Készítsen listát azokról a dolgozókról, akik nem kaptak prémiumot!

select id,alk_kod,alk_nev ,beosztas ,fizetes , coalesce(premium,0) from alkalmazott ;

--48. Irassa ki azon alkalmazottak adatait, akik nevének második betűje az 'O' betű!
select * from alkalmazott a where alk_nev like '_O%';

--45. Irassa ki a 10, 20 vagy 60-as telepen dolgozók adatait!
select * from alkalmazott a , reszleg r where a.reszleg_id = r.id and r.reszleg_kod in (10,20,60);

--44. Irassa ki azon dolgozók adatait, akiknek a beosztása 'TELEPHELYVEZETŐ' vagy 'SZERELŐ'!
select * from alkalmazott a where beosztas in ('TELEPHELYVEZETO','SZERELO');

--50. Irassa ki azon alkalmazottak adatait, akik a 10-es részlegben dolgoznak és beosztásuk 'ELADÓ', vagy nem kaptak prémiumot!
select * from alkalmazott a , reszleg r where a.reszleg_id = r.id and (r.reszleg_kod=20 and (a.beosztas='ELADO' or a.premium is null));

--53. Irassa ki azon dolgozók adatait, akiknek a fizetése kisebb, mint a prémiumuk kétszerese!
select * from alkalmazott a where fizetes<2*premium ;

--56. Irassa ki azon megrendelések adatait, amelyekben a kölcsönzött (nem kifizetett) autó típusnevében szerepel a RENAULT szó!
select * from rendeles r , tipusok t where r.tipusok_id = t.id and t.tipus_nev like '%RENAULT%' and r.fizetes = 'N';

--54. Irassa ki azokat a rendelés adatokat, amelyekben a kölcsönzés végén a kilométeróra állása legalább 1000-rel mutat többet, mint az elején vagy a kölcsönzött napok száma nagyobb 10-nél!
select * from rendeles r where km_veg is not null and (km_veg-km_kezdet>1000 or napok>10); 

--57. Készítsen listát azon autók adatairól, amelyek kilométer díja 100 és 300 Ft között van és napi kölcsönzési díja kevesebb, mint 6000 Ft!
select * from autok a , tipusok t , auto_csop ac where a.tipusok_id = t.id and t.auto_csop_id = ac.id and ac.km_dij between 50 and 300 and ac.napi_dij <6000 ;

--58. Listázza ki azokat az autótípus jellemzőket, amelyek az E-vel kezdődő nevű autócsoportba tartoznak!
select * from tipusok t , auto_csop ac where t.auto_csop_id = ac.id and ac.auto_csop_nev like 'E%';

--55. Készítsen listát azon megrendelésekben tárolt adatokról, amelyekben a következő rendszámú autók közül kölcsönöztek: ABC-123, ABR-047, BAH-115, CDE-324!
select * from rendeles r, autok a  where r.rendszam_id = a.id and a.rendszam in ('ABC-123', 'ABR-047', 'BAH-115', 'CDE-324');

--61. Irassa ki az alkalmazottak nevét nagy kezdőbetűkkel, beosztásukat csupa kis betűvel!
select initcap(a.alk_nev),lower(a.beosztas)  from alkalmazott a ;

--63. Készítsen listát az összes készpénzzel fizető ügyfélről! Az ügyfél nevét, számát és a fizetési módját a következő szöveg után írja ki: 'ÜGYFÉL:'

select 'ÜGYFÉL: '||u.ugyfel_nev||','||u.ugyfel_szam||','||u.fizetesi_mod  from ugyfelek u where u.fizetesi_mod = 'K' ;

--64. Irassa ki az ügyfelek számát, nevét és megbízottját úgy, hogy a megbízott neve nagybetűvel kezdődjön és a többi karaktere kisbetűs legyen vagy 
--10 db '*' szerepeljen az üres mező helyén!

select u.ugyfel_szam , u.ugyfel_nev , coalesce(initcap(u.megbizott),'**********') from ugyfelek u ;

--65. A 'minden|szo nagy,betuvel.kezdodik' karaktersorozatra alkalmazzuk az INITCAP függvényt! (DUAL tábla)

select initcap('minden|szo nagy,betuvel.kezdodik') ;

--66. Irassa ki az alkalmazottak beosztását kisbetűvel és azt, hogy az alkalmazott neve hány karakterből áll!
select lower(a.beosztas),length(a.alk_nev)  from alkalmazott a ;

--67. Irassa ki a beosztásokat, és a beosztások 4-6. karakterét kisbetűssé alakítva!
select lower(substr(a.beosztas,4,3)),a.beosztas from alkalmazott a ;

--70. Irassa ki a 'KAKAS' karaktersorozatot úgy, hogy balról vágjuk le az 'A' és 'K' karaktereket!
select  ltrim( ltrim('KAKAS','K'),'A'); 

select ABS(1000), ABS(-100) , ABS(-27.11);
select SQRT(25), SQRT(36);
select POWER(5,2);
select ROUND(-123.456,2), ROUND(123.556,0),ROUND(123.456,-1), ROUND(-123.4567,2);
select TRUNC(123.45,1), TRUNC(123.45,0) ,TRUNC(123.45,-1), TRUNC(123.45,-2);
select SIGN(10), SIGN(0), SIGN(-5);
select CEIL(6.1), CEIL(-6.1);
select FLOOR(6.1), FLOOR(-6.1);
select MOD(10,3);

--74. Írjon SELECT parancsot, amely kerekítve kiírja, hogy mennyibe kerül 3 napra 257 km-re egy'NORMAL' autócsoportba tartozó autó kölcsönzése!
SELECT ROUND(3*napi_dij+275*km_dij) FROM auto_csop WHERE auto_csop_nev='NORMAL';

--73. Irassa ki az alkalmazottak nevét, fizetését és fizetésének címletezését! Hány db 5000, 1000, 500 és 100 Ft-os szükséges a kifizetéshez?
SELECT 
sum((fizetes/5000)) otezer,
sum(((fizetes%5000)/1000)) ezer,
sum((((fizetes%5000)%1000)/500)) otszaz,
sum(((((fizetes%5000)%1000)%500)/100)) szaz,
sum(((((fizetes%5000)%1000)%500%100)/50)) otven
FROM alkalmazott ;

--77. Írassuk ki az AUTOK táblából a NORMAL autócsoport minden autójának rendszámát, típusnevét és vásárlási időpontját 'the 6 day of Jun, 1994'- hez hasonló formában!

select a.rendszam,t.tipus_nev , to_char(a.vasarlas_datuma,'the DD day of Mon, YYYY') vasarlas_datuma from autok a , auto_csop ac, tipusok t where a.auto_csop_id = ac.id and a.tipusok_id = t.id  and lower(ac.auto_csop_nev) = 'normal' ;

select a.rendszam,t.tipus_nev , to_char(a.vasarlas_datuma,'Q.  YYYY.Mon.DD') vasarlas_datuma from autok a , auto_csop ac, tipusok t where a.auto_csop_id = ac.id and a.tipusok_id = t.id  and lower(ac.auto_csop_nev) = 'normal' ;

--78. Irassa ki azokat a rendelés adatokat, ahol a rendelés feladása és a kölcsönzés kezdete között 1 hétnél kevesebb idő van!
select r.kolcson_kezdete - r.rendeles_datum,* from rendeles r where r.kolcson_kezdete - r.rendeles_datum < 7;

--79. Készítsen listát az összes olyan rendelés tételről, ahol a kölcsönzési idő 10 napnál hosszabb!
SELECT * FROM rendeles WHERE napok > 10;

--80. Irassa ki az elmúlt 7 nap rendelés adatait! (SYSDATE)
select current_date , now();
select current_date - r.rendeles_datum,* from rendeles r where current_date - r.rendeles_datum <7;

--81. Ha feltesszük, hogy az amortizáció az eredeti ár 3%-a havonta, akkor írassuk ki, hogy az 1994 előtt vásárolt autóknak mennyi a jelenlegi értéke!

select vasarlas_datuma, TRUNC( (extract(year from age(current_date, vasarlas_datuma ))*12 + extract(month from age(current_date, vasarlas_datuma)))::numeric ,0) ho,
(ar/100)*3 amort_ert,
ar vasarlasi_ar,
ar-((ar/100)*3*TRUNC( (extract(year from age(current_date, vasarlas_datuma ))*12 + extract(month from age(current_date, vasarlas_datuma)))::numeric ,0)) jelenlegi_ert
FROM autok WHERE vasarlas_datuma < '1994-01-01';


select extract(year from age(current_date, vasarlas_datuma )),extract(month from age(current_date, vasarlas_datuma))from autok a ;

--82. Irassa ki a rendelések táblájából az ügyfelek számát, a rendelésük dátumát, valamint a kölcsönzés kezdetének időpontját a magyar szokásoknak megfelelően! (év. hó. nap.)

SELECT id,TO_CHAR(rendeles_datum,'YYYY.MM.DD') rendeles, TO_CHAR(kolcson_kezdete,'YYYY.MM.DD') kolcsonzes FROM rendeles;
SELECT id,rendeles_datum, kolcson_kezdete FROM rendeles;

--83. Írja ki a mai dátumot követő 90. nap dátumát! (SYSDATE)
select current_date + 90;

--84. Írja kí az alkalmazottak táblájából a belépés dátumát és annak 5 hónappal megnövelt értékét!
SELECT belepes,belepes + interval '5 month' FROM alkalmazott;

--85. Írja ki minden alkalmazottra a rendszerdátum (SYSDATE) és a belépés dátuma közötti hónapok számát!

SELECT alk_nev,(extract(year from age(current_date, belepes ))*12 + extract(month from age(current_date, belepes)))::numeric as "eltelt hónapok" FROM alkalmazott;

--86. Írja ki a rendszerdátumhoz legközelebbi 'Friday' dátumát, valamint a hónap utolsó napjának dátumát!
-- az 5+7 -et kell változtatni az 5-ös helyére a nap számát, ahol a 0 avasárnap és 6-os a szombat
SELECT 'TOMORROW'::date + ( 5 + 7 - extract ( dow FROM 'TOMORROW'::date))::int%7, (date_trunc('MONTH', current_date) + INTERVAL '1 MONTH - 1 day')::date;

--87. Irassa ki a '1994. 06. 07.' karaktersorozat dátummá konvertált alakját!

SELECT TO_DATE('2080 06 07','YY-MM-DD');

--88. Írja ki a belépés dátumát'YYYY.Month.DAY' formában!

SELECT TO_CHAR(belepes,'YYYY.Month.DAY') FROM alkalmazott;

--89. Írja ki a saját születési dátumát betűkkel! 'Year Month Day'
SELECT TO_CHAR(TO_DATE('1975.01.20','YYYY.MM.DD'), 'YYYY Month DD');

--93. Irassa ki az alkalmazottak táblájából a minimális, a maximális, az összes és az átlagfizetést, valamint a létszámot!

SELECT MIN(fizetes),MAX(fizetes),SUM(fizetes),AVG(fizetes),COUNT(fizetes) FROM alkalmazott;

--94. Irassa ki a részlegkódot, a minimális, a maximálís, az összes és átlagfizetést, valamint a létszámot részlegenkénti csoportosításban!

SELECT reszleg_kod,MIN(fizetes),MAX(fizetes),SUM(fizetes),AVG(fizetes),COUNT(fizetes) FROM alkalmazott a, reszleg r  where  a.reszleg_id = r.id GROUP BY r.reszleg_kod order by r.reszleg_kod asc;

--96. Irassa ki a részlegkódot, átlagfizetést azokra a részlegekre, ahol az átlagfizetés 8000 Ft-nál nagyobb!

SELECT reszleg_kod,AVG(fizetes) FROM alkalmazott a, reszleg r  where  a.reszleg_id = r.id GROUP BY r.reszleg_kod having avg(fizetes)>18000 order by r.reszleg_kod asc;

--97. Irassa ki azon a részlegek kódját, ahol pontosan ketten dolgoznak!

SELECT reszleg_kod,alk_nev  FROM alkalmazott a, reszleg r  where  a.reszleg_id = r.id GROUP BY r.reszleg_kod,a.alk_nev  having count(a.alk_nev)=2 order by r.reszleg_kod asc;



