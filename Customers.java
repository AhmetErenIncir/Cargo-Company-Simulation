public class Customers  {

    protected String Name;
    protected String SurName;

    /**
     * No argument constructor
     */
    Customers(){
        Name = "Empty";
        SurName = "Empty";
    }

    /**
     *
     * @param theName name of customer
     * @param theSurname surname of customer
     */
    Customers(String theName , String theSurname){
        Name = theName;
        SurName = theSurname;
    }

    /**
     * This method gives information about packet to Customer
     * @param p
     */
    public void show_status(Packets p){

        System.out.println("Sender Name : " + p.SenderName);
        System.out.println("Sender Surname : " + p.SenderSurname);
        System.out.println("Sender Address : " + p.SenderAddress);
        System.out.println("Packets's current status : " + p.Status);

    }

}
