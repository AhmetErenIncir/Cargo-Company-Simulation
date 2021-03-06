public class Administrators {


    private static String[] Branches = new String[5];
    private static TransportationPersonnel[] TransportationPersonnelList = new TransportationPersonnel[4];
    private static int BranchesNumber;
    private static int TransportationPersonnelNumber;

    static {
        Branches[0] = "London";
        Branches[1] = "Manchester";
        Branches[2] = "Bristol";
        BranchesNumber = 3;

    }

    static{
        TransportationPersonnelList[0] = new TransportationPersonnel(85);
        TransportationPersonnelList[1] = new TransportationPersonnel(88);
        TransportationPersonnelNumber = 2;
    }

    /**
     * This function adds new branch
     * @param NewBranch new branch
     */
    public static void AddBranch(String NewBranch){
        if(BranchesNumber < 5){
            Branches[BranchesNumber] = NewBranch;
            BranchesNumber++;
            System.out.println("New Branch " + NewBranch + " added");
        }
        else{
            System.out.println("The maximum number of branches has been reached. You can't add new branch");
        }
    }

    /**
     * Prints list of branches
     */
    public static void ShowBranches(){
        for(int i=0 ; i<BranchesNumber ; i++){
            System.out.println(Branches[i]);
        }

    }

    /**
     * Add new Transportation Personnel
     * @param NewId new Id
     */
    public static void AddTransportationPersonnel(int NewId){
        if(TransportationPersonnelNumber<5){
            TransportationPersonnelList[TransportationPersonnelNumber] = new TransportationPersonnel(NewId);
            TransportationPersonnelNumber++;
            System.out.println("New Transportation Personnel Added ID : )" + NewId);
        }
        else{
            System.out.println("The maximum number of TransportationPersonnel has been reached. You can't add new TransportationPersonnel");
        }
    }

    /**
     * Prints list of Transportation Personnel
     */
    public static void showTransportationPersonnelList(){
        System.out.println("The ID list of TransportationPersonnel : ");
        for (int i=0 ; i<TransportationPersonnelNumber ; i++){
            System.out.println(TransportationPersonnelList[i].TransportationPersonnelId);
        }
    }

    /**
     * This function removes Transportation Personnel from list
     * @param theId Id of Transportation Personnel
     */
    public static void RemoveTransportationPersonnel(int theId){
        int location = 0;
        boolean flag = false;
        for(int i=0 ; i<TransportationPersonnelNumber ; i++) {
            if(TransportationPersonnelList[i].TransportationPersonnelId == theId ) {
                flag  = true;
                break;
            }
            location++;
        }

        if(flag == true){
            for(int i=location ; i<TransportationPersonnelNumber-1 ; i++) {
                TransportationPersonnelList[i] = TransportationPersonnelList[i+1];
            }
            TransportationPersonnelNumber--;
            System.out.println(theId+ " Id"+" Personnel removed");
        }
        else {
            System.out.println("Entered Invalid ID");
        }


    }

    /**
     * Adds new branch
     * @param employees employees array
     * @param EmployeeNumber Employee Number
     * @param theName Employees name
     * @param theSurname Employees surname
     * @param theBranchID Employees Id
     */
    public static void AddNewBranchEmployee(BranchEmployee[] employees , int EmployeeNumber,String theName , String theSurname , int theBranchID){
        employees[EmployeeNumber] = new BranchEmployee(theName,theSurname,theBranchID);
    }

    public static void RemoveBranch(String RBranch){
        int location = 0;
        boolean flag = false;
        for(int i=0 ; i<BranchesNumber ; i++) {
            if(Branches[i].equals(RBranch)) {
                flag = true;
                System.out.println(RBranch + " deleted");
                break;
            }
            location++;
        }

        if(flag == true){
            for(int i=location ; i<BranchesNumber-1 ; i++) {
                Branches[i] = Branches[i+1];
            }
            BranchesNumber--;
        }
        else {
            System.out.println("Branch not found");
        }

    }

    /**
     * Removes branch Employee
     * @param employees employees array
     * @param location location of employee in list
     * @param BranchEmployeeNumber Number of branch employees
     */
    public static void RemoveBranchEmployee(BranchEmployee [] employees , int location , int BranchEmployeeNumber){

        for(int i=location ; i<BranchEmployeeNumber-1 ; i++) {
            employees[i] = employees[i+1];
        }

    }






}
