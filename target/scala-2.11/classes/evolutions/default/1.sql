# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comments (
  id                        bigint not null,
  author_id                 bigint,
  posted_at                 timestamp,
  content                   text,
  post_id                   bigint,
  constraint pk_comments primary key (id))
;

create table linked_account (
  id                        bigint not null,
  user_id                   bigint,
  provider_user_id          varchar(255),
  provider_key              varchar(255),
  constraint pk_linked_account primary key (id))
;

create table jos_content (
  id                        bigint not null,
  title                     varchar(255),
  posted_at                 timestamp,
  content                   text,
  author_id                 bigint,
  html_preview              varchar(255),
  constraint pk_jos_content primary key (id))
;

create table security_role (
  id                        bigint not null,
  role_name                 varchar(255),
  constraint pk_security_role primary key (id))
;

create table tags (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_tags primary key (id))
;

create table token_action (
  id                        bigint not null,
  token                     varchar(255),
  target_user_id            bigint,
  type                      varchar(2),
  created                   timestamp,
  expires                   timestamp,
  constraint ck_token_action_type check (type in ('EV','PR')),
  constraint uq_token_action_token unique (token),
  constraint pk_token_action primary key (id))
;

create table jos_users (
  id                        bigint not null,
  email                     varchar(255),
  name                      varchar(255),
  first_name                varchar(255),
  password                  varchar(255),
  last_name                 varchar(255),
  is_admin                  boolean,
  last_login                timestamp,
  active                    boolean,
  email_validated           boolean,
  constraint pk_jos_users primary key (id))
;

create table user_permission (
  id                        bigint not null,
  value                     varchar(255),
  constraint pk_user_permission primary key (id))
;


create table jos_content_tags (
  jos_content_id                 bigint not null,
  tags_id                        bigint not null,
  constraint pk_jos_content_tags primary key (jos_content_id, tags_id))
;

create table jos_users_security_role (
  jos_users_id                   bigint not null,
  security_role_id               bigint not null,
  constraint pk_jos_users_security_role primary key (jos_users_id, security_role_id))
;

create table jos_users_user_permission (
  jos_users_id                   bigint not null,
  user_permission_id             bigint not null,
  constraint pk_jos_users_user_permission primary key (jos_users_id, user_permission_id))
;
create sequence comments_seq;

create sequence linked_account_seq;

create sequence jos_content_seq;

create sequence security_role_seq;

create sequence tags_seq;

create sequence token_action_seq;

create sequence jos_users_seq;

create sequence user_permission_seq;

alter table comments add constraint fk_comments_author_1 foreign key (author_id) references jos_users (id);
create index ix_comments_author_1 on comments (author_id);
alter table comments add constraint fk_comments_post_2 foreign key (post_id) references jos_content (id);
create index ix_comments_post_2 on comments (post_id);
alter table linked_account add constraint fk_linked_account_user_3 foreign key (user_id) references jos_users (id);
create index ix_linked_account_user_3 on linked_account (user_id);
alter table jos_content add constraint fk_jos_content_author_4 foreign key (author_id) references jos_users (id);
create index ix_jos_content_author_4 on jos_content (author_id);
alter table token_action add constraint fk_token_action_targetUser_5 foreign key (target_user_id) references jos_users (id);
create index ix_token_action_targetUser_5 on token_action (target_user_id);



alter table jos_content_tags add constraint fk_jos_content_tags_jos_conte_01 foreign key (jos_content_id) references jos_content (id);

alter table jos_content_tags add constraint fk_jos_content_tags_tags_02 foreign key (tags_id) references tags (id);

alter table jos_users_security_role add constraint fk_jos_users_security_role_jo_01 foreign key (jos_users_id) references jos_users (id);

alter table jos_users_security_role add constraint fk_jos_users_security_role_se_02 foreign key (security_role_id) references security_role (id);

alter table jos_users_user_permission add constraint fk_jos_users_user_permission__01 foreign key (jos_users_id) references jos_users (id);

alter table jos_users_user_permission add constraint fk_jos_users_user_permission__02 foreign key (user_permission_id) references user_permission (id);

# --- !Downs

drop table if exists comments cascade;

drop table if exists linked_account cascade;

drop table if exists jos_content cascade;

drop table if exists jos_content_tags cascade;

drop table if exists security_role cascade;

drop table if exists tags cascade;

drop table if exists token_action cascade;

drop table if exists jos_users cascade;

drop table if exists jos_users_security_role cascade;

drop table if exists jos_users_user_permission cascade;

drop table if exists user_permission cascade;

drop sequence if exists comments_seq;

drop sequence if exists linked_account_seq;

drop sequence if exists jos_content_seq;

drop sequence if exists security_role_seq;

drop sequence if exists tags_seq;

drop sequence if exists token_action_seq;

drop sequence if exists jos_users_seq;

drop sequence if exists user_permission_seq;

