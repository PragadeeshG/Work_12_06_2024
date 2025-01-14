create table if not exists bfs_validation_unitcurrent_ownership(
bfs_code varchar(255) not null,
function_meta varchar(255) null,
current_ownership varchar(255) null,
bfsfunction_control varchar(255) null,
premium_payment varchar(255) null,
business_concept_origin char null,
current_ownership_indicator varchar(255) null,
consumption_origin varchar(255) null,
consumption_origin_indicator varchar(255) null,
creation_cr varchar(255) null,
modified_cr varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint bfs_validation_unitcurrent_ownership_pk primary key(bfs_code));