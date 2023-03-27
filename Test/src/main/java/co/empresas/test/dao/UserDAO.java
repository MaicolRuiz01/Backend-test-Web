package co.empresas.test.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import co.empresas.test.modelo.User;
import co.empresas.test.util.Conexion;

public class UserDAO {
	
	private Conexion conexion;
	
	private static final String INSERT_USER_SQL = "INSERT INTO user (nombre, email, pais) VALUES (?,?,?);" ;
	private static final String SELECT_ALL_USERS = "SELECT * FROM user  ;";
	private static final String SELECTT_USER_BY_ID = "SELECT * FROM user (nombre, email, pais) WHERE id =?;";
	private static final String DELETE_USER_SQL = "DELETE FROM user WHERE id=?;";
	private static final String UPDATE_USER_SQL = "UPDATE user SET nombre = ?, email= ?, pais= ?WHERE id=?;";
	public UserDAO() {
		this.conexion=Conexion.getConexion();
	}
	
	public void insert(User user) throws SQLException{
		try {
			PreparedStatement preparedStatement= (PreparedStatement)conexion.setPreparedStatement(INSERT_USER_SQL);
			preparedStatement.setString(1, user.getNombre());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPais());
			conexion.execute();
			
		}
		
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void delete(int id) throws SQLException {
		try {
			PreparedStatement preparedStatement= (PreparedStatement)conexion.setPreparedStatement(DELETE_USER_SQL);
			preparedStatement.setInt(1, id);
		
			conexion.execute();
			
		}
		
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public void update(User user) throws SQLException {
		try {
			PreparedStatement preparedStatement= (PreparedStatement)conexion.setPreparedStatement(UPDATE_USER_SQL);
			preparedStatement.setString(1, user.getNombre());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPais());
			preparedStatement.setInt(4, user.getId());
			conexion.execute();
			
		}
		
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public List<User> selectAll(){
		
		List <User> users = new ArrayList<>();
		
		try {
			
			PreparedStatement preparedStatement= (PreparedStatement)conexion.setPreparedStatement(SELECT_ALL_USERS);
			ResultSet rs = conexion.query();
			
			while(rs.next()) {
				int id=rs.getInt("id");
				String nombre= rs.getString("nombre");
				String pais= rs.getString("pais");
				String email= rs.getString("email");
				users.add(new User(id,nombre,email,pais));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return users;
		
	}
	
	
		public User select(int id){
		
		User usuario = null;
		
		try {
			
			PreparedStatement preparedStatement= (PreparedStatement)conexion.setPreparedStatement(SELECTT_USER_BY_ID);
			preparedStatement.setInt(1, id);
			
			ResultSet rs = conexion.query();
			
			while(rs.next()) {
				
				String nombre= rs.getString("nombre");
				String pais= rs.getString("pais");
				String email= rs.getString("email");
				usuario= new User(id,nombre,email,pais);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return usuario;
		
	}
	
	
	
	
	
}
