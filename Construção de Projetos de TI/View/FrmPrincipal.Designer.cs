
namespace View
{
    partial class FrmPrincipal
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
            this.toolStripStatusLabel1 = new System.Windows.Forms.ToolStripStatusLabel();
            this.lblUsuarioLogado = new System.Windows.Forms.ToolStripStatusLabel();
            this.barraStatus = new System.Windows.Forms.StatusStrip();
            this.menuTop = new System.Windows.Forms.MenuStrip();
            this.btnLogout = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.imCadastrar = new System.Windows.Forms.ToolStripMenuItem();
            this.imCadUsuario = new System.Windows.Forms.ToolStripMenuItem();
            this.imCadEmpr = new System.Windows.Forms.ToolStripMenuItem();
            this.imCadLivro = new System.Windows.Forms.ToolStripMenuItem();
            this.imCadEdit = new System.Windows.Forms.ToolStripMenuItem();
            this.imCadAutor = new System.Windows.Forms.ToolStripMenuItem();
            this.imAlterar = new System.Windows.Forms.ToolStripMenuItem();
            this.imAltUsuario = new System.Windows.Forms.ToolStripMenuItem();
            this.imAltEmpr = new System.Windows.Forms.ToolStripMenuItem();
            this.imAltLivro = new System.Windows.Forms.ToolStripMenuItem();
            this.imAltEdit = new System.Windows.Forms.ToolStripMenuItem();
            this.imAltAutor = new System.Windows.Forms.ToolStripMenuItem();
            this.imVisualizar = new System.Windows.Forms.ToolStripMenuItem();
            this.imVisuUsuario = new System.Windows.Forms.ToolStripMenuItem();
            this.imVisuEmpr = new System.Windows.Forms.ToolStripMenuItem();
            this.imVisuLivro = new System.Windows.Forms.ToolStripMenuItem();
            this.imVisuEdit = new System.Windows.Forms.ToolStripMenuItem();
            this.imVisuAutor = new System.Windows.Forms.ToolStripMenuItem();
            this.barraStatus.SuspendLayout();
            this.menuTop.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // toolStripStatusLabel1
            // 
            this.toolStripStatusLabel1.Name = "toolStripStatusLabel1";
            this.toolStripStatusLabel1.Size = new System.Drawing.Size(50, 17);
            this.toolStripStatusLabel1.Text = "Usuário:";
            // 
            // lblUsuarioLogado
            // 
            this.lblUsuarioLogado.Name = "lblUsuarioLogado";
            this.lblUsuarioLogado.Size = new System.Drawing.Size(29, 17);
            this.lblUsuarioLogado.Text = "user";
            // 
            // barraStatus
            // 
            this.barraStatus.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripStatusLabel1,
            this.lblUsuarioLogado});
            this.barraStatus.Location = new System.Drawing.Point(0, 580);
            this.barraStatus.Name = "barraStatus";
            this.barraStatus.Size = new System.Drawing.Size(1114, 22);
            this.barraStatus.TabIndex = 0;
            this.barraStatus.Text = "statusStrip1";
            // 
            // menuTop
            // 
            this.menuTop.BackColor = System.Drawing.SystemColors.GradientInactiveCaption;
            this.menuTop.Font = new System.Drawing.Font("Segoe UI", 10F);
            this.menuTop.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.imCadastrar,
            this.imAlterar,
            this.imVisualizar});
            this.menuTop.Location = new System.Drawing.Point(0, 0);
            this.menuTop.Name = "menuTop";
            this.menuTop.RenderMode = System.Windows.Forms.ToolStripRenderMode.System;
            this.menuTop.Size = new System.Drawing.Size(1114, 27);
            this.menuTop.TabIndex = 1;
            this.menuTop.Text = "menuStrip1";
            // 
            // btnLogout
            // 
            this.btnLogout.Location = new System.Drawing.Point(1024, 2);
            this.btnLogout.Name = "btnLogout";
            this.btnLogout.Size = new System.Drawing.Size(90, 25);
            this.btnLogout.TabIndex = 2;
            this.btnLogout.Values.Text = "Logout";
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::View.Properties.Resources.book_in_library_with_open_textbook;
            this.pictureBox1.Location = new System.Drawing.Point(0, 30);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(1114, 547);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 3;
            this.pictureBox1.TabStop = false;
            // 
            // imCadastrar
            // 
            this.imCadastrar.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.imCadUsuario,
            this.imCadEmpr,
            this.imCadLivro,
            this.imCadEdit,
            this.imCadAutor});
            this.imCadastrar.Image = global::View.Properties.Resources.cadastrro;
            this.imCadastrar.Name = "imCadastrar";
            this.imCadastrar.Size = new System.Drawing.Size(96, 23);
            this.imCadastrar.Text = "&Cadastrar";
            // 
            // imCadUsuario
            // 
            this.imCadUsuario.Name = "imCadUsuario";
            this.imCadUsuario.Size = new System.Drawing.Size(151, 24);
            this.imCadUsuario.Text = "Usuário";
            this.imCadUsuario.Click += new System.EventHandler(this.imCadUsuario_Click);
            // 
            // imCadEmpr
            // 
            this.imCadEmpr.Name = "imCadEmpr";
            this.imCadEmpr.Size = new System.Drawing.Size(151, 24);
            this.imCadEmpr.Text = "Empréstimo";
            this.imCadEmpr.Click += new System.EventHandler(this.imCadEmpr_Click);
            // 
            // imCadLivro
            // 
            this.imCadLivro.Name = "imCadLivro";
            this.imCadLivro.Size = new System.Drawing.Size(151, 24);
            this.imCadLivro.Text = "Livro";
            this.imCadLivro.Click += new System.EventHandler(this.imCadLivro_Click);
            // 
            // imCadEdit
            // 
            this.imCadEdit.Name = "imCadEdit";
            this.imCadEdit.Size = new System.Drawing.Size(151, 24);
            this.imCadEdit.Text = "Editora";
            this.imCadEdit.Click += new System.EventHandler(this.imCadEdit_Click);
            // 
            // imCadAutor
            // 
            this.imCadAutor.Name = "imCadAutor";
            this.imCadAutor.Size = new System.Drawing.Size(151, 24);
            this.imCadAutor.Text = "Autor";
            this.imCadAutor.Click += new System.EventHandler(this.imCadAutor_Click);
            // 
            // imAlterar
            // 
            this.imAlterar.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.imAltUsuario,
            this.imAltEmpr,
            this.imAltLivro,
            this.imAltEdit,
            this.imAltAutor});
            this.imAlterar.Image = global::View.Properties.Resources.edit;
            this.imAlterar.Name = "imAlterar";
            this.imAlterar.Size = new System.Drawing.Size(129, 23);
            this.imAlterar.Text = "&Alterar / Excluir";
            // 
            // imAltUsuario
            // 
            this.imAltUsuario.Name = "imAltUsuario";
            this.imAltUsuario.Size = new System.Drawing.Size(151, 24);
            this.imAltUsuario.Text = "Usuário";
            this.imAltUsuario.Click += new System.EventHandler(this.imAltUsuario_Click);
            // 
            // imAltEmpr
            // 
            this.imAltEmpr.Name = "imAltEmpr";
            this.imAltEmpr.Size = new System.Drawing.Size(151, 24);
            this.imAltEmpr.Text = "Empréstimo";
            this.imAltEmpr.Click += new System.EventHandler(this.imAltEmpr_Click);
            // 
            // imAltLivro
            // 
            this.imAltLivro.Name = "imAltLivro";
            this.imAltLivro.Size = new System.Drawing.Size(151, 24);
            this.imAltLivro.Text = "Livro";
            this.imAltLivro.Click += new System.EventHandler(this.imAltLivro_Click);
            // 
            // imAltEdit
            // 
            this.imAltEdit.Name = "imAltEdit";
            this.imAltEdit.Size = new System.Drawing.Size(151, 24);
            this.imAltEdit.Text = "Editora";
            this.imAltEdit.Click += new System.EventHandler(this.imAltEdit_Click);
            // 
            // imAltAutor
            // 
            this.imAltAutor.Name = "imAltAutor";
            this.imAltAutor.Size = new System.Drawing.Size(151, 24);
            this.imAltAutor.Text = "Autor";
            this.imAltAutor.Click += new System.EventHandler(this.imAltAutor_Click);
            // 
            // imVisualizar
            // 
            this.imVisualizar.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.imVisuUsuario,
            this.imVisuEmpr,
            this.imVisuLivro,
            this.imVisuEdit,
            this.imVisuAutor});
            this.imVisualizar.Image = global::View.Properties.Resources.visualizar;
            this.imVisualizar.Name = "imVisualizar";
            this.imVisualizar.Size = new System.Drawing.Size(141, 23);
            this.imVisualizar.Text = "&Visualizar Dados ";
            // 
            // imVisuUsuario
            // 
            this.imVisuUsuario.Name = "imVisuUsuario";
            this.imVisuUsuario.Size = new System.Drawing.Size(151, 24);
            this.imVisuUsuario.Text = "Usuário";
            this.imVisuUsuario.Click += new System.EventHandler(this.imVisuUsuario_Click);
            // 
            // imVisuEmpr
            // 
            this.imVisuEmpr.Name = "imVisuEmpr";
            this.imVisuEmpr.Size = new System.Drawing.Size(151, 24);
            this.imVisuEmpr.Text = "Empréstimo";
            this.imVisuEmpr.Click += new System.EventHandler(this.imVisuEmpr_Click);
            // 
            // imVisuLivro
            // 
            this.imVisuLivro.Name = "imVisuLivro";
            this.imVisuLivro.Size = new System.Drawing.Size(151, 24);
            this.imVisuLivro.Text = "Livro";
            this.imVisuLivro.Click += new System.EventHandler(this.imVisuLivro_Click);
            // 
            // imVisuEdit
            // 
            this.imVisuEdit.Name = "imVisuEdit";
            this.imVisuEdit.Size = new System.Drawing.Size(151, 24);
            this.imVisuEdit.Text = "Editora";
            this.imVisuEdit.Click += new System.EventHandler(this.imVisuEdit_Click);
            // 
            // imVisuAutor
            // 
            this.imVisuAutor.Name = "imVisuAutor";
            this.imVisuAutor.Size = new System.Drawing.Size(151, 24);
            this.imVisuAutor.Text = "Autor";
            this.imVisuAutor.Click += new System.EventHandler(this.imVisuAutor_Click);
            // 
            // FrmPrincipal
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1114, 602);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.btnLogout);
            this.Controls.Add(this.barraStatus);
            this.Controls.Add(this.menuTop);
            this.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MainMenuStrip = this.menuTop;
            this.MaximizeBox = false;
            this.Name = "FrmPrincipal";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Sistema Gerenciador de Biblioteca";
            this.Load += new System.EventHandler(this.FrmPrincipal_Load);
            this.barraStatus.ResumeLayout(false);
            this.barraStatus.PerformLayout();
            this.menuTop.ResumeLayout(false);
            this.menuTop.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ToolStripStatusLabel toolStripStatusLabel1;
        private System.Windows.Forms.ToolStripStatusLabel lblUsuarioLogado;
        private System.Windows.Forms.StatusStrip barraStatus;
        private System.Windows.Forms.MenuStrip menuTop;
        private System.Windows.Forms.ToolStripMenuItem imCadastrar;
        private System.Windows.Forms.ToolStripMenuItem imCadUsuario;
        private System.Windows.Forms.ToolStripMenuItem imCadEmpr;
        private System.Windows.Forms.ToolStripMenuItem imCadLivro;
        private System.Windows.Forms.ToolStripMenuItem imVisualizar;
        private System.Windows.Forms.ToolStripMenuItem imAlterar;
        private System.Windows.Forms.ToolStripMenuItem imCadEdit;
        private System.Windows.Forms.ToolStripMenuItem imCadAutor;
        private System.Windows.Forms.ToolStripMenuItem imAltUsuario;
        private System.Windows.Forms.ToolStripMenuItem imAltEmpr;
        private System.Windows.Forms.ToolStripMenuItem imAltLivro;
        private System.Windows.Forms.ToolStripMenuItem imAltEdit;
        private System.Windows.Forms.ToolStripMenuItem imAltAutor;
        private System.Windows.Forms.ToolStripMenuItem imVisuUsuario;
        private System.Windows.Forms.ToolStripMenuItem imVisuEmpr;
        private System.Windows.Forms.ToolStripMenuItem imVisuLivro;
        private System.Windows.Forms.ToolStripMenuItem imVisuEdit;
        private System.Windows.Forms.ToolStripMenuItem imVisuAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnLogout;
        private System.Windows.Forms.PictureBox pictureBox1;
    }
}