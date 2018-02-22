/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.method.challenge;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yuta
 */
public class challenge11_8 extends HttpServlet {

        String[] Userprof(String name){
        
        if(name=="田中"){
        String[] TanakaProf={"ID=1234","誕生日:一日","ところ:東京"};
        return TanakaProf;
        }
        
        else if(name=="佐藤"){
            String[] NamakoProf={"ID=2341","誕生日：二日",null};
            return NamakoProf;  
        }
        
        else if(name=="後藤"){
        String[] DeluxProf={"ID=3412","誕生日:三日","ところ：刀京"};
        return DeluxProf;
    }
        return null ;
        
    }
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String[] list1 = Userprof("田中");
            String[] list2 = Userprof("佐藤");
            String[] list3 = Userprof("後藤");
            
            
            int limit =2;
            int count =0;

            
            
            for(String check1 :list1){
                if(check1==null || limit==count){
                    continue;}
                
                out.print(check1);
                }
            
            count++;

            
            for(String check2 :list2){
                if(check2==null || limit==count){
                    continue;
                }
                out.print(check2);
            
                }
            count++;
            
            for(String check3:list3){
                if(check3==null || limit==count){
                    continue;}
                out.print(check3);
            
            }
            count++;
        }
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
        processRequest(request, response);
    }

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
        processRequest(request, response);
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

}
