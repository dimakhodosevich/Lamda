public class Radio implements ElectricityConsumer{

    public void radioOn(){
        System.out.println("Radio on!!!");
    }

    @Override
    public void electricityOn(Object obj) {
        radioOn();
    }
}
