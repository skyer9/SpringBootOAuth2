create table oauth_client_details (
    client_id VARCHAR(255) PRIMARY KEY,
    resource_ids VARCHAR(255),
    client_secret VARCHAR(255),
    scope VARCHAR(255),
    authorized_grant_types VARCHAR(255),
    web_server_redirect_uri VARCHAR(255),
    authorities VARCHAR(255),
    access_token_validity INTEGER,
    refresh_token_validity INTEGER,
    additional_information VARCHAR(4096),
    autoapprove tinyint
);

create table oauth_client_token (
    token_id VARCHAR(255),
    token BLOB,
    authentication_id VARCHAR(255),
    user_name VARCHAR(255),
    client_id VARCHAR(255)
);

create table oauth_access_token (
    token_id VARCHAR(255),
    token BLOB,
    authentication_id VARCHAR(255),
    user_name VARCHAR(255),
    client_id VARCHAR(255),
    authentication BLOB,
    refresh_token VARCHAR(255)
);

create table oauth_refresh_token (
    token_id VARCHAR(255),
    token BLOB,
    authentication BLOB
);

create table oauth_code (
    code VARCHAR(255), authentication BLOB
);

create table oauth_approvals (
	userId VARCHAR(255),
	clientId VARCHAR(255),
	scope VARCHAR(255),
	status VARCHAR(10),
	expiresAt TIMESTAMP,
	lastModifiedAt TIMESTAMP
);

create table user (
    id int(11) not null auto_increment,
    user_name varchar(32) not null,
    password varchar(100) not null,
    user_type char(1) not null,
    reg_date datetime not null,
    primary key (id),
    unique key user_name (user_name)
);