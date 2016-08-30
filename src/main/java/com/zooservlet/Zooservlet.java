package com.zooservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.goingtothezoo.Animals;
import com.goingtothezoo.DAO;

/**
 * Servlet implementation class Zooservlet
 */
@WebServlet("/Zooservlet")
public class Zooservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Zooservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Animals addTodb = new Animals();
		
		addTodb.setName(request.getParameter("Name"));
		addTodb.setSpecies(request.getParameter("Species"));
		addTodb.setTypeOfCage(request.getParameter("TypeOfCage"));
		addTodb.setFood(request.getParameter("Food"));
		addTodb.setWeight(Float.parseFloat(request.getParameter("Weight")));
		
		DAO.writeToDB(addTodb);
	}

}
