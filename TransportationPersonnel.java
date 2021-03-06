import java.util.ArrayList;
import java.util.Scanner;

public class TransportationPersonnel extends Packets {
    protected int TransportationPersonnelId;
    TransportationPersonnel(){
        TransportationPersonnelId = 0;
    }
    TransportationPersonnel(int theNumber){
        TransportationPersonnelId = theNumber;
    }
    public void Show(){
        System.out.println(TransportationPersonnelId);
    }

    /**
     * This method change the status the packet. It does not take tack number because it uses inheritance to reach track number.
     * @param packets list of packets
     */
    public void UpdateStatus(ArrayList<PacketInfo> packets){

        Scanner scanner = new Scanner(System.in);
        int theTrackNumber=-1;
        System.out.println("The List of Packets ID");
        for (int i= 0 ; i<packets.size() ; i++){
            if(packets.get(i).trackNumber != 0)
                System.out.println(packets.get(i).trackNumber);
        }
        System.out.println("Please Enter the Packet number to change current status");
        theTrackNumber = scanner.nextInt();

        try{

            for (int i= 0 ; i<packets.size() ; i++){
                if(packets.get(i).trackNumber == theTrackNumber){
                    if(packets.get(i).Status == "Was delivered"){
                        System.out.println("Packet has already delivered");
                    }
                    else{
                        packets.get(i).Status = "Was delivered";
                        System.out.println("Packet with tracking number " +packets.get(i).trackNumber+ " is delivered to " + packets.get(i).ReceiverName + " " + packets.get(i).ReceiverSurname);
                    }
                }
            }

        }catch (Exception e){
            System.out.println("System Error");
        }


    }


}
