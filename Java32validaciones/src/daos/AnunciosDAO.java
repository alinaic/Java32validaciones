package daos;

import java.util.List;

import modelo.Anuncio;

public interface AnunciosDAO {

	void registrarAnuncio(Anuncio anuncio);

	List<Anuncio> obtenerAnuncios();
	
	void borrarAnuncio(int id);

	Anuncio obtenerAnunciosPorId(int id);

	void guardarCambiosAnuncio(Anuncio anuncio);

}
