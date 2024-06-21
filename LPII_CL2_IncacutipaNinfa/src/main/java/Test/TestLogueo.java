package Test;

import Dao.TblLogueoImp;
import model.TblUsuariocl2;

public class TestLogueo {

	public static void main(String[] args) {
	
		 TblUsuariocl2 cliente = new TblUsuariocl2();
	        cliente.setUsuariocl2("Juan");
	        cliente.setPasswordcl2("1234");

	        // Crear una instancia de TblLogueoImp
	        TblLogueoImp logueoDao = new TblLogueoImp();

	        // Llamar al método BuscarUsuario
	        TblUsuariocl2 usuarioEncontrado = logueoDao.BuscarUsuario(cliente);

	        // Verificar si se encontró el usuario e imprimir su nombre de usuario en la consola
	        if (usuarioEncontrado != null) {
	            System.out.println("Usuario encontrado: " + usuarioEncontrado.getUsuariocl2());
	        } else {
	            System.out.println("Usuario no encontrado");
	        }
	}

}
