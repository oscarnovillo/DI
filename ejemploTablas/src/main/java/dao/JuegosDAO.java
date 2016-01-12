/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Juego;

/**
 *
 * @author oscar
 */
public class JuegosDAO {

    public ArrayList<Juego> getAllJuegos()  {
        ArrayList<Juego> juegos = new ArrayList<>();
        Connection connection=null;
        DBConnection con = new DBConnection();
        try {
            connection = con.getConnection();
            String sql = "SELECT * FROM JUEGOS";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("ID");
                String nombre = rs.getString("NOMBRE");
                //Display values
                Juego j = new Juego(id,nombre);
                juegos.add(j);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JuegosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JuegosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            con.cerrarConexion(connection);
        }
        return juegos;
    }

}
