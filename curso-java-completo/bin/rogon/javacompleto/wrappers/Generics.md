

Até a versão 1.4 a lista podia receber qualquer coisa

```java
List lista = new ArrayList<>();
lista.add("String");
lista.add(1L);
lista.add(12.2);
```

Para mostrar o que tinha dentro da lista, usavamos o `toString`

```java
System.out.println(lista.toString());
```

A complicação aparecia no for, que deveriamos fazer utilizando a classe
mais abstrata.