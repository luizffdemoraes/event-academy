-- Inserções para a tabela Participante
INSERT INTO Participante (id, nome, email) VALUES (1, 'José Silva', 'jose@gmail.com');
INSERT INTO Participante (id, nome, email) VALUES (2, 'Tiago Faria', 'tiago@gmail.com');
INSERT INTO Participante (id, nome, email) VALUES (3, 'Maria do Rosário', 'maria@gmail.com');
INSERT INTO Participante (id, nome, email) VALUES (4, 'Teresa Silva', 'teresa@gmail.com');

-- Inserções para a tabela Categoria
INSERT INTO Categoria (id, descricao) VALUES (1, 'Curso');
INSERT INTO Categoria (id, descricao) VALUES (2, 'Oficina');

-- Inserções para a tabela Atividade
INSERT INTO Atividade (id, nome, descricao, preco, categoria_id) VALUES (1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO Atividade (id, nome, descricao, preco, categoria_id) VALUES (2, 'Oficina de Github', 'Controle versões de seus projetos', 50.00, 2);

-- Inserções para a tabela Bloco
INSERT INTO Bloco (participante_id, atividade_id, inicio, fim) VALUES (1, 1, '2017-09-25 08:00:00', '2017-09-25 11:00:00');
INSERT INTO Bloco (participante_id, atividade_id, inicio, fim) VALUES (2, 2, '2017-09-25 14:00:00', '2017-09-25 18:00:00');
INSERT INTO Bloco (participante_id, atividade_id, inicio, fim) VALUES (3, 1, '2017-09-26 08:00:00', '2017-09-26 11:00:00');
