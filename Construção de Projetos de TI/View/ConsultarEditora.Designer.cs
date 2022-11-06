
namespace View
{
    partial class ConsultarEditora
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
            this.dgvEditora = new ComponentFactory.Krypton.Toolkit.KryptonDataGridView();
            this.colIdEdit = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colNomeEdit = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.btnFecharEdit = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.lblBuscarEditora = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.txbBuscarEditora = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.btnConsEditoraBuscar = new System.Windows.Forms.ToolStripButton();
            ((System.ComponentModel.ISupportInitialize)(this.dgvEditora)).BeginInit();
            this.toolStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // dgvEditora
            // 
            this.dgvEditora.AllowUserToAddRows = false;
            this.dgvEditora.AllowUserToDeleteRows = false;
            this.dgvEditora.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvEditora.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colIdEdit,
            this.colNomeEdit});
            this.dgvEditora.Location = new System.Drawing.Point(26, 56);
            this.dgvEditora.Name = "dgvEditora";
            this.dgvEditora.ReadOnly = true;
            this.dgvEditora.RowHeadersVisible = false;
            this.dgvEditora.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvEditora.Size = new System.Drawing.Size(305, 466);
            this.dgvEditora.TabIndex = 0;
            // 
            // colIdEdit
            // 
            this.colIdEdit.HeaderText = "ID";
            this.colIdEdit.Name = "colIdEdit";
            this.colIdEdit.ReadOnly = true;
            this.colIdEdit.Width = 150;
            // 
            // colNomeEdit
            // 
            this.colNomeEdit.HeaderText = "Nome";
            this.colNomeEdit.Name = "colNomeEdit";
            this.colNomeEdit.ReadOnly = true;
            this.colNomeEdit.Width = 150;
            // 
            // btnFecharEdit
            // 
            this.btnFecharEdit.Location = new System.Drawing.Point(241, 553);
            this.btnFecharEdit.Name = "btnFecharEdit";
            this.btnFecharEdit.Size = new System.Drawing.Size(90, 25);
            this.btnFecharEdit.TabIndex = 1;
            this.btnFecharEdit.Values.Text = "Fechar";
            this.btnFecharEdit.Click += new System.EventHandler(this.btnFecharEdit_Click);
            // 
            // lblBuscarEditora
            // 
            this.lblBuscarEditora.Location = new System.Drawing.Point(40, 24);
            this.lblBuscarEditora.Name = "lblBuscarEditora";
            this.lblBuscarEditora.Size = new System.Drawing.Size(49, 20);
            this.lblBuscarEditora.TabIndex = 2;
            this.lblBuscarEditora.Values.Text = "Buscar:";
            // 
            // txbBuscarEditora
            // 
            this.txbBuscarEditora.Location = new System.Drawing.Point(95, 21);
            this.txbBuscarEditora.Name = "txbBuscarEditora";
            this.txbBuscarEditora.Size = new System.Drawing.Size(199, 23);
            this.txbBuscarEditora.TabIndex = 3;
            // 
            // toolStrip1
            // 
            this.toolStrip1.Dock = System.Windows.Forms.DockStyle.None;
            this.toolStrip1.Font = new System.Drawing.Font("Segoe UI", 9F);
            this.toolStrip1.GripStyle = System.Windows.Forms.ToolStripGripStyle.Hidden;
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnConsEditoraBuscar});
            this.toolStrip1.Location = new System.Drawing.Point(297, 19);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(26, 25);
            this.toolStrip1.TabIndex = 7;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // btnConsEditoraBuscar
            // 
            this.btnConsEditoraBuscar.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.btnConsEditoraBuscar.Image = global::View.Properties.Resources.lupa;
            this.btnConsEditoraBuscar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnConsEditoraBuscar.Name = "btnConsEditoraBuscar";
            this.btnConsEditoraBuscar.Size = new System.Drawing.Size(23, 22);
            // 
            // ConsultarEditora
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(366, 590);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.txbBuscarEditora);
            this.Controls.Add(this.lblBuscarEditora);
            this.Controls.Add(this.btnFecharEdit);
            this.Controls.Add(this.dgvEditora);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "ConsultarEditora";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Lista de Editoras";
            ((System.ComponentModel.ISupportInitialize)(this.dgvEditora)).EndInit();
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private ComponentFactory.Krypton.Toolkit.KryptonDataGridView dgvEditora;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnFecharEdit;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblBuscarEditora;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbBuscarEditora;
        private System.Windows.Forms.DataGridViewTextBoxColumn colIdEdit;
        private System.Windows.Forms.DataGridViewTextBoxColumn colNomeEdit;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripButton btnConsEditoraBuscar;
    }
}