# Sistema de Agendamento Médico

## Descrição

O **Sistema de Agendamento Médico** é uma aplicação desenvolvida em Java com Spring Boot que facilita a marcação e o gerenciamento de consultas médicas. Através deste sistema, é possível realizar o cadastro de pacientes e médicos, agendar consultas, visualizar a disponibilidade na agenda dos profissionais e acompanhar o histórico de consultas realizadas.

## Funcionalidades

- **Cadastro e Gerenciamento de Usuários**
  - Cadastro de pacientes e médicos.
  - Atualização e exclusão de cadastros.

- **Agendamento de Consultas**
  - Marcação de consultas com base na disponibilidade dos médicos.
  - Alteração e cancelamento de consultas.

- **Visualização de Agenda**
  - Consulta da agenda diária dos médicos.
  - Visualização do histórico de consultas dos pacientes.

- **APIs RESTful**
  - Endpoints para criação, leitura, atualização e exclusão (CRUD) dos recursos.
  - Integração com front-end ou aplicativos mobile.

- **Documentação da API**
  - Documentação interativa utilizando Swagger.

- **Testes Automatizados**
  - Testes unitários com JUnit e Mockito para garantir a qualidade do código.

## Tecnologias Utilizadas

- **Backend:** Java 11 (ou superior), Spring Boot, Spring MVC
- **Banco de Dados:** PostgreSQL (ou outro de sua preferência)
- **Gerenciamento de Dependências:** Maven
- **Documentação da API:** Swagger / OpenAPI
- **Testes:** JUnit, Mockito
- **Outras:** Spring Security (para autenticação e autorização, se necessário), Thymeleaf (opcional, para criação de views)

## Pré-Requisitos

- **Java 11** ou superior instalado.
- **Maven** instalado.
- **Banco de Dados:** PostgreSQL (ou outro SGBD de sua escolha).
- **IDE:** IntelliJ, Eclipse, VS Code, ou outra de sua preferência.
