import java.util.ArrayList;
import java.util.Scanner;


abstract class PacketInfo {

    protected int trackNumber;
    protected String ReceiverName;
    protected String ReceiverSurname;
    protected String ReceiverAddress;
    protected String SenderName;
    protected String SenderSurname;
    protected String SenderAddress;
    protected String Status;

    /**
     * This method is an abstract method. It prints information about packet.
     */
    abstract void GetInfoPacket() ;

}
