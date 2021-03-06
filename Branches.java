import java.util.ArrayList;
import java.util.Scanner;


public class Branches {

    protected String BranchName;
    protected  ArrayList<PacketInfo> packets = new ArrayList<>(); //I used Polymorphism!!!
    protected ArrayList<BranchesEmployee> branchesEmployee = new ArrayList<>();


    /**
     * No argument constructor
     */
    Branches (){
        BranchName = "Empty";
        packets.add(new Packets());
        packets.add(new Packets());
        packets.add(new Packets());
        branchesEmployee.add(new BranchesEmployee());
        branchesEmployee.add(new BranchesEmployee());
        branchesEmployee.add(new BranchesEmployee());
        branchesEmployee.add(new BranchesEmployee());
        branchesEmployee.add(new BranchesEmployee());
    }

    /**
     * 1 Argument constructor . It takes branch name.
     * @param theBranchName branch name.
     */
    Branches (String theBranchName){
        BranchName = theBranchName;
        packets.add(new Packets());
        packets.add(new Packets());
        packets.add(new Packets());
        branchesEmployee.add(new BranchesEmployee());
        branchesEmployee.add(new BranchesEmployee());
        branchesEmployee.add(new BranchesEmployee());
        branchesEmployee.add(new BranchesEmployee());
        branchesEmployee.add(new BranchesEmployee());
    }

    /**
     * Method prints Branch Employee List.
     */
    public void ShowBranchEmployeesList(){
       for (int i=0 ; i<branchesEmployee.size() ; i++){
           if(!branchesEmployee.get(i).name.equals("empty"))
               System.out.println(branchesEmployee.get(i).name);
       }
    }

    /**
     * This method prints list of Packet's Tracking numbers
     */
    public void ShowPackets(){
       for(int i=0 ; i<packets.size() ; i++){
           if(packets.get(i).trackNumber != 0){
               System.out.println(packets.get(i).trackNumber);
           }
       }
    }

    /**
     * This method returns the Branch Name according to Track no.
     * @param trackNo track no.
     * @return Branch Name.
     */
    public String GetBranchName(int trackNo){
       return BranchName;
    }







}
