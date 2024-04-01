package day05_tasks;

public class Computer {
    public static void main (String []args){

        String brand = "HP";
        String processor = "AMD A10-4655M APU ";
        int ramMemory = 8;
        int storageMemory = 128;
        boolean hasMonitor = true;
        boolean hasWifiCard = true;
        String description = "The HP Pavilion is designed for flexibility. Stay powerfully connected with the AMD A10-4655M APU and enjoy effortless video calls with the HD camera.";
        int price = 299;
        double cpu = 2.00;
        String color = "Silver";
        int numberOfMonitors = 2;
        int numberOfUsbSlots = 4;
        boolean hasUsb3 = false;

        System.out.println ("Computer details: ");
        System.out.println ("Computer brand:\t\t\t\t\t\t" + brand);
        System.out.println ("Processor:\t\t\t\t\t\t\t" + processor);
        System.out.println ("Ram memory:\t\t\t\t\t\t\t" + ramMemory);
        System.out.println ("Storage memory:\t\t\t\t\t\t" + storageMemory);
        System.out.println ("Has it  a monitor?\t\t\t\t\t" + hasMonitor);
        System.out.println ("Has it wi-fi card?\t\t\t\t\t" + hasWifiCard);
        System.out.println ("Description:\t\t\t\t\t\t" + description);
        System.out.println ("Price:\t\t\t\t\t\t\t\t" + "$" + price);
        System.out.println ("CPU:\t\t\t\t\t\t\t\t" + cpu);
        System.out.println ("Color:\t\t\t\t\t\t\t\t" + color);
        System.out.println ("Number og monitors:\t\t\t\t\t" + numberOfMonitors);
        System.out.println ("Number of USB slots:\t\t\t\t" + numberOfUsbSlots);
        System.out.println ("Has it USB 3.0?\t\t\t\t\t\t" + hasUsb3);


    }
}
