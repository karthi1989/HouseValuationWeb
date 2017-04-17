/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import NeuralNetwork.NeuralNetwork;
import Callback.INeuralNetworkCallback;
import Entity.Result;
import Utils.DataUtils;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karthi
 */
@WebServlet(urlPatterns = {"/Evaluation"})
public class Evaluation extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 float price;
 static int testPrice;
 public float percentage;
 private String infoPath;
 private String pricePath;
 String strPrice;
    
    protected void doGet(HttpServletRequest request)
            throws ServletException, IOException {

            /* TODO output your page here. You may use following sample code. */
           

        String area= request.getParameter("area");
        final int area2 = Integer.valueOf(area);
       
        
        String lsize= request.getParameter("lsize");
        final int lsize2 = Integer.valueOf(lsize);
    
        String lvalue= request.getParameter("lvalue");
        final int lvalue2 = Integer.valueOf(lvalue);
       
        
        String hsize= request.getParameter("hsize");
        final int hsize2 = Integer.valueOf(hsize);
      
        
        String stories= request.getParameter("stories");
        final int stories2 = Integer.valueOf(stories);
        
        
        String bed= request.getParameter("bed");
        final int bed2 = Integer.valueOf(bed);
       
        
        String bath= request.getParameter("bath");
        final int bath2 = Integer.valueOf(bath);
     
        
        String year= request.getParameter("year");
        final int year2 = Integer.valueOf(year);
     
        
        String reno= request.getParameter("reno");
        final int reno2 = Integer.valueOf(reno);
        if( reno2 == 1 ) {
        
      }else {
      
      }
              
        String highway= request.getParameter("highway");
        final int highway2 = Integer.valueOf(highway);
         if( "1".equals(highway) ) {
     
      }else {
      
      }
        
        String mainrd= request.getParameter("mainrd");
        final int mainrd2 = Integer.valueOf(mainrd);
        if( "1".equals(mainrd) ) {
     
      }else {
     
      }
        
        String hos= request.getParameter("hos");
        final int hos2 = Integer.valueOf(hos);
        if( "1".equals(hos) ) {
       
      }else {
        
      }
        
        String col= request.getParameter("col");
        final int col2 = Integer.valueOf(col);
        if( "1".equals(col) ) {
     
      }else {
    
      }
        
        String supermarket= request.getParameter("supermarket");
        final int supermarket2 = Integer.valueOf(supermarket);
        if( "1".equals(supermarket) ) {
      
      }else {
      
      }
        
        String scl= request.getParameter("scl");
        final int scl2 = Integer.valueOf(scl);
        if( "1".equals(scl) ) {
      
      }else {
   
      }
        
        String bus= request.getParameter("bus");
        final int bus2 = Integer.valueOf(bus);
        if( "1".equals(bus) ) {
      
      }else {
         
      }
        
        String wne= request.getParameter("wne");
        final int wne2 = Integer.valueOf(wne);
        if( "1".equals(wne) ) {
   
      }else {
  
      }
        
        String gar= request.getParameter("gar");
        final int gar2 = Integer.valueOf(gar);
        if( "1".equals(gar) ) {
         
      }else {
      
      }
        
        String cashcr= request.getParameter("cashcr");
        final int cashcr2 = Integer.valueOf(cashcr);
       
        
        String sec= request.getParameter("sec");
        final int sec2 = Integer.valueOf(sec);
        if( "1".equals(sec) ) {
     
      }else {
      
      }
        
        String garage= request.getParameter("garage");
        final int garage2 = Integer.valueOf(garage);
        if( "1".equals(garage) ) {
     
      }else {
     
      }
        
        String ac= request.getParameter("ac");
        final int ac2 = Integer.valueOf(ac);
        if( "1".equals(ac) ) {
      
      }else {
   
      }
        
        String tiled= request.getParameter("tiled");
        final int tiled2 = Integer.valueOf(tiled);
        if( "1".equals(tiled) ) {
     
      }else {
      
      }
        
        String citypoint= request.getParameter("citypoint");
        final int citypoint2 = Integer.valueOf(citypoint);
        if( "1".equals(citypoint) ) {
         
      }else {
      
      }
        
        String frontal= request.getParameter("frontal");
        final int frontal2 = Integer.valueOf(frontal);
      
        
        String bedroom= request.getParameter("bedroom");
        final int bedroom2 = Integer.valueOf(bedroom);
       
        
        String bathroom= request.getParameter("bathroom");
        final int bathroom2 = Integer.valueOf(bathroom);
        
        
        String kitchen= request.getParameter("kitchen");
        final int kitchen2 = Integer.valueOf(kitchen);
        
            
        infoPath = 
             getServletContext().getInitParameter("infoTxt");
        
        pricePath =
                getServletContext().getInitParameter("priceTxt");
            
        //out.println("Starting neural network sample... ");

        int[][] x = DataUtils.readInputsFromFile(infoPath);
        float[] t = DataUtils.readOutputsFromFile(pricePath);
                  

        NeuralNetwork neuralNetwork = new NeuralNetwork(x, t, new INeuralNetworkCallback() {
            @Override
            public float success(Result result) {
                
                //int[] valueToPredict = new int[] {15,6,138,1,1,5,4,2012,1,0,0,0,0,1,0,1,1,0,1,0,1,0,1,0,32,34,35,36}; 
                //int[] valueToPredict = new int[] {getArea(),getLsize(),getLvalue(),getHsize(),getStories(),getBed(),getBath(),getYear(),getReno(),getHighway(),getMainrd(),getHos(),getCol(),getSupermarket(),getScl(),getBus(),getWne(),getGar(),getCashcr(),getSec(),getGarage(),getAc(),getTiled(),getCitypoint(),getFrontal(),getBedroom(),getBathroom(),getKitchen()}; 
                int[] valueToPredict = new int[]{area2,lsize2,lvalue2,hsize2,stories2,bed2,bath2,year2,reno2,highway2,mainrd2,hos2,col2,supermarket2,scl2,bus2,wne2,gar2,cashcr2,sec2,garage2,ac2,tiled2,citypoint2,frontal2,bedroom2,bathroom2,kitchen2}; 
               
                //out.println("Predicted result: " + result.predictValue(valueToPredict));
                //out.print("<br/>");
                //out.println("Predicted price: " + result.predictValue(valueToPredict)*280);
                //out.print("<br/>");
                //System.out.println(getArea());
                percentage = result.getSuccessPercentage();
                return price = result.predictValue(valueToPredict)*280;
                //return price = area2;
                
            }

            
            public void failure(Entity.Error error) {
               
            }

        });

        neuralNetwork.startLearning();
  
        //return price;
        //response.sendRedirect("/price.jsp");
           
        
        }
        
        
       /* request.setAttribute("priceData", price);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/price.jsp");
        rd.forward(request, response);
        RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/WEB-INF/price.jsp");
        RequetsDispatcherObj.forward(request, response);*/
        
        //request.setAttribute("price", "This is the result of the servlet call");
        //request.getRequestDispatcher("/WEB-INF/price.jsp").forward(request, response);
        
       // RequestDispatcher requestDispatcher; 
       // requestDispatcher = request.getRequestDispatcher("price.jsp");
       // requestDispatcher.forward(request, response);
       
       // String testing = "abc";
       // request.setAttribute("testing",testing);
       // request.getRequestDispatcher("price.jsp").forward(request, response); 
       
       /* RequestDispatcher requestDispatcher; 
        requestDispatcher = request.getRequestDispatcher("price.jsp");
        requestDispatcher.forward(request, response);*/
       
       //response.sendRedirect("/price.jsp");
        
        

   /*protected void runProcess(HttpServletRequest request)
            throws ServletException, IOException {
        doGet(request);
    }
    
    protected String getProcess(HttpServletRequest request)
            throws ServletException, IOException {
        runProcess(request);
        strPrice=String.valueOf(price);
        return strPrice;
    }*/
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   /* @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

         getProcess(request, response);    
         
        //response.sendRedirect("/price.jsp");
        
        /*request.setAttribute("data", price);
        RequestDispatcher rd = request.getRequestDispatcher("/price.jsp");
        rd.include(request, response);*/
        
       /* String strPrice = String.valueOf(price);
        request.setAttribute("price",strPrice);
        request.getRequestDispatcher("price.jsp").include(request, response);*/
        
        
        /*String nextJSP = "/price.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);*/
       
        //request.setAttribute("price",price);
        //request.setAttribute("percentage",percentage);
        //request.getRequestDispatcher("/price.jsp").forward(request, response);
        //request.getRequestDispatcher("/price.jsp").forward(request, response);
        
         //String strPrice = String.valueOf(price);
        //request.setAttribute("price",strPrice);
      //  request.getRequestDispatcher("price.jsp").include(request, response);
        
  //RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/price.jsp");
  //dispatcher.include(request,response);
  
        /*response.sendRedirect("/price.jsp");
       
        throw new ServletException("GET method used with " +
                getClass( ).getName( )+": POST method required.");*/
        
       /* RequestDispatcher valuePrice = request.getRequestDispatcher("/price.jsp");    
      updateData demo5 = new updateData();
      String s5 = demo5.estPrice();
      request.setAttribute("s5", s5);  
      valuePrice.forward(request, response);
      response.sendRedirect("price.jsp");*/
       
   //String strPrice=String.valueOf(price);
   /*request.getSession().setAttribute("strPrice",strPrice);
   RequestDispatcher view=getServletContext().getRequestDispatcher("/price.jsp");
   view.forward(request, response);
   response.sendRedirect("price.jsp");*/
   
      /*  request.setAttribute("StringPrice",strPrice);
        RequestDispatcher getPrice = request.getRequestDispatcher("EvaluationGet");
        getPrice.forward(request,response);
        
       
        
        
    }*/

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        doGet(request);    
        
        /*request.setAttribute("StringPrice",strPrice);
        RequestDispatcher getPrice = request.getRequestDispatcher("EvaluationGet");
        getPrice.forward(request,response);*/
        
     /*   String[] estPrice2 = new String[] {"123"};
      updateData.main(estPrice2);
      
      RequestDispatcher valuePrice = request.getRequestDispatcher("/price.jsp");    
      updateData demo5 = new updateData();
      String s5 = demo5.estPrice();
      request.setAttribute("s5", s5);  
      valuePrice.forward(request, response);
      response.sendRedirect("price.jsp");*/
     
   String strPrice=String.valueOf(price);
   request.getSession().setAttribute("strPrice",strPrice);
   RequestDispatcher view=getServletContext().getRequestDispatcher("/price.jsp");
   view.forward(request, response);
   response.sendRedirect("price.jsp");
   
       /* request.getSession().setAttribute("StringPrice",strPrice);
        RequestDispatcher getPrice = request.getRequestDispatcher("EvaluationGet");
        getPrice.forward(request,response);*/
   
    }
    
    

    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    public int getTestPrice() {
        testPrice = (int)price;
        return testPrice ;
    }

}
