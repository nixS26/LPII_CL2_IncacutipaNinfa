package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import Interfaces.Validar;
import model.TblUsuariocl2;

public class TblLogueoImp implements Validar {

	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 cliente) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_IncacutipaNinfa");
	        EntityManager em = emf.createEntityManager();
	        TblUsuariocl2 bususuario = null;
	        try {
	            em.getTransaction().begin();
	            bususuario = em.createQuery(
	                "SELECT u FROM TblUsuariocl2 u WHERE u.usuariocl2 = :nombreUsuario", 
	                TblUsuariocl2.class).setParameter("nombreUsuario", cliente.getUsuariocl2()).getSingleResult();
	            em.getTransaction().commit();
	            if (bususuario != null && bususuario.getPasswordcl2().equals(cliente.getPasswordcl2())) {
	                return bususuario;
	            }
	        } catch (NoResultException e) {
	    
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            em.close();
	        }
	        return null;
	    }

}
