
namespace View
{
    partial class ConsultarEmpr
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
            this.dgvEmpr = new ComponentFactory.Krypton.Toolkit.KryptonDataGridView();
            this.colIdEmpr = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colDataEmpr = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colDataDevol = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colCpfEmpr = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colLivroEmpr = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.lblConsultaEmpr = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.txbBuscarEmpr = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.btnFecharEmpr = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.btnConsLivroBusca = new System.Windows.Forms.ToolStripButton();
            ((System.ComponentModel.ISupportInitialize)(this.dgvEmpr)).BeginInit();
            this.toolStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // dgvEmpr
            // 
            this.dgvEmpr.AllowUserToAddRows = false;
            this.dgvEmpr.AllowUserToDeleteRows = false;
            this.dgvEmpr.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvEmpr.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colIdEmpr,
            this.colDataEmpr,
            this.colDataDevol,
            this.colCpfEmpr,
            this.colLivroEmpr});
            this.dgvEmpr.Location = new System.Drawing.Point(27, 64);
            this.dgvEmpr.Name = "dgvEmpr";
            this.dgvEmpr.ReadOnly = true;
            this.dgvEmpr.RowHeadersVisible = false;
            this.dgvEmpr.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvEmpr.Size = new System.Drawing.Size(752, 497);
            this.dgvEmpr.TabIndex = 0;
            // 
            // colIdEmpr
            // 
            this.colIdEmpr.HeaderText = "ID";
            this.colIdEmpr.Name = "colIdEmpr";
            this.colIdEmpr.ReadOnly = true;
            this.colIdEmpr.Width = 150;
            // 
            // colDataEmpr
            // 
            this.colDataEmpr.HeaderText = "Data de Empréstimo";
            this.colDataEmpr.Name = "colDataEmpr";
            this.colDataEmpr.ReadOnly = true;
            this.colDataEmpr.Width = 150;
            // 
            // colDataDevol
            // 
            this.colDataDevol.HeaderText = "Data de Devolução";
            this.colDataDevol.Name = "colDataDevol";
            this.colDataDevol.ReadOnly = true;
            this.colDataDevol.Width = 150;
            // 
            // colCpfEmpr
            // 
            this.colCpfEmpr.HeaderText = "CPF Usuário";
            this.colCpfEmpr.Name = "colCpfEmpr";
            this.colCpfEmpr.ReadOnly = true;
            this.colCpfEmpr.Width = 150;
            // 
            // colLivroEmpr
            // 
            this.colLivroEmpr.HeaderText = "Livro";
            this.colLivroEmpr.Name = "colLivroEmpr";
            this.colLivroEmpr.ReadOnly = true;
            this.colLivroEmpr.Width = 150;
            // 
            // lblConsultaEmpr
            // 
            this.lblConsultaEmpr.Location = new System.Drawing.Point(231, 24);
            this.lblConsultaEmpr.Name = "lblConsultaEmpr";
            this.lblConsultaEmpr.Size = new System.Drawing.Size(49, 20);
            this.lblConsultaEmpr.TabIndex = 1;
            this.lblConsultaEmpr.Values.Text = "Buscar:";
            // 
            // txbBuscarEmpr
            // 
            this.txbBuscarEmpr.Location = new System.Drawing.Point(286, 21);
            this.txbBuscarEmpr.Name = "txbBuscarEmpr";
            this.txbBuscarEmpr.Size = new System.Drawing.Size(255, 23);
            this.txbBuscarEmpr.TabIndex = 2;
            // 
            // btnFecharEmpr
            // 
            this.btnFecharEmpr.Location = new System.Drawing.Point(689, 590);
            this.btnFecharEmpr.Name = "btnFecharEmpr";
            this.btnFecharEmpr.Size = new System.Drawing.Size(90, 25);
            this.btnFecharEmpr.TabIndex = 3;
            this.btnFecharEmpr.Values.Text = "Fechar";
            this.btnFecharEmpr.Click += new System.EventHandler(this.btnFecharEmpr_Click);
            // 
            // toolStrip1
            // 
            this.toolStrip1.Dock = System.Windows.Forms.DockStyle.None;
            this.toolStrip1.Font = new System.Drawing.Font("Segoe UI", 9F);
            this.toolStrip1.GripStyle = System.Windows.Forms.ToolStripGripStyle.Hidden;
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnConsLivroBusca});
            this.toolStrip1.Location = new System.Drawing.Point(544, 19);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(26, 25);
            this.toolStrip1.TabIndex = 7;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // btnConsLivroBusca
            // 
            this.btnConsLivroBusca.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.btnConsLivroBusca.Image = global::View.Properties.Resources.lupa;
            this.btnConsLivroBusca.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnConsLivroBusca.Name = "btnConsLivroBusca";
            this.btnConsLivroBusca.Size = new System.Drawing.Size(23, 22);
            // 
            // ConsultarEmpr
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(805, 627);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.btnFecharEmpr);
            this.Controls.Add(this.txbBuscarEmpr);
            this.Controls.Add(this.lblConsultaEmpr);
            this.Controls.Add(this.dgvEmpr);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "ConsultarEmpr";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Lista de Empréstimos";
            ((System.ComponentModel.ISupportInitialize)(this.dgvEmpr)).EndInit();
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private ComponentFactory.Krypton.Toolkit.KryptonDataGridView dgvEmpr;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblConsultaEmpr;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbBuscarEmpr;
        private System.Windows.Forms.DataGridViewTextBoxColumn colIdEmpr;
        private System.Windows.Forms.DataGridViewTextBoxColumn colDataEmpr;
        private System.Windows.Forms.DataGridViewTextBoxColumn colDataDevol;
        private System.Windows.Forms.DataGridViewTextBoxColumn colCpfEmpr;
        private System.Windows.Forms.DataGridViewTextBoxColumn colLivroEmpr;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnFecharEmpr;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripButton btnConsLivroBusca;
    }
}