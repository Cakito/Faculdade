
namespace View
{
    partial class AlterUsuario
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
            this.dgvAlterUsuario = new ComponentFactory.Krypton.Toolkit.KryptonDataGridView();
            this.colAlterCpf = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colAlterEmailUsuario = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colAlterCelularUsuario = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colAlterNomeUsuario = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.lblAlterCpf = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.txbAlterUsuario = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.btnAlterSalvarUsuario = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.btnAlterExcluirUsuario = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.btnAlterUsuarioFechar = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.toolStrip2 = new System.Windows.Forms.ToolStrip();
            this.btnAlterUsuarioBusca = new System.Windows.Forms.ToolStripButton();
            ((System.ComponentModel.ISupportInitialize)(this.dgvAlterUsuario)).BeginInit();
            this.toolStrip2.SuspendLayout();
            this.SuspendLayout();
            // 
            // dgvAlterUsuario
            // 
            this.dgvAlterUsuario.AllowUserToAddRows = false;
            this.dgvAlterUsuario.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvAlterUsuario.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colAlterCpf,
            this.colAlterEmailUsuario,
            this.colAlterCelularUsuario,
            this.colAlterNomeUsuario});
            this.dgvAlterUsuario.Location = new System.Drawing.Point(37, 69);
            this.dgvAlterUsuario.Name = "dgvAlterUsuario";
            this.dgvAlterUsuario.RowHeadersVisible = false;
            this.dgvAlterUsuario.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvAlterUsuario.Size = new System.Drawing.Size(604, 478);
            this.dgvAlterUsuario.TabIndex = 0;
            // 
            // colAlterCpf
            // 
            this.colAlterCpf.HeaderText = "CPF";
            this.colAlterCpf.Name = "colAlterCpf";
            this.colAlterCpf.Width = 150;
            // 
            // colAlterEmailUsuario
            // 
            this.colAlterEmailUsuario.HeaderText = "Email";
            this.colAlterEmailUsuario.Name = "colAlterEmailUsuario";
            this.colAlterEmailUsuario.Width = 150;
            // 
            // colAlterCelularUsuario
            // 
            this.colAlterCelularUsuario.HeaderText = "Celular";
            this.colAlterCelularUsuario.Name = "colAlterCelularUsuario";
            this.colAlterCelularUsuario.Width = 150;
            // 
            // colAlterNomeUsuario
            // 
            this.colAlterNomeUsuario.HeaderText = "Nome";
            this.colAlterNomeUsuario.Name = "colAlterNomeUsuario";
            this.colAlterNomeUsuario.Width = 150;
            // 
            // lblAlterCpf
            // 
            this.lblAlterCpf.Location = new System.Drawing.Point(107, 31);
            this.lblAlterCpf.Name = "lblAlterCpf";
            this.lblAlterCpf.Size = new System.Drawing.Size(80, 20);
            this.lblAlterCpf.TabIndex = 1;
            this.lblAlterCpf.Values.Text = "Digite o CPF:";
            // 
            // txbAlterUsuario
            // 
            this.txbAlterUsuario.Location = new System.Drawing.Point(193, 28);
            this.txbAlterUsuario.Name = "txbAlterUsuario";
            this.txbAlterUsuario.Size = new System.Drawing.Size(204, 23);
            this.txbAlterUsuario.TabIndex = 2;
            // 
            // btnAlterSalvarUsuario
            // 
            this.btnAlterSalvarUsuario.Location = new System.Drawing.Point(37, 576);
            this.btnAlterSalvarUsuario.Name = "btnAlterSalvarUsuario";
            this.btnAlterSalvarUsuario.Size = new System.Drawing.Size(112, 25);
            this.btnAlterSalvarUsuario.TabIndex = 3;
            this.btnAlterSalvarUsuario.Values.Text = "Salvar Alterações";
            // 
            // btnAlterExcluirUsuario
            // 
            this.btnAlterExcluirUsuario.Location = new System.Drawing.Point(193, 576);
            this.btnAlterExcluirUsuario.Name = "btnAlterExcluirUsuario";
            this.btnAlterExcluirUsuario.Size = new System.Drawing.Size(90, 25);
            this.btnAlterExcluirUsuario.TabIndex = 4;
            this.btnAlterExcluirUsuario.Values.Text = "Excluir";
            // 
            // btnAlterUsuarioFechar
            // 
            this.btnAlterUsuarioFechar.Location = new System.Drawing.Point(551, 576);
            this.btnAlterUsuarioFechar.Name = "btnAlterUsuarioFechar";
            this.btnAlterUsuarioFechar.Size = new System.Drawing.Size(90, 25);
            this.btnAlterUsuarioFechar.TabIndex = 5;
            this.btnAlterUsuarioFechar.Values.Text = "Fechar";
            this.btnAlterUsuarioFechar.Click += new System.EventHandler(this.btnAlterUsuarioFechar_Click);
            // 
            // toolStrip2
            // 
            this.toolStrip2.Dock = System.Windows.Forms.DockStyle.None;
            this.toolStrip2.Font = new System.Drawing.Font("Segoe UI", 9F);
            this.toolStrip2.GripStyle = System.Windows.Forms.ToolStripGripStyle.Hidden;
            this.toolStrip2.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnAlterUsuarioBusca});
            this.toolStrip2.Location = new System.Drawing.Point(400, 26);
            this.toolStrip2.Name = "toolStrip2";
            this.toolStrip2.Size = new System.Drawing.Size(57, 25);
            this.toolStrip2.TabIndex = 7;
            this.toolStrip2.Text = "toolStrip2";
            // 
            // btnAlterUsuarioBusca
            // 
            this.btnAlterUsuarioBusca.BackColor = System.Drawing.SystemColors.Control;
            this.btnAlterUsuarioBusca.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.btnAlterUsuarioBusca.Image = global::View.Properties.Resources.lupa;
            this.btnAlterUsuarioBusca.ImageTransparentColor = System.Drawing.Color.Transparent;
            this.btnAlterUsuarioBusca.Name = "btnAlterUsuarioBusca";
            this.btnAlterUsuarioBusca.Size = new System.Drawing.Size(23, 22);
            this.btnAlterUsuarioBusca.Text = "Search";
            // 
            // AlterUsuario
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(679, 613);
            this.Controls.Add(this.toolStrip2);
            this.Controls.Add(this.btnAlterUsuarioFechar);
            this.Controls.Add(this.btnAlterExcluirUsuario);
            this.Controls.Add(this.btnAlterSalvarUsuario);
            this.Controls.Add(this.txbAlterUsuario);
            this.Controls.Add(this.lblAlterCpf);
            this.Controls.Add(this.dgvAlterUsuario);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "AlterUsuario";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Alterar / Excluir Usuário";
            ((System.ComponentModel.ISupportInitialize)(this.dgvAlterUsuario)).EndInit();
            this.toolStrip2.ResumeLayout(false);
            this.toolStrip2.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private ComponentFactory.Krypton.Toolkit.KryptonDataGridView dgvAlterUsuario;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblAlterCpf;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbAlterUsuario;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnAlterSalvarUsuario;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnAlterExcluirUsuario;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnAlterUsuarioFechar;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAlterCpf;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAlterEmailUsuario;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAlterCelularUsuario;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAlterNomeUsuario;
        private System.Windows.Forms.ToolStrip toolStrip2;
        private System.Windows.Forms.ToolStripButton btnAlterUsuarioBusca;
    }
}