import java.util.Scanner;
public class CargoCompany {

    private static BranchEmployee[] branchEmployee = new BranchEmployee[5];
    private static Packets[] packets = new Packets[3];
    private static TransportationPersonnel transportationPersonnel = new TransportationPersonnel();
    private static Administrators administrators = new Administrators();
    private static Customers customers = new Customers();
    private static int branchEmployeeNumber = 3;
    private static int packetNumber;


    static {

        // Instantiating the objects present in the array
        packets[0] = new Packets("Blake", "Beverly", "14 Tottenham Court Road", "Hollis", "Harper", "91 Western Road", "On the road", 458, 15);
        packets[1] = new Packets("Hunter", "Lee", "44-46 Morningside Road", "Lindsay", "Shelby", "The Business Centre", "Was delivered", 459, 17);
        packets[2] = new Packets("Sherlock", "Holmes", "221B Baker Street", "John", "Watson", "3 Edgar Buildings", "On the road", 460, 28);
        packetNumber = 3;
        branchEmployee[0] = new BranchEmployee("John","Liam",15);
        branchEmployee[1] = new BranchEmployee("Jacob","Mason",78);
        branchEmployee[2]  = new BranchEmployee("Oscar","Rhys",89);
    }


    /**
     * showStatus method provides to get information about packet's current information using customers 's show_status method.
     * You need to enter the Tracking Number to show packet information.
     */
    public static void showStatus(){
       System.out.println("Please Enter the tracking Number to see your packet details");
       Scanner scanner = new Scanner(System.in);
       int TrackingNumber = scanner.nextInt();
       boolean flag =  false;
        for (Packets packet : packets) {
            if (packet.TrackingNumber == TrackingNumber) {
                customers.show_status(packet);
                flag = true;
            }
        }
       if(!flag){
           System.out.println("Invalid Tracking Number");
       }

    }

    /**
     *The Transportation Personel
     */
    public static void UpdateStatus(){
        System.out.println("Please Enter the delivered packet Tracking Number to change current status' packet");
        Scanner scanner = new Scanner(System.in);
        int TrackingNumber = scanner.nextInt();
        boolean flag = false;
        for (Packets packet : packets) {
            if (packet.TrackingNumber == TrackingNumber) {
                if(packet.Status.equals("Was delivered")){
                    System.out.println("Packet has already delivered");
                    flag = true;
                }
                else{
                    TransportationPersonnel.UpdateStatus(packet);
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("Invalid Tracking Number");
        }
    }

    /**
     * This method prints list of branches.
     */
    public  static void ShowBranchList(){
        Administrators.ShowBranches();
    }

    /**
     * Add new branches into branch list.
     * @param NewBranch
     */
    public static void AddNewBranch(String NewBranch){
        Administrators.AddBranch(NewBranch);
    }

    /**
     * Add new branch employee to list of branch employees.
     * @param theName Name of branch employee
     * @param theSurname Surname of branch employee
     * @param theBranchId Branch Id of branch employee
     */
    public static void AddNewBranchEmployee(String theName , String theSurname , int theBranchId){
        if(branchEmployeeNumber < 5){
            Administrators.AddNewBranchEmployee(branchEmployee,branchEmployeeNumber,theName,theSurname,theBranchId);
            branchEmployeeNumber++;
            System.out.println("New Branch Employee Added");
        }
        else{
            System.out.println("The maximum number of branches employee has been reached. You can't add new branch employee");
        }
    }

    /**
     * This methods prints List of Branch Employees.
     */
    public static void ShowBranchEmployeeList(){
        for(int i=0 ; i<branchEmployeeNumber ; i++){
            String str;

            str =  i+1 + ".)" + branchEmployee[i].Name + " " + branchEmployee[i].Surname + " " + branchEmployee[i].BranchId;

            System.out.println(str);
        }
    }

    /**
     * This method Remove Branch using administrators' Remove Branch method.
     * @param str branch name
     */
    public static void RemoveBranch(String str){
        administrators.RemoveBranch(str);
    }

    public static void RemoveBranchEmployee(int loc){
        if(loc < branchEmployeeNumber){
            administrators.RemoveBranchEmployee(branchEmployee,loc,branchEmployeeNumber);
            branchEmployeeNumber--;
        }
    }

    /**
     * This method remove Transportation Personnel from list
     * @param theId Personnel Id
     */
    public static void RemoveTransportationPersonnel(int theId){
        administrators.RemoveTransportationPersonnel(theId);
    }

    /**
     * This method adds new Transportation Personnel to list
     * @param newId new personnel ID
     */
    public static void AddTransportationPersonnel(int newId){
        administrators.AddTransportationPersonnel(newId);
    }

    /**
     * This method prints Transportation Personnel list
     */
    public static void ShowTransportationPersonnelList(){
        administrators.showTransportationPersonnelList();
    }

    /**
     * This method prints list of User.
     */
    public static void  ShowUserList(){
        BranchEmployee.ShowCustomerList();
    }

    /**
     * This method Add new Customer to Customer list.
     * @param theName Customer name
     * @param theSurname Customer Surname
     */
    public static void AddNewCustomer(String theName , String theSurname){
        branchEmployee[0].AddNewCustomer(theName,theSurname);
    }

    /**
     * this method remove the Customer from list.
     * @param theName customer name
     * @param theSurname customer surname
     */
    public static void RemoveCustomer(String theName , String theSurname){
        branchEmployee[0].RemoveCustomer(theName,theSurname);
    }

    /**
     * This method Change the current status of packet using branch employee's special method.
     */
    public static void ModifyPacket(){

        System.out.println("Please Enter the packet Tracking Number to change current status' packet");
        Scanner scanner = new Scanner(System.in);
        int TrackingNumber = scanner.nextInt();
        boolean flag = false;
        for (int i=0 ; i<packetNumber ; i++) {
            if(packets[i].TrackingNumber == TrackingNumber){
                System.out.println(branchEmployee[0].BranchId);
                branchEmployee[0].ModifyPacket(packets[i]);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Invalid Tracking Number");
        }

    }

    /**
     * This method prints list of Packets tracking numbers.
     */
    public static void ShowPacketsTrackingNumbers(){
        for(int i=0 ; i<packetNumber ; i++){
            System.out.println(packets[i].TrackingNumber);
        }
    }



}
