public class Lamda {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addConsumer(lamp);
        switcher.addConsumer(radio);

        String m = " hahaha";
        switcher.addConsumer( (h)-> {

                System.out.println("Fire on!!!" + "Dima"+m);
        });

        switcher.swithOn();
    }

}
