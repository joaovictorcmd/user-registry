# User Registry - Java Swing

**User Registry** é um mini projeto desenvolvido como parte do curso de Formação Desenvolvedor Full Stack Java EBAC. Este aplicativo oferece uma interface gráfica simples para cadastrar e listar usuários, utilizando a biblioteca Swing do Java.

## ✨ Tecnologias

- Java 21
- Swing (GUI)
- Arquitetura MVC + DAO

## 🧩 Funcionalidades

- **Cadastro de Usuários:** Permite a criação de novos registros de usuários, solicitando as seguintes informações:
    * Nome
    * Sobrenome
    * Telefone
    * Email
  
- **Listagem de Usuários:** Exibe uma lista de todos os usuários que foram cadastrados e estão armazenados na memória do aplicativo durante a sua execução.

## 📁 Estrutura do Projeto

O projeto está organizado em camadas bem definidas para facilitar a manutenção e o entendimento do código:

- `domain` – Representa o modelo de dados (entidade)
- `dao` – Acesso e manipulação dos dados
- `service` – Lógica de negócio
- `controller` – Intermediador entre a view e o service
- `view` – Interface gráfica Swing

## 🚀 Como executar

Para executar este mini projeto, siga os passos abaixo:

1.  **Pré-requisitos:** Certifique-se de ter o Java Development Kit (JDK) versão 21 ou superior instalado em sua máquina.
2.  **Importar o Projeto:** Abra sua IDE Java preferida (como Eclipse, IntelliJ IDEA ou Visual Studio Code com as extensões Java apropriadas) e importe o projeto para o seu workspace.
3.  **Navegar até a Classe Principal:** Localize a classe `App.java` dentro da estrutura do projeto.
4.  **Executar o Aplicativo:** Clique com o botão direito sobre a classe `App.java` no seu IDE e selecione a opção "Run" ou "Run As" -> "Java Application".

Após a execução, a interface gráfica do sistema de cadastro de usuários deverá ser exibida.

---
