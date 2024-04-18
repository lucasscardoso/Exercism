# Instruções
Neste exercício você implementará um conjunto parcial de rotinas utilitárias para ajudar um desenvolvedor a limpar nomes de SqueakyClean.

Nas 4 tarefas você construirá gradativamente o cleanmétodo. Um nome SqueakyClean válido é composto por zero ou mais letras e sublinhados.

Em todos os casos, a string de entrada é garantida como não nula. Observe que o cleanmétodo deve tratar uma string vazia como válida.

### 1. Substitua quaisquer espaços encontrados por sublinhados
Implemente o método ( estático ) SqueakyClean.clean()para substituir quaisquer espaços por sublinhados. Isso também se aplica a espaços iniciais e finais.

```
SqueakyClean.clean("my   Id");
// => "my___Id"
```


### 2. Converta kebab-case em camelCase
Modifique o método ( estático ) SqueakyClean.clean()para converter kebab-case em camelCase.

```
SqueakyClean.clean("a-bc");
// => "aBc"
```


### 3. Converta leetspeak em texto normal
Modifique o método ( estático ) SqueakyClean.clean()para converter leetspeak em texto normal. Para simplificar , usaremos apenas 4, 3, e da tabela.017

```
SqueakyClean.clean("H3ll0 W0rld");
// => "Hello_World"
```


### 4. Omita caracteres que não sejam letras
Modifique o método ( estático ) SqueakyClean.clean()para omitir quaisquer caracteres que não sejam letras.

```
SqueakyClean.clean("a$#.b");
// => "ab"
```


# Instructions
In this exercise you will implement a partial set of utility routines to help a developer clean up SqueakyClean names.

In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name is comprised of zero or more letters and underscores.

In all cases the input string is guaranteed to be non-null. Note that the clean method should treat an empty string as valid.

### 1. Replace any spaces encountered with underscores
Implement the (static) SqueakyClean.clean() method to replace any spaces with underscores. This also applies to leading and trailing spaces.

```
SqueakyClean.clean("my   Id");
// => "my___Id"
```


### 2. Convert kebab-case to camelCase
Modify the (static) SqueakyClean.clean() method to convert kebab-case to camelCase.

```
SqueakyClean.clean("a-bc");
// => "aBc"
```


### 3. Convert leetspeak to normal text
Modify the (static) SqueakyClean.clean() method to convert leetspeak to normal text. For simplicity we will only be using 4, 3, 0, 1 and 7 from the table.

SqueakyClean.clean("H3ll0 W0rld");
// => "Hello_World"
```


### 4. Omit characters that are not letters
Modify the (static) SqueakyClean.clean() method to omit any characters that are not letters.

```
SqueakyClean.clean("a$#.b");
// => "ab"
```