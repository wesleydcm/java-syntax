public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        
        System.out.println("Tv on? " + smartTv.on);
        System.out.println("Current channel: " + smartTv.ch);
        System.out.println("Current volume: " + smartTv.volume);


        smartTv.changeCh(4);
        System.out.println("Current channel: " + smartTv.ch);


        
        // smartTv.decreaseCh();
        // System.out.println("Current channel: " + smartTv.ch);

        // smartTv.increaseCh();
        // System.out.println("Current channel: " + smartTv.ch);

        
        
        // smartTv.turnDownVolume();
        // System.out.println("Current volume: " + smartTv.volume);


        // smartTv.turnOn();

        // System.out.println("Tv on? " + smartTv.on);
         }
}
