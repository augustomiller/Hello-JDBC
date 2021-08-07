# Hello JDBC ☕️
Entendendo o mapeamento com o banco de dados.

## Java DataBase Connectivity

* É uma biblioteca com diversas classes e interfaces escritas na linguagem java, que estão presentes nos pacotes **java.sql** e **javax.sql**.
* Elas permitem que programas em java realizem conexões em Banco de Dados para realizar consultas.
* Uma dessas classes principais é o **driver JDBC** que intermedia essa interação.


![Captura de Tela 2021-08-07 às 20 16 43](https://user-images.githubusercontent.com/990877/128616074-ae579e5d-f064-4a7a-92e7-17833624842a.png)

# Tipos de Drivers

* Tipo 1: Ponte JDBC-ODBC
É o tipo mais simples mas restrito à plataforma Windows. Utiliza CBDO para conectar-se com o banco de dados, convertendo métodos JDBC em chamadas às funções do ODBC. Esta ponte é normalmente usada quando não há um driver puro-Java (tipo 4) para determinado banco de dados, pois seu uso é desencorajado devido à dependência de plataforma.

* Tipo 2: Driver API-Nativo
O driver API-Nativo traduz as chamadas JDBC para as chamadas da API cliente do banco de dados usado. Como a Ponte JDBC-ODBC, pode precisar de software extra instalado na máquina cliente.

* Tipo 3: Driver Nativo
Traduz a chamada JDBC para um protocolo de rede independente do banco de dados utilizado, que é traduzido para o protocolo do banco de dados por um servidor. Por utilizar um protocolo independente, pode conectar as aplicações clientes Java a vários bancos de dados diferentes. É o modelo mais flexível e pode ser visto como um driver intermediário, pois também atua como Middleware. É mais utilizado para banco de dados antigos como estatais de governos.

* Tipo 4: Driver de Protocolo de Rede
Converte as chamadas JDBC diretamente no protocolo do banco de dados utilizado. Implementado em Java, normalmente é independente de plataforma e escrito pelos próprios desenvolvedores. É o tipo mais recomendado para ser usado.

# Configurações do projeto 🍃  | https://start.spring.io/

![Captura de Tela 2021-08-07 às 20 38 27](https://user-images.githubusercontent.com/990877/128616354-e29e9cb0-d75c-4620-875c-ac3972a586a0.png)
