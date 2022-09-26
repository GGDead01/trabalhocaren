package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.DAOFuncionario;
import modelo.Funcionario;
import java.util.List;

public final class CadastroFuncionario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/ListarFuncionario.jsp");
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

      out.write("<script>\n");
      out.write("    function enviar(par) {\n");
      out.write("        if (par == 'cadastrar') {\n");
      out.write("\n");
      out.write("            if (document.cadastro.nomeFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Nome';\n");
      out.write("            } else if (document.cadastro.enderecoFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Endereco';\n");
      out.write("            } else if (document.cadastro.cpfFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo CPF';\n");
      out.write("            } else if (document.cadastro.rgFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo RG';\n");
      out.write("            } else if (document.cadastro.telefoneFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Telefone';\n");
      out.write("            } else if (document.cadastro.salario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Salario';\n");
      out.write("            } else if (document.cadastro.cargaHoraria.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Carga Horaria';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("                document.cadastro.action = 'CAEFuncionario.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'cancelar') {\n");
      out.write("            document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("            document.cadastro.nomeFuncionario.value = '';\n");
      out.write("            document.cadastro.enderecoFuncionario.value = '';\n");
      out.write("            document.cadastro.cpfFuncionario.value = '';\n");
      out.write("            document.cadastro.rgFuncionario.value = '';\n");
      out.write("            document.cadastro.telefoneFuncionario.value = '';\n");
      out.write("            document.cadastro.salario.value = '';\n");
      out.write("            document.cadastro.cargaHoraria.value = '';\n");
      out.write("            document.cadastro.action = 'CadastroFuncionario.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("            /// }\n");
      out.write("        } else if (par == 'alterar') {\n");
      out.write("\n");
      out.write("            if (document.cadastro.nomeFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Nome';\n");
      out.write("            } else if (document.cadastro.enderecoFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Endereco';\n");
      out.write("            } else if (document.cadastro.cpfFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo CPF';\n");
      out.write("            } else if (document.cadastro.rgFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo RG';\n");
      out.write("            } else if (document.cadastro.telefoneFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Telefone';\n");
      out.write("            } else if (document.cadastro.salario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Salario';\n");
      out.write("            } else if (document.cadastro.cargaHoraria.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Carga Horaria';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'alterar';\n");
      out.write("                document.cadastro.action = 'CAEFuncionario.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'excluir') {\n");
      out.write("            document.cadastro.opcao.value = 'excluir';\n");
      out.write("            document.cadastro.action = 'CAEFuncionario.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");

    String codFuncionario = request.getParameter("codFuncionario");
    if (codFuncionario == null) {
        codFuncionario = "0";
    }

    String mensagem = request.getParameter("mensagem");
    String nomeFuncionario = request.getParameter("nomeFuncionario");
    String enderecoFuncionario = request.getParameter("enderecoFuncionario");
    String cpfFuncionario = request.getParameter("cpfFuncionario");
    String rgFuncionario = request.getParameter("rgFuncionario");
    String telefoneFuncionario = request.getParameter("telefoneFuncionario");
    String salario = request.getParameter("salario");
    String cargaHoraria = request.getParameter("cargaHoraria");
    String opcao = request.getParameter("opcao");
    if (opcao == null) {
        opcao = "cadastrar";
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=Latin1\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadastro Funcionario</h1>\n");
      out.write("        <form name=\"cadastro\" >\n");
      out.write("            <p><label>Nome: </label><input type=\"text\" name=\"nomeFuncionario\" value=\"");
      out.print( (nomeFuncionario == null) ? "" : nomeFuncionario);
      out.write("\" size=\"30\" /> \n");
      out.write("            </p>\n");
      out.write("            <p><label>Endereço: </label><input type=\"text\" name=\"enderecoFuncionario\" value=\"");
      out.print( (enderecoFuncionario == null) ? "" : enderecoFuncionario);
      out.write("\" size=\"30\" /> \n");
      out.write("            </p>\n");
      out.write("            <p><label>CPF: </label><input type=\"text\" name=\"cpfFuncionario\" value=\"");
      out.print( (cpfFuncionario == null) ? "" : cpfFuncionario);
      out.write("\" size=\"30\" /> \n");
      out.write("            </p>\n");
      out.write("            <p><label>RG: </label><input type=\"text\" name=\"rgFuncionario\" value=\"");
      out.print( (rgFuncionario == null) ? "" : rgFuncionario);
      out.write("\" size=\"30\" /> \n");
      out.write("            </p>\n");
      out.write("            <p><label>Telefone: </label><input type=\"text\" name=\"telefoneFuncionario\" value=\"");
      out.print( (telefoneFuncionario == null) ? "" : telefoneFuncionario);
      out.write("\" size=\"30\" /> \n");
      out.write("            </p>\n");
      out.write("            <p><label>Salário: </label><input type=\"text\" name=\"salario\" value=\"");
      out.print( (salario == null) ? "" : salario);
      out.write("\" size=\"30\" /> \n");
      out.write("            </p>\n");
      out.write("            <p><label>Carga Horária: </label><input type=\"text\" name=\"cargaHoraria\" value=\"");
      out.print( (cargaHoraria == null) ? "" : cargaHoraria);
      out.write("\" size=\"30\" /> \n");
      out.write("            </p>\n");
      out.write("            \n");
if (opcao.equals("cadastrar")) {
      out.write("\n");
      out.write("<input type=\"button\" value=\"Cadastrar\" name=\"Cadastrar\" onclick=\"enviar('cadastrar')\" />\n");
}
      out.write('\n');
if (opcao.equals("alterar")) {
      out.write("\n");
      out.write("<input type=\"button\" value=\"Alterar\" name=\"Alterar\" onclick=\"enviar('alterar')\" />\n");
      out.write("<input type=\"button\" value=\"Cancelar\" name=\"Cancelar\" onclick=\"enviar('cancelar')\" />\n");
}
      out.write('\n');
if (opcao.equals("excluir")) {
      out.write("  \n");
      out.write("<input type=\"button\" value=\"Excluir\" name=\"Excluir\" onclick=\"enviar('excluir')\" />\n");
      out.write("<input type=\"button\" value=\"Cancelar\" name=\"Cancelar\" onclick=\"enviar('cancelar')\" />\n");
}
      out.write("\n");
      out.write("<input type=\"hidden\" name=\"codFuncionario\" value=\"");
      out.print(codFuncionario);
      out.write("\" />\n");
      out.write("<input type=\"hidden\" name=\"opcao\" value=\"");
      out.print(opcao);
      out.write("\" />\n");
      out.write("<br></br>\n");
      out.write("<textarea name=\"mensagem\" rows=\"2\" cols=\"100\">\n");
      out.write("    ");
      out.print( (mensagem == null) ? "" : mensagem);
      out.write("\n");
      out.write("</textarea>\n");
      out.write("</form>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    DAOFuncionario daoFuncionario = new DAOFuncionario();
    List<Funcionario> listaFuncionario = daoFuncionario.listarFuncionario();

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
      out.write("            <th>TELEFONE</th>\n");
      out.write("            <th>SALÁRIO</th>\n");
      out.write("            <th>CARGA HORÁRIA</th>\n");
      out.write("            <th>ALTERAR</th>\n");
      out.write("            <th>EXCLUIR</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");
 for (Funcionario funcionario : listaFuncionario) {
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( funcionario.getCodFuncionario());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getNomeFuncionario());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getEnderecoFuncionario());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getCpfFuncionario());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getRgFuncionario());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getTelefoneFuncionario());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getSalario());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getCargaHoraria());
      out.write("</td>\n");
      out.write("            <td> \n");
      out.write("                <a href=\"CadastroFuncionario.jsp?opcao=alterar&codFuncionario=");
      out.print( funcionario.getCodFuncionario());
      out.write("&nomeFuncionario=");
      out.print( funcionario.getNomeFuncionario());
      out.write("&enderecoFuncionario=");
      out.print( funcionario.getEnderecoFuncionario());
      out.write("&cpfFuncionario=");
      out.print( funcionario.getCpfFuncionario());
      out.write("&rgFuncionario=");
      out.print( funcionario.getRgFuncionario());
      out.write("&telefoneFuncionario=");
      out.print( funcionario.getTelefoneFuncionario());
      out.write("&salario=");
      out.print( funcionario.getSalario());
      out.write("&cargaHoraria=");
      out.print( funcionario.getCargaHoraria());
      out.write("\">alterar</a> \n");
      out.write("            </td> \n");
      out.write("            <td> \n");
      out.write("                <a href=\"CadastroFuncionario.jsp?opcao=excluir&codFuncionario=");
      out.print( funcionario.getCodFuncionario());
      out.write("&nomeFuncionario=");
      out.print( funcionario.getNomeFuncionario());
      out.write("&enderecoFuncionario=");
      out.print( funcionario.getEnderecoFuncionario());
      out.write("&cpfFuncionario=");
      out.print( funcionario.getCpfFuncionario());
      out.write("&rgFuncionario=");
      out.print( funcionario.getRgFuncionario());
      out.write("&telefoneFuncionario=");
      out.print( funcionario.getTelefoneFuncionario());
      out.write("&salario=");
      out.print( funcionario.getSalario());
      out.write("&cargaHoraria=");
      out.print( funcionario.getCargaHoraria());
      out.write("\">excluir</a>\n");
      out.write("            </td\n");
      out.write("        </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>     \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
