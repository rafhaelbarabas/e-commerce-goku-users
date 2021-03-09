INSERT INTO users (name, email, password) VALUES ('Teste', 'teste@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO users (name, email, password) VALUES ('Teste 2', 'teste2@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO roles (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO roles (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO user_roles (id_user, id_role) VALUES (1, 1);
INSERT INTO user_roles (id_user, id_role) VALUES (2, 1);
INSERT INTO user_roles (id_user, id_role) VALUES (2, 2);