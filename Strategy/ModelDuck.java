package Strategy;

import Strategy.Fly.FlyNoWay;
import Strategy.Quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flybehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck!");
    }
}
