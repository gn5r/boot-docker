drop table if exists test;
create table test (
  `key` varchar(255) not null comment 'キー',
  `value` text comment '値',
  primary key (`key`)
) comment='テストテーブル';