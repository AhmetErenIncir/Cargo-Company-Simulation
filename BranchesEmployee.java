import java.util.ArrayList;
import java.util.Scanner;

public class BranchesEmployee extends Packets {


    protected String name;
    protected String surname;
    protected ArrayList<Customers> customers = new ArrayList<>(); // String yapabilirsin.

    /**
     * 1 argument constructor. It takes branch name
     * @param theName Branch name
     */
    BranchesEmployee(String theName){
        name = theName;
        customers.add(new Customers("Archie") );
        customers.add(new Customers("Lara") );
        customers.add(new Customers("Carroll") );
    }

    /**
     * No argument Constructor.
     */
    BranchesEmployee(){
        name = "empty";
        customers.add(new Customers("Archie") );
        customers.add(new Customers("Lara") );
        customers.add(new Customers("Carroll") );
    }

    /**
     * Method removes Customer from Customer List.
     */
    public void RemoveCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The List of Customer : ");
        for(int i=0 ; i<customers.size() ; i++){
            if(!customers.get(i).CustomerName.equals("Empty"))
                System.out.println(customers.get(i).CustomerName);
        }
        System.out.println("Please Enter the name to remove customer from list :");
        String theName = scanner.next();
        boolean flag = false;
        for(int i=0 ; i<customers.size() ; i++){
            if(customers.get(i).CustomerName.equals(theName)){
                customers.remove(i);
                flag = true;
            }
        }
        System.out.println("The List of Customer after remove operation : ");
        for(int i=0 ; i<customers.size() ; i++){
            if(!customers.get(i).CustomerName.equals("Empty"))
                System.out.println(customers.get(i).CustomerName);
        }


    }

    /**
     *  Method takes packets and change packet's status according to track number
     * @param packets ArrayList packets.
     */
    public void ChangeStatusByBranchEmployee(ArrayList<PacketInfo> packets){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The List of Packet's tracking numbers : ");
        for(int i=0 ; i<packets.size() ; i++){
            System.out.println(packets.get(i).trackNumber);
        }
        System.out.println("Please Enter the tracking Number");
        int theTrackNumber = scanner.nextInt();
        boolean flag = false;

        for(int i=0 ; i<packets.size() ; i++){
            if(packets.get(i).trackNumber == theTrackNumber ){
                flag = true;
                System.out.println("Packet Found");
                System.out.println("If the package reached the branch Please Enter 1");
                System.out.println("if the package has left the branch , Please Enter 2");
                int select = scanner.nextInt();
                if(select == 1){
                    packets.get(i).Status = "On the Branch";
                    System.out.println("Packet with tracking number " + packets.get(i).trackNumber +" " + packets.get(i).Status);
                }
                else{
                    packets.get(i).Status = "Left from Branch";
                    System.out.println("Packet with tracking number " + packets.get(i).trackNumber +" " + packets.get(i).Status);
                }
            }
        }

        if(!flag){
            System.out.println("Packet not found . Invalid Tracking Number");
        }

    }

    /**
     * This method changes the packet's current status using inheritance.
     */
    public void StatusCheck(){
        Status = "On the Branch";
    }





}
