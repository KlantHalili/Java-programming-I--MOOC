/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laloschjetnan
 */
public class Item {
//object instance variables

    String id;
    String name;

    //constructor
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
// specifies how the object should be printed

    public String toString() {
        return this.id + ": " + this.name;
    }

    //specific method to compare Archive objects, only returns true if the IDs match
    //name doesn't have to match
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedArchive = (Item) compared;

        if (this.id.equals(comparedArchive.id)) {
            return true;
        } else {
            return false;
        }
    }

}