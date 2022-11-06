
namespace View
{
    partial class CadLivro
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
            this.gpbLivro = new System.Windows.Forms.GroupBox();
            this.txbEdicao = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.txbAno = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.txbTitulo = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.txbIsbn = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.lblEdicao = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.lblAno = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.lblTitulo = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.lblIsbn = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.btnConfirmLivro = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.btnCancelLivro = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.gpbLivro.SuspendLayout();
            this.SuspendLayout();
            // 
            // gpbLivro
            // 
            this.gpbLivro.Controls.Add(this.txbEdicao);
            this.gpbLivro.Controls.Add(this.txbAno);
            this.gpbLivro.Controls.Add(this.txbTitulo);
            this.gpbLivro.Controls.Add(this.txbIsbn);
            this.gpbLivro.Controls.Add(this.lblEdicao);
            this.gpbLivro.Controls.Add(this.lblAno);
            this.gpbLivro.Controls.Add(this.lblTitulo);
            this.gpbLivro.Controls.Add(this.lblIsbn);
            this.gpbLivro.Location = new System.Drawing.Point(31, 28);
            this.gpbLivro.Name = "gpbLivro";
            this.gpbLivro.Size = new System.Drawing.Size(497, 224);
            this.gpbLivro.TabIndex = 0;
            this.gpbLivro.TabStop = false;
            this.gpbLivro.Text = "Dados do Livro";
            // 
            // txbEdicao
            // 
            this.txbEdicao.Location = new System.Drawing.Point(390, 134);
            this.txbEdicao.Name = "txbEdicao";
            this.txbEdicao.Size = new System.Drawing.Size(43, 23);
            this.txbEdicao.TabIndex = 7;
            // 
            // txbAno
            // 
            this.txbAno.Location = new System.Drawing.Point(390, 63);
            this.txbAno.Name = "txbAno";
            this.txbAno.Size = new System.Drawing.Size(43, 23);
            this.txbAno.TabIndex = 6;
            // 
            // txbTitulo
            // 
            this.txbTitulo.Location = new System.Drawing.Point(92, 131);
            this.txbTitulo.Name = "txbTitulo";
            this.txbTitulo.Size = new System.Drawing.Size(171, 23);
            this.txbTitulo.TabIndex = 5;
            // 
            // txbIsbn
            // 
            this.txbIsbn.Location = new System.Drawing.Point(92, 63);
            this.txbIsbn.Name = "txbIsbn";
            this.txbIsbn.Size = new System.Drawing.Size(171, 23);
            this.txbIsbn.TabIndex = 4;
            // 
            // lblEdicao
            // 
            this.lblEdicao.Location = new System.Drawing.Point(335, 137);
            this.lblEdicao.Name = "lblEdicao";
            this.lblEdicao.Size = new System.Drawing.Size(49, 20);
            this.lblEdicao.TabIndex = 3;
            this.lblEdicao.Values.Text = "Edição:";
            // 
            // lblAno
            // 
            this.lblAno.Location = new System.Drawing.Point(349, 63);
            this.lblAno.Name = "lblAno";
            this.lblAno.Size = new System.Drawing.Size(35, 20);
            this.lblAno.TabIndex = 2;
            this.lblAno.Values.Text = "Ano:";
            // 
            // lblTitulo
            // 
            this.lblTitulo.Location = new System.Drawing.Point(42, 134);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(44, 20);
            this.lblTitulo.TabIndex = 1;
            this.lblTitulo.Values.Text = "Título:";
            // 
            // lblIsbn
            // 
            this.lblIsbn.Location = new System.Drawing.Point(47, 66);
            this.lblIsbn.Name = "lblIsbn";
            this.lblIsbn.Size = new System.Drawing.Size(39, 20);
            this.lblIsbn.TabIndex = 0;
            this.lblIsbn.Values.Text = "ISBN:";
            // 
            // btnConfirmLivro
            // 
            this.btnConfirmLivro.Location = new System.Drawing.Point(341, 271);
            this.btnConfirmLivro.Name = "btnConfirmLivro";
            this.btnConfirmLivro.Size = new System.Drawing.Size(90, 25);
            this.btnConfirmLivro.TabIndex = 1;
            this.btnConfirmLivro.Values.Text = "Confirmar";
            // 
            // btnCancelLivro
            // 
            this.btnCancelLivro.Location = new System.Drawing.Point(158, 271);
            this.btnCancelLivro.Name = "btnCancelLivro";
            this.btnCancelLivro.Size = new System.Drawing.Size(90, 25);
            this.btnCancelLivro.TabIndex = 2;
            this.btnCancelLivro.Values.Text = "Cancelar";
            this.btnCancelLivro.Click += new System.EventHandler(this.btnCancelLivro_Click);
            // 
            // CadLivro
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(565, 308);
            this.Controls.Add(this.btnCancelLivro);
            this.Controls.Add(this.btnConfirmLivro);
            this.Controls.Add(this.gpbLivro);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "CadLivro";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Cadastro Livro";
            this.gpbLivro.ResumeLayout(false);
            this.gpbLivro.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gpbLivro;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblEdicao;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblAno;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblTitulo;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblIsbn;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbEdicao;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbAno;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbTitulo;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbIsbn;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnConfirmLivro;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnCancelLivro;
    }
}