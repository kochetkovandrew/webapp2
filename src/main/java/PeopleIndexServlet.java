/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.webapplication2.NewSessionBeanLocal;
import com.mycompany.webapplication2.Person;
import javax.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.LazyList;
import org.javalite.activejdbc.Model;

/**
 *
 * @author kochetkov
 */
public class PeopleIndexServlet extends HttpServlet {

    @EJB
    NewSessionBeanLocal newSessionBean;

//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        Base.open("org.postgresql.Driver", "jdbc:postgresql://localhost/anwendungen", "anwendungen", "anwendungen");
//    }
//    public void destroy() {
//        // Base.close();
//    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processGetRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Base.open("org.postgresql.Driver", "jdbc:postgresql://localhost/anwendungen", "anwendungen", "anwendungen");
        LazyList<Person> people = Person.findAll();
        request.setAttribute("people", people);
        for (Iterator<Person> i = people.iterator(); i.hasNext();) {
            Person person = i.next();
            person.setBMIString(newSessionBean.calculateBMIString(person.getFloat("height"), person.getFloat("weight")));
        }

        // Base.close();
        request.getRequestDispatcher("/WEB-INF/people/index.jsp").forward(request, response);
    }
    
    protected void processPostRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("person[name]"); 
        float weight = Float.parseFloat(request.getParameter("person[weight]"));
        float height = Float.parseFloat(request.getParameter("person[height]"));
        // Base.open("org.postgresql.Driver", "jdbc:postgresql://localhost/anwendungen", "anwendungen", "anwendungen");
//        LazyList<Model> people = Person.findAll();
//        request.setAttribute("people", people);
        Person p = new Person();
        p.set("name", name);
        p.set("weight", weight);
        p.set("height", height);
        p.saveIt();
        // Base.close();
        response.sendRedirect("/WebApplication2/people");
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
        processGetRequest(request, response);
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
        processPostRequest(request, response);
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
