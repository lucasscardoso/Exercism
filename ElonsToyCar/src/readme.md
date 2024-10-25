# Instruções
Neste exercício, você brincará com um carrinho de controle remoto, para o qual finalmente economizou dinheiro suficiente para comprar.

Os carros começam com baterias cheias (100%). Cada vez que você dirige o carro usando o controle remoto, ele percorre 20 metros e drena um por cento da bateria.

O carro controlado remotamente tem um display LED sofisticado que mostra duas informações:

A distância total percorrida, exibida como: "Driven <METERS> meters".
A carga restante da bateria, exibida como: "Battery at <PERCENTAGE>%".
Se a bateria estiver em 0%, você não poderá mais dirigir o carro e o visor da bateria mostrará "Battery empty".

Você tem seis tarefas, cada uma das quais trabalhará com instâncias de carros controlados remotamente.

## 1. Compre um carro de controle remoto novo
Implemente o método ( estático ) ElonsToyCar.buy()para retornar uma nova instância de carro controlado remotamente:

`ElonsToyCar car = ElonsToyCar.buy();`

## 2. Exibir a distância percorrida
Implemente o ElonsToyCar.distanceDisplay()método para retornar a distância conforme exibida no display LED:

`ElonsToyCar car = ElonsToyCar.buy();
car.distanceDisplay();
// => "Driven 0 meters"`

## 3. Exibir a porcentagem da bateria
Implemente o ElonsToyCar.batteryDisplay()método para retornar a porcentagem da bateria conforme exibida no display LED:

`ElonsToyCar car = ElonsToyCar.buy();
car.batteryDisplay();
// => "Battery at 100%"`

## 4. Atualizar o número de metros percorridos ao dirigir
Implemente o ElonsToyCar.drive()método que atualiza o número de metros percorridos:

´ElonsToyCar car = ElonsToyCar.buy();
car.drive();
car.drive();
car.distanceDisplay();
// => "Driven 40 meters"`

## 5. Atualize a porcentagem da bateria ao dirigir
Atualize o ElonsToyCar.drive()método para atualizar a porcentagem da bateria:

`ElonsToyCar car = ElonsToyCar.buy();
car.drive();
car.drive();
car.batteryDisplay();
// => "Battery at 98%"`

## 6. Evite dirigir quando a bateria estiver descarregada
Atualizar o ElonsToyCar.drive()método para não aumentar a distância percorrida nem diminuir a porcentagem da bateria quando ela estiver descarregada (em 0%):

`ElonsToyCar car = ElonsToyCar.buy();
// Drain the battery
// ...
car.distanceDisplay();
// => "Driven 2000 meters"
car.batteryDisplay();
// => "Battery empty"`

---
# Instructions


In this exercise you'll be playing around with a remote controlled car, which you've finally saved enough money for to buy.

Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers 20 meters and drains one percent of the battery.

The remote controlled car has a fancy LED display that shows two bits of information:

The total distance it has driven, displayed as: "Driven <METERS> meters".
The remaining battery charge, displayed as: "Battery at <PERCENTAGE>%".
If the battery is at 0%, you can't drive the car anymore and the battery display will show "Battery empty".

You have six tasks, each of which will work with remote controlled car instances.

## 1. Buy a brand-new remote controlled car
Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance:

`ElonsToyCar car = ElonsToyCar.buy();`

## 2. Display the distance driven
Implement the ElonsToyCar.distanceDisplay() method to return the distance as displayed on the LED display:

`ElonsToyCar car = ElonsToyCar.buy();
car.distanceDisplay();
// => "Driven 0 meters"`

## 3. Display the battery percentage
Implement the ElonsToyCar.batteryDisplay() method to return the battery percentage as displayed on the LED display:

`ElonsToyCar car = ElonsToyCar.buy();
car.batteryDisplay();
// => "Battery at 100%"`

## 4. Update the number of meters driven when driving
Implement the ElonsToyCar.drive() method that updates the number of meters driven:

`ElonsToyCar car = ElonsToyCar.buy();
car.drive();
car.drive();
car.distanceDisplay();
// => "Driven 40 meters"`

## 5. Update the battery percentage when driving
Update the ElonsToyCar.drive() method to update the battery percentage:

`ElonsToyCar car = ElonsToyCar.buy();
car.drive();
car.drive();
car.batteryDisplay();
// => "Battery at 98%"`

## 6. Prevent driving when the battery is drained
Update the ElonsToyCar.drive() method to not increase the distance driven nor decrease the battery percentage when the battery is drained (at 0%):

`ElonsToyCar car = ElonsToyCar.buy();

// Drain the battery
// ...

car.distanceDisplay();
// => "Driven 2000 meters"

car.batteryDisplay();
// => "Battery empty"`

---