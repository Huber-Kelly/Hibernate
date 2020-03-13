/* This program is a part of a simple hibernate example used for CIT-360
   It is written by Troy Tuckett.  BYUI.EDU
 */
package edu.byui.tuckett.hibernatetest;

//comes from hibernate list of jars in build path
import javax.persistence.*;

/** This Data Object class corresponds with customer table
 *  in database. */

// Tells hibernate that this class relates to the table "customer"
@Entity
@Table(name = "customer")
public class Customer {

    /** id is an identity type field in the database and the primary key */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //this field relates to the "id" field
    @Column(name = "id")
    private int id; //don't have to name the class variables the same as the table variables but makes it easier
    //this field relates to the "name" field
    @Column(name = "name")
    private String name;
    //this feild relates to the "address" field
    @Column(name = "address")
    private String address;
    //this field relates to the "phone" field
    @Column(name = "phone")
    private String phone;

    //generate getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return Integer.toString(id) + " " + name + " " + address + " " + phone;
    }
}

