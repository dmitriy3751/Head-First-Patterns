package Strategy;

import Strategy.Fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlybehavior(new FlyRocketPowered());   // динамическая смена поведения
        model.performFly();
    }
}
