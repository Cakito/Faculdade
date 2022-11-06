
namespace View
{
    partial class AlterEmprestimo
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
            this.dgvAlterEmpr = new ComponentFactory.Krypton.Toolkit.KryptonDataGridView();
            this.colAlterIdEmpr = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colAlterLivroEmpr = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colAlterCpfEmpr = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colAlterDataEmpr = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colAlterDataDevol = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.txbAlterEmpr = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.lblAlterCpfEmpr = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.btnAlterSalvarEmpr = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.btnAlterExcluirEmpr = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.btnAlterEmprFechar = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.btnAlterEmprBusca = new System.Windows.Forms.ToolStripButton();
            ((System.ComponentModel.ISupportInitialize)(this.dgvAlterEmpr)).BeginInit();
            this.toolStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // dgvAlterEmpr
            // 
            this.dgvAlterEmpr.AllowUserToAddRows = false;
            this.dgvAlterEmpr.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvAlterEmpr.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colAlterIdEmpr,
            this.colAlterLivroEmpr,
            this.colAlterCpfEmpr,
            this.colAlterDataEmpr,
            this.colAlterDataDevol});
            this.dgvAlterEmpr.Location = new System.Drawing.Point(45, 80);
            this.dgvAlterEmpr.Name = "dgvAlterEmpr";
            this.dgvAlterEmpr.RowHeadersVisible = false;
            this.dgvAlterEmpr.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvAlterEmpr.Size = new System.Drawing.Size(704, 469);
            this.dgvAlterEmpr.TabIndex = 0;
            // 
            // colAlterIdEmpr
            // 
            this.colAlterIdEmpr.HeaderText = "ID";
            this.colAlterIdEmpr.Name = "colAlterIdEmpr";
            // 
            // colAlterLivroEmpr
            // 
            this.colAlterLivroEmpr.HeaderText = "Livro";
            this.colAlterLivroEmpr.Name = "colAlterLivroEmpr";
            this.colAlterLivroEmpr.Width = 150;
            // 
            // colAlterCpfEmpr
            // 
            this.colAlterCpfEmpr.HeaderText = "CPF Usuário";
            this.colAlterCpfEmpr.Name = "colAlterCpfEmpr";
            this.colAlterCpfEmpr.Width = 150;
            // 
            // colAlterDataEmpr
            // 
            this.colAlterDataEmpr.HeaderText = "Data de Empréstimo";
            this.colAlterDataEmpr.Name = "colAlterDataEmpr";
            this.colAlterDataEmpr.Width = 150;
            // 
            // colAlterDataDevol
            // 
            this.colAlterDataDevol.HeaderText = "Data de Devolução";
            this.colAlterDataDevol.Name = "colAlterDataDevol";
            this.colAlterDataDevol.Width = 150;
            // 
            // txbAlterEmpr
            // 
            this.txbAlterEmpr.Location = new System.Drawing.Point(292, 34);
            this.txbAlterEmpr.Name = "txbAlterEmpr";
            this.txbAlterEmpr.Size = new System.Drawing.Size(212, 23);
            this.txbAlterEmpr.TabIndex = 1;
            // 
            // lblAlterCpfEmpr
            // 
            this.lblAlterCpfEmpr.Location = new System.Drawing.Point(206, 37);
            this.lblAlterCpfEmpr.Name = "lblAlterCpfEmpr";
            this.lblAlterCpfEmpr.Size = new System.Drawing.Size(80, 20);
            this.lblAlterCpfEmpr.TabIndex = 2;
            this.lblAlterCpfEmpr.Values.Text = "Digite o CPF:";
            // 
            // btnAlterSalvarEmpr
            // 
            this.btnAlterSalvarEmpr.Location = new System.Drawing.Point(45, 581);
            this.btnAlterSalvarEmpr.Name = "btnAlterSalvarEmpr";
            this.btnAlterSalvarEmpr.Size = new System.Drawing.Size(121, 25);
            this.btnAlterSalvarEmpr.TabIndex = 3;
            this.btnAlterSalvarEmpr.Values.Text = "Salvar Alterações";
            // 
            // btnAlterExcluirEmpr
            // 
            this.btnAlterExcluirEmpr.Location = new System.Drawing.Point(207, 581);
            this.btnAlterExcluirEmpr.Name = "btnAlterExcluirEmpr";
            this.btnAlterExcluirEmpr.Size = new System.Drawing.Size(90, 25);
            this.btnAlterExcluirEmpr.TabIndex = 4;
            this.btnAlterExcluirEmpr.Values.Text = "Excluir";
            // 
            // btnAlterEmprFechar
            // 
            this.btnAlterEmprFechar.Location = new System.Drawing.Point(659, 581);
            this.btnAlterEmprFechar.Name = "btnAlterEmprFechar";
            this.btnAlterEmprFechar.Size = new System.Drawing.Size(90, 25);
            this.btnAlterEmprFechar.TabIndex = 5;
            this.btnAlterEmprFechar.Values.Text = "Fechar";
            this.btnAlterEmprFechar.Click += new System.EventHandler(this.btnAlterEmprFechar_Click);
            // 
            // toolStrip1
            // 
            this.toolStrip1.Dock = System.Windows.Forms.DockStyle.None;
            this.toolStrip1.Font = new System.Drawing.Font("Segoe UI", 9F);
            this.toolStrip1.GripStyle = System.Windows.Forms.ToolStripGripStyle.Hidden;
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnAlterEmprBusca});
            this.toolStrip1.Location = new System.Drawing.Point(507, 32);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(26, 25);
            this.toolStrip1.TabIndex = 7;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // btnAlterEmprBusca
            // 
            this.btnAlterEmprBusca.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.btnAlterEmprBusca.Image = global::View.Properties.Resources.lupa;
            this.btnAlterEmprBusca.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnAlterEmprBusca.Name = "btnAlterEmprBusca";
            this.btnAlterEmprBusca.Size = new System.Drawing.Size(23, 22);
            // 
            // AlterEmprestimo
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(794, 618);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.btnAlterEmprFechar);
            this.Controls.Add(this.btnAlterExcluirEmpr);
            this.Controls.Add(this.btnAlterSalvarEmpr);
            this.Controls.Add(this.lblAlterCpfEmpr);
            this.Controls.Add(this.txbAlterEmpr);
            this.Controls.Add(this.dgvAlterEmpr);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "AlterEmprestimo";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Alterar / Excluir Empréstimos";
            ((System.ComponentModel.ISupportInitialize)(this.dgvAlterEmpr)).EndInit();
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private ComponentFactory.Krypton.Toolkit.KryptonDataGridView dgvAlterEmpr;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbAlterEmpr;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblAlterCpfEmpr;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnAlterSalvarEmpr;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnAlterExcluirEmpr;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnAlterEmprFechar;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAlterIdEmpr;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAlterLivroEmpr;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAlterCpfEmpr;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAlterDataEmpr;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAlterDataDevol;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripButton btnAlterEmprBusca;
    }
}