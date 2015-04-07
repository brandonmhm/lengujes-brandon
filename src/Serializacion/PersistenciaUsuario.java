/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

import java.io.*;

public class PersistenciaUsuario {

        public void Guardar(Usuario u)throws Exception{
                //paso i
         File file=new File("D:\\archivaldo.yo");      
        //paso2
        FileOutputStream fos=new FileOutputStream(file);
        //paso tres llenarlo con algo ese algo en este caso 
        //un usuario
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);
        oos.close();
        }
        
    public Usuario leer()throws Exception{
    
        File file=new File("D:\\archivaldo.yo");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Usuario u=new Usuario();
        u= (Usuario)ois.readObject();
    
        return u;
}


}

    