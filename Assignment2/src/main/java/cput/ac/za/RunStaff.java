package cput.ac.za;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class RunStaff {

    public static void main(String[] args){

        // Creating Objects
        Staff staff1 = new Staff(100);
        Staff staff2 = new Staff(101);
        Staff staff3 = new Staff(102);
        Staff staff4 = new Staff(103);

        //ArrayList
        List listStaff = new ArrayList();
        listStaff.add(staff1);
        listStaff.add(staff2);
        listStaff.add(staff3);
        System.out.print("*****Calling using List :*****\n");
        for(int i=0;i<listStaff.size();i++){
            String staffInfo = listStaff.get(i).toString();
            System.out.println(staffInfo);
        }

        //Only Objects from Staff Class Can Be Added
        Collection<Staff> staffCollection = new HashSet<Staff>();

        staffCollection.add(staff4);
        staffCollection.add(staff3);

        System.out.println("*****Calling using Collection and set*****\n" + staffCollection);

        //Using HashMap
        Map mapStaff = new HashMap();
        mapStaff.put("set1", staff1);
        mapStaff.put("set2", staff3);
        mapStaff.put("set3", staff4);

        System.out.println("*****Calling using HashMap*****");

        Object staffInfo = (Object) mapStaff.get("set1");
        System.out.println("Calling from set1 : \n" + staffInfo);

        staffInfo = (Object) mapStaff.get("set2");
        System.out.println("Calling from set2 : \n" + staffInfo);

        staffInfo = (Object) mapStaff.get("set3");
        System.out.println("Calling from set3 : \n" + staffInfo);

    }
}
