create table if not exists bfs_validation_unitcurrent_ownership_meta_history(
history_date varchar(255) not null,
bfs_code varchar(255) null,
function_meta varchar(255) null,
current_ownership varchar(255) null,
cert_status_flag varchar(255) null,
cert_status_done char null,
cert_status_type varchar(255) null,
acted_by varchar(255) null,
cert_status_origin varchar(255) null,
updated_from_origin varchar(255) null,
removed_from_origin varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint bfs_validation_unitcurrent_ownership_meta_history_pk primary key(history_date));