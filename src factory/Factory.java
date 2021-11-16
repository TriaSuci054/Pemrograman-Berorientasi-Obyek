/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import interfaces.InterfaceMahasiswa;
import implement.ImplementMahasiswa;
/**
 *
 * @author My Komputer
 */
public class Factory {
    private static InterfaceMahasiswa mahasiswaDao;

    public static InterfaceMahasiswa getmahasiswaDao() {
        mahasiswaDao = new ImplementMahasiswa();
        return mahasiswaDao;
    }
}
