# Instruções
Você é um ávido observador de pássaros que acompanha quantos pássaros visitaram seu jardim nos últimos sete dias.

Você tem seis tarefas, todas relacionadas com o número de pássaros que visitaram seu jardim.

### 1. Verifique quais foram as contagens da semana passada
Para efeito de comparação, você sempre mantém por perto uma cópia das contagens da semana passada, que foram: 0, 2, 5, 3, 7, 8 e 4. Implemente o BirdWatcher.getLastWeek()método que retorna as contagens da semana passada:

BirdWatcher.getLastWeek();
// => [0, 2, 5, 3, 7, 8, 4]


### 2. Verifique quantas aves visitaram hoje
Implemente o BirdWatcher.getToday()método para retornar quantos pássaros visitaram seu jardim hoje. As contagens de aves são ordenadas por dia, sendo o primeiro elemento a contagem do dia mais antigo e o último elemento a contagem de hoje.

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getToday();
// => 1


### 3. Aumente a contagem de hoje
Implemente o BirdWatcher.incrementTodaysCount()método para incrementar a contagem de hoje:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.incrementTodaysCount();
birdCount.getToday();
// => 2


### 4. Verifique se houve algum dia sem visitas de pássaros
Implemente o BirdWatcher.hasDayWithoutBirds()método que retorna truese houve um dia em que nenhum pássaro visitou o jardim; caso contrário, retorne false:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.hasDayWithoutBirds();
// => true


### 5. Calcule o número de aves visitantes nos primeiros dias
Implemente o BirdWatcher.getCountForFirstDays()método que retorna o número de pássaros que visitaram seu jardim desde o início da semana, mas limite a contagem ao número especificado de dias a partir do início da semana.

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getCountForFirstDays(4);
// => 14


### 6. Calcule o número de dias ocupados
Alguns dias são mais ocupados que outros. Um dia agitado é aquele em que cinco ou mais pássaros visitaram seu jardim. Implemente o BirdWatcher.getBusyDays()método para retornar o número de dias ocupados:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getBusyDays();
// => 2



# Instructions
You're an avid bird watcher that keeps track of how many birds have visited your garden in the last seven days.

You have six tasks, all dealing with the numbers of birds that visited your garden.

### 1. Check what the counts were last week
For comparison purposes, you always keep a copy of last week's counts nearby, which were: 0, 2, 5, 3, 7, 8 and 4. Implement the BirdWatcher.getLastWeek() method that returns last week's counts:

BirdWatcher.getLastWeek();
// => [0, 2, 5, 3, 7, 8, 4]


### 2. Check how many birds visited today
Implement the BirdWatcher.getToday() method to return how many birds visited your garden today. The bird counts are ordered by day, with the first element being the count of the oldest day, and the last element being today's count.

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getToday();
// => 1


### 3. Increment today's count
Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.incrementTodaysCount();
birdCount.getToday();
// => 2


### 4. Check if there was a day with no visiting birds
Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if there was a day at which zero birds visited the garden; otherwise, return false:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.hasDayWithoutBirds();
// => true


### 5. Calculate the number of visiting birds for the first number of days
Implement the BirdWatcher.getCountForFirstDays() method that returns the number of birds that have visited your garden from the start of the week, but limit the count to the specified number of days from the start of the week.

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getCountForFirstDays(4);
// => 14


### 6. Calculate the number of busy days
Some days are busier that others. A busy day is one where five or more birds have visited your garden. Implement the BirdWatcher.getBusyDays() method to return the number of busy days:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getBusyDays();
// => 2