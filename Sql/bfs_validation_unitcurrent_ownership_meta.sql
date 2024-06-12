create table if not exists bfs_validation_unitcurrent_ownership_meta(
bfs_code varchar(255) not null,
function_meta varchar(255) null,
current_ownership varchar(255) null,
department_code varchar(255) null,
model_partition_type char null,
function_system Integer null,
bfsfunction_type char null,
bfsfunction_system varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint bfs_validation_unitcurrent_ownership_meta_pk primary key(bfs_code));