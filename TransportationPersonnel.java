public class TransportationPersonnel  {

    protected int TransportationPersonnelId;

    /**
     * No argument constructor
     */
    TransportationPersonnel(){
        TransportationPersonnelId = 0;
    }

    /**
     *
     * @param theId TransportationPersonnel Id
     */
    TransportationPersonnel(int theId){
        TransportationPersonnelId = theId;
    }

    /**
     * This method changes the status the packet if not delivered yet.
     * @param p
     */
    public static void UpdateStatus(Packets p){
        p.Status = "Was delivered";
        System.out.println("Packet delivered to  " + p.ReceiverName + " " + p.ReceiverSurname);
        System.out.println("Packet's current status is : " + p.Status);
    }

}
