package br.com.lis2b.igorviagens.auth.usuario.api;

import java.util.UUID;

import br.com.lis2b.igorviagens.auth.usuario.domain.Usuario;
import lombok.Value;
@Value
public class UsuarioCriadoResponse {
	
	private final UUID idUsuario;
	private final String email;
	
	public UsuarioCriadoResponse(Usuario usuario) {
		this.idUsuario = usuario.getIdUsuario();
		this.email = usuario.getEmail();
	}
}