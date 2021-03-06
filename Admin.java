import java.util.ArrayList;
import java.util.Scanner;


public class Admin {

    protected  ArrayList<Branches> branches = new ArrayList<>();
    protected  ArrayList<TransportationPersonnel> transportationPersonnel = new ArrayList<>();

    /**
     * No argument constructor. It loads information for test.
     */
    Admin(){

        for (int i=0 ; i<4 ; i++){
            Branches br= new Branches();
            branches.add(br);
        }
        branches.get(0).BranchName = "Liverpool";
        branches.get(1).BranchName = "Manchester";
        branches.get(2).BranchName = "Bristol";
        branches.get(3).BranchName = "London";
        branches.get(0).branchesEmployee.get(0).name = "Kate";
        branches.get(0).branchesEmployee.get(1).name = "Harry";
        branches.get(0).branchesEmployee.get(2).name = "Jacob";
        branches.get(0).branchesEmployee.get(3).name = "Kyle";
        branches.get(1).branchesEmployee.get(0).name = "James";
        branches.get(1).branchesEmployee.get(1).name = "David";
        branches.get(1).branchesEmployee.get(2).name = "Ethan";
        branches.get(1).branchesEmployee.get(3).name = "Daniel";
        branches.get(2).branchesEmployee.get(0).name = "Ava";
        branches.get(2).branchesEmployee.get(1).name = "Lily";
        branches.get(3).branchesEmployee.get(0).name = "Victoria ";
        branches.get(3).branchesEmployee.get(1).name = "Mia";
        branches.get(0).packets.get(0).trackNumber = 485;
        branches.get(0).packets.get(0).ReceiverName = "Leo";
        branches.get(0).packets.get(0).ReceiverSurname = "Perry";
        branches.get(0).packets.get(0).ReceiverAddress = "49  Overtone Circle";
        branches.get(0).packets.get(0).SenderName = "Sophie";
        branches.get(0).packets.get(0).SenderSurname = "Tracy";
        branches.get(0).packets.get(0).SenderAddress = "38  Farburn Terrace";
        branches.get(0).packets.get(0).Status = "On the Way";
        branches.get(0).packets.get(1).trackNumber = 486;
        branches.get(0).packets.get(1).ReceiverName = "Archie ";
        branches.get(0).packets.get(1).ReceiverSurname = "Johnson";
        branches.get(0).packets.get(1).ReceiverAddress = "132  London Road";
        branches.get(0).packets.get(1).SenderName = "Henry ";
        branches.get(0).packets.get(1).SenderSurname = "Goddard";
        branches.get(0).packets.get(1).SenderAddress = "119  Brynglas Road";
        branches.get(0).packets.get(1).Status = "Was delivered";
        branches.get(0).packets.get(2).trackNumber = 487;
        branches.get(0).packets.get(2).ReceiverName = "Maya";
        branches.get(0).packets.get(2).ReceiverSurname = "Ali";
        branches.get(0).packets.get(2).ReceiverAddress = "57  Mill Lane";
        branches.get(0).packets.get(2).SenderName = "Corey";
        branches.get(0).packets.get(2).SenderSurname = "Marshall";
        branches.get(0).packets.get(2).SenderAddress = "59  Guild Street";
        branches.get(0).packets.get(2).Status = "On the Way";
        branches.get(1).packets.get(0).trackNumber = 588;
        branches.get(1).packets.get(0).ReceiverName = "Elliot";
        branches.get(1).packets.get(0).ReceiverSurname = "Hamilton";
        branches.get(1).packets.get(0).ReceiverAddress = "75  Bishop's Street";
        branches.get(1).packets.get(0).SenderName = "George";
        branches.get(1).packets.get(0).SenderSurname = "Baker";
        branches.get(1).packets.get(0).SenderAddress = "46  St Oars Road";
        branches.get(1).packets.get(0).Status = "On the Way";
        branches.get(1).packets.get(1).trackNumber = 589;
        branches.get(1).packets.get(1).ReceiverName = "Harrison ";
        branches.get(1).packets.get(1).ReceiverSurname = "Winter";
        branches.get(1).packets.get(1).ReceiverAddress = "76  Manor Close";
        branches.get(1).packets.get(1).SenderName = "Evan";
        branches.get(1).packets.get(1).SenderSurname = "Conway";
        branches.get(1).packets.get(1).SenderAddress = "103  Great North Road";
        branches.get(1).packets.get(1).Status = "Was delivered";
        branches.get(1).packets.get(2).trackNumber = 590;
        branches.get(1).packets.get(2).ReceiverName = "Maya";
        branches.get(1).packets.get(2).ReceiverSurname = "Doyle";
        branches.get(1).packets.get(2).ReceiverAddress = "51  Davids Lane";
        branches.get(1).packets.get(2).SenderName = "Dominic";
        branches.get(1).packets.get(2).SenderSurname = "Charlton";
        branches.get(1).packets.get(2).SenderAddress = "96  Shannon Way";
        branches.get(1).packets.get(2).Status = "On the Way";
        branches.get(2).packets.get(0).trackNumber = 605;
        branches.get(2).packets.get(0).ReceiverName = "David";
        branches.get(2).packets.get(0).ReceiverSurname = "Spencer";
        branches.get(2).packets.get(0).ReceiverAddress = "31  Consett Rd";
        branches.get(2).packets.get(0).SenderName = "Phoebe";
        branches.get(2).packets.get(0).SenderSurname = "Khan";
        branches.get(2).packets.get(0).SenderAddress = "39  Petworth Rd";
        branches.get(2).packets.get(0).Status = "Was delivered";
        branches.get(2).packets.get(1).trackNumber = 606;
        branches.get(2).packets.get(1).ReceiverName = "Aaliyah";
        branches.get(2).packets.get(1).ReceiverSurname = "Gray";
        branches.get(2).packets.get(1).ReceiverAddress = "115  Foregate Street";
        branches.get(2).packets.get(1).SenderName = "Poppy";
        branches.get(2).packets.get(1).SenderSurname = "Begum";
        branches.get(2).packets.get(1).SenderAddress = "135  Fulford Road";
        branches.get(2).packets.get(1).Status = "On the Way";
        branches.get(3).packets.get(0).trackNumber = 708;
        branches.get(3).packets.get(0).ReceiverName = "Victoria";
        branches.get(3).packets.get(0).ReceiverSurname = "Howell";
        branches.get(3).packets.get(0).ReceiverAddress = "74  Hart Road";
        branches.get(3).packets.get(0).SenderName = "Melissa";
        branches.get(3).packets.get(0).SenderSurname = "Barber";
        branches.get(3).packets.get(0).SenderAddress = "55  London Road";
        branches.get(3).packets.get(0).Status = "On the Way";
        branches.get(3).packets.get(1).trackNumber = 709;
        branches.get(3).packets.get(1).ReceiverName = "Alexander";
        branches.get(3).packets.get(1).ReceiverSurname = "Buckley";
        branches.get(3).packets.get(1).ReceiverAddress = "23  New Dover Rd";
        branches.get(3).packets.get(1).SenderName = "Cerys";
        branches.get(3).packets.get(1).SenderSurname = "Lowe";
        branches.get(3).packets.get(1).SenderAddress = "67  Brynglas Road";
        branches.get(3).packets.get(1).Status = "Was delivered";
        transportationPersonnel.add(new TransportationPersonnel(78));
        transportationPersonnel.add(new TransportationPersonnel(79));
        transportationPersonnel.add(new TransportationPersonnel(80));
    }


    /**
     * This method prints List of Transportation Personnel ID list.
     */
    public void ShowTransportationPersonnelIDList(){

        System.out.println("The ID list of TransportationPersonnel : ");
        for(int i=0 ; i<transportationPersonnel.size() ; i++){
            System.out.println(transportationPersonnel.get(i).TransportationPersonnelId);
        }

    }

    /**
     * This method prints List of branch .
     */
    public void ShowBranchesList(){

        for(int i=0 ; i<branches.size() ; i++){
            System.out.println(i+1 +" )"+branches.get(i).BranchName);
        }


    }
    /**
     * This method prints List of branch employees .
     */
    public void ShowBranchEmployeesList(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the Branch to see Branch's Employees ");
        ShowBranchesList();
        int BranchIndex = scanner.nextInt();
        branches.get(BranchIndex).ShowBranchEmployeesList();


    }
    /**
     * This method adds new branch to branches.
     */
    public void AddNewBranch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the new Branch name");
        String theBranchName = scanner.nextLine();
        branches.add(new Branches(theBranchName));

    }
    /**
     * This method removes the branch from branches.
     */
    public void RemoveBranch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the Branch to remove");
        ShowBranchesList();
        int BranchIndex = scanner.nextInt();
        branches.remove(BranchIndex-1);

    }
    /**
     * This method removes branch employee from branch employees.
     */
    public void RemoveBranchEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the Branch to see Branch's Employees ");
        ShowBranchesList();
        int BranchIndex = scanner.nextInt();
        System.out.println("The List of Employees the selected Branch : ");

        for (int i=0 ; i<branches.get(BranchIndex-1).branchesEmployee.size() ; i++){
            if(!branches.get(BranchIndex - 1).branchesEmployee.get(i).name.equals("empty"))
                System.out.println(branches.get(BranchIndex-1).branchesEmployee.get(i).name);
        }

        System.out.println("Please Enter the name to remove Branch Employee");
        String theName = scanner.next();
        boolean flag = false;
        int index = -1;
        for (int i=0 ; i<branches.get(BranchIndex-1).branchesEmployee.size() ; i++){
            if(branches.get(BranchIndex-1).branchesEmployee.get(i).name.equals(theName)){
                index = i;
                flag = true;
            }
        }
        if(flag){
            branches.get(BranchIndex-1).branchesEmployee.remove(index);
        }

        System.out.println("The employee list after the remove operation");
        for(int i=0 ; i<branches.get(BranchIndex-1).branchesEmployee.size() ; i++){
            if(!branches.get(BranchIndex-1).branchesEmployee.get(i).name.equals("empty"))
                System.out.println(branches.get(BranchIndex-1).branchesEmployee.get(i).name);
        }


    }
    /**
     * This method adds new branch employee to branch employees.
     */
    public void AddBranchEmployee(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select the Branch to Add new employee");
        ShowBranchesList();
        int index = scanner.nextInt();
        System.out.println("Please Enter the name to add new employee");
        String theEmployee = scanner.next();

        branches.get(index-1).branchesEmployee.add(new BranchesEmployee(theEmployee));

        System.out.println("The New Employee List after add operation");

        for(int i=0 ; i<branches.get(index-1).branchesEmployee.size() ; i++){
            if(!branches.get(index - 1).branchesEmployee.get(i).name.equals("empty"))
                System.out.println(branches.get(index-1).branchesEmployee.get(i).name);
        }



    }

    /**
     * This method adds new Transportation Personnel ID to Transportation Personnel ID List.
     */
    public void AddTransportationPersonnel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The ID List of Transportation Personnel before add operation");
        ShowTransportationPersonnelIDList();
        System.out.println();
        System.out.println("Please Enter the ID to add Transportation Personnel ID List ");
        int newID= scanner.nextInt();
        transportationPersonnel.add(new TransportationPersonnel(newID));
        System.out.println("The ID List of Transportation Personnel after add operation");
        System.out.println();
        ShowTransportationPersonnelIDList();

    }
    /**
     * This method removes the Transportation Personnel ID from Transportation Personnel ID List.
     */
    public void RemoveTransportationPersonnel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The ID List of Transportation Personnel before remove operation");
        ShowTransportationPersonnelIDList();
        System.out.println();
        System.out.println("Please Enter the ID to remove Transportation Personnel from ID List ");
        int theID= scanner.nextInt();
        boolean flag = false;
        for(int i=0 ; i<transportationPersonnel.size() ; i++){
            if(transportationPersonnel.get(i).TransportationPersonnelId == theID ){
                transportationPersonnel.remove(i);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Entered Id not found");
        }
        else {
            System.out.println("The ID List of Transportation Personnel after remove operation");
            System.out.println();
            ShowTransportationPersonnelIDList();
        }

    }



}
