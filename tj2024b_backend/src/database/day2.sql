create database my1230;
use my1230;
# [1] 테이블 생성한다. create table 테이블명(필드명 타입);
create table testtable1(필드명 int);
# [2] 현재 활성화(사용) 중인 DB내 모든 테이블 조회
show tables;
# [3] 테이블 생성한다. create table 테이블명(필드명 타입 , 필드명 타입)
# 여러개 필드가 존재할 경우 ,(쉼표) 구분한다
create table testtable2( 필드명1 int , 필드명2 double );
# [4] 테이블 삭제한다. drop table 테이블명;
drop table testtable1;
drop table if exists testtable2;
# [5] 데이터 타입
/*
	[정수]
		tinyint		1바이트		-128 ~ +127		vs byte
        smallint	2바이트		+-3만정도		vs short
        mediumint	3바이트		+-800만정도
        int			4바이트		+-21억이상
        bigint		8바이트		+-21억이상		vs long
	[실수]
		float		4바이트		부동소수점(표현 범위 이상일 경우 오차 발생)
        double		8바이트		부동소수점(표현 범위 이상일 경우 오차 발생)
        decimal		문자타입	실수를 문자로 처리하는 타입 , 오차 없음
	[날짜/시간]
		date		날짜표현 , 0000-00-00 , 1000년 ~ 9999년
        time		시간표현 , 00:00:00
        datetime	날짜/시간표현 , 0000-00-00 00:00:00
	[문자]
		char(문자길이)	문자열표현 , 고정길이 , 최대 255글자 , char(5)		--> "유재석" --> [유] [재] [석] [ ] [ ]
        varchar(문자길이) 문자열표현 , 가변길이 , 최대 255글자 , varchar(5) --> "유재석" --> [유] [재] [석] 남은 길이는 제거
        text			문자열표현 , 최대 6만 글자
        longtext		문자열표현 , 최대 42억개 글자 , 4GB , 대용량
	[논리]
		bool		true or false 표현 , tinyint 와 같다.
*/
