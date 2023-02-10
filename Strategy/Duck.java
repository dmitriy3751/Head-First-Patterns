package Strategy;

import Strategy.Fly.FlyBehavior;
import Strategy.Quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flybehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flybehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    // для возможности динамической смены поведения дочерних классов
    public void setFlybehavior(FlyBehavior fb) {
        flybehavior = fb;
    }

    // для возможности динамической смены поведения дочерних классов
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
