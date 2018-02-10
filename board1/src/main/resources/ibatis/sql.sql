drop table board;

create table board(
id number(5) primary key,
title varchar2(100),
writer varchar2(50),
content varchar2(2000),
hit number(5) default 0,
regDate date default sysdate
	);

create or replace function f_max
return number
as
maxNum number(5);
begin
	select max(nvl(id,0)) into maxNum from board;
 return maxNum;	
end ;



