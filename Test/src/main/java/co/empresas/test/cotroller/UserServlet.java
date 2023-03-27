package co.empresas.test.cotroller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.empresas.test.dao.UserDAO;
import co.empresas.test.modelo.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.userDao=new UserDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		try {
		switch(action) {
		case "/new":
			showNewForm(request, response);
			break;
		case "/insert":
			insertUser(request,response);
			break;
		case "/delete":
			deleteUser(request,response);
			break;
		case "/edit":
			showEditForm(request,response);
			break;
		case "/update":
			actualizarUser(request,response);
			break;
		default:
			listUsers(request,response);
			break;
		
		}
		}catch(SQLException e){
			throw new ServletException(e);
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("user.jps");
		dispatcher.forward(request, response);
	}
	
	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		String nombre=  request.getParameter("nombre");
		String email=  request.getParameter("email");
		String pais=  request.getParameter("pais");
		
		User usuario =new User(nombre,email,pais);
		
		userDao.insert(usuario);
		
		response.sendRedirect("list");
		
		
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	// TODO Auto-generated method stub
	int id = Integer.parseInt(request.getParameter("id"));
	
	User userActual = userDao.select(id);
	
	request.setAttribute("user", userActual);
	RequestDispatcher dispatcher = request.getRequestDispatcher("user.jps");
	dispatcher.forward(request, response);
	
	}

	private void actualizarUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre=  request.getParameter("nombre");
		String email=  request.getParameter("email");
		String pais=  request.getParameter("pais");
	
		User usuario =new User(id, nombre,email,pais);
	
		userDao.update(usuario);
	
		response.sendRedirect("list");
	
	
}
	
	private void deleteUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
	
		userDao.delete(id);
	
		response.sendRedirect("list");
	
	
}
	private void listUsers(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List <User> listUsers=userDao.selectAll();
		
		request.setAttribute("listUsers", listUsers);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("userList.jps");
		dispatcher.forward(request, response);
	}

}
