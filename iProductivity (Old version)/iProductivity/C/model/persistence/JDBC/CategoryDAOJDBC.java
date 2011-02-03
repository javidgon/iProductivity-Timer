// Clase DAO JDBC de MVC en JAVA.
package model.persistence.JDBC;

import java.util.*;
import java.sql.*;
import model.entity.Category;
import model.entity.CategoryImpl;
import model.persistence.CategoryDAO;


public class CategoryDAOJDBC implements CategoryDAO {

    public void create(Category entidad) {
        String SQL = "Insert into category (Id, Name) values(?, ?)";
        try {
            PreparedStatement p = (PreparedStatement) Persistence.createConnection().prepareStatement(SQL);
            p.setInt(1, entidad.getId());
            p.setString(2, entidad.getName());
            p.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            Persistence.closeConnection();
        }
    }

    public Category read(String pk){
        System.out.println("Entra");
        Category category = null;
        String SQL = "SELECT * FROM category where Id=?";
        try {
            PreparedStatement p = (PreparedStatement) Persistence.createConnection().prepareStatement(SQL);
            p.setInt(1, Integer.parseInt(pk));
            ResultSet res = p.executeQuery();
            int id;
            String name;
            if (res.next()) {
                id=res.getInt("Id");
                name = res.getString("Name");
                category = new CategoryImpl(id,name);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            Persistence.closeConnection();
        }
        return category;
    }

    public void update(Category entidad) {
        String sql = "UPDATE category SET Name = ? WHERE ID LIKE ?";
        try {
            PreparedStatement ps = (PreparedStatement) Persistence.createConnection().prepareStatement(sql);
            ps.setString(1, entidad.getName());
            ps.setInt(2, entidad.getId());
            ps.executeUpdate();
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        finally {
            Persistence.closeConnection();
        }
    }

    public void delete(Category entidad) {
        String sql = "DELETE FROM category WHERE Name = ?";
        try {
            PreparedStatement ps = Persistence.createConnection().prepareStatement(sql);
            ps.setString(1, entidad.getName());
            ps.execute();
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        finally {
            Persistence.closeConnection();
        }
    }

    public List<Category> list() {
        List<Category> users = new ArrayList<Category>();
        try {
            Statement s = Persistence.createConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM category");
            int id;
            String name;
            while(rs.next()) {
                id = rs.getInt("Id");
                name = rs.getString("Name");
                users.add(new CategoryImpl(id,name));
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        finally {
            Persistence.closeConnection();
        }
        return users;
    }

    public void done(Category entidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Category> list(String Serializable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Category> listDone(String Serializable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}