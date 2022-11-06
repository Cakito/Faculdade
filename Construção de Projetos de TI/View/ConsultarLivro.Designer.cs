
namespace View
{
    partial class ConsultarLivro
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
            this.dgvLivro = new ComponentFactory.Krypton.Toolkit.KryptonDataGridView();
            this.colIsbn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colAutorLivro = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colEditoraLivro = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colTitulo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colEdicao = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colAno = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.lblBuscarLivro = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.txbBuscarLivro = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.btnFecharLivro = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.btnConsLivroBuscar = new System.Windows.Forms.ToolStripButton();
            ((System.ComponentModel.ISupportInitialize)(this.dgvLivro)).BeginInit();
            this.toolStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // dgvLivro
            // 
            this.dgvLivro.AllowUserToAddRows = false;
            this.dgvLivro.AllowUserToDeleteRows = false;
            this.dgvLivro.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvLivro.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colIsbn,
            this.colAutorLivro,
            this.colEditoraLivro,
            this.colTitulo,
            this.colEdicao,
            this.colAno});
            this.dgvLivro.Location = new System.Drawing.Point(29, 66);
            this.dgvLivro.Name = "dgvLivro";
            this.dgvLivro.ReadOnly = true;
            this.dgvLivro.RowHeadersVisible = false;
            this.dgvLivro.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvLivro.Size = new System.Drawing.Size(803, 507);
            this.dgvLivro.TabIndex = 0;
            // 
            // colIsbn
            // 
            this.colIsbn.HeaderText = "ISBN";
            this.colIsbn.Name = "colIsbn";
            this.colIsbn.ReadOnly = true;
            this.colIsbn.Width = 150;
            // 
            // colAutorLivro
            // 
            this.colAutorLivro.HeaderText = "Autor";
            this.colAutorLivro.Name = "colAutorLivro";
            this.colAutorLivro.ReadOnly = true;
            this.colAutorLivro.Width = 150;
            // 
            // colEditoraLivro
            // 
            this.colEditoraLivro.HeaderText = "Editora";
            this.colEditoraLivro.Name = "colEditoraLivro";
            this.colEditoraLivro.ReadOnly = true;
            this.colEditoraLivro.Width = 150;
            // 
            // colTitulo
            // 
            this.colTitulo.HeaderText = "Título";
            this.colTitulo.Name = "colTitulo";
            this.colTitulo.ReadOnly = true;
            this.colTitulo.Width = 150;
            // 
            // colEdicao
            // 
            this.colEdicao.HeaderText = "Edição";
            this.colEdicao.Name = "colEdicao";
            this.colEdicao.ReadOnly = true;
            // 
            // colAno
            // 
            this.colAno.HeaderText = "Ano";
            this.colAno.Name = "colAno";
            this.colAno.ReadOnly = true;
            // 
            // lblBuscarLivro
            // 
            this.lblBuscarLivro.Location = new System.Drawing.Point(246, 26);
            this.lblBuscarLivro.Name = "lblBuscarLivro";
            this.lblBuscarLivro.Size = new System.Drawing.Size(49, 20);
            this.lblBuscarLivro.TabIndex = 1;
            this.lblBuscarLivro.Values.Text = "Buscar: ";
            // 
            // txbBuscarLivro
            // 
            this.txbBuscarLivro.Location = new System.Drawing.Point(301, 23);
            this.txbBuscarLivro.Name = "txbBuscarLivro";
            this.txbBuscarLivro.Size = new System.Drawing.Size(265, 23);
            this.txbBuscarLivro.TabIndex = 2;
            // 
            // btnFecharLivro
            // 
            this.btnFecharLivro.Location = new System.Drawing.Point(742, 590);
            this.btnFecharLivro.Name = "btnFecharLivro";
            this.btnFecharLivro.Size = new System.Drawing.Size(90, 25);
            this.btnFecharLivro.TabIndex = 3;
            this.btnFecharLivro.Values.Text = "Fechar";
            this.btnFecharLivro.Click += new System.EventHandler(this.btnFecharLivro_Click);
            // 
            // toolStrip1
            // 
            this.toolStrip1.Dock = System.Windows.Forms.DockStyle.None;
            this.toolStrip1.Font = new System.Drawing.Font("Segoe UI", 9F);
            this.toolStrip1.GripStyle = System.Windows.Forms.ToolStripGripStyle.Hidden;
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnConsLivroBuscar});
            this.toolStrip1.Location = new System.Drawing.Point(569, 21);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(26, 25);
            this.toolStrip1.TabIndex = 7;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // btnConsLivroBuscar
            // 
            this.btnConsLivroBuscar.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.btnConsLivroBuscar.Image = global::View.Properties.Resources.lupa;
            this.btnConsLivroBuscar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnConsLivroBuscar.Name = "btnConsLivroBuscar";
            this.btnConsLivroBuscar.Size = new System.Drawing.Size(23, 22);
            this.btnConsLivroBuscar.Text = "toolStripButton1";
            // 
            // ConsultarLivro
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(857, 627);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.btnFecharLivro);
            this.Controls.Add(this.txbBuscarLivro);
            this.Controls.Add(this.lblBuscarLivro);
            this.Controls.Add(this.dgvLivro);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "ConsultarLivro";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Lista de Livros";
            ((System.ComponentModel.ISupportInitialize)(this.dgvLivro)).EndInit();
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private ComponentFactory.Krypton.Toolkit.KryptonDataGridView dgvLivro;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblBuscarLivro;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbBuscarLivro;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnFecharLivro;
        private System.Windows.Forms.DataGridViewTextBoxColumn colIsbn;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAutorLivro;
        private System.Windows.Forms.DataGridViewTextBoxColumn colEditoraLivro;
        private System.Windows.Forms.DataGridViewTextBoxColumn colTitulo;
        private System.Windows.Forms.DataGridViewTextBoxColumn colEdicao;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAno;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripButton btnConsLivroBuscar;
    }
}