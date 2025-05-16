package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {

    public static void main(String[] args) {

        /* comment. extends 키워드를 이용하여 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다. */
//        RabbitFarm<Animal> farm1 = new RabbitFarm();

//        RabbitFarm<Mammal> farm2 = new RabbitFarm();

//        RabbitFarm<Snake> farm3 = new RabbitFarm();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

//        farm4.setAnimal(new Snake());

        farm4.setAnimal(new Rabbit());
        ((Rabbit) farm4.getAnimal()).cry();
        (farm4.getAnimal()).cry();

        farm5.setAnimal(new Bunny());
        ((Bunny) farm5.getAnimal()).cry();
        (farm5.getAnimal()).cry();

        farm6.setAnimal(new DrunkenBunny());
        ((DrunkenBunny) farm6.getAnimal()).cry();
        (farm6.getAnimal()).cry();
    }
}