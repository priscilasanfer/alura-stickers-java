# Alura Stickers Java

## Aula 1 - Consumindo uma API de filmes com Java

Nesta primeira aula, vamos construir uma aplicação do zero para consumir a API do IMDb e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação...   
Tudo isso sem usar nenhuma biblioteca externa!

- [Código da Aula](https://github.com/alura-cursos/imersao-java/tree/aula1)

### Links citados
- [Os 250 melhores filmes de acordo com a classificação do IMDB](https://www.imdb.com/chart/top/)
- [A documentação da API do IMDB](https://imdb-api.com/api)
- [Documentação da classe HttpRequest do pacote java.net.http](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html)
- [Classe pronta que utiliza Expressões Regulares para fazer parse de um JSON](https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3)
- [Biblioteca Jackson, que faz parse de JSON](https://github.com/FasterXML/jackson)
- [Site que ajuda a entender Expressões Regulares](https://regex101.com/) 
- [Artigo: Como deixar no seu GitHub com um README interessante](https://www.alura.com.br/artigos/escrever-bom-readme)
- [O endpoint da API do IMDB que devolve os 250 melhores filmes: https://imdb-api.com/en/API/Top250Movies/ + SUA-API-KEY](https://imdb-api.com/en/API/Top250Movies/)

### Desafios desta aula
1 - Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.  
2 - Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando   códigos ANSI, e mais!  
3 - Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente  
4 - Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON  
5 - Desafio supremo: criar alguma maneira para você dar uma avaliação ao filme, puxando de algum   

### Material complementar

- [Artigo na Alura “O que é JSON?”](https://www.alura.com.br/artigos/o-que-e-json)
- [Artigo na Alura sobre como pintar o terminal, com tabelinha de cores e negrito](https://www.alura.com.br/artigos/decorando-terminal-cores-emojis)


## Aula 2 - GERANDO FIGURINHAS PARA WHATSAPP
Nesta segunda aula vamos criar um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos!


### Links citados

- Documentação do [pacote javax.imageio](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/imageio/package-summary.html), que trata de leitura e escrita de imagens.
- Documentação da [classe BufferedImage](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/image/BufferedImage.html), que representa uma imagem no Java
- Documentação da [classe Graphics2D](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html), a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original.
- Documentação da [abstração InputStream](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html), que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros.

### Desafios desta aula

1 - Ler a documentação da classe abstrata InputStream.  
2 - Centralizar o texto na figurinha.  
3 - Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!  
4 - Criar diretório de saída das imagens, se ainda não existir.  
5 - Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.  
6 - Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha!  
7 - Colocar contorno (outline) no texto da imagem.  
8 - Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.  
9 - Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.  
10 - Desafio supremo: usar alguma biblioteca de manipulação de imagens como OpenCV pra extrair imagem principal e contorná-la.  

### Material complementar

- Primeira aula do curso [“Java Polimorfismo: entenda herança e interfaces”](https://www.alura.com.br/conteudo/java-heranca-interfaces-polimorfismo) da Alura.  
- Apêndice da apostila [“Java e Orientação a Objetos”](https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io) da Alura sobre o pacote java.io que explica com mais detalhes a abstração InputStream.  