# 프로젝트 : boardservice10 CML 과 샘플 INSERT
# 1. DB 구성한다.
drop database if exists boardservice10;
create database boardservice10;
use boardservice10;

# 2. 테이블 생성 , PK 테이블 먼저 생성 한다. 적절하게 타입 과 제약조건을 고려한다.
# [1] 회원테이블 생성
create table member (
	mno int unsigned auto_increment ,
    mid varchar(30) not null unique ,
    mpwd varchar(30) not null ,
    mname varchar(20) not null ,
    mphone varchar(13) not null unique ,
    mdate datetime default now() ,
    constraint primary key(mno)
);

# [2] 회원테이블 샘플 레코드 삽입
insert into member ( mid, mpwd, mname, mphone ) values ( 'qwe123', 'a123456', '유재석', '010-3333-3333' );
insert into member ( mid, mpwd, mname, mphone ) values ( 'asd123', 'b123456', '강호동', '010-4444-4444' );
insert into member ( mid, mpwd, mname, mphone ) values ( 'zxc123', 'c123456', '신동엽', '010-5555-5555' );
insert into member ( mid, mpwd, mname, mphone ) values ( 'vbn123', 'd123456', '서장훈', '010-6666-6666' );
insert into member ( mid, mpwd, mname, mphone ) values ( 'rty123', 'e123456', '하하', '010-7777-7777' );

# [3] 카테고리 테이블 생성
create table category (
	cno int unsigned auto_increment ,
    cname varchar(10) not null unique,
    cdate datetime default now() ,
    constraint primary key(cno)
);

# [4] 카테고리 샘플 레코드 삽입
insert into category ( cname ) values ( '자유' );
insert into category ( cname ) values ( '질문' );
insert into category ( cname ) values ( '노하우' );
insert into category ( cname ) values ( '공부' );
insert into category ( cname ) values ( '친목' );

# [5] 게시물 테이블 생성
create table board (
	bno int unsigned auto_increment ,
    btitle varchar(100) not null ,
    bcontent longtext ,
    vbiew int unsigned default 0 ,
    bdate datetime default now() ,
    mno int unsigned ,
    cno int unsigned ,
    constraint primary key(bno) ,
    # FK 제약조건 옵션 ,
		# on update/delete [옵션]	: fk가 참조하는 pk가 삭제 또는 수정에 따른 fk의 제약 옵션
		# restrict 					: fk가 pk를 참조중이면 pk 레코드를 삭제/수정 불가능
		# cascade					: pk 값이 삭제/수정 되면 fk 도 같이 삭제/수정
        # set null					: pk 값이 삭제/수정 되면 fk는 참조 없애고 null 변경
	# 만약에 특정 회원이 회원탈퇴(PK) 삭제되면 그를 참조하는 작성자(FK) 레코드도 같이 삭제/수정 한다.
    constraint foreign key(mno) references member (mno) on update cascade on delete cascade ,
    # 만약에 특정 카테고리가 삭제 되면 그를 참조하는 게시물 도 같이 삭제/수정 한다.
    constraint foreign key(cno) references category (cno) on update cascade on delete cascade
);

# [6] 게시물 샘플 레코드 삽입
insert into board ( btitle , bcontent , mno , cno ) values ( '안녕하세요1' , '힘찬 자바1' , 1 , 1 );
insert into board ( btitle , bcontent , mno , cno ) values ( '안녕하세요2' , '힘찬 자바2' , 1 , 3 );
insert into board ( btitle , bcontent , mno , cno ) values ( '안녕하세요3' , '힘찬 자바3' , 4 , 3 );
insert into board ( btitle , bcontent , mno , cno ) values ( '안녕하세요4' , '힘찬 자바4' , 2 , 5 );
insert into board ( btitle , bcontent , mno , cno ) values ( '안녕하세요5' , '힘찬 자바5' , 3 , 2 );

# [7] 댓글 테이블 생성
create table reply(
	rno int unsigned auto_increment,
	rcontent varchar(100) not null,
    rdate datetime default now(),
	constraint primary key(rno),   
    mno int unsigned,
    constraint foreign key(mno) references member(mno) on update cascade on delete cascade,
    bno int unsigned,
    constraint foreign key(bno) references board(bno) on update cascade on delete cascade
);

# [8] 댓글 테이블 샘플 레코드 삽입
insert into reply(rcontent, mno, bno) values('하하하 댓글1', 3, 3);
insert into reply(rcontent, mno, bno) values('하하하 댓글2', 3, 3);
insert into reply(rcontent, mno, bno) values('하하하 댓글3', 4, 5);
insert into reply(rcontent, mno, bno) values('하하하 댓글4', 5, 5);
insert into reply(rcontent, mno, bno) values('하하하 댓글5', 1, 4);

select * from member;
select * from category;
select * from board;
select * from reply;