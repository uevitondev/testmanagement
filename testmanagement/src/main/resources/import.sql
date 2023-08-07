INSERT INTO tb_switchtest (name) VALUES ('Medição de Atenuação');

INSERT INTO tb_testcase (steps_actions, steps_data, steps_result, type) VALUES ('Acessar o Dashboard "Medição de Atenuação" no primeiro Menu na segunda opção', 'URL da tela:  /main/attenuation-measurement/attenuation-measurement', 'O portal deve abrir a tela "Medição de Atenuação"', 'MANUAL');

INSERT INTO tb_statustest (status, instant, time, testcase_id) VALUES ('SUCESSO', TIMESTAMP WITH TIME ZONE '2023-08-07T13:00:00Z', 1000, 1);
INSERT INTO tb_statustest (status, instant, time, testcase_id) VALUES ('FAIL', TIMESTAMP WITH TIME ZONE '2023-08-08T13:00:00Z', 2000, 1);
INSERT INTO tb_statustest (status, instant, time, testcase_id) VALUES ('UNVERIFIED', TIMESTAMP WITH TIME ZONE '2023-08-09T13:00:00Z', 3000, 1);


