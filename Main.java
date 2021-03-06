import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ICargoCompany CargoCompany = new CargoCompany();
        Scanner scanner = new Scanner(System.in);

        int selection;
        System.out.println("Enter 1 to test Admin operations");
        System.out.println("Enter 2 to test Branch Employee operations");
        System.out.println("Enter 3 to test Transportation Personnel operations");
        System.out.println("Enter 4 to test Customer operations");
        System.out.println("Enter 5 to exit");
        selection = scanner.nextInt();

        do{

            if(selection ==1){

                System.out.println("Started tests of Admin operations");

                System.out.println("Testing Add New Branch");
                System.out.println("The Branch List Before Operation: ");
                CargoCompany.ShowBranchesList();
                CargoCompany.AddNewBranch();
                System.out.println("The Branch List After Addition operation : ");
                CargoCompany.ShowBranchesList();

                System.out.println();

                System.out.println("Testing Remove Branch");
                CargoCompany.RemoveBranch();
                System.out.println("The Branch List After Remove operation : ");
                CargoCompany.ShowBranchesList();

                System.out.println();

                System.out.println("Testing Add Branch Employee");
                CargoCompany.AddBranchEmployee();

                System.out.println();

                System.out.println("Testing Remove Branch Employee");
                CargoCompany.RemoveBranchEmployee();

                System.out.println();

                System.out.println("Testing Add New Transportation Personnel");
                CargoCompany.AddTransportationPersonnel();

                System.out.println("Testing Remove the Transportation Personnel");
                CargoCompany.RemoveTransportationPersonnel();


            }

            else if(selection ==2){
                System.out.println("Started tests of Branch Employee operations");

                System.out.println("Testing Remove User Method");
                CargoCompany.RemoveCustomer();

                System.out.println("");

                System.out.println("Testing change information of about the shipments");
                CargoCompany.ChangeStatusByBranchEmployee();

            }

            else if(selection == 3){
                System.out.println("Started tests of Transportation Personnel");
                System.out.println("Testing Change status method");
                CargoCompany.UpdateStatus();
            }

            else if(selection == 4){
                System.out.println("Started tests of Customer operations");
                System.out.println("Test of method of fetching information about cargo");
                CargoCompany.GetInfo();
                System.out.println();
            }
            else{
                System.out.println("Invalid Choice! Please try again");
            }

            System.out.println("Enter 1 to test Admin operations");
            System.out.println("Enter 2 to test Branch Employee operations");
            System.out.println("Enter 3 to test Transportation Personnel operations");
            System.out.println("Enter 4 to test Customer operations");
            System.out.println("Enter 5 to exit");
            selection = scanner.nextInt();

        }while(selection != 5);



    }

}
