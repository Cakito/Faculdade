using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Model;

namespace View
{
    public partial class FrmPrincipal : Form
    {
        public FrmPrincipal()
        {
            InitializeComponent();
        }

        private void FrmPrincipal_Load(object sender, EventArgs e)
        {
            FrmLogin formLogin = new FrmLogin();
            
            if(formLogin.ShowDialog() == DialogResult.OK)
            {
                Usuario u = (Usuario)formLogin.Tag;
                lblUsuarioLogado.Text = u.User;
                this.Show();
            }            
            else
            {
                this.Close();
            }
        }

        private void imCadUsuario_Click(object sender, EventArgs e)
        {
            CadUsuario cadU = new CadUsuario();

            cadU.ShowDialog();
        }

        private void imCadEmpr_Click(object sender, EventArgs e)
        {
            CadEmpr cadEmpr = new CadEmpr();

            cadEmpr.ShowDialog();
        }

        private void imCadLivro_Click(object sender, EventArgs e)
        {
            CadLivro cadL = new CadLivro();

            cadL.ShowDialog();
        }

        private void imCadEdit_Click(object sender, EventArgs e)
        {
            CadEdit cadEdit = new CadEdit();

            cadEdit.ShowDialog();
        }

        private void imCadAutor_Click(object sender, EventArgs e)
        {
            CadAutor cadAutor = new CadAutor();

            cadAutor.ShowDialog();
        }

        private void imVisuUsuario_Click(object sender, EventArgs e)
        {
            ConsultarUsuario consUsuario = new ConsultarUsuario();

            consUsuario.ShowDialog();
        }

        private void imVisuEmpr_Click(object sender, EventArgs e)
        {
            ConsultarEmpr consEmpr = new ConsultarEmpr();

            consEmpr.ShowDialog();
        }

        private void imVisuLivro_Click(object sender, EventArgs e)
        {
            ConsultarLivro consL = new ConsultarLivro();

            consL.ShowDialog();
        }

        private void imVisuEdit_Click(object sender, EventArgs e)
        {
            ConsultarEditora consEdit = new ConsultarEditora();

            consEdit.ShowDialog();
        }

        private void imVisuAutor_Click(object sender, EventArgs e)
        {
            ConsultarAutor consAutor = new ConsultarAutor();

            consAutor.ShowDialog();
        }

        private void imAltUsuario_Click(object sender, EventArgs e)
        {
            AlterUsuario altU = new AlterUsuario();

            altU.ShowDialog();
        }

        private void imAltEmpr_Click(object sender, EventArgs e)
        {
            AlterEmprestimo altEmpr = new AlterEmprestimo();

            altEmpr.ShowDialog();
        }

        private void imAltLivro_Click(object sender, EventArgs e)
        {
            AlterLivro altL = new AlterLivro();

            altL.ShowDialog();

        }

        private void imAltEdit_Click(object sender, EventArgs e)
        {
            AlterEditora altEdit = new AlterEditora();

            altEdit.ShowDialog();
        }

        private void imAltAutor_Click(object sender, EventArgs e)
        {
            AlterAutor altAutor = new AlterAutor();

            altAutor.ShowDialog();
        }
    }
}
