show databases;

show variables like 'datadir';

create database mydb1226;

drop database mydb1226;

# [4-2] 만약에 데이터베이스가 존재 하면 삭제하기
# if(만약에) exists(존재하다)
drop database if exists mydb1226;

# [5] db server 내 여러개 데이터베이스 중에 사용/활성화 할 데이터베이스 선택

drop database if exists test1;

create database test1;

show databases;

show variables like 'datadir';

use mydb1230;

# [5] MYSQL 데이터 타입
# 다양한 데이터 타입 이용한 테이블 생성 실습
create table testtable3 ( # 테이블 생성 시작
	# 속성명 타입 , 속성명 타입
    정수필드1 tinyint 	 , 정수필드2 smallint     , 정수필드3 mediumint 	, 정수필드4 int		 , 정수필드5 bigint ,
    실수필드1 float		 , 실수필드2 double 	  ,
    날짜필드 date 		 , 시간필드 time 		  , 날짜시간필드 datetime   ,
    문자필드1 char(100)  , 문자필드2 varchar(100) , 문자필드3 text 			, 문자필드4 longtext ,
    논리필드 bool 		# 마지막 필드 뒤에는 ,(쉼표) 넣지 않는다.
);