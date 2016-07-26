/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.educalibro.test;

import ec.com.educalibro.dalc.clienteDalc;
import ec.com.educalibro.dalc.dalc;
import ec.com.educalibro.entidades.cliente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author orlando
 */
public class play {

    public static void main(String[] args) {
        clienteDalc dalc = new clienteDalc();
        cliente c = new cliente(2, "0968589856525", "orlando", "0987578596");
        try {
            dalc.registrar(c);
        } catch (Exception ex) {
            //Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: " + ex);
        }

        try {
            List<cliente> listado = dalc.listar();
            for (cliente cli : listado) {
                System.out.println(cli.toString());
            }
        } catch (Exception ex) {
            //Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: " + ex);
        }
    }

}
