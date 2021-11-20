package renan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    Calculadora cal = new Calculadora();
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String snum1 = request.getParameter("num1");
		String snum2 = request.getParameter("num2");
		String btnAdi = request.getParameter("ad");
		String btnSub = request.getParameter("su");
		String btnMul = request.getParameter("mu");
		String btnDiv = request.getParameter("di");
		
		double dnum1 = Double.parseDouble(snum1);
		double dnum2 = Double.parseDouble(snum2);
		
		double res = 0;
		
		if(btnAdi!=null) {
			res = cal.adicao(dnum1, dnum2);
			out.print("Resultado da adição: "+res);
		} 
		if(btnSub!=null) {
			res = cal.subtracao(dnum1, dnum2);
			out.print("Resultado da subtração: "+res);
		} 
		if(btnMul!=null) {
			res = cal.multiplicacao(dnum1, dnum2);
			out.print("Resultado da multiplicação: "+res);
		} 
		if(btnDiv!=null) {
			res = cal.divisao(dnum1, dnum2);
			out.print("Resultado da divisão: "+res);
		} 
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
