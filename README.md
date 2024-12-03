# Explicação sobre como o TreeSet compara os elementos:

1. **Implementação da Interface Comparable:** A classe Product implementa a interface Comparable<Product>. 
Isso é crucial, pois o TreeSet usa o método compareTo para determinar a ordem dos elementos.

2. **Método compareTo:** O método compareTo é sobrescrito para definir a lógica de comparação. 
No exemplo, os produtos são comparados com base no atributo name, convertendo ambos os nomes para letras maiúsculas para garantir 
que a comparação seja insensível a maiúsculas e minúsculas.

3. **Armazenamento no TreeSet:** Quando os produtos são adicionados ao TreeSet, ele organiza automaticamente os elementos 
com base na ordem definida pelo método compareTo. Isso significa que, ao iterar sobre os elementos do conjunto, eles serão 
exibidos em ordem alfabética com base nos nomes dos produtos.

4. **Uniqueness:** O TreeSet não permite elementos duplicados. Se você tentar adicionar um produto que já está presente 
(considerando o método equals), ele não será adicionado ao conjunto. Portanto, o método equals também é importante para 
garantir que dois produtos com o mesmo nome e preço sejam considerados idênticos.

## Conclusão:
O TreeSet é uma coleção que garante a ordem dos elementos com base na comparação definida pelo método compareTo. 
Isso permite que os elementos sejam armazenados de maneira ordenada e também garante que não haja duplicatas com base no método equals.
