import java.util.ArrayList;
import java.util.Scanner;

public class CargoCompany implements ICargoCompany  {

    Admin adm = new Admin();
    TransportationPersonnel transportationPersonnel = new TransportationPersonnel();
    BranchesEmployee branchesEmployee = new BranchesEmployee();
    Customers customers = new Customers();



    @Override
    public void ShowTransportationPersonnelIDList() {
        adm.ShowTransportationPersonnelIDList();
    }

    @Override
    public void ShowBranchesList() {
        adm.ShowBranchesList();
    }

    @Override
    public void ShowBranchEmployeesList() {
        adm.ShowBranchEmployeesList();
    }

    @Override

    public void UpdateStatus() {
        Scanner scanner = new Scanner(System.in);
        String branchName;
        int branchIndex;
        boolean flag = false;
        System.out.println("The List of Branches");
        for(int i=0 ;i<adm.branches.size() ; i++){
            System.out.println(adm.branches.get(i).BranchName);
        }

        try{
            System.out.println("Please Enter the Branch Name");
            branchName = scanner.nextLine();
            for(int i=0 ; i<adm.branches.size() ; i++){
                if(branchName.equals(adm.branches.get(i).BranchName)){
                    branchIndex = i;
                    flag = true;
                    transportationPersonnel.UpdateStatus(adm.branches.get(branchIndex).packets);
                }
            }

            if(!flag){
                throw new Exception();
            }

        }catch (Exception e){
            System.out.println("Entered Invalid Branch Name");
        }


    }

    @Override
    public void GetInfo() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int theBranch ;
        System.out.println("Please Select the Branch to get information about your Packet");
        System.out.println("The Branch List : ");
        for(int i=0 ; i<adm.branches.size() ; i++){
            System.out.println( i+1 + ".)"+ adm.branches.get(i).BranchName);
        }
        theBranch = scanner.nextInt();
        System.out.println("The List of Packets tracking ID on Branch : ");



        for(int i=0 ; i<adm.branches.get(theBranch-1).packets.size() ; i++){
            if(adm.branches.get(theBranch-1).packets.get(i).trackNumber !=0)
                System.out.println(adm.branches.get(theBranch-1).packets.get(i).trackNumber);
        }

        int trackNumber = scanner.nextInt();

        customers.GetInfo(adm.branches.get(theBranch-1).packets,trackNumber);




    }

    @Override
    public void AddNewBranch() {
        adm.AddNewBranch();
    }

    @Override
    public void RemoveBranch() {
        adm.RemoveBranch();
    }

    @Override
    public void RemoveBranchEmployee() {
        adm.RemoveBranchEmployee();

    }

    @Override
    public void AddBranchEmployee() {
        adm.AddBranchEmployee();
    }

    @Override
    public void RemoveCustomer() {
        adm.branches.get(0).branchesEmployee.get(0).RemoveCustomer();
    }

    @Override
    public void ChangeStatusByBranchEmployee() {
        adm.branches.get(0).branchesEmployee.get(0).ChangeStatusByBranchEmployee(adm.branches.get(0).packets);
    }

    @Override
    public void AddTransportationPersonnel() {
        adm.AddTransportationPersonnel();
    }

    @Override
    public void RemoveTransportationPersonnel() {
        adm.RemoveTransportationPersonnel();
    }


}
