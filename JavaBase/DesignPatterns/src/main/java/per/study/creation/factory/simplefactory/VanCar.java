package per.study.creation.factory.simplefactory;

public class VanCar extends AbstractCar{

    public VanCar() {
        this.engine = "单缸柴油机";
    }

    @Override
    public void run() {
        System.out.println(engine + " --> 哒哒哒");
    }
}
