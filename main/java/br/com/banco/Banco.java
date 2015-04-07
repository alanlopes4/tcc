package br.com.banco;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Banco {
	
	EntityManager em;
    private static Banco instancia;
    
    
    public Banco(){
    
    em = Persistence.createEntityManagerFactory("youTeacherUP").createEntityManager();
    
    }
    
    public synchronized static Banco getIstancia(){
    
        if(instancia == null){
        
            instancia = new Banco();
        }
        
        return instancia;
    
    
    }
    
    public EntityManager getEm(){
    
        return em;
    
    }
    
    
	
	
	

}
