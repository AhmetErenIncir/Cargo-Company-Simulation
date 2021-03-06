import java.util.Scanner;
public class BranchEmployee {

    protected static Customers[] CustomerList  = new Customers[5];
    protected  int BranchId;
    protected  String Name;
    protected  String Surname;
    private static int CustomerNumber;

    /**
     * No argument constructor
     */
    BranchEmployee(){
        Name = "empty";
        Surname = "empty";
        BranchId = 0;
    }

    /**
     * 3 arguments constructor
     * @param theName Employee Name
     * @param theSurname Employee Surname
     * @param theBranchId Employee BranchId
     */
    BranchEmployee(String theName , String theSurname , int theBranchId){
        Name = theName;
        Surname = theSurname;
        BranchId = theBranchId;
    }

    static {
        CustomerList[0] = new Customers("Emily" ,"Joanne");
        CustomerList[1] = new Customers("Ava" ,"Jones");
        CustomerList[2] = new Customers("Davis" ,"Walsh");
        CustomerNumber = 3;
    }


    /**
     * It prints the list of Customer
     */
    public static void ShowCustomerList(){
        for (int i=0 ; i<CustomerNumber ; i++){
            System.out.println(CustomerList[i].Name +" "+CustomerList[i].SurName);
        }
    }

    /**
     * this method add new customer to list.
     * @param theName customer name
     * @param theSurname customer surname
     */
    public static void AddNewCustomer(String theName , String theSurname){
        if(CustomerNumber < 5){
            CustomerList[CustomerNumber] = new Customers(theName,theSurname);
            CustomerNumber++;
        }
        else{
            System.out.println("The maximum number of Customer has been reached. You can't add new Customer");
        }
    }

    /**
     * This method remove the Customer from list.
     * @param theName customer name
     * @param theSurname customer surname
     */
    public static void RemoveCustomer(String theName , String theSurname){
        int location = 0;
        boolean flag = false;
        for(int i=0 ; i<CustomerNumber ; i++) {
            if(CustomerList[i].Name.equals(theName) && CustomerList[i].SurName.equals(theSurname)) {
                flag = true;
                break;
            }
            location++;
        }
        if(flag == true){
            for(int i=location ; i<CustomerNumber-1 ; i++) {
                CustomerList[i] = CustomerList[i+1];
            }
            CustomerNumber--;
            System.out.println("User Removed");
        }
        else {
            System.out.println("User not found");
        }

    }

    /**
     * this method modify the packets current status.
     * @param p packet object
     */
    public static void ModifyPacket(Packets p){
        Scanner scanner = new Scanner(System.in);
        System.out.println("If package reaches the branch , Please enter 1");
        System.out.println("If package leaves the branch , Please enter 2");
        int sel = scanner.nextInt();
        if(sel == 1){
            p.Status = "Package at the branch";
            System.out.println("Packet's status changed as 'at the branch' ");
        }
        else if(sel == 2){
            p.Status = "Package left from branch";
            System.out.println("Packet's status changed as 'left from branch' ");
        }
        else{
            System.out.println("Wrong Selection");
        }


    }










}
