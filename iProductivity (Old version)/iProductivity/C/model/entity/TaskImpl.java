/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author javidgon
 */
public class TaskImpl implements Task{

    private String description;
    private String type;
    private String creation_date;
    private String done;
    private String value;

    DateFormat dateFormat = null;
    Date date = null;
   public TaskImpl(String description, String type,String value){

    this.setDescription(description);
    this.setType(type);
    this.setDone("0");
    this.setValue(value);
    date = new Date();
    dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    this.creation_date = dateFormat.format(date);

   }
     public TaskImpl(String description, String type, String creation_date, String value){

    this.setDescription(description);
    this.setType(type);
    this.creation_date = creation_date;
    this.value = value;

   }
   public TaskImpl(String description){

    this.setDescription(description);

   }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TaskImpl other = (TaskImpl) obj;
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.description != null ? this.description.hashCode() : 0);
        return hash;
    }

 





}
