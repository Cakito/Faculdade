
namespace View
{
    partial class CadUsuario
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.gpbDadosPerfil = new System.Windows.Forms.GroupBox();
            this.lblNasc = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.lblCel = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.lblEmail = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.lblNome = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.lblCpf = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.mtbNasc = new System.Windows.Forms.MaskedTextBox();
            this.mtbCpf = new ComponentFactory.Krypton.Toolkit.KryptonMaskedTextBox();
            this.mtbCel = new ComponentFactory.Krypton.Toolkit.KryptonMaskedTextBox();
            this.txbEmail = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.txbNome = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.kryptonButton1 = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.btnCadCancelarUsuario = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.gpbDadosPerfil.SuspendLayout();
            this.SuspendLayout();
            // 
            // gpbDadosPerfil
            // 
            this.gpbDadosPerfil.Controls.Add(this.lblNasc);
            this.gpbDadosPerfil.Controls.Add(this.lblCel);
            this.gpbDadosPerfil.Controls.Add(this.lblEmail);
            this.gpbDadosPerfil.Controls.Add(this.lblNome);
            this.gpbDadosPerfil.Controls.Add(this.lblCpf);
            this.gpbDadosPerfil.Controls.Add(this.mtbNasc);
            this.gpbDadosPerfil.Controls.Add(this.mtbCpf);
            this.gpbDadosPerfil.Controls.Add(this.mtbCel);
            this.gpbDadosPerfil.Controls.Add(this.txbEmail);
            this.gpbDadosPerfil.Controls.Add(this.txbNome);
            this.gpbDadosPerfil.Location = new System.Drawing.Point(33, 25);
            this.gpbDadosPerfil.Name = "gpbDadosPerfil";
            this.gpbDadosPerfil.Size = new System.Drawing.Size(632, 279);
            this.gpbDadosPerfil.TabIndex = 0;
            this.gpbDadosPerfil.TabStop = false;
            this.gpbDadosPerfil.Text = "Dados do Perfil";
            // 
            // lblNasc
            // 
            this.lblNasc.Location = new System.Drawing.Point(342, 133);
            this.lblNasc.Name = "lblNasc";
            this.lblNasc.Size = new System.Drawing.Size(78, 20);
            this.lblNasc.TabIndex = 10;
            this.lblNasc.Values.Text = "Nascimento:";
            // 
            // lblCel
            // 
            this.lblCel.Location = new System.Drawing.Point(369, 71);
            this.lblCel.Name = "lblCel";
            this.lblCel.Size = new System.Drawing.Size(51, 20);
            this.lblCel.TabIndex = 9;
            this.lblCel.Values.Text = "Celular:";
            // 
            // lblEmail
            // 
            this.lblEmail.Location = new System.Drawing.Point(46, 207);
            this.lblEmail.Name = "lblEmail";
            this.lblEmail.Size = new System.Drawing.Size(42, 20);
            this.lblEmail.TabIndex = 8;
            this.lblEmail.Values.Text = "Email:";
            // 
            // lblNome
            // 
            this.lblNome.Location = new System.Drawing.Point(41, 135);
            this.lblNome.Name = "lblNome";
            this.lblNome.Size = new System.Drawing.Size(47, 20);
            this.lblNome.TabIndex = 7;
            this.lblNome.Values.Text = "Nome:";
            // 
            // lblCpf
            // 
            this.lblCpf.Location = new System.Drawing.Point(54, 68);
            this.lblCpf.Name = "lblCpf";
            this.lblCpf.Size = new System.Drawing.Size(34, 20);
            this.lblCpf.TabIndex = 1;
            this.lblCpf.Values.Text = "CPF:";
            // 
            // mtbNasc
            // 
            this.mtbNasc.Culture = new System.Globalization.CultureInfo("pt-BR");
            this.mtbNasc.Location = new System.Drawing.Point(426, 135);
            this.mtbNasc.Mask = "00/00/0000";
            this.mtbNasc.Name = "mtbNasc";
            this.mtbNasc.Size = new System.Drawing.Size(113, 20);
            this.mtbNasc.TabIndex = 6;
            this.mtbNasc.ValidatingType = typeof(System.DateTime);
            // 
            // mtbCpf
            // 
            this.mtbCpf.Culture = new System.Globalization.CultureInfo("pt-BR");
            this.mtbCpf.Location = new System.Drawing.Point(94, 68);
            this.mtbCpf.Mask = "000.000.000-00";
            this.mtbCpf.Name = "mtbCpf";
            this.mtbCpf.Size = new System.Drawing.Size(194, 23);
            this.mtbCpf.TabIndex = 5;
            this.mtbCpf.Text = "   ,   ,   -";
            // 
            // mtbCel
            // 
            this.mtbCel.Location = new System.Drawing.Point(426, 68);
            this.mtbCel.Mask = "(99)90000-0000";
            this.mtbCel.Name = "mtbCel";
            this.mtbCel.Size = new System.Drawing.Size(113, 23);
            this.mtbCel.TabIndex = 4;
            this.mtbCel.Text = "(  )     -";
            // 
            // txbEmail
            // 
            this.txbEmail.Location = new System.Drawing.Point(94, 207);
            this.txbEmail.Name = "txbEmail";
            this.txbEmail.Size = new System.Drawing.Size(194, 23);
            this.txbEmail.TabIndex = 2;
            // 
            // txbNome
            // 
            this.txbNome.Location = new System.Drawing.Point(94, 133);
            this.txbNome.Name = "txbNome";
            this.txbNome.Size = new System.Drawing.Size(194, 23);
            this.txbNome.TabIndex = 1;
            // 
            // kryptonButton1
            // 
            this.kryptonButton1.Location = new System.Drawing.Point(388, 322);
            this.kryptonButton1.Name = "kryptonButton1";
            this.kryptonButton1.Size = new System.Drawing.Size(90, 25);
            this.kryptonButton1.TabIndex = 1;
            this.kryptonButton1.Values.Text = "Confirmar";
            // 
            // btnCadCancelarUsuario
            // 
            this.btnCadCancelarUsuario.Location = new System.Drawing.Point(231, 322);
            this.btnCadCancelarUsuario.Name = "btnCadCancelarUsuario";
            this.btnCadCancelarUsuario.Size = new System.Drawing.Size(90, 25);
            this.btnCadCancelarUsuario.TabIndex = 2;
            this.btnCadCancelarUsuario.Values.Text = "Cancelar";
            this.btnCadCancelarUsuario.Click += new System.EventHandler(this.btnCadCancelarUsuario_Click);
            // 
            // CadUsuario
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(687, 359);
            this.Controls.Add(this.btnCadCancelarUsuario);
            this.Controls.Add(this.kryptonButton1);
            this.Controls.Add(this.gpbDadosPerfil);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "CadUsuario";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Cadastro Usuário";
            this.gpbDadosPerfil.ResumeLayout(false);
            this.gpbDadosPerfil.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gpbDadosPerfil;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbEmail;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbNome;
        private ComponentFactory.Krypton.Toolkit.KryptonMaskedTextBox mtbCel;
        private ComponentFactory.Krypton.Toolkit.KryptonMaskedTextBox mtbCpf;
        private System.Windows.Forms.MaskedTextBox mtbNasc;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblNasc;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblCel;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblEmail;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblNome;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblCpf;
        private ComponentFactory.Krypton.Toolkit.KryptonButton kryptonButton1;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnCadCancelarUsuario;
    }
}