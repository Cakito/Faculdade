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
    public partial class FrmLogin : Form
    {
        public FrmLogin()
        {
            InitializeComponent();
        }

        private void btnEntrar_Click(object sender, EventArgs e)
        {
            Usuario usuario = new Usuario();
            usuario.User = txbUsuario.Text;
            usuario.Senha = txbSenha.Text;

            if (ValidarLogin(usuario))
            {
                this.DialogResult = DialogResult.OK;

                this.Tag = usuario;

                this.Close();
            }
            else
            {
                lblMsg.Visible = true;
            }
        }

        private bool ValidarLogin(Usuario _usuario)
        {
            bool resultado = false;

            try
            {
                if (_usuario.User.Equals("usuario") && _usuario.Senha.Equals("senha"))
                {
                    resultado = true;
                }
            }
            catch (Exception ex)
            {

                MessageBox.Show("Erro ao efetuar o Login: " + ex.Message);
            }

            return resultado;
        }

        private void txbUsuario_TextChanged(object sender, EventArgs e)
        {
            lblMsg.Visible = false;
        }

        private void txbSenha_TextChanged(object sender, EventArgs e)
        {
            lblMsg.Visible = false;
        }

        protected override bool ProcessCmdKey(ref Message msg, Keys keyData)
        {

            switch (keyData)
            {
                case Keys.Enter:
                    btnEntrar_Click(null, null);
                    break;
                case Keys.Escape:
                    this.Close();
                    break;
            }
            return base.ProcessCmdKey(ref msg, keyData);
        }
    }
}
