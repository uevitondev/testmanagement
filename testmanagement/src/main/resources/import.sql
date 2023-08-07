INSERT INTO tb_switchtest (id, name) VALUES (1, 'Medição de Atenuação');

INSERT INTO tb_testcase (id, steps_actions, steps_data, steps_result, type) VALUES (1, 'Acessar o Dashboard "Medição de Atenuação" no primeiro Menu na segunda opção', 'URL da tela:  /main/attenuation-measurement/attenuation-measurement', 'O portal deve abrir a tela "Medição de Atenuação"', 'MANUAL');

INSERT INTO tb_statustest (id, status, instant, time) VALUES (1, 'SUCESSO', TIMESTAMP WITH TIME ZONE '2023-08-07T13:00:00Z', 1000);
INSERT INTO tb_statustest (id, status, instant, time) VALUES (2, 'FAIL', TIMESTAMP WITH TIME ZONE '2023-08-08T13:00:00Z', 2000);
INSERT INTO tb_statustest (id, status, instant, time) VALUES (3, 'UNVERIFIED', TIMESTAMP WITH TIME ZONE '2023-08-09T13:00:00Z', 3000);




