package jdo;

import java.io.Serializable;

/**
 * Created by divyanathan on 31/10/17.
 */

public class EmployeeJDO implements Serializable{
    int Id;
    int Age;
    String Name;
    String Address;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
