import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public HelloServlet() {
        super();
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=gbk");
        PrintWriter out = res.getWriter();
        try{
            String name = req.getParameter("name");
            name = new String(name.getBytes("ISO-8859-1"),"GBK");
            out.println("<HTML>");
            out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
            out.println("<BODY>");
            out.println("你好！欢迎" + name + "使用Servlet");
            out.println("</BODY>");
            out.println("</HTML>");

            out.flush();
            out.close();

        }catch (Exception e){
            e.printStackTrace();
            out.println("<HTML>");
            out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
            out.println("<BODY>");
            out.println("你好！欢迎 anonymous 使用Servlet");
            out.println("</BODY>");
            out.println("</HTML>");
            out.flush();
            out.close();
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        doGet(req,res);
    }

    public void init()throws ServletException{

    }
}