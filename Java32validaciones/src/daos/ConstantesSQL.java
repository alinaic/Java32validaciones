package daos;

public class ConstantesSQL {
	public static final String INSERCION_ANUNCIO = "insert into tabla_anuncios(titulo, precio, telefono, email, descripcion)"
			+ "values(?,?,?,?,?)";

	public static final String SELECION_ANUNCIOS = "select * from tabla_anuncios";

	public static final String INSERCION_USUARIO = "insert into tabla_usuario(nombre, pass, poblacion, email)"
			+ "values(?,?,?,?)";

	public static final String SELECION_USUARIO = "SELECT * FROM portal_anuncios.tabla_usuario";

	public static final String IDENTIFICACION_USUARIO = "select id from tabla_usuario where email = ? and pass = ?";

	public static final String IDENTIFICACION_ADMIN = "select id from tabla_usuario where email = ? and pass = ? and admin = 1";
	
	public static final String BORRAR_ANUNCIO = "delete from tabla_anuncios where id=?";

	public static final String OBTENER_ANUNCIO_POR_ID = "SELECT * FROM TABLA_ANUNCIOS WHERE ID = ?";

	public static final String GUARDAR_CAMBIOS_ANUNCIO = "update tabla_anuncios set titulo = ?, precio = ?, descripcion = ? where id = ?";

	public static final String BORRAR_USUARIO = "delete from tabla_usuario where id=?";
	
	public static final String OBTENER_USUARIO_POR_ID = "select * from tabla_usuario where id = ?";
	
	public static final String GUARDAR_CAMBIOS_USUARIO = "update tabla_usuario set nombre = ?, pass = ?, poblacion = ?, email = ? where id = ?";

	
	
}// end class
