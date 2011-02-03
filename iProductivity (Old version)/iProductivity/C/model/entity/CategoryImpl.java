/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model.entity;

/**
 *
 * @author javidgon
 */
public class CategoryImpl implements Category{

    private int id;
    private String name;

    public CategoryImpl(int id, String name){

        this.setId(id);
        this.setName(name);

    }

    public CategoryImpl(int id){

        this.setId(id);

    }

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




}
