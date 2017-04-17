

// Import required java libraries
import java.io.*;
import java.util.*;
 
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.output.*;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;


public class UploadServlet extends HttpServlet {
   
   private boolean isMultipart;
   private String filePath;
   private int maxFileSize = 5000 * 5000;
   private int maxMemSize = 5000 * 5000;
   private File file;

   public void init( ){
      // Get the file location where it would be stored.
      filePath = 
             getServletContext().getInitParameter("file-upload"); 
   }
   public void doPost(HttpServletRequest request, 
               HttpServletResponse response)
              throws ServletException, java.io.IOException {
      // Check that we have a file upload request
      isMultipart = ServletFileUpload.isMultipartContent(request);
      response.setContentType("text/html");
      java.io.PrintWriter out = response.getWriter( );
      if( !isMultipart ){
         out.println("<html>");
         out.println("<head>");
         out.println("<title>Servlet upload</title>");  
         out.println("</head>");
         out.println("<body>");
         out.println("<p>No file uploaded</p>"); 
         out.println("</body>");
         out.println("</html>");
         return;
      }
      DiskFileItemFactory factory = new DiskFileItemFactory();
      // maximum size that will be stored in memory
      factory.setSizeThreshold(maxMemSize);
      // Location to save data that is larger than maxMemSize.
      factory.setRepository(new File("e:\\temp"));

      // Create a new file upload handler
      ServletFileUpload upload = new ServletFileUpload(factory);
      // maximum file size to be uploaded.
      upload.setSizeMax( maxFileSize );

      try{ 
      // Parse the request to get file items.
      List fileItems = upload.parseRequest(request);
	
      // Process the uploaded file items
      Iterator i = fileItems.iterator();

      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet upload</title>");  
      out.println("</head>");
      out.println("<body>");
      while ( i.hasNext () ) 
      {
         FileItem fi = (FileItem)i.next();
         if ( !fi.isFormField () )	
         {
            // Get the uploaded file parameters
            String fieldName = fi.getFieldName();
            String fileName = fi.getName();
            String contentType = fi.getContentType();
            boolean isInMemory = fi.isInMemory();
            long sizeInBytes = fi.getSize();

            // Write the file
            if( fileName.lastIndexOf("\\") >= 0 ){
               file = new File( filePath + 
               fileName.substring( fileName.lastIndexOf("\\"))) ;
            }else{
               file = new File( filePath + 
               fileName.substring(fileName.lastIndexOf("\\")+1)) ;
            }
            fi.write( file ) ;
            out.println("Uploaded Filename 1: " + fileName + "<br>");          
         }
         
         
      }
      out.println("</body>");
      out.println("</html>");
   }catch(Exception ex) {
       System.out.println(ex);
   }
      
      String[] arguments = new String[] {"123"};
      ExampleFeatureSurf.main(arguments);
      
      RequestDispatcher rd = request.getRequestDispatcher("/next.jsp");    
      ExampleFeatureSurf demo = new ExampleFeatureSurf();
      String s = demo.runSurf();
      request.setAttribute("s", s);  
//rd.forward(request, response);
//response.sendRedirect("next.jsp");

      String[] arguments2 = new String[] {"456"};
      ExampleFeatureSurf2.main(arguments2);
      
      RequestDispatcher rd2 = request.getRequestDispatcher("/next.jsp");    
      ExampleFeatureSurf2 demo2 = new ExampleFeatureSurf2();
      String s2 = demo2.runSurf2();
      request.setAttribute("s2", s2);  
      
      String[] arguments3 = new String[] {"789"};
      ExampleFeatureSurf3.main(arguments3);
      
      RequestDispatcher rd3 = request.getRequestDispatcher("/next.jsp");    
      ExampleFeatureSurf3 demo3 = new ExampleFeatureSurf3();
      String s3 = demo3.runSurf3();
      request.setAttribute("s3", s3);  
      
      String[] arguments4 = new String[] {"101"};
      ExampleFeatureSurf4.main(arguments4);
      
      RequestDispatcher rd4 = request.getRequestDispatcher("/next.jsp");    
      ExampleFeatureSurf4 demo4 = new ExampleFeatureSurf4();
      String s4 = demo4.runSurf4();
      request.setAttribute("s4", s4);  

rd.forward(request, response);
//response.sendRedirect("next.jsp");
rd2.forward(request, response);
rd3.forward(request, response);
rd4.forward(request, response);
response.sendRedirect("next.jsp");

   }
   
   public void doGet(HttpServletRequest request, 
                       HttpServletResponse response)
        throws ServletException, java.io.IOException {
        
       response.sendRedirect("/next.jsp");
       
        throw new ServletException("GET method used with " +
                getClass( ).getName( )+": POST method required.");
       
       
   } 
}