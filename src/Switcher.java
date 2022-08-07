import java.util.ArrayList;
import java.util.List;

public class Switcher {
    List<ElectricityConsumer> electricityConsumers= new ArrayList<>();

    public void swithOn(){
        System.out.println("Swith is on!!!");
        for(ElectricityConsumer e: electricityConsumers){
            e.electricityOn(this);
        }
    }

    public void addConsumer(ElectricityConsumer electricityConsumer){
        electricityConsumers.add(electricityConsumer);
    }

    public void removeConsumer(ElectricityConsumer electricityConsumer){
        electricityConsumers.remove(electricityConsumer);
    }

}
