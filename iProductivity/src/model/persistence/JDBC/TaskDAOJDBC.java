/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model.persistence.JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.entity.Task;
import model.entity.TaskImpl;
import model.persistence.TaskDAO;

/**
 *
 * @author javidgon
 */
public class TaskDAOJDBC implements TaskDAO{

    // Implementación de los métodos DAO para JDBC.


    // Métodos compartidos.

 public void create(Task entidad) {
        String SQL = "Insert into task (Description, Type, Creation_date, Done, Time) values(?,?,?,?,?)";
        try {
            PreparedStatement p = (PreparedStatement) Persistence.createConnection().prepareStatement(SQL);
            p.setString(1, entidad.getDescription());
            p.setString(2, entidad.getType());
            p.setString(3, entidad.getCreation_date());
            p.setString(4, entidad.getDone());
            p.setString(5, entidad.getValue());
            p.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            Persistence.closeConnection();
        }
    }

    public Task read(String pk) {
        Task Task = null;
        String SQL = "SELECT * FROM task where Description=?";
        try {
            PreparedStatement p = (PreparedStatement) Persistence.createConnection().prepareStatement(SQL);
            p.setString(1, pk);
            ResultSet res = p.executeQuery();
            String description, type,creation_date,value;
            if (res.next()) {
                description=res.getString("Description");
                type = res.getString("Type");
                creation_date = res.getString("Creation_date");
                value = res.getString("Time");
                Task = new TaskImpl(description, type,creation_date,value);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            Persistence.closeConnection();
        }
        return Task;
    }

    public void update(Task entidad) {
        String sql = "UPDATE task SET Type = ?, Time = ? WHERE Description = ?";
        try {
            PreparedStatement ps = (PreparedStatement) Persistence.createConnection().prepareStatement(sql);
            ps.setString(1, entidad.getType());
            ps.setString(2, entidad.getValue());
            ps.setString(3, entidad.getDescription());
            ps.executeUpdate();
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        finally {
            Persistence.closeConnection();
        }
    }


    public void delete(Task entidad) {
        String sql = "DELETE FROM task WHERE Description = ?";
        try {
            PreparedStatement ps = Persistence.createConnection().prepareStatement(sql);
            ps.setString(1, entidad.getDescription());
            ps.execute();
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        finally {
            Persistence.closeConnection();
        }
    }

        public List<Task> list() {
        List<Task> tasks = new ArrayList<Task>();
        try {
            java.sql.Statement s = Persistence.createConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM task WHERE done = 0");
            String description, type,creation_date,time;
            while(rs.next()) {
                description = rs.getString("Description");
                type = rs.getString("Type");
                creation_date = rs.getString("Creation_date");
                time = rs.getString("Time");
                tasks.add(new TaskImpl(description, type,creation_date,time));
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        finally {
            Persistence.closeConnection();
        }
        return tasks;
    }


  // Hasta aquí los métodos compartidos.

  // Métodos específicos.

        public void done(Task entidad) {
        String sql = "UPDATE task SET Done = ? WHERE Description = ?";
        try {
            PreparedStatement ps = (PreparedStatement) Persistence.createConnection().prepareStatement(sql);
            ps.setString(1, "1");
            ps.setString(2, entidad.getDescription());
            ps.executeUpdate();
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        finally {
            Persistence.closeConnection();
        }
    }


    public List<Task> listDone() {
        Task task = null;
        List<Task> tasks = new ArrayList<Task>();
       String SQL = "SELECT * FROM task where done = ?";
        try {
            PreparedStatement p = (PreparedStatement) Persistence.createConnection().prepareStatement(SQL);
            p.setString(1, "1");
            ResultSet res = p.executeQuery();
            String description, type,creation_date,value;
            while(res.next()) {
                description=res.getString("Description");
                type = res.getString("Type");
                creation_date = res.getString("Creation_date");
                value = res.getString("Time");
                task = new TaskImpl(description, type,creation_date,value);
                tasks.add(task);
            }
            }
        catch(SQLException e) {
            System.out.println(e);
        }
        finally {
            Persistence.closeConnection();
        }
        return tasks;
    }

    // Métodos de las categorías.

    public String readCategory(String id) {
        String SQL = "SELECT name FROM category where id=?";
        String name = null;
        try {
            PreparedStatement p = (PreparedStatement) Persistence.createConnection().prepareStatement(SQL);
            p.setInt(1, Integer.valueOf(id));
            ResultSet res = p.executeQuery();
            if (res.next()) {
                name=res.getString("Name");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            Persistence.closeConnection();
        }
        return name;
    }

    public List<String> listCategories() {
        List categories = new ArrayList();
       String SQL = "SELECT name FROM category";
        try {
            PreparedStatement p = (PreparedStatement) Persistence.createConnection().prepareStatement(SQL);
            ResultSet res = p.executeQuery();
            String name;
            while(res.next()) {
                name=res.getString("Name");
                categories.add(name);
            }
            }
        catch(SQLException e) {
            System.out.println(e);
        }
        finally {
            Persistence.closeConnection();
        }
        return categories;
    }

    public void updateCategory(String id, String name) {
        String sql = "UPDATE category SET Name = ? WHERE Id = ?";
        try {
            PreparedStatement ps = (PreparedStatement) Persistence.createConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, Integer.valueOf(id));
            ps.executeUpdate();
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        finally {
            Persistence.closeConnection();
        }
    }


}
