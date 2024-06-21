package Test;

import java.util.List;

import Dao.TblProductoImp;
import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// REALIZAMOS LAS RESPECTIVAS INSTANCIAS
				TblProductocl2 producto = new TblProductocl2();
				TblProductoImp crud=new TblProductoImp();
				//insertamos datos
				/*producto.setNombrecl2("Rotomartillo");
				producto.setPrecioventacl2(999.9);
				producto.setPreciocompcl2(1550.89);
				producto.setEstadocl2("nuevo");
				producto.setDescripcl2("Funciona sin gasolina");
			
				//invocamos el metodo registrar...
				crud.RegistrarProducto(producto);
				System.out.println("Registrado correctamente");
				*/
				
				List<TblProductocl2> listado=crud.ListarProducto();
				//aplicacos un bucle
				for(TblProductocl2 lis:listado){
					//imprimir por pantalla
					System.out.println("codigo "+ lis.getIdproductocl2()+"\n"+
					"nombre" + lis.getNombrecl2()+"\n"+
							"PV" + lis.getPrecioventacl2()+"\n"+
							"PC"+lis.getPreciocompcl2()+"\n"+
							"Estado: " + lis.getEstadocl2()+"\n"+
							"Desc: " + lis.getDescripcl2());
	}

}
}
