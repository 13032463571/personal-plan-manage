import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by wangzhen on 2018/12/9.
 */
public class downloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        //通过路径得到一个输入流
        String path = this.getServletContext().getRealPath("WEB-INF/web.xml");
        FileInputStream fis = new FileInputStream(path);
        resp.setHeader("content-disposition", "attachment;filename=test.xml");
        resp.setHeader("content-type", "text");
        //创建字节输出流
        ServletOutputStream sos = resp.getOutputStream();
        //执行输出操作
        int len = 1;

        byte[] b = new byte[1024];
        while((len = fis.read(b)) != -1) {
            sos.write(b, 0, len);
        }
        /*方法内可以不关流*/
        sos.close();
        fis.close();
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
