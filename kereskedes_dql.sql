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

















