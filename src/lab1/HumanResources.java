/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author tpronschinske
 */
public class HumanResources {
    
    private boolean empInterview;
    private boolean empSearch;
    private boolean empResume;
    private boolean empContacted;
    private boolean hireProcess;

    public void humanResourcesEmployeeFile(){
        recieveResume();
        employeeSearch();
        contactPossibleEmployee();
        employeeInterview();      
    }
    
    
     private void employeeSearch(){
        empSearch = true;
    }
    
    private void recieveResume(){
     if(empSearch) {
            empResume = true;
        } else {
            System.out.println("Sorry, you cannot meet with HR");
        }
    }
   
    
    private void contactPossibleEmployee(){
        if(empSearch && empResume){
            empContacted = true;
        }else {
            System.out.println("Sorry, you cannot meet with HR");
        }
    }
    
    private void employeeInterview(){
        if(empSearch && empResume && empContacted){
            hireProcess(hireProcess);
        }
            
    }
    
    
    
}
