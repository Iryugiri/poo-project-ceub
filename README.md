
# Sistematizacao de Programacao Orientada a Objeto



## Projeto

![App Screenshot](https://i.imgur.com/GbXbEGG.png)


## Projeto Escolhido

Projeto A: Implementar uma API REST que permita o completo gerenciamento das informações dos empregados por meio de requisições HTTP. Deve ser possível inserir (POST), obter (GET), alterar (PUT ou PATCH) e remover (DELETE) os dados. O sistema deve garantir a persistência dos dados, mesmo após o sistema finalizar. Pode ser utilizado um SGBD, como o MySQL ou PostgreSQL.


## Instalação

Para instalar o projeto e necessario ter alguns requizitos, tem o JDK, o Postgresql.

## Instalação do JDK 17

### Windows

1. **Download**: Acesse o site oficial da Oracle para baixar o JDK 17: [Download JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html). Escolha a versão apropriada para Windows.
2. **Instalação**: Execute o arquivo baixado e siga as instruções na tela para instalar o JDK.
3. **Configurar variável de ambiente**:
   - Clique com o botão direito em 'Meu Computador' e selecione 'Propriedades'.
   - Clique em 'Configurações avançadas do sistema' e depois em 'Variáveis de Ambiente'.
   - Adicione uma nova variável de sistema chamada `JAVA_HOME` que aponta para o diretório onde o JDK foi instalado (ex: `C:\Program Files\Java\jdk-17`).
   - Encontre a variável `Path` nas variáveis do sistema e adicione `%JAVA_HOME%\bin` ao valor existente.

### Linux

1. **Download**: Acesse o link acima e baixe o arquivo tar.gz apropriado para Linux.
2. **Instalação**:
   - Abra um terminal e navegue até o diretório onde o arquivo foi baixado.
   - Extraia o arquivo com `tar -xvf <nome-do-arquivo>.tar.gz`.
   - Mova a pasta extraída para `/usr/lib/jvm/` usando `sudo mv <nome-da-pasta-extraída> /usr/lib/jvm/`.
3. **Configurar variável de ambiente**:
   - Abra o arquivo `~/.bashrc` em um editor de texto.
   - Adicione as seguintes linhas no final do arquivo:
     ```
     export JAVA_HOME=/usr/lib/jvm/<nome-da-pasta>
     export PATH=$PATH:$JAVA_HOME/bin
     ```
   - Atualize o arquivo com `source ~/.bashrc`.

### Instalcao do Postgress

## Windows

### Passo 1: Baixar o Instalador
1. Acesse a página oficial de downloads do PostgreSQL: [https://www.postgresql.org/download/windows/](https://www.postgresql.org/download/windows/).
2. Clique em "Download the installer".

### Passo 2: Executar o Instalador
1. Execute o arquivo baixado (`postgresql-xx.x-x-windows.exe`).
2. Siga o assistente de instalação:
    - Escolha o diretório de instalação.
    - Selecione os componentes que deseja instalar (padrão é recomendado).
    - Defina uma senha para o usuário `postgres`.
    - Configure a porta de conexão (padrão é `5432`).
    - Escolha o local de dados (padrão é recomendado).

### Passo 3: Finalizar a Instalação
1. Conclua a instalação e marque a opção para iniciar o Stack Builder.
2. No Stack Builder, você pode instalar ferramentas adicionais e extensões.

### Passo 4: Verificar a Instalação
1. Abra o PgAdmin 4 ou outro cliente de banco de dados de sua preferência.
2. Conecte-se ao servidor PostgreSQL usando a senha definida durante a instalação.

## macOS

### Passo 1: Usar Homebrew (Recomendado)
1. Instale o Homebrew se ainda não o tiver: `/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"`.
2. Atualize o Homebrew: `brew update`.

### Passo 2: Instalar PostgreSQL
1. Execute o comando: `brew install postgresql`.

### Passo 3: Iniciar o Serviço PostgreSQL
1. Inicie o serviço: `brew services start postgresql`.

### Passo 4: Verificar a Instalação
1. Abra um terminal e execute: `psql postgres`.
2. Você deve estar conectado ao banco de dados PostgreSQL.

### Passo 5: Configurar Inicialização Automática (Opcional)
1. Para configurar o PostgreSQL para iniciar automaticamente com o sistema: `ln -sfv /usr/local/opt/postgresql/*.plist ~/Library/LaunchAgents`.
2. Carregue a configuração: `launchctl load ~/Library/LaunchAgents/homebrew.mxcl.postgresql.plist`.

## Linux

### Passo 1: Atualizar Pacotes
1. Abra um terminal e atualize os pacotes do sistema:
    - Para Ubuntu/Debian:
      ```bash
      sudo apt update
      sudo apt upgrade
      ```
    - Para Fedora/CentOS:
      ```bash
      sudo dnf update
      ```

### Passo 2: Instalar PostgreSQL
1. Instale o PostgreSQL:
    - Para Ubuntu/Debian:
      ```bash
      sudo apt install postgresql postgresql-contrib
      ```
    - Para Fedora:
      ```bash
      sudo dnf install postgresql-server postgresql-contrib
      ```
    - Para CentOS/RHEL:
      ```bash
      sudo yum install postgresql-server postgresql-contrib
      ```

### Passo 3: Inicializar o Banco de Dados
1. Inicialize o banco de dados:
    - Para Ubuntu/Debian, o serviço inicia automaticamente. Você pode verificar o status com:
      ```bash
      sudo systemctl status postgresql
      ```
    - Para Fedora/CentOS:
      ```bash
      sudo postgresql-setup --initdb
      sudo systemctl start postgresql
      sudo systemctl enable postgresql
      ```

### Passo 4: Configurar o Usuário
1. Acesse a conta do usuário `postgres`:
    ```bash
    sudo -i -u postgres
    ```
2. Abra o prompt do PostgreSQL:
    ```bash
    psql
    ```

### Passo 5: Criar uma Senha para o Usuário `postgres`
1. No prompt do PostgreSQL, execute:
    ```sql
    \password postgres
    ```
2. Digite a nova senha.

### Passo 6: Verificar a Instalação
1. No terminal, execute:
    ```bash
    psql -U postgres -h localhost
    ```
2. Digite a senha que você configurou e verifique se consegue acessar o banco de dados.

---

Seguindo esses passos, você terá o PostgreSQL instalado e configurado em seu sistema operacional.

## Configurações a fazer:

Agora que seu usuario foi criado e necessario colocar no arquivo applications.properties.

Com o Eclipse aberto entre em src/main/resources.

- Dentro do arquivo "applications.properties"
```
    spring.datasource.url=jdbc:postgresql://localhost:5432/MGS
    spring.datasource.username=Coloque seu user
    spring.datasource.password=coloque sua senha
    spring.datasource.driver-class-name=org.postgresql.Driver
```

# Instalação do DBeaver

## Download e Instalação

### Windows

1. **Download**:
   - Acesse o site oficial do DBeaver: [DBeaver Downloads](https://dbeaver.io/download/)
   - Escolha a versão "Community Edition" e clique em "Download" para Windows.
2. **Instalação**:
   - Execute o arquivo baixado (um instalador `.exe`).
   - Siga as instruções na tela para instalar o DBeaver.

### Linux

1. **Download**:
   - Escolha a versão para Linux no mesmo link acima.
2. **Instalação**:
   - Para distribuições baseadas em Debian, use `sudo dpkg -i <nome-do-arquivo>.deb`.
   - Para distribuições baseadas em Red Hat, use `sudo rpm -i <nome-do-arquivo>.rpm`.
   - Para outras distribuições, você pode usar o arquivo `.tar.gz`.

### macOS

1. **Download**:
   - Escolha a versão para macOS no site de downloads.
2. **Instalação**:
   - Abra o arquivo `.dmg` baixado.
   - Arraste o ícone do DBeaver para a pasta de Aplicações.

## Iniciando o DBeaver

- Após a instalação, você pode iniciar o DBeaver através do menu iniciar ou da linha de comando no Linux e Windows, e a partir da pasta de Aplicações no macOS.

## Configuração Inicial

- Quando você inicia o DBeaver pela primeira vez, será possível conectar-se a qualquer banco de dados suportado pela ferramenta, configurando a conexão com as informações específicas do banco de dados de sua escolha.

## Verificação da Instalação

- Verifique se o DBeaver foi instalado corretamente tentando conectar-se a um banco de dados e executando algumas consultas básicas para garantir que tudo esteja funcionando como esperado.


## Criacao do Banco de Dados

Dentro do DBeaver, crie uma conexao, depois crie um banco de dados MGS, abra um script,rode esse trecho de codigo para criar o banco de dados
    
    CREATE TABLE employee (
	Id SERIAL PRIMARY KEY,
	Name varchar(50) DEFAULT NULL,
	Phone varchar(11) DEFAULT NULL,
	Email varchar(50) DEFAULT NULL
    );

    CREATE TABLE sickness(
	Id SERIAL PRIMARY KEY,
	sick_of_employee text DEFAULT NULL,
	id_employee int NOT NULL,
	FOREIGN KEY (id_employee) references employee(Id)
    );

    INSERT INTO employee (Name, Phone, Email) VALUES 
	('Caue Just', '60214139387', 'caue.justin@gmail.com');

    INSERT INTO sickness (sick_of_employee, id_employee) values
	('Escorbuto',1),
	('Peste Negra',1);

## Instalação do Eclipse IDE

Este documento fornece instruções passo a passo para a instalação do Eclipse IDE, uma plataforma de desenvolvimento amplamente utilizada para Java e outras linguagens de programação.

### Download e Instalação

#### Windows

1. **Download**:
   - Acesse o site oficial do Eclipse: [Eclipse Downloads](https://www.eclipse.org/downloads/)
   - Clique em "Download 64 bit" e escolha o pacote "Eclipse IDE for Java Developers" (ou outra versão de acordo com sua necessidade).
2. **Instalação**:
   - Execute o arquivo baixado (um instalador `.exe`).
   - Siga as instruções na tela para instalar o Eclipse. Durante a instalação, você pode escolher o diretório de destino para a instalação do Eclipse.
   - Após a conclusão, um atalho será criado na área de trabalho ou no menu iniciar.

#### Linux

1. **Download**:
   - Siga o mesmo link acima e baixe a versão apropriada para Linux (arquivo tar.gz).
2. **Instalação**:
   - Extraia o arquivo baixado com o comando `tar -zxvf <nome-do-arquivo>.tar.gz` no terminal.
   - Mova a pasta extraída para a localização desejada, por exemplo: `sudo mv eclipse /opt/eclipse`.
   - Para criar um lançador para o Eclipse, crie um arquivo `.desktop` em `/usr/share/applications/`:
     ```
     [Desktop Entry]
     Name=Eclipse
     Type=Application
     Exec=/opt/eclipse/eclipse
     Icon=/opt/eclipse/icon.xpm
     Comment=Eclipse Integrated Development Environment
     NoDisplay=false
     Categories=Development;IDE;
     Name[en]=Eclipse
     ```

### Iniciando o Eclipse

- **Windows**: Clique duas vezes no atalho do Eclipse criado na sua área de trabalho ou no menu iniciar.
- **Linux**: Execute o Eclipse a partir do terminal com `/opt/eclipse/eclipse` ou utilizando o lançador, caso tenha criado um.

### Configuração Inicial

- Na primeira inicialização, o Eclipse solicitará que você selecione um workspace (diretório de trabalho). Escolha ou crie um diretório que será usado para armazenar seus projetos.
- Explore as preferências do Eclipse em `Window -> Preferences` para ajustar configurações de acordo com suas necessidades, como codificação de caracteres, configurações de Java, entre outros.

### Verificação da Instalação

- Verifique se o Eclipse abre e está configurado corretamente abrindo alguns dos menus e criando um projeto de teste.

## Instalação do Lombok

Dentro do Eclipse:
 - 
 
    1. Entre na aba Help > Install new software, cole esse link: https://projectlombok.org/p2

    2. Selecione o Lombok, Clique em next deoius en finish.

## Instalação do Spring Boot
    
Dentro do Eclipse
 -

    1. Entre na aba Help > Eclipse market place..., digite Spring Tools 4, e instale.



# Instalação do Postman

Este documento fornece instruções passo a passo para a instalação do Postman, uma ferramenta popular para o desenvolvimento e teste de APIs.

## Download e Instalação

### Windows

1. **Download**:
   - Acesse o site oficial do Postman: [Postman Downloads](https://www.postman.com/downloads/)
   - Clique em "Download the App" e escolha a versão para Windows.
2. **Instalação**:
   - Execute o arquivo baixado (um instalador `.exe`).
   - Siga as instruções na tela para instalar o Postman.

### Linux

1. **Download**:
   - Acesse o mesmo link acima e escolha a versão para Linux.
2. **Instalação**:
   - Dependendo da distribuição, você pode baixar um arquivo `.tar.gz` ou um pacote específico como `.deb` ou `.rpm`.
   - Para distribuições baseadas em Debian (como Ubuntu), use `sudo dpkg -i <nome-do-arquivo>.deb`.
   - Para distribuições baseadas em Red Hat, use `sudo rpm -i <nome-do-arquivo>.rpm`.

### macOS

1. **Download**:
   - Acesse o link acima e escolha a versão para macOS.
2. **Instalação**:
   - Abra o arquivo `.dmg` baixado.
   - Arraste o ícone do Postman para a pasta de Aplicações.

## Iniciando o Postman

- **Windows e Linux**: Você pode iniciar o Postman a partir do menu iniciar ou da linha de comando.
- **macOS**: Abra o Postman a partir da pasta de Aplicações.

## Configuração Inicial

- Ao abrir o Postman pela primeira vez, você pode optar por criar uma conta ou entrar em uma existente para sincronizar suas coleções de APIs e ambientes entre diferentes dispositivos e instalações.

## Verificação da Instalação

- Verifique se o Postman foi instalado e está funcionando corretamente criando uma nova requisição e enviando para uma API de teste, como `https://postman-echo.com/get`.

## Demonstração

Para uma demonstracao do projeto acesse (PT-BR):


## Licença

[MIT](https://choosealicense.com/licenses/mit/)

