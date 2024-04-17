# Instruções
Karl quer acompanhar uma lista de idiomas para aprender no site da Exercism. Karl precisa ser capaz de adicionar novos idiomas, remover os antigos e verificar se determinados idiomas estão na lista. Seria muito emocionante se Karl quisesse aprender Java ou Kotlin!

### 1. Defina uma função para verificar se a lista de idiomas está vazia
Karl precisa saber se sua lista de idiomas fica vazia, para que ele possa encontrar mais para aprender! Defina um método chamado isEmptyque retornará truese não houver idiomas na lista.

```
 if (languageList.isEmpty()) {
    findMoreLanguagesToLearn();
}

```


### 2. Defina uma função para adicionar um idioma à lista
Karl está ansioso para aprender Kotlin e Python! Ajude Karl a começar definindo um método chamado addLanguageque pega a linguagem que ele deseja aprender e a adiciona à lista.

```
languageList.addLanguage("Kotlin");
languageList.addLanguage("Python");

```


### 3. Defina uma função para remover um idioma da lista
Karl decidiu que não quer aprender Scala agora. Ajude Karl a removê-lo da lista definindo um método chamado removeLanguageque pega o idioma que ele está removendo e o remove da lista.

```
languageList.removeLanguage("Scala");
```


### 4. Defina uma função para retornar o primeiro item da lista
Karl quer lembrar o primeiro idioma que adicionou à lista (que ainda está na lista). Defina um método chamado firstLanguageque retorne o primeiro idioma da lista.

```
String kotlin = languageList.firstLanguage(); // "Kotlin"
```


### 5. Defina uma função para retornar quantos idiomas estão na lista
Karl precisa saber quantos idiomas ele está tentando aprender. Ajude Karl a encontrar a resposta definindo um método chamado countque retorna o número de idiomas na lista.

```
int two = languageList.count(); // 2

```


### 6. Defina uma função para determinar se um idioma está na lista
Karl está tentando lembrar se queria aprender Python ou Ruby. Defina um método chamado containsLanguageque use a linguagem que ele está perguntando para que Karl possa descobrir!

```
boolean learningPython = languageList.containsLanguage("Python"); // true
boolean learningRuby = languageList.containsLanguage("Ruby"); // false
```


### 7. Defina uma função para determinar se a lista é interessante
Se Karl quiser aprender Java ou Kotlin, isso é muito emocionante! Defina um método chamado isExcitingque retorne verdadeiro se Karl quiser aprender Java ou Kotlin.

```
javaLanguageList.isExciting() // true
neitherKotlinNorJavaLanguageList.isExciting() // false
```

# Instructions
Karl wants to keep track of a list of languages to learn on Exercism's website. Karl needs to be able to add new languages, remove old ones and check if certain languages are in the list. It would be very exciting if Karl wants to learn Java or Kotlin!

## 1. Define a function to check if the language list is empty
Karl needs to know if his list of languages ever becomes empty, so he can go find more to learn! Define a method called isEmpty which returns true if there are no languages in the list.

```
if (languageList.isEmpty()) {
    findMoreLanguagesToLearn();
}
```


### 2. Define a function to add a language to the list
Karl is looking forward to learning Kotlin and Python! Help Karl get started by defining a method called addLanguage which takes the language he wants to learn and adds it to the list.

```
languageList.addLanguage("Kotlin");
languageList.addLanguage("Python");
```


### 3. Define a function to remove a language from the list
Karl decided he does not want to learn Scala right now. Help Karl remove it from the list by defining a method called removeLanguage which takes the language he is removing and removes it from the list.

```
languageList.removeLanguage("Scala");
```


### 4. Define a function to return the first item in the list
Karl wants to remember the first language he added to the list (that is still in the list). Define a method called firstLanguage that returns the first language in the list.

```
String kotlin = languageList.firstLanguage(); // "Kotlin"
```


### 5. Define a function to return how many languages are in the list
Karl needs to know how many languages he is trying to learn. Help Karl find the answer by defining a method called count which returns the number of languages in the list.

```
int two = languageList.count(); // 2
```


### 6. Define a function to determine if a language is in the list
Karl is trying to remember if he wanted to learn Python or Ruby. Define a method called containsLanguage which takes the language he is asking about so Karl can find out!

```
boolean learningPython = languageList.containsLanguage("Python"); // true
boolean learningRuby = languageList.containsLanguage("Ruby"); // false
```


### 7. Define a function to determine if the list is exciting
If Karl wants to learn Java or Kotlin, that is very exciting! Define a method called isExciting that returns true if Karl wants to learn Java or Kotlin.

```
javaLanguageList.isExciting() // true
neitherKotlinNorJavaLanguageList.isExciting() // false
```