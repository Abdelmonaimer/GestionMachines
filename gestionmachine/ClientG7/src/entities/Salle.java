/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author Monaim
 */
public class Salle implements Serializable {
    
    public int id;
    public String code;
    
    
    public Salle(){
        
    }
    
    public Salle( String code){
        
        this.code=code;
    }
    
    public int getId(){
       return id;
    }
    public void setId(int id){
        this.id=id;
    }
    
    public String getCode(){
        return code;
    }
    public void setCode(String code){
         this.code=code;
    }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", code=" + code + '}';
    }
    
    
    
    
}
