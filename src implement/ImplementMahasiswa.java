
package implement;

import entity.EntitasMahasiswa;
import interfaces.InterfaceMahasiswa;
public class ImplementMahasiswa implements InterfaceMahasiswa{
    public boolean cekLogin(EntitasMahasiswa e) {
        boolean status = false;
        if(e.getUser().equals("reguler") && 
                e.getPassword().equals("admin")){
            status = true;
        }
        else if(e.getUser().equals("international") && 
                e.getPassword().equals("admin")){
            status = true;
            
        }
        return status;
    }}
