# Instruções
Neste exercício, você escreverá alguns códigos para ajudá-lo a preparar uma lasanha brilhante com base no seu livro de culinária favorito.

Você tem quatro tarefas, todas relacionadas ao tempo gasto no preparo da lasanha.

## 1. Defina o tempo esperado de forno em minutos
Defina o expectedMinutesInOven()método que não leva nenhum parâmetro e retorna quantos minutos a lasanha deve ficar no forno. De acordo com o livro de culinária, o tempo esperado do forno em minutos é 40:

Lasagna lasagna = new Lasagna();
lasagna.expectedMinutesInOven();
// => 40


### 2. Calcule o tempo restante do forno em minutos
Defina o remainingMinutesInOven()método que leva como parâmetro os minutos reais que a lasanha ficou no forno e retorna quantos minutos a lasanha ainda tem para permanecer no forno, com base no tempo de forno esperado em minutos da tarefa anterior.

Lasagna lasagna = new Lasagna();
lasagna.remainingMinutesInOven(30);
// => 10


### 3. Calcule o tempo de preparo em minutos
Defina o preparationTimeInMinutes()método que leva como parâmetro o número de camadas que você adicionou à lasanha e retorna quantos minutos você gastou preparando a lasanha, assumindo que cada camada leva 2 minutos para ser preparada.

Lasagna lasagna = new Lasagna();
lasagna.preparationTimeInMinutes(2);
// => 4


### 4. Calcule o tempo total de trabalho em minutos
Defina o totalTimeInMinutes()método que leva dois parâmetros: o primeiro parâmetro é o número de camadas que você adicionou à lasanha e o segundo parâmetro é o número de minutos que a lasanha ficou no forno. A função deve retornar quantos minutos no total você trabalhou no cozimento da lasanha, que é a soma do tempo de preparo em minutos, e o tempo em minutos que a lasanha ficou no forno no momento.

Lasagna lasagna = new Lasagna();
lasagna.totalTimeInMinutes(3, 20);
// => 26




# Instructions
In this exercise you're going to write some code to help you cook a brilliant lasagna from your favorite cooking book.

You have four tasks, all related to the time spent cooking the lasagna.

### 1. Define the expected oven time in minutes
Define the expectedMinutesInOven() method that does not take any parameters and returns how many minutes the lasagna should be in the oven. According to the cooking book, the expected oven time in minutes is 40:

Lasagna lasagna = new Lasagna();
lasagna.expectedMinutesInOven();
// => 40


### 2. Calculate the remaining oven time in minutes
Define the remainingMinutesInOven() method that takes the actual minutes the lasagna has been in the oven as a parameter and returns how many minutes the lasagna still has to remain in the oven, based on the expected oven time in minutes from the previous task.

Lasagna lasagna = new Lasagna();
lasagna.remainingMinutesInOven(30);
// => 10


### 3. Calculate the preparation time in minutes
Define the preparationTimeInMinutes() method that takes the number of layers you added to the lasagna as a parameter and returns how many minutes you spent preparing the lasagna, assuming each layer takes you 2 minutes to prepare.

Lasagna lasagna = new Lasagna();
lasagna.preparationTimeInMinutes(2);
// => 4


4. Calculate the total working time in minutes
Define the totalTimeInMinutes() method that takes two parameters: the first parameter is the number of layers you added to the lasagna, and the second parameter is the number of minutes the lasagna has been in the oven. The function should return how many minutes in total you've worked on cooking the lasagna, which is the sum of the preparation time in minutes, and the time in minutes the lasagna has spent in the oven at the moment.

Lasagna lasagna = new Lasagna();
lasagna.totalTimeInMinutes(3, 20);
// => 26