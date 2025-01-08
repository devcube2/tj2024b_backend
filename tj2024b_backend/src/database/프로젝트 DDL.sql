create table member (
	mno int unsigned auto_increment ,
    mid varchar(30) not null ,
    mpwd varchar(30) not null ,
    mname varchar(30) not null ,
    mphone varchar(13) not null ,
    mtype tinyint not null ,
    constraint primary key(mno)
);

insert into member (mid, mpwd, mname, mphone, mtype) values ('qwe', '1234', '현정우', '010-1111-1111', 1);
insert into member (mid, mpwd, mname, mphone, mtype) values ('asd', '2345', '박희만', '010-2222-2222', 2);
insert into member (mid, mpwd, mname, mphone, mtype) values ('zxc', '3456', '한상범', '010-3333-3333', 2);
insert into member (mid, mpwd, mname, mphone, mtype) values ('rty', '4567', '노진구', '010-4444-4444', 2);
insert into member (mid, mpwd, mname, mphone, mtype) values ('fgh', '5678', '유재석', '010-5555-5555', 2);
insert into member (mid, mpwd, mname, mphone, mtype) values ('vbn', '6789', '강호동', '010-6666-6666', 3);

create table memberaddress (
	mano int unsigned auto_increment ,
    mazipcode varchar(100) not null ,
    maroad varchar(100) not null ,
    mastreet varchar(100) not null ,
    madetail varchar(100) not null ,
    mno int unsigned ,
    constraint primary key(mano) ,
    constraint foreign key(mno) references member(mno) on update cascade on delete cascade
);