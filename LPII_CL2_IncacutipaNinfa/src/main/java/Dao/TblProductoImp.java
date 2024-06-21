package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class TblProductoImp implements IProducto{

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_IncacutipaNinfa");
		//gestionar las entidades
		EntityManager emanager= em.createEntityManager();
		//inciamos la transaccion
		emanager.getTransaction().begin();
		//registramos a la base de datos
		emanager.persist(producto);
		//emititmos mensaje por consola
		System.out.println("Producto Registrado en la base de datos");
		//confirmamos la transaccion
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		
	}

	@Override
	public List<TblProductocl2> ListarProducto() {
		// TODO Auto-generated method stub
		// Establecemos la conexion con la unidad de persistencia
				EntityManagerFactory fab= Persistence.createEntityManagerFactory("LPII_CL2_IncacutipaNinfa");
				//gestionamos las entidades
				EntityManager em= fab.createEntityManager();
				//iniciamos la transaccion
				em.getTransaction().begin();
				//recuaperamos la data de la base  de datos
				List<TblProductocl2> listado=em.createQuery("select c from TblProductocl2 c", TblProductocl2.class).getResultList();
				//confirmamos la transaccion
				em.getTransaction().commit();
				//cerramos
				em.close();
				//retornamos el listado
				return listado;
	}

}
