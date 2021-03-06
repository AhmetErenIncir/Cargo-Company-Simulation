import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        CargoCompany company = new CargoCompany();

        int selection;
        System.out.println("Please Enter the tracking Number to see your packet details");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter 1 to test Admin operations");
        System.out.println("Enter 2 to test Branch Employee operations");
        System.out.println("Enter 3 to test TransportationPersonnel operations");
        System.out.println("Enter 4 to test Customer operations");
        System.out.println("Enter 5 to exit");

        selection = scanner.nextInt();

        do{

            if(selection == 1){
                System.out.println("Started tests of Admin operations");

                System.out.println("Testing Add New Branch");
                System.out.println("The Branch List : ");
                CargoCompany.ShowBranchList();
                System.out.println("Enter the name of new Branch");
                String newBranch = scanner.next();
                CargoCompany.AddNewBranch(newBranch);
                System.out.println("The Branch List : ");
                CargoCompany.ShowBranchList();

                System.out.println();

                System.out.println("Testing Remove Branch");
                System.out.println("The Branch List : ");
                CargoCompany.ShowBranchList();
                System.out.println("Enter the name of the branch to remove it");
                String deletedBranch = scanner.next();
                CargoCompany.RemoveBranch(deletedBranch);
                System.out.println("The Branch List : ");
                CargoCompany.ShowBranchList();

                System.out.println();

                System.out.println("Testing Add new branch employee");
                System.out.println("The Branch Employee List : ");
                CargoCompany.ShowBranchEmployeeList();
                System.out.println("Enter the name new employee");
                String BranchEmpName = scanner.next();
                System.out.println("Enter the surname new employee");
                String BranchEmpSurname = scanner.next();
                System.out.println("Enter the branchId new employee");
                int BranchId = scanner.nextInt();
                CargoCompany.AddNewBranchEmployee(BranchEmpName,BranchEmpSurname,BranchId);
                System.out.println("The Branch Employee List : ");
                CargoCompany.ShowBranchEmployeeList();

                System.out.println();

                System.out.println("Testing Remove branch employee");
                System.out.println("The Branch Employee List : ");
                CargoCompany.ShowBranchEmployeeList();
                System.out.println("Please Enter in which row the employee to be deleted");
                int loc = scanner.nextInt();
                CargoCompany.RemoveBranchEmployee(loc-1);
                System.out.println("The Branch Employee List : ");
                CargoCompany.ShowBranchEmployeeList();

                System.out.println();

                System.out.println("Testing Add new Transportation Personnel");
                System.out.println("The Transportation Personnel ID List : ");
                CargoCompany.ShowTransportationPersonnelList();
                System.out.println("Please Enter the Id to Add new Transportation Personnel ");
                int transporterId = scanner.nextInt();
                CargoCompany.AddTransportationPersonnel(transporterId);
                System.out.println("The Transportation Personnel ID List : ");
                CargoCompany.ShowTransportationPersonnelList();

                System.out.println();

                System.out.println("Testing Remove the Transportation Personnel");
                System.out.println("The Transportation Personnel ID List : ");
                CargoCompany.ShowTransportationPersonnelList();
                System.out.println("Please Enter the Transportation Personnel Id to remove");
                transporterId = scanner.nextInt();
                CargoCompany.RemoveTransportationPersonnel(transporterId);
                System.out.println("The Transportation Personnel ID List : ");
                CargoCompany.ShowTransportationPersonnelList();

            }
            else if (selection == 2){

                System.out.println("Started tests of Branch Employee operations");

                System.out.println("Testing Remove User Method");
                System.out.println("The list of users : ");
                CargoCompany.ShowUserList();
                System.out.println("Please Enter User name to remove");
                String UserName = scanner.next();
                System.out.println("Please Enter User  Surname to remove");
                String UserSurname = scanner.next();
                CargoCompany.RemoveCustomer(UserName,UserSurname);
                System.out.println("The list of users : ");
                CargoCompany.ShowUserList();

                System.out.println();

                System.out.println("Testing change information of about the shipments");
                System.out.println("The list of Packet's Tracking Numbers : ");
                CargoCompany.ShowPacketsTrackingNumbers();
                CargoCompany.ModifyPacket();


            }
            else if (selection == 3){
                System.out.println("Started tests of Transportation Personnel");
                System.out.println("Testing Change status method");
                System.out.println("Cargo Tracking Number List : ");
                CargoCompany.ShowPacketsTrackingNumbers();
                CargoCompany.UpdateStatus();
            }
            else if (selection == 4){
                System.out.println("Started tests of Customer operations");
                System.out.println("Test of method of fetching information about cargo");
                System.out.println("Cargo Tracking Number List : ");
                CargoCompany.ShowPacketsTrackingNumbers();
                CargoCompany.showStatus();
            }
            else{
                System.out.println("Invalid Choice! Please try again");
            }
            System.out.println();
            System.out.println("Enter 1 to test Admin operations");
            System.out.println("Enter 2 to test Branch Employee operations");
            System.out.println("Enter 3 to test TransportationPersonnel operations");
            System.out.println("Enter 4 to test Customer operations");
            System.out.println("Enter 5 to exit");
            selection = scanner.nextInt();

        }while(selection != 5);


    }

}
