/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model.entity;



/**
 *
 * @author javidgon
 */
public interface Task extends Entidad{

    public String getDescription();

    public void setDescription(String description);

    public String getType();

    public void setType(String type);

    public String getCreation_date();

    public void setCreation_date(String creation_date);

    public String getDone();

    public void setDone(String i);

    public String getValue();

    public void setValue(String value);
}
