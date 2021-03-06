import java.util.ArrayList;
import java.util.Scanner;


public class Customers extends Packets{

    protected String CustomerName;

    /**
     * 1 Argument constructor. It takes branch name.
     * @param theName branch name
     */
    Customers(String theName){
        CustomerName = theName;
    }

    /**
     * No argument constructor.
     */
    Customers(){
        CustomerName = "Empty";
    }

    /**
     * This method gives information about packet according to track number.
     * @param p packet list
     * @param trackNumber track number
     */
   public void GetInfo(ArrayList<PacketInfo> p,int trackNumber){

        boolean flag =false;
        for(int i = 0 ; i<p.size() ; i++){
            if(p.get(i).trackNumber == trackNumber){
                p.get(i).GetInfoPacket();
                flag = true;
            }
        }

        if(!flag){
            System.out.println("Packet not found");
        }


   }

}
