--select mezőnevek from táblanevek where feltételek group by csoportosítás having csoportosítás szűrés order by rendezés;

select rendszam,tipus_nev,ar from autok, tipusok where autok.tipusok_id = tipusok.id ;

select rendszam,tipus_nev,ar from autok, tipusok where autok.tipusok_id = tipusok.id order by ar desc;

select rendszam,tipus_nev,ar from autok,tipusok where autok.tipusok_id = tipusok.id and ar > 1350000;

select tipus_nev,ar,auto_csop_nev from autok,tipusok,auto_csop 
	where 
		autok.tipusok_id = tipusok.id 
		and autok.auto_csop_id = auto_csop.id 
		and ar > 1350000
	order by auto_csop_nev asc, ar desc;
	

select * from tipusok;
select * from autok;