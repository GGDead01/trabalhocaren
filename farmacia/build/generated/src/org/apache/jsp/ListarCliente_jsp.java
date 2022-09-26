package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.DAOCliente;
import modelo.ConverteData;
import modelo.Cliente;
import java.util.List;

public final class ListarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    DAOCliente daoCliente = new DAOCliente();
    List<Cliente> ListaCliente = daoCliente.listarCliente();
    ConverteData converte = new ConverteData();

      out.write("\n");
      out.write("\n");
      out.write("<table border =\"l\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>CÓDIGO</th>\n");
      out.write("            <th>NOME</th>\n");
      out.write("            <th>ENDEREÇO</th>\n");
      out.write("            <th>CPF</th>\n");
      out.write("            <th>RG</th>\n");
      out.write("            <th>NASCIMENTO</th>\n");
      out.write("            <th>TELEFONE</th>\n");
      out.write("            <th>ALTERAR</th>\n");
      out.write("            <th>EXCLUIR</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");
 for (Cliente cliente : ListaCliente) {
      out.write("\n");
      out.write("        <tr> \n");
      out.write("            <td> ");
      out.print( cliente.getCodCliente());
      out.write("</td>\n");
      out.write("            <td> ");
      out.print( cliente.getNomeCliente());
      out.write("</td>\n");
      out.write("            <td> ");
      out.print(cliente.getEnderecoCliente());
      out.write("</td>\n");
      out.write("            <td> ");
      out.print(cliente.getCpfCliente());
      out.write("</td>\n");
      out.write("            <td> ");
      out.print(cliente.getRgCliente());
      out.write("</td>\n");
      out.write("            <td> ");
      out.print( converte.converteTela(cliente.getDataNascimento()));
      out.write("</td>\n");
      out.write("            <td> ");
      out.print(cliente.getTelefoneCliente());
      out.write("</td>\n");
      out.write("            <td> \n");
      out.write("                <a href=\"CadastroCliente.jsp?opcao=alterar&codCliente=");
      out.print( cliente.getCodCliente());
      out.write("&nomeCliente=");
      out.print( cliente.getNomeCliente());
      out.write("&enderecoCliente=");
      out.print( cliente.getEnderecoCliente());
      out.write("&cpfCliente=");
      out.print( cliente.getCpfCliente());
      out.write("&rgCliente=");
      out.print( cliente.getRgCliente());
      out.write("&dataNascimento=");
      out.print( converte.converteTela(cliente.getDataNascimento()));
      out.write("&telefoneCliente=");
      out.print( cliente.getTelefoneCliente());
      out.write("\">alterar</a>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <a href=\"CadastroCliente.jsp?opcao=excluir&codCliente=");
      out.print( cliente.getCodCliente());
      out.write("&nomeCliente=");
      out.print( cliente.getNomeCliente());
      out.write("&enderecoCliente=");
      out.print( cliente.getEnderecoCliente());
      out.write("&cpfCliente=");
      out.print( cliente.getCpfCliente());
      out.write("&rgCliente=");
      out.print( cliente.getRgCliente());
      out.write("&dataNascimento=");
      out.print( converte.converteTela(cliente.getDataNascimento()));
      out.write("&telefoneCliente=");
      out.print( cliente.getTelefoneCliente());
      out.write("\">excluir</a>\n");
      out.write("            </td\n");
      out.write("        </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>     \n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
