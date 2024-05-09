
# Sistematizacao de Programacao Orientada a Objeto



## Projeto

![App Screenshot](https://i.imgur.com/GbXbEGG.png)


## Projeto Escolhido

Projeto A: Implementar uma API REST que permita o completo gerenciamento das informações dos empregados por meio de requisições HTTP. Deve ser possível inserir (POST), obter (GET), alterar (PUT ou PATCH) e remover (DELETE) os dados. O sistema deve garantir a persistência dos dados, mesmo após o sistema finalizar. Pode ser utilizado um SGBD, como o MySQL ou PostgreSQL.


## Instalação

Para instalar o projeto e necessario ter alguns requizitos, tem o JDK, o MySQL.

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

## Instalação do MySQL

### Windows e Linux

1. **Download**: Acesse o site oficial do MySQL [MySQL Downloads](https://dev.mysql.com/downloads/mysql/) e escolha a versão adequada para seu sistema operacional.
2. **Instalação**: Execute o instalador baixado e siga as instruções. Selecione a opção de instalação completa.

### Configuração Inicial do MySQL

1. **Configurar o MySQL**: Durante a instalação, será solicitado para configurar o servidor MySQL, incluindo a definição de uma senha para o usuário root.
2. **Criar um novo usuário**:
   - Após a instalação, acesse o MySQL através do terminal ou do MySQL Command Line Client usando `mysql -u root -p`.
   - Digite a senha do root quando solicitado.
   - Crie um novo usuário executando:
     ```sql
     CREATE USER 'novo_usuario'@'localhost' IDENTIFIED BY 'nova_senha';
     ```
   - Para dar privilégios ao novo usuário, execute:
     ```sql
     GRANT ALL PRIVILEGES ON *.* TO 'novo_usuario'@'localhost' WITH GRANT OPTION;
     ```
   - Aplique as mudanças com `FLUSH PRIVILEGES;`.

## Verificação da Instalação

- Para verificar se o JDK foi instalado corretamente, abra um terminal ou prompt de comando e digite `java -version`.
- Para verificar se o MySQL está funcionando, tente fazer login com o novo usuário: `mysql -u novo_usuario -p`.



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

