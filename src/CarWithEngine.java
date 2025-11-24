public class CarWithEngine {

    Engine engine;

    CarWithEngine(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        System.out.println("Starting Engine ... ");
        engine.startEngine();
    }
}
