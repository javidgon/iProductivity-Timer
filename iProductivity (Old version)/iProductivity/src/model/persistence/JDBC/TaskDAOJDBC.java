/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model.persistence.JDBC;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.entity.Task;
import model.entity.TaskImpl;
import model.persistence.TaskDAO;

/**
 *
 * @author javidgon
 */
public class TaskDAOJDBC implements TaskDAO{
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

    public boolean createWithoutDeadline(Task entidad) {
        boolean create = false;
        String SQL = "Insert into task (Description, Type) values(?, ?)";
        try {
            PreparedStatement p = (PreparedStatement) Persistence.createConnection().prepareStatement(SQL);
            p.setString(1, entidad.getDescription());
            p.setString(2, entidad.getType());
            p.executeUpdate();
            create = true;
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            Persistence.closeConnection();
        }
        return create;
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
                Task = new TaskImpl(description, type,creation_date);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            Persistence.closeConnection();
        }
        return Task;
    }

    public void update(Task entidad) {
        String sql = "UPDATE task SET Description = ?, Type = ?, Time = ? WHERE Description = ?";
        try {
            PreparedStatement ps = (PreparedStatement) Persistence.createConnection().prepareStatement(sql);
            ps.setString(1, entidad.getDescription());
            ps.setString(2, entidad.getType());
            ps.setString(3, entidad.getValue());
            ps.setString(4, entidad.getDescription());
            ps.executeUpdate();
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        finally {
            Persistence.closeConnection();
        }
    }

        public void done(Task entidad) {
        String sql = "UPDATE task SET Done = ?, Type = ? WHERE Description = ?";
        try {
            PreparedStatement ps = (PreparedStatement) Persistence.createConnection().prepareStatement(sql);
            ps.setString(1, "1");
            ps.setString(2, "");
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

    public List<Task> list(String filterType) {
        Task task = null;
        List<Task> tasks = new ArrayList<Task>();
       String SQL = "SELECT * FROM task where Type=?";
        try {
             PreparedStatement p = (PreparedStatement) Persistence.createConnection().prepareStatement(SQL);
            p.setString(1, filterType);
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

    public List<Task> listDone(String i) {
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
                task = new TaskImpl(description, type,creation_date);
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
    public List<Task> list() {
        List<Task> tasks = new ArrayList<Task>();
        try {
            java.sql.Statement s = Persistence.createConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM task");
            String description, type,creation_date;
            while(rs.next()) {
                description = rs.getString("Description");
                type = rs.getString("Type");
                creation_date = rs.getString("Creation_date");
                tasks.add(new TaskImpl(description, type,creation_date));
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
