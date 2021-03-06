import java.util.ArrayList;
import java.util.Scanner;


public interface ICargoCompany {

    /**
     * This function prints Transportation Personnel Id list.
     */
    void ShowTransportationPersonnelIDList();

    /**
     * This function prints Branch list
     */
    void ShowBranchesList();

    /**
     * This function prints Branch Employee list
     */
    void ShowBranchEmployeesList();

    /**
     * This function changes current status the packet using Transportation Personnel method.
     */
    void UpdateStatus();

    /**
     * This function prints Packet's information using Packet method
     */
    void GetInfo();

    /**
     *  This function add new Branch using Admin function
     */
    void AddNewBranch();

    /**
     * This function remove Branch using Admin function
     */
    void RemoveBranch();

    /**
     * This function add Branch Employee using Admin function
     */
    void RemoveBranchEmployee();

    /**
     * This function add Branch Employee using Admin function
     */
    void AddBranchEmployee();

    /**
     * This function remove Customer using Branch Employee function
     */
    void RemoveCustomer();

    /**
     * This function changes Packet's current status using Branch Employee function
     */
    void ChangeStatusByBranchEmployee();

    /**
     * Add new Transportation Personnel to Transportation Personnel ID list
     */
    void AddTransportationPersonnel();
    /**
     * Remove Transportation Personnel to Transportation Personnel ID list
     */
    void RemoveTransportationPersonnel();

}
