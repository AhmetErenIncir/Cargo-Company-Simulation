public class Packets {
    protected String SenderName;
    protected String SenderSurname;
    protected String SenderAddress;
    protected String ReceiverName;
    protected String ReceiverSurname;
    protected String ReceiverAddress;
    protected String Status;
    protected int TrackingNumber;
    protected int BranchId;

    /**
     * No argument constructor
     */
    Packets(){
        SenderName = "empty";
        SenderAddress ="empty";
        SenderSurname ="empty";
        ReceiverAddress ="empty";
        ReceiverSurname = "empty";
        ReceiverName = "empty";
        Status = "empty";
        TrackingNumber = 0;
        BranchId = 0;
    }

    /**
     *
     * @param theSenderName sender name
     * @param theSenderSurname sender surname
     * @param theSenderAddress sender address
     * @param theReceiverName Receiver name
     * @param theReceiverSurname Receiver surname
     * @param theReceiverAddress Receiver Address
     * @param theStatus status of packet
     * @param theTrackingNumber Tracking number
     * @param theBranchId Branch Id
     */
    Packets(String theSenderName,String theSenderSurname ,String theSenderAddress , String theReceiverName ,String theReceiverSurname,
            String theReceiverAddress ,String theStatus , int theTrackingNumber , int theBranchId){

        SenderName = theSenderName;
        SenderSurname = theSenderSurname;
        SenderAddress = theSenderAddress;
        ReceiverName = theReceiverName;
        ReceiverSurname = theReceiverSurname;
        ReceiverAddress = theReceiverAddress;
        Status = theStatus;
        TrackingNumber = theTrackingNumber;
        BranchId = theBranchId;

  }


}
