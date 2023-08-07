INSERT INTO tb_switchtest (name) VALUES ('Medição de Atenuação');

INSERT INTO tb_testcase (steps_actions, steps_data, steps_result, type) VALUES ('Acessar o Dashboard "Medição de Atenuação" no primeiro Menu na segunda opção', 'URL da tela:  /main/attenuation-measurement/attenuation-measurement', 'O portal deve abrir a tela "Medição de Atenuação"', 'MANUAL');
INSERT INTO tb_testcase (steps_actions, steps_data, steps_result, type) VALUES ('Realizar consulta por BA de COF ou por Barramento ou Trecho', 'Inserir o número do BA ou nome do Barramento ou Trecho', 'O portal deve realizar a consulta, podendo retornar dados ou não se o BA/Barramento/Trecho pesquisado não for encontrado', 'MANUAL');

INSERT INTO tb_statustest (status, date, time, testcase_id) VALUES ('SUCESSO','2023-08-07', 1000, 1);
INSERT INTO tb_statustest (status, date, time, testcase_id) VALUES ('FAIL', '2023-08-07', 1000, 2);
INSERT INTO tb_statustest (status, date, time, testcase_id) VALUES ('FAIL', '2023-08-08', 2000, 1);
INSERT INTO tb_statustest (status, date, time, testcase_id) VALUES ('UNVERIFIED','2023-08-09', 3000, 1);


