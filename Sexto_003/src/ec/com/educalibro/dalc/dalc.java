/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.educalibro.dalc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author orlando
 */
public class dalc {

    private Connection cn;
    
    

    public void Conectar() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:8081/prueba?user=root&password='posgres'");
        } catch (Exception e) {
            throw e;
        }

    }

    /**
     * Cierra las conexiones abiertas al motor de la base de datos
     *
     * @throws Exception Captura el error y lo muestra
     */
    public void Cerrar() throws Exception {
        try {
            if (cn != null) {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

}
