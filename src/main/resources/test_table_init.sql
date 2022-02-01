create table test_table
(
    id    serial primary key,
    key   varchar(100),
    value varchar(100)
);

insert into test_table (id, key, value)
values (0, 'default key', 'default value'),
       (1, 'key1', 'value1'),
       (2, 'key2', 'value2');
