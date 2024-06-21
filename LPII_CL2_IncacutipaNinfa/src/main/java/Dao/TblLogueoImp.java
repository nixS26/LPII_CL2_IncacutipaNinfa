package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Validar;
import model.TblUsuariocl2;

public class TblLogueoImp implements Validar {

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 cliente) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_IncacutipaNinfa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Buscar al usuario por su nombre de usuario
        TblUsuariocl2 bususuario = em.createQuery(
            "SELECT u FROM TblUsuariocl2 u WHERE u.usuariocl2 = :nombreUsuario", 
            TblUsuariocl2.class
        )
        .setParameter("nombreUsuario", cliente.getUsuariocl2())
        .getSingleResult();

        em.getTransaction().commit();

        // Verificar si se encontró el usuario y si la contraseña coincide
        if (bususuario != null && bususuario.getPasswordcl2().equals(cliente.getPasswordcl2())) {
            // La contraseña coincide, retornar el usuario
            return bususuario;
        } else {
            // La contraseña no coincide, retornar null
            return null;
        }
    }

}
