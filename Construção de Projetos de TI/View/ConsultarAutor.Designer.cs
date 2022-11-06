
namespace View
{
    partial class ConsultarAutor
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
            this.dgvAutor = new ComponentFactory.Krypton.Toolkit.KryptonDataGridView();
            this.colIdAutor = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colNomeAutor = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.btnFecharAutor = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.lblBuscarAutor = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.txbBuscarAutor = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.btnConsAutorBusca = new System.Windows.Forms.ToolStripButton();
            ((System.ComponentModel.ISupportInitialize)(this.dgvAutor)).BeginInit();
            this.toolStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // dgvAutor
            // 
            this.dgvAutor.AllowUserToAddRows = false;
            this.dgvAutor.AllowUserToDeleteRows = false;
            this.dgvAutor.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvAutor.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colIdAutor,
            this.colNomeAutor});
            this.dgvAutor.Location = new System.Drawing.Point(31, 57);
            this.dgvAutor.Name = "dgvAutor";
            this.dgvAutor.ReadOnly = true;
            this.dgvAutor.RowHeadersVisible = false;
            this.dgvAutor.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvAutor.Size = new System.Drawing.Size(333, 483);
            this.dgvAutor.TabIndex = 0;
            // 
            // colIdAutor
            // 
            this.colIdAutor.HeaderText = "ID";
            this.colIdAutor.Name = "colIdAutor";
            this.colIdAutor.ReadOnly = true;
            this.colIdAutor.Width = 150;
            // 
            // colNomeAutor
            // 
            this.colNomeAutor.HeaderText = "Nome";
            this.colNomeAutor.Name = "colNomeAutor";
            this.colNomeAutor.ReadOnly = true;
            this.colNomeAutor.Width = 180;
            // 
            // btnFecharAutor
            // 
            this.btnFecharAutor.Location = new System.Drawing.Point(274, 563);
            this.btnFecharAutor.Name = "btnFecharAutor";
            this.btnFecharAutor.Size = new System.Drawing.Size(90, 25);
            this.btnFecharAutor.TabIndex = 1;
            this.btnFecharAutor.Values.Text = "Fechar";
            this.btnFecharAutor.Click += new System.EventHandler(this.btnFecharAutor_Click);
            // 
            // lblBuscarAutor
            // 
            this.lblBuscarAutor.Location = new System.Drawing.Point(42, 22);
            this.lblBuscarAutor.Name = "lblBuscarAutor";
            this.lblBuscarAutor.Size = new System.Drawing.Size(49, 20);
            this.lblBuscarAutor.TabIndex = 2;
            this.lblBuscarAutor.Values.Text = "Buscar: ";
            // 
            // txbBuscarAutor
            // 
            this.txbBuscarAutor.Location = new System.Drawing.Point(97, 19);
            this.txbBuscarAutor.Name = "txbBuscarAutor";
            this.txbBuscarAutor.Size = new System.Drawing.Size(213, 23);
            this.txbBuscarAutor.TabIndex = 3;
            // 
            // toolStrip1
            // 
            this.toolStrip1.Dock = System.Windows.Forms.DockStyle.None;
            this.toolStrip1.Font = new System.Drawing.Font("Segoe UI", 9F);
            this.toolStrip1.GripStyle = System.Windows.Forms.ToolStripGripStyle.Hidden;
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnConsAutorBusca});
            this.toolStrip1.Location = new System.Drawing.Point(313, 17);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(26, 25);
            this.toolStrip1.TabIndex = 7;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // btnConsAutorBusca
            // 
            this.btnConsAutorBusca.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.btnConsAutorBusca.Image = global::View.Properties.Resources.lupa;
            this.btnConsAutorBusca.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnConsAutorBusca.Name = "btnConsAutorBusca";
            this.btnConsAutorBusca.Size = new System.Drawing.Size(23, 22);
            // 
            // ConsultarAutor
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(397, 600);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.txbBuscarAutor);
            this.Controls.Add(this.lblBuscarAutor);
            this.Controls.Add(this.btnFecharAutor);
            this.Controls.Add(this.dgvAutor);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "ConsultarAutor";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Lista de Autores";
            ((System.ComponentModel.ISupportInitialize)(this.dgvAutor)).EndInit();
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private ComponentFactory.Krypton.Toolkit.KryptonDataGridView dgvAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnFecharAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblBuscarAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbBuscarAutor;
        private System.Windows.Forms.DataGridViewTextBoxColumn colIdAutor;
        private System.Windows.Forms.DataGridViewTextBoxColumn colNomeAutor;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripButton btnConsAutorBusca;
    }
}