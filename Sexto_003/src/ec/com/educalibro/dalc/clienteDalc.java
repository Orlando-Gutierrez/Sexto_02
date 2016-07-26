/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.educalibro.dalc;

import ec.com.educalibro.entidades.cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author orlando
 */
public class clienteDalc extends dalc {

    public void registrar(cliente c) throws Exception {

        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO cliente(ruc,nombre,telefono) VALUES(?,?,?)");
            st.setString(1, c.getRUC());
            st.setString(2, c.getNombre());
            st.setString(3, c.getTelefono());

        } catch (Exception e) {
            throw e;
        } finally {

            this.Cerrar();

        }

    }

    public List<cliente> listar() throws Exception {
        List<cliente> lista;
        ResultSet rs;

        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT id, ruc, nombre, telefono FROM cliente");
            rs = st.executeQuery();
            lista = new ArrayList();

            while (rs.next()) {
                cliente c = new cliente();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setTelefono("telefono");
                c.setRUC(rs.getString("ruc"));

                lista.add(c);
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;

    }
}
