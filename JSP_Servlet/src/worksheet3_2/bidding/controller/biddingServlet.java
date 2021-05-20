package worksheet3_2.bidding.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import worksheet3_2.bidding.dao.Biddingdao;
import worksheet3_2.bidding.model.BiddingInfo;

/**
 * Servlet implementation class biddingServlet
 */
@WebServlet("/bidding")
public class biddingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private Biddingdao bd=new Biddingdao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public biddingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:").append(request.getContextPath());
		RequestDispatcher dis=request.getRequestDispatcher("/WEB-INF/views/biddinginput.jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ItemName=request.getParameter("ItemName");
		String UserName=request.getParameter("UserName");
		String Amount=request.getParameter("Amount");
		String Email=request.getParameter("Email");
		boolean CheckBidding=(request.getParameter("CheckBidding")==null)?false:true;
		
		BiddingInfo b=new BiddingInfo();
		b.setItemName(ItemName);
		b.setAmount(Amount);
		b.setEmail(Email);
		b.setUserName(UserName);
		b.setCheckBidding(CheckBidding);
		try {
			bd.BiddingInput(b);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dis=request.getRequestDispatcher("/WEB-INF/views/showDetails.jsp");
		dis.forward(request, response);
		// TODO Auto-generated method stub
	}

}
