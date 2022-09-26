package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelo.Fornecedor;
import modelo.DAOFornecedor;

public final class CadastroFornecedor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/ListarFornecedor.jsp");
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
      out.write("            if (document.cadastro.nomeFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Nome';\n");
      out.write("            } else if (document.cadastro.cnpj.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Cnpj';\n");
      out.write("            } else if (document.cadastro.endereco.value == '') {\n");
      out.write("            document.cadastro.mensagem.value = 'Preencha o campo Endereco';\n");
      out.write("            } else if (document.cadastro.email.value == '') {\n");
      out.write("            document.cadastro.mensagem.value = 'Preencha o campo Email';\n");
      out.write("            } else if (document.cadastro.telefone.value == '') {\n");
      out.write("            document.cadastro.mensagem.value = 'Preencha o campo Telefone';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("                document.cadastro.action = 'CAEFornecedor.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'cancelar') {\n");
      out.write("            document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("            document.cadastro.nomeFornecedor.value = '';\n");
      out.write("            document.cadastro.cnpj.value = '';\n");
      out.write("            document.cadastro.email.value = '';\n");
      out.write("            document.cadastro.telefone.value = '';\n");
      out.write("            document.cadastro.action = 'CadastroFornecedor.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("            /// }\n");
      out.write("        } else if (par == 'alterar') {\n");
      out.write("            if (document.cadastro.nomeFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Nome';\n");
      out.write("            } else if (document.cadastro.cnpj.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Cnpj';\n");
      out.write("            } else if (document.cadastro.endereco.value == '') {\n");
      out.write("            document.cadastro.mensagem.value = 'Preencha o campo Endereco';\n");
      out.write("            } else if (document.cadastro.email.value == '') {\n");
      out.write("            document.cadastro.mensagem.value = 'Preencha o campo Email';\n");
      out.write("            } else if (document.cadastro.telefone.value == '') {\n");
      out.write("            document.cadastro.mensagem.value = 'Preencha o campo Telefone';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'alterar';\n");
      out.write("                document.cadastro.action = 'CAEFornecedor.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'excluir') {\n");
      out.write("            document.cadastro.opcao.value = 'excluir';\n");
      out.write("            document.cadastro.action = 'CAEFornecedor.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("   </script>\n");
      out.write("\n");

    String codFornecedor = request.getParameter("codFornecedor");
    if (codFornecedor == null) {
        codFornecedor = "0";
    }
    String mensagem = request.getParameter("mensagem");
    String nomeFornecedor = request.getParameter("nomeFornecedor");
    String cnpj = request.getParameter("cnpj");
    String endereco = request.getParameter("endereco");
    String email = request.getParameter("email");
    String telefone = request.getParameter("telefone");
    
    String opcao = request.getParameter("opcao");
    if (opcao == null) {
        opcao = "cadastrar";
    }

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
      out.write("        <h1>Cadastro Fornecedor</h1>\n");
      out.write("        <form name=\"cadastro\" >\n");
      out.write("\n");
      out.write("            <p><label>Nome: </label><input type=\"text\" name=\"nomeFornecedor\" value=\" ");
      out.print( (nomeFornecedor == null) ? "" : nomeFornecedor);
      out.write("\" size=\"30\">\n");
      out.write("            </p>\n");
      out.write("            <p><label>CNPJ: </label> \n");
      out.write("                <input type=\"text\" name=\"cnpj\" value=\"");
      out.print( (cnpj == null) ? "" : cnpj);
      out.write("\" size= \"30\">\n");
      out.write("            </p>\n");
      out.write("            <p><label>Endereço: </label> \n");
      out.write("                <input type=\"text\" name=\"endereco\" value=\"");
      out.print( (endereco == null) ? "" : endereco);
      out.write("\" size= \"30\">\n");
      out.write("            </p>\n");
      out.write("            <p><label>Email: </label> \n");
      out.write("                <input type=\"text\" name=\"email\" value=\"");
      out.print( (email == null) ? "" : email);
      out.write("\" size= \"30\">\n");
      out.write("            </p>\n");
      out.write("            <p><label>Telefone: </label> \n");
      out.write("                <input type=\"text\" name=\"telefone\" value=\"");
      out.print( (telefone == null) ? "" : telefone);
      out.write("\" size= \"30\">\n");
      out.write("            </p>\n");
      out.write("            ");
if (opcao.equals("cadastrar")) {
      out.write("\n");
      out.write("            <input type=\"button\" value=\"Cadastrar\" name=\"Cadastrar\" onclick=\"enviar('cadastrar')\"/>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("            ");
if (opcao.equals("alterar")) {
      out.write("\n");
      out.write("            <input type=\"button\" value=\"Alterar\" name=\"Alterar\" onclick=\"enviar('alterar')\"/>\n");
      out.write("            <input type=\"button\" value=\"Cancelar\" name=\"Cancelar\" onclick=\"enviar('cancelar')\"/>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("            ");
if (opcao.equals("excluir")) {
      out.write("\n");
      out.write("            <input type=\"button\" value=\"Excluir\" name=\"Excluir\" onclick=\"enviar('excluir')\"/>\n");
      out.write("            <input type=\"button\" value=\"Cancelar\" name=\"Cancelar\" onclick=\"enviar('cancelar')\"/>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"codFornecedor\" value=\"");
      out.print( codFornecedor);
      out.write("\" />\n");
      out.write("            <input type=\"hidden\" name=\"opcao\" value=\"");
      out.print( opcao);
      out.write("\" />\n");
      out.write("\n");
      out.write("            <br></br>\n");
      out.write("            <textarea name=\"mensagem\" rows=\"2\" cols=\"100\">\n");
      out.write("                ");
      out.print( (mensagem == null) ? "" : mensagem);
      out.write("\n");
      out.write("            </textarea>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

DAOFornecedor daoFornecedor = new DAOFornecedor();
List<Fornecedor> ListaFornecedor = daoFornecedor.listarFornecedor();
    


      out.write("\n");
      out.write("<table border =\"1\">\n");
      out.write("    <thead>\n");
      out.write("        \n");
      out.write("    <tr>\n");
      out.write("        <th> CÓDIGO</th>\n");
      out.write("        <th>NOME</th>\n");
      out.write("        <th>CNPJ</th>\n");
      out.write("        <th>ENDEREÇO</th>\n");
      out.write("        <th>EMAIL</th>\n");
      out.write("        <th>TELEFONE</th>\n");
      out.write("        <th>ALTERAR</th>\n");
      out.write("        <th>EXCLUIR</th>\n");
      out.write("     </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");
 for(Fornecedor fornecedor: ListaFornecedor){ 
      out.write("\n");
      out.write("        <tr> \n");
      out.write("            <td> ");
      out.print( fornecedor.getCodFornecedor());
      out.write("</td>\n");
      out.write("            <td> ");
      out.print( fornecedor.getNomeFornecedor());
      out.write("</td>\n");
      out.write("            <td> ");
      out.print( fornecedor.getCnpj());
      out.write("</td>\n");
      out.write("            <td> ");
      out.print( fornecedor.getEndereco());
      out.write("</td>\n");
      out.write("            <td> ");
      out.print( fornecedor.getEmail());
      out.write("</td>\n");
      out.write("            <td> ");
      out.print( fornecedor.getTelefone());
      out.write("</td>\n");
      out.write("            <td> \n");
      out.write("                <a href=\"CadastroFornecedor.jsp?opcao=alterar&codFornecedor=");
      out.print( fornecedor.getCodFornecedor());
      out.write("&nomeFornecedor=");
      out.print( fornecedor.getNomeFornecedor());
      out.write("&cnpj=");
      out.print( fornecedor.getCnpj());
      out.write("&endereco=");
      out.print( fornecedor.getEndereco());
      out.write("&email=");
      out.print( fornecedor.getEmail());
      out.write("&telefone=");
      out.print( fornecedor.getTelefone());
      out.write("\">alterar</a>\n");
      out.write("            </td>\n");
      out.write("            <td> \n");
      out.write("                <a href=\"CadastroFornecedor.jsp?opcao=excluir&codFornecedor=");
      out.print( fornecedor.getCodFornecedor());
      out.write("&nomeFornecedor=");
      out.print( fornecedor.getNomeFornecedor());
      out.write("&cnpj=");
      out.print( fornecedor.getCnpj());
      out.write("&endereco=");
      out.print( fornecedor.getEndereco());
      out.write("&email=");
      out.print( fornecedor.getEmail());
      out.write("&telefone=");
      out.print( fornecedor.getTelefone());
      out.write("\">excluir</a>\n");
      out.write("            </td>\n");
      out.write("            <td> \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("    </tbody>\n");
      out.write("    \n");
      out.write("</table>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
