**Formação Desenvolvedor Moderno Módulo**: Back end <br>
**Capítulo**: Modelo de domínio e ORM

**DESAFIO:** Modelo de domínio e ORM  
**Forma de entrega:** link do projeto no Github

Você deve criar um projeto no Spring Boot com Java e banco de dados H2, e implementar o modelo
conceitual conforme especificação a seguir. Além disso, você deve fazer o seeding da base de dados
conforme diagrama de objetos que segue.<br>

<h3>Como o trabalho será corrigido?</h3> 
O repositório do Github será clonado pelo professor, que executará o projeto localmente. O projeto
deverá executar sem erros, e a base de dados deverá ser criada corretamente. O H2 Console será
executado no navegador, e todas tabelas esperadas deverão ser criadas, com todos relacionamentos, e
os dados do seeding deverão estar presentes em cada tabela.

<h3>ESPECIFICAÇÃO - Sistema EVENTO:</h3>
Deseja-se construir um sistema para gerenciar as informações dos participantes das atividades de um
evento acadêmico. As atividades deste evento podem ser, por exemplo, palestras, cursos, oficinas
práticas, etc. Cada atividade que ocorre possui nome, descrição, preço, e pode ser dividida em vários
blocos de horários (por exemplo: um curso de HTML pode ocorrer em dois blocos, sendo necessário
armazenar o dia e os horários de início de fim do bloco daquele dia). Para cada participante, deseja-se
cadastrar seu nome e email. <br>

<p style="text-align: center;">
  <img alt="Diagrama de objetos" src="imagens/diagrama-de-objetos.png">
</p>

Instância dos dados para seeding.:

<p style="text-align: center;">
  <img alt="Diagrama modelo conceitual" src="imagens/diagrama-modelo-conceitual.png">
</p>
