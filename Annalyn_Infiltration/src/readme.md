#Instruções
Neste exercício, você implementará a lógica da missão para um novo jogo de RPG que um amigo está desenvolvendo. A personagem principal do jogo é Annalyn, uma garota corajosa com um cachorro de estimação feroz e leal. Infelizmente, ocorre um desastre, pois sua melhor amiga foi sequestrada enquanto procurava frutas na floresta. Annalyn tentará encontrar e libertar sua melhor amiga, opcionalmente levando seu cachorro com ela nesta missão.

Depois de algum tempo seguindo a trilha de sua melhor amiga, ela encontra o acampamento onde sua melhor amiga está presa. Acontece que existem dois sequestradores: um cavaleiro poderoso e um arqueiro astuto.

Tendo encontrado os sequestradores, Annalyn considera quais das seguintes ações ela pode realizar:

Ataque rápido: um ataque rápido pode ser feito se o cavaleiro estiver dormindo, pois leva tempo para ele colocar a armadura, então ficará vulnerável.
Espião: o grupo pode ser espionado se pelo menos um deles estiver acordado. Caso contrário, espionar é uma perda de tempo.
Sinalizar prisioneiro: o prisioneiro pode ser sinalizado por meio de sons de pássaros se o prisioneiro estiver acordado e o arqueiro estiver dormindo, pois os arqueiros são treinados em sinalização de pássaros, para que possam interceptar a mensagem.
Prisioneiro livre : Annalyn pode tentar entrar furtivamente no acampamento para libertar o prisioneiro. Isso é algo arriscado de se fazer e só pode ter sucesso de duas maneiras:
Se Annalyn tiver seu cachorro de estimação, ela poderá resgatar o prisioneiro se o arqueiro estiver dormindo. O cavaleiro está com medo do cachorro e o arqueiro não terá tempo de se preparar antes que Annalyn e o prisioneiro possam escapar.
Se Annalyn não tem seu cachorro, ela e o prisioneiro devem ser muito sorrateiros! Annalyn pode libertar o prisioneiro se o prisioneiro estiver acordado e o cavaleiro e o arqueiro estiverem dormindo, mas se o prisioneiro estiver dormindo, eles não poderão ser resgatados: o prisioneiro ficaria surpreso com a aparição repentina de Annalyn e acordaria o cavaleiro e o arqueiro.
Você tem quatro tarefas: implementar a lógica para determinar se as ações acima estão disponíveis com base no estado dos três personagens encontrados na floresta e se o cachorro de estimação de Annalyn está presente ou não.

### 1. Verifique se um ataque rápido pode ser feito
Implemente o método ( estático ) AnnalynsInfiltration.canFastAttack()que assume um valor booleano que indica se o cavaleiro está acordado. Este método retorna truese um ataque rápido puder ser feito com base no estado do cavaleiro. Caso contrário, retorna false:

boolean knightIsAwake = true;
AnnalynsInfiltration.canFastAttack(knightIsAwake);
// => false


### 2. Verifique se o grupo pode ser espionado
Implemente o método ( estático ) AnnalynsInfiltration.canSpy()que assume três valores booleanos, indicando se o cavaleiro, o arqueiro e o prisioneiro, respectivamente, estão acordados. O método retorna truese o grupo puder ser espionado, com base no estado dos três personagens. Caso contrário, retorna false:

boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
// => true


### 3. Verifique se o prisioneiro pode ser sinalizado
Implemente o método ( estático ) AnnalynsInfiltration.canSignalPrisoner()que assume dois valores booleanos, indicando se o arqueiro e o prisioneiro, respectivamente, estão acordados. O método retorna truese o prisioneiro puder ser sinalizado, com base no estado dos dois personagens. Caso contrário, retorna false:

boolean archerIsAwake = false;
boolean prisonerIsAwake = true;
AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
// => true


### 4. Verifique se o prisioneiro pode ser libertado
Implemente o método ( estático ) AnnalynsInfiltration.canFreePrisoner()que aceita quatro valores booleanos. Os três primeiros parâmetros indicam se o cavaleiro, o arqueiro e o prisioneiro, respectivamente, estão acordados. O último parâmetro indica se o cachorro de estimação de Annalyn está presente. O método retorna truese o prisioneiro puder ser libertado com base no estado dos três personagens e na presença do cachorro de estimação de Annalyn. Caso contrário, ele retorna false:

boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
boolean petDogIsPresent = false;
AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
// => false




# Instructions
In this exercise, you'll be implementing the quest logic for a new RPG game a friend is developing. The game's main character is Annalyn, a brave girl with a fierce and loyal pet dog. Unfortunately, disaster strikes, as her best friend was kidnapped while searching for berries in the forest. Annalyn will try to find and free her best friend, optionally taking her dog with her on this quest.

After some time spent following her best friend's trail, she finds the camp in which her best friend is imprisoned. It turns out there are two kidnappers: a mighty knight and a cunning archer.

Having found the kidnappers, Annalyn considers which of the following actions she can engage in:

Fast attack: a fast attack can be made if the knight is sleeping, as it takes time for him to get his armor on, so he will be vulnerable.
Spy: the group can be spied upon if at least one of them is awake. Otherwise, spying is a waste of time.
Signal prisoner: the prisoner can be signalled using bird sounds if the prisoner is awake and the archer is sleeping, as archers are trained in bird signaling, so they could intercept the message.
Free prisoner: Annalyn can try sneaking into the camp to free the prisoner. This is a risky thing to do and can only succeed in one of two ways:
If Annalyn has her pet dog with her she can rescue the prisoner if the archer is asleep. The knight is scared of the dog and the archer will not have time to get ready before Annalyn and the prisoner can escape.
If Annalyn does not have her dog then she and the prisoner must be very sneaky! Annalyn can free the prisoner if the prisoner is awake and the knight and archer are both sleeping, but if the prisoner is sleeping they can't be rescued: the prisoner would be startled by Annalyn's sudden appearance and wake up the knight and archer.
You have four tasks: to implement the logic for determining if the above actions are available based on the state of the three characters found in the forest and whether Annalyn's pet dog is present or not.

### 1. Check if a fast attack can be made
Implement the (static) AnnalynsInfiltration.canFastAttack() method that takes a boolean value that indicates if the knight is awake. This method returns true if a fast attack can be made based on the state of the knight. Otherwise, returns false:

boolean knightIsAwake = true;
AnnalynsInfiltration.canFastAttack(knightIsAwake);
// => false


### 2. Check if the group can be spied upon
Implement the (static) AnnalynsInfiltration.canSpy() method that takes three boolean values, indicating if the knight, archer and the prisoner, respectively, are awake. The method returns true if the group can be spied upon, based on the state of the three characters. Otherwise, returns false:

boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
// => true


### 3. Check if the prisoner can be signalled
Implement the (static) AnnalynsInfiltration.canSignalPrisoner() method that takes two boolean values, indicating if the archer and the prisoner, respectively, are awake. The method returns true if the prisoner can be signalled, based on the state of the two characters. Otherwise, returns false:

boolean archerIsAwake = false;
boolean prisonerIsAwake = true;
AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
// => true


### 4. Check if the prisoner can be freed
Implement the (static) AnnalynsInfiltration.canFreePrisoner() method that takes four boolean values. The first three parameters indicate if the knight, archer and the prisoner, respectively, are awake. The last parameter indicates if Annalyn's pet dog is present. The method returns true if the prisoner can be freed based on the state of the three characters and Annalyn's pet dog's presence. Otherwise, it returns false:

boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
boolean petDogIsPresent = false;
AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
// => false