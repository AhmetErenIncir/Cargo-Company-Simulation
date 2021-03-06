import java.util.ArrayList;
import java.util.Scanner;


public class Packets extends PacketInfo {

    /**
     * .1 Argument constructor . It takes track number.
     * @param track track number.
     */
    Packets(int track){
        trackNumber = track;
    }

    /**
     * No argument constructor.
     */
    Packets(){
        trackNumber = 0;
    }

    @Override
    void GetInfoPacket() {
        System.out.println("Sender Name : " + SenderName);
        System.out.println("Sender Surname : " + SenderSurname);
        System.out.println("Sender Address : " + SenderAddress);
        System.out.println("Receiver Name : " + ReceiverName);
        System.out.println("Receiver Name : " + ReceiverSurname);
        System.out.println("Receiver Address : " + ReceiverAddress);
        System.out.println("Current Status : " + Status);
    }
}


