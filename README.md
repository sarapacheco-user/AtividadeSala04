Descrição do Projeto
Este projeto é um programa em Java que implementa um sistema de alocação de estudantes em turmas de uma instituição de ensino. O sistema permite associar alunos, professores, cursos e disciplinas, proporcionando uma visualização clara de como as turmas são formadas.

O conceito de "ensalamento" é utilizado para descrever a alocação de alunos e professores em turmas específicas. Este sistema é construído utilizando o paradigma de orientação a objetos.

Estrutura do Projeto
O projeto é dividido nas seguintes classes:

Pessoa: Classe base que contém o atributo comum "nome".
Aluno: Extensão da classe Pessoa, representando um estudante vinculado a um curso.
Professor: Extensão da classe Pessoa, representando um docente associado a uma disciplina.
Curso: Representa um curso que contém várias disciplinas.
Disciplina: Representa uma disciplina específica associada a um curso.
Turma: Contém um professor, uma disciplina e um ou mais alunos matriculados.
Ensalamento: Responsável pela lógica de alocação de turmas.

Os alunos dispostos pelo professor são esses:
Alunos
Alfredo - TI
Amélia - TI
Ana - ADM
Bruno - TI
Bentinho - ADM
Capitú - TI
Debra - TI
Ian - ADM
Iracema - TI
Joelmir - ADM
Julieta - TI
Luana - ADM
Luciana - TI
Majô - ADM
Maria - ADM
Norberto - TI
Paulo - ADM
Romeu - ADM
Wendel - TI
Zoey - TI
Professores
Mia - POO
Saulo - Estrutura de Dados
Paula - BI
Cursos
TI
ADM
Disciplinas
POO (curso de TI)
Estrutura de Dados (curso de TI)
BI (curso de ADM)
Instruções para Execução
Clone o repositório:

bash
Copiar código
git clone https://github.com/sarapacheco-user/AtividadeSala04
cd seu_repositorio
Compile o programa: Certifique-se de ter o Java instalado e utilize o comando:

bash
Copiar código
javac src/*.java
Execute o programa:

bash
Copiar código
java src/Ensalamento
O resultado da alocação será exibido no console.

Observações
O método main serve apenas para acionar a execução do ensalamento.
O resultado da alocação será apresentado de forma clara para o usuário no console.
Vídeo de Demonstração
Um vídeo explicativo sobre o código e a execução do programa está disponível no repositório em formato MPEG-4.

Contribuições
Sinta-se à vontade para contribuir com sugestões ou melhorias!

Licença
Este projeto é de uso educacional e não possui uma licença específica.

