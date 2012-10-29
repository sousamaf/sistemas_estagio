Projeto: Sistema de estagio
Academico(a) responsavel: Cassio

Descricao do projeto:
Desenvolver um sistema WEB em JSF 2 para que os alunos da FACTO selecionem via WEB o professor orientador de seu estágio, 
visando que um professor oriente no máximo 8 alunos. O sistema deve integrar dois bancos de dados, sendo um para acesso 
dos professores e outro para o acesso dos alunos através do portal chamilo.

Requisitos funcionais:
Banco de dados, controle de alunos, controle de cursos, controle de professores e relatórios.

RF. 1: Banco de dados:
Descrição: O sistema irá integrar o banco de dados para acesso pelo professor e o banco de dados para acesso pelo aluno.
Entrada: Professor ou aluno acessa o sistema.
Processo: Sistema verifica login e senha e caso estejam ok, acessam o sistema.
Saída: Mensagem de confirmação bem sucedida ou mensagem de erro.

RF. 2: Controle de Alunos:
Descrição: O sistema deverá controlar os alunos por curso, listar os professores disponíveis para orientar no estágio e 
informar sucesso ou erro.
Entrada: Aluno seleciona qual período de estágio, data e horário.
Processo: Sistema verifica e lista professores disponíveis de acordo com opções registradas pelo aluno, ocultando os 
professores que já estão ocupados.
Saída: Mensagem de confirmação bem sucedida ou mensagem de erro.

RF. 3: Controle de Cursos:
Descrição: O sistema deverá verificar em qual curso o aluno está matriculado e carregar apenas as disciplinas, horários e 
datas de acordo com seu curso.
Entrada: Aluno realiza login no sistema.
Processo: Sistema carrega informações do aluno.
Saída: Sistema retorna estágios disponíveis de acordo com informações obtidas ou mensagem de erro.

RF. 4: Controle dos Professores
Descrição: O sistema irá listar os alunos que foram inscritos por professor.
Entrada: Professor solicita relatório de alunos cadastrados para receber orientação.
Processo: Sistema verifica alunos cadastrados.
Saída: Gera relatório de alunos cadastrados ou mensagem de erro.

RF. 5: Relatórios
Descrição: Sistema deverá gerar relatórios com opções para: Alunos cadastrados em estágio, alunos não cadastrados, professores 
com vagas disponíveis e professores sem disponibilidade de vagas. Os relatórios completos só poderão ser gerados pelo coordenador 
do curso, direção e ouvidoria, os demais pelo próprio professor.
Entrada: Seleciona o tipo de relatório
Processo: Sistema realiza busca no banco de dados.
Saída: Relatório é gerado em formato PDF ou mensagem de erro.
