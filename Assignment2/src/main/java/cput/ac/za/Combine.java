package cput.ac.za;

public class Combine implements NameAndSurname {
    @Override
    public String combineName(String name, String surname){
        return name + " " + surname;
    }
}
