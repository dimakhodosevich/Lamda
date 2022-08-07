public class Lamp implements ElectricityConsumer{
    public void lampOn(){
        System.out.println("Lamp is on!!!");
    }

    @Override
    public void electricityOn(Object obj) {
        lampOn();
    }
}
