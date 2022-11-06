
namespace View
{
    partial class ConsultarUsuario
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
            this.dgvUsuario = new ComponentFactory.Krypton.Toolkit.KryptonDataGridView();
            this.colCPF = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colNomeUsuario = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colEmail = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colCelular = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.lblBuscarUsuario = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.txbBuscarUsuario = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.btnFecharUsuario = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.btnConsUsuarioBusca = new System.Windows.Forms.ToolStripButton();
            ((System.ComponentModel.ISupportInitialize)(this.dgvUsuario)).BeginInit();
            this.toolStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // dgvUsuario
            // 
            this.dgvUsuario.AllowUserToAddRows = false;
            this.dgvUsuario.AllowUserToDeleteRows = false;
            this.dgvUsuario.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvUsuario.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colCPF,
            this.colNomeUsuario,
            this.colEmail,
            this.colCelular});
            this.dgvUsuario.Location = new System.Drawing.Point(23, 73);
            this.dgvUsuario.Name = "dgvUsuario";
            this.dgvUsuario.ReadOnly = true;
            this.dgvUsuario.RowHeadersVisible = false;
            this.dgvUsuario.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvUsuario.Size = new System.Drawing.Size(602, 477);
            this.dgvUsuario.TabIndex = 0;
            // 
            // colCPF
            // 
            this.colCPF.HeaderText = "CPF";
            this.colCPF.Name = "colCPF";
            this.colCPF.ReadOnly = true;
            this.colCPF.Width = 150;
            // 
            // colNomeUsuario
            // 
            this.colNomeUsuario.HeaderText = "Nome";
            this.colNomeUsuario.Name = "colNomeUsuario";
            this.colNomeUsuario.ReadOnly = true;
            this.colNomeUsuario.Width = 150;
            // 
            // colEmail
            // 
            this.colEmail.HeaderText = "Email";
            this.colEmail.Name = "colEmail";
            this.colEmail.ReadOnly = true;
            this.colEmail.Width = 150;
            // 
            // colCelular
            // 
            this.colCelular.HeaderText = "Celular";
            this.colCelular.Name = "colCelular";
            this.colCelular.ReadOnly = true;
            this.colCelular.Width = 150;
            // 
            // lblBuscarUsuario
            // 
            this.lblBuscarUsuario.Location = new System.Drawing.Point(166, 24);
            this.lblBuscarUsuario.Name = "lblBuscarUsuario";
            this.lblBuscarUsuario.Size = new System.Drawing.Size(49, 20);
            this.lblBuscarUsuario.TabIndex = 1;
            this.lblBuscarUsuario.Values.Text = "Buscar:";
            // 
            // txbBuscarUsuario
            // 
            this.txbBuscarUsuario.Location = new System.Drawing.Point(221, 21);
            this.txbBuscarUsuario.Name = "txbBuscarUsuario";
            this.txbBuscarUsuario.Size = new System.Drawing.Size(262, 23);
            this.txbBuscarUsuario.TabIndex = 2;
            // 
            // btnFecharUsuario
            // 
            this.btnFecharUsuario.Location = new System.Drawing.Point(535, 577);
            this.btnFecharUsuario.Name = "btnFecharUsuario";
            this.btnFecharUsuario.Size = new System.Drawing.Size(90, 25);
            this.btnFecharUsuario.TabIndex = 3;
            this.btnFecharUsuario.Values.Text = "Fechar";
            this.btnFecharUsuario.Click += new System.EventHandler(this.btnFecharUsuario_Click);
            // 
            // toolStrip1
            // 
            this.toolStrip1.Dock = System.Windows.Forms.DockStyle.None;
            this.toolStrip1.Font = new System.Drawing.Font("Segoe UI", 9F);
            this.toolStrip1.GripStyle = System.Windows.Forms.ToolStripGripStyle.Hidden;
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnConsUsuarioBusca});
            this.toolStrip1.Location = new System.Drawing.Point(486, 19);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(26, 25);
            this.toolStrip1.TabIndex = 7;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // btnConsUsuarioBusca
            // 
            this.btnConsUsuarioBusca.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.btnConsUsuarioBusca.Image = global::View.Properties.Resources.lupa;
            this.btnConsUsuarioBusca.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnConsUsuarioBusca.Name = "btnConsUsuarioBusca";
            this.btnConsUsuarioBusca.Size = new System.Drawing.Size(23, 22);
            // 
            // ConsultarUsuario
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(660, 624);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.btnFecharUsuario);
            this.Controls.Add(this.txbBuscarUsuario);
            this.Controls.Add(this.lblBuscarUsuario);
            this.Controls.Add(this.dgvUsuario);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "ConsultarUsuario";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Lista de Usuários";
            ((System.ComponentModel.ISupportInitialize)(this.dgvUsuario)).EndInit();
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private ComponentFactory.Krypton.Toolkit.KryptonDataGridView dgvUsuario;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblBuscarUsuario;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbBuscarUsuario;
        private System.Windows.Forms.DataGridViewTextBoxColumn colCPF;
        private System.Windows.Forms.DataGridViewTextBoxColumn colNomeUsuario;
        private System.Windows.Forms.DataGridViewTextBoxColumn colEmail;
        private System.Windows.Forms.DataGridViewTextBoxColumn colCelular;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnFecharUsuario;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripButton btnConsUsuarioBusca;
    }
}