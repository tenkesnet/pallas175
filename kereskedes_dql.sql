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








