abstract class Alert {
    public abstract void triggerAlert();

    public void logAlert(){
        System.out.println("Alert has been logged!");
    }
}