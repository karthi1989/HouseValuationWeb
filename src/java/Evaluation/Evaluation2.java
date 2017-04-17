/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluation;

import Callback.INeuralNetworkCallback;
import Entity.Result;
import NeuralNetwork.NeuralNetwork;
import Utils.DataUtils;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karthi
 */
public class Evaluation2 extends HttpServlet {

public float price;
public float percentage;
 
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String area= request.getParameter("area");
        final int area2 = Integer.valueOf(area);
        out.println("Your area is Colombo: " + area);
        out.print("<br/>");
        
        String lsize= request.getParameter("lsize");
        final int lsize2 = Integer.valueOf(lsize);
        out.println("Your land size is: " + lsize);
        out.print("<br/>");
        
        String lvalue= request.getParameter("lvalue");
        final int lvalue2 = Integer.valueOf(lvalue);
        out.println("Your land value is: " + lvalue);
        out.print("<br/>");
        
        String hsize= request.getParameter("hsize");
        final int hsize2 = Integer.valueOf(hsize);
        out.println("Your house size is: " + hsize);
        out.print("<br/>");
        
        String stories= request.getParameter("stories");
        final int stories2 = Integer.valueOf(stories);
        out.println("No of stories your house has: " + stories);
        out.print("<br/>");
        
        String bed= request.getParameter("bed");
        final int bed2 = Integer.valueOf(bed);
        out.println("No of bedrooms your house has: " + bed);
        out.print("<br/>");
        
        String bath= request.getParameter("bath");
        final int bath2 = Integer.valueOf(bath);
        out.println("No of bathrooms your house has: " + bath);
        out.print("<br/>");
        
        String year= request.getParameter("year");
        final int year2 = Integer.valueOf(year);
        out.println("Your house built year is: " + year);
        out.print("<br/>");
        
        String reno= request.getParameter("reno");
        final int reno2 = Integer.valueOf(reno);
        if( reno2 == 1 ) {
         out.print("Does your house got renovated within 10 years? " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Does your house got renovated within 10 years? " + "No");
         out.print("<br/>");
      }
              
        String highway= request.getParameter("highway");
        final int highway2 = Integer.valueOf(highway);
         if( "1".equals(highway) ) {
         out.print("Highway within 1km: " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Highway within 1km: " + "No");
         out.print("<br/>");
      }
        
        String mainrd= request.getParameter("mainrd");
        final int mainrd2 = Integer.valueOf(mainrd);
        if( "1".equals(mainrd) ) {
         out.print("Main road within 1km: " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Main road within 1km: " + "No");
         out.print("<br/>");
      }
        
        String hos= request.getParameter("hos");
        final int hos2 = Integer.valueOf(hos);
        if( "1".equals(hos) ) {
         out.print("Hospital within 1km: " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Hospital within 1km: " + "No");
         out.print("<br/>");
      }
        
        String col= request.getParameter("col");
        final int col2 = Integer.valueOf(col);
        if( "1".equals(col) ) {
         out.print("College within 1km: " + "Yes");
         out.print("<br/>");
      }else {
         out.print("College within 1km: " + "No");
         out.print("<br/>");
      }
        
        String supermarket= request.getParameter("supermarket");
        final int supermarket2 = Integer.valueOf(supermarket);
        if( "1".equals(supermarket) ) {
         out.print("Supermarket within 1km: " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Supermarket within 1km: " + "No");
         out.print("<br/>");
      }
        
        String scl= request.getParameter("scl");
        final int scl2 = Integer.valueOf(scl);
        if( "1".equals(scl) ) {
         out.print("School within 1km: " + "Yes");
         out.print("<br/>");
      }else {
         out.print("School within 1km: " + "No");
         out.print("<br/>");
      }
        
        String bus= request.getParameter("bus");
        final int bus2 = Integer.valueOf(bus);
        if( "1".equals(bus) ) {
         out.print("Bus station within 1km: " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Bus station within 1km: " + "No");
         out.print("<br/>");
      }
        
        String wne= request.getParameter("wne");
        final int wne2 = Integer.valueOf(wne);
        if( "1".equals(wne) ) {
         out.print("Water & Electricity, both available? " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Water & Electricity, both available? " + "No");
         out.print("<br/>");
      }
        
        String gar= request.getParameter("gar");
        final int gar2 = Integer.valueOf(gar);
        if( "1".equals(gar) ) {
         out.print("Private garden available? " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Private garden available? " + "No");
         out.print("<br/>");
      }
        
        String cashcr= request.getParameter("cashcr");
        final int cashcr2 = Integer.valueOf(cashcr);
        out.println("Cash crops available at your garden: " + cashcr);
        out.print("<br/>");
        
        String sec= request.getParameter("sec");
        final int sec2 = Integer.valueOf(sec);
        if( "1".equals(sec) ) {
         out.print("Home Security System Implemented? " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Home Security System Implemented? " + "No");
         out.print("<br/>");
      }
        
        String garage= request.getParameter("garage");
        final int garage2 = Integer.valueOf(garage);
        if( "1".equals(garage) ) {
         out.print("Garage available? " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Garage available? " + "No");
         out.print("<br/>");
      }
        
        String ac= request.getParameter("ac");
        final int ac2 = Integer.valueOf(ac);
        if( "1".equals(ac) ) {
         out.print("Air-conditioner Fixed? " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Air-conditioner Fixed? " + "No");
         out.print("<br/>");
      }
        
        String tiled= request.getParameter("tiled");
        final int tiled2 = Integer.valueOf(tiled);
        if( "1".equals(tiled) ) {
         out.print("Fully Tiled?  " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Fully Tiled?  " + "No");
         out.print("<br/>");
      }
        
        String citypoint= request.getParameter("citypoint");
        final int citypoint2 = Integer.valueOf(citypoint);
        if( "1".equals(citypoint) ) {
         out.print("Is it your house nearest/ within 5km to main city-points in Colombo?  " + "Yes");
         out.print("<br/>");
      }else {
         out.print("Is it your house nearest/ within 5km to main city-points in Colombo?  " + "No");
         out.print("<br/>");
      }
        
        String frontal= request.getParameter("frontal");
        final int frontal2 = Integer.valueOf(frontal);
        out.println("Your land value is: " + frontal);
        out.print("<br/>");
        
        String bedroom= request.getParameter("bedroom");
        final int bedroom2 = Integer.valueOf(bedroom);
        out.println("Frontal Feature: " + bedroom);
        out.print("<br/>");
        
        String bathroom= request.getParameter("bathroom");
        final int bathroom2 = Integer.valueOf(bathroom);
        out.println("Bathroom Feature: " + bathroom);
        out.print("<br/>");
        
        String kitchen= request.getParameter("kitchen");
        final int kitchen2 = Integer.valueOf(kitchen);
        out.println("Kitchen Feature: " + kitchen);
        out.print("<br/>");
        
        
        beanClass Bean = new beanClass();
        Bean.setArea2(area2);
        Bean.setLsize2(lsize2);
        Bean.setLvalue2(lvalue2);
        Bean.setHsize2(hsize2);
        Bean.setStories2(stories2);
        Bean.setBed2(bed2);
        Bean.setBath2(bath2);
        Bean.setYear2(year2);
        Bean.setReno2(reno2);
        Bean.setHighway2(highway2);
        Bean.setMainrd2(mainrd2);
        Bean.setHos2(hos2);
        Bean.setCol2(col2);
        Bean.setSupermarket2(supermarket2);
        Bean.setScl2(scl2);
        Bean.setBus2(bus2);
        Bean.setWne2(wne2);
        Bean.setGar2(gar2);
        Bean.setCashcr2(cashcr2);
        Bean.setSec2(sec2);
        Bean.setGarage2(garage2);
        Bean.setAc2(ac2);
        Bean.setTiled2(tiled2);
        Bean.setCitypoint2(citypoint2);
        Bean.setFrontal2(frontal2);
        Bean.setBedroom2(bedroom2);
        Bean.setBathroom2(bathroom2);
        Bean.setKitchen2(kitchen2);
 
        updateData update = new updateData();
        update.updateData(Bean);
            
        
        
        String[] estPrice2 = new String[] {"123"};
      updateData.main(estPrice2);
      
      RequestDispatcher valuePrice = request.getRequestDispatcher("/price.jsp");    
      updateData demo5 = new updateData();
      String s5 = demo5.estPrice();
      request.setAttribute("s5", s5);  
      valuePrice.forward(request, response);
      response.sendRedirect("price.jsp");
}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     RequestDispatcher valuePrice = request.getRequestDispatcher("/price.jsp");    
      updateData demo5 = new updateData();
      String s5 = demo5.estPrice();
      request.setAttribute("s5", s5);  
      valuePrice.forward(request, response);
      response.sendRedirect("price.jsp");
      
         
        
        
        
                      
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
        
        /* String[] estPrice2 = new String[] {"123"};
      updateData.main(estPrice2);
      
      RequestDispatcher valuePrice = request.getRequestDispatcher("/price.jsp");    
      updateData demo5 = new updateData();
      String s5 = demo5.estPrice();
      request.setAttribute("s5", s5);  
      valuePrice.forward(request, response);
      response.sendRedirect("price.jsp");*/
        
        /*int sum = (int) price;
        String price2 = Integer.toString(sum);
       
        request.setAttribute("price2",price2);
        request.getRequestDispatcher("price.jsp").forward(request, response); 
        response.sendRedirect("price.jsp");*/
        
       
}

    


