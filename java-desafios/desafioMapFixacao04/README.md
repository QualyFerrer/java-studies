📊 Contagem de Votos em Java

Este projeto é uma aplicação Java simples que lê um arquivo .csv contendo nomes e quantidades de votos, soma os votos por candidato e exibe o resultado final no console.

🚀 Funcionalidades

Lê um arquivo CSV informado pelo usuário

Soma os votos de candidatos com nomes repetidos

Exibe o total de votos por candidato

Mantém a ordem de inserção dos dados (usando LinkedHashMap)

-----------------------------------------------------------
📂 Formato do arquivo de entrada

O arquivo deve estar no formato CSV, com nome do candidato e quantidade de votos, separados por vírgula:

Maria,10
João,5
Maria,7
Ana,3
João,2

---------------------------------------------------------------

🧠 Como funciona

O programa solicita ao usuário o caminho do arquivo

Lê o arquivo linha por linha

Para cada linha:

Se o candidato já existir no mapa, soma os votos

Caso contrário, adiciona o candidato ao mapa

Ao final, imprime o total de votos por candidato.
