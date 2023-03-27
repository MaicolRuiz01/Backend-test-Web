package co.empresas.test.modelo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nombre;
	private String email;
	private String pais;
	
	
	public User(String nombre, String email, String pais) {
		
		this.nombre = nombre;
		this.email = email;
		this.pais = pais;
	}
	
	
	
	
	
	
	


	
	
	
	
	

}
