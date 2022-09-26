package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelo.Cliente;
import modelo.DAOCliente;
import modelo.DAOCliente;
import modelo.ConverteData;
import modelo.Cliente;
import java.util.List;

public final class CadastroCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/ListarCliente.jsp");
  }

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
      response.setContentType("text/html;charset=Latin1");
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
      out.write("<script>\n");
      out.write("    function enviar(par) {\n");
      out.write("        if (par == 'cadastrar') {\n");
      out.write("\n");
      out.write("            if (document.cadastro.nomeCliente.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Nome';\n");
      out.write("            } else if (document.cadastro.enderecoCliente.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Endereço';\n");
      out.write("            } else if (document.cadastro.cpfCliente.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Cpf';\n");
      out.write("            } else if (document.cadastro.rgCliente.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Rg';\n");
      out.write("            } else if (document.cadastro.dataNascimento.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Nascimento';\n");
      out.write("            } else if (document.cadastro.telefoneCliente.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Telefone';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("                document.cadastro.action = 'CAECliente.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'cancelar') {\n");
      out.write("            document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("            document.cadastro.nomeCliente.value = '';\n");
      out.write("            document.cadastro.enderecoCliente.value = '';\n");
      out.write("            document.cadastro.cpfCliente.value = '';\n");
      out.write("            document.cadastro.rgCliente.value = '';\n");
      out.write("            document.cadastro.dataNascimento.value = '';\n");
      out.write("            document.cadastro.telefoneCliente.value = '';\n");
      out.write("            document.cadastro.action = 'CadastroCliente.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("            /// }\n");
      out.write("        } else if (par == 'alterar') {\n");
      out.write("\n");
      out.write("            if (document.cadastro.nomeCliente.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Nome';\n");
      out.write("            } else if (document.cadastro.enderecoCliente.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Endereço';\n");
      out.write("            } else if (document.cadastro.cpfCliente.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Cpf';\n");
      out.write("            } else if (document.cadastro.rgCliente.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Rg';\n");
      out.write("            } else if (document.cadastro.dataNascimento.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Nascimento';\n");
      out.write("            } else if (document.cadastro.telefoneCliente.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Telefone';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'alterar';\n");
      out.write("                document.cadastro.action = 'CAECliente.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'excluir') {\n");
      out.write("            document.cadastro.opcao.value = 'excluir';\n");
      out.write("            document.cadastro.action = 'CAECliente.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");

    String codCliente = request.getParameter("codCliente");
    if (codCliente == null) {
        codCliente = "0";
    }
    String mensagem = request.getParameter("mensagem");
    String nomeCliente = request.getParameter("nomeCliente");
    String enderecoCliente = request.getParameter("enderecoCliente");
    String cpfCliente = request.getParameter("cpfCliente");
    String rgCliente = request.getParameter("rgCliente");
    String dataNascimento = request.getParameter("dataNascimento");
    String telefoneCliente = request.getParameter("telefoneCliente");

    String opcao = request.getParameter("opcao");
    if (opcao == null) {
        opcao = "cadastrar";
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=Latin1\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadastro Cliente</h1>\n");
      out.write("        <form name=\"cadastro\" >\n");
      out.write("\n");
      out.write("            <p><label>Nome: </label><input type=\"text\" name=\"nomeCliente\" value=\" ");
      out.print( (nomeCliente == null) ? "" : nomeCliente);
      out.write("\" size=\"30\">\n");
      out.write("            </p>\n");
      out.write("            <p><label>Endereço: </label><input type=\"text\" name=\"enderecoCliente\" value=\"");
      out.print( (enderecoCliente == null) ? "" : enderecoCliente);
      out.write("\" size= \"30\">\n");
      out.write("            </p>\n");
      out.write("            <p><label>CPF: </label><input type=\"text\" name=\"cpfCliente\" value=\"");
      out.print( (cpfCliente == null) ? "" : cpfCliente);
      out.write("\" size= \"30\">\n");
      out.write("            </p>\n");
      out.write("            <p><label>RG: </label><input type=\"text\" name=\"rgCliente\" value=\"");
      out.print( (rgCliente == null) ? "" : rgCliente);
      out.write("\" size= \"30\">\n");
      out.write("            </p>\n");
      out.write("            <p><label>Nascimento: </label><input type=\"text\" name=\"dataNascimento\" value=\"");
      out.print( (dataNascimento == null) ? "" : dataNascimento);
      out.write("\" size= \"30\">\n");
      out.write("            </p>\n");
      out.write("            <p><label>Telefone: </label><input type=\"text\" name=\"telefoneCliente\" value=\"");
      out.print( (telefoneCliente == null) ? "" : telefoneCliente);
      out.write("\" size= \"30\">\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("        ");
if (opcao.equals("cadastrar")) {
      out.write("\n");
      out.write("        <input type=\"button\" value=\"Cadastrar\" name=\"Cadastrar\" onclick=\"enviar('cadastrar')\" />\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");
if (opcao.equals("alterar")) {
      out.write("\n");
      out.write("        <input type=\"button\" value=\"Alterar\" name=\"Alterar\" onclick=\"enviar('alterar')\" />\n");
      out.write("        <input type=\"button\" value=\"Cancelar\" name=\"Cancelar\" onclick=\"enviar('cancelar')\" />\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");
if (opcao.equals("excluir")) {
      out.write("  \n");
      out.write("        <input type=\"button\" value=\"Excluir\" name=\"Excluir\" onclick=\"enviar('excluir')\" />\n");
      out.write("        <input type=\"button\" value=\"Cancelar\" name=\"Cancelar\" onclick=\"enviar('cancelar')\" />\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <input type=\"hidden\" name=\"codCliente\" value=\"");
      out.print(codCliente);
      out.write("\" />\n");
      out.write("        <input type=\"hidden\" name=\"opcao\" value=\"");
      out.print(opcao);
      out.write("\" />\n");
      out.write("        <br></br>\n");
      out.write("        <textarea name=\"mensagem\" rows=\"2\" cols=\"100\">\n");
      out.write("            ");
      out.print( (mensagem == null) ? "" : mensagem);
      out.write("\n");
      out.write("        </textarea>\n");
      out.write("    </form>\n");
      out.write("    <br>\n");
      out.write("    ");
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
      out.write("&%cpfCliente=");
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
      out.write("&%cpfCliente=");
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
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
