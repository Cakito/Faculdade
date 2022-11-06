
namespace View
{
    partial class AlterAutor
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
            this.colAlterAu = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colAlterNomeAutor = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.lblAlterAutor = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.btnAlterSalvarAutor = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.btnAlterExcluirAutor = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.btnAlterFecharAutor = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.txbAlterAutor = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.btnAlterAutorBusca = new System.Windows.Forms.ToolStripButton();
            ((System.ComponentModel.ISupportInitialize)(this.dgvAutor)).BeginInit();
            this.toolStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // dgvAutor
            // 
            this.dgvAutor.AllowUserToAddRows = false;
            this.dgvAutor.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvAutor.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colAlterAu,
            this.colAlterNomeAutor});
            this.dgvAutor.Location = new System.Drawing.Point(32, 79);
            this.dgvAutor.Name = "dgvAutor";
            this.dgvAutor.RowHeadersVisible = false;
            this.dgvAutor.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvAutor.Size = new System.Drawing.Size(403, 405);
            this.dgvAutor.TabIndex = 0;
            // 
            // colAlterAu
            // 
            this.colAlterAu.HeaderText = "ID";
            this.colAlterAu.Name = "colAlterAu";
            this.colAlterAu.Width = 200;
            // 
            // colAlterNomeAutor
            // 
            this.colAlterNomeAutor.HeaderText = "Nome";
            this.colAlterNomeAutor.Name = "colAlterNomeAutor";
            this.colAlterNomeAutor.Width = 200;
            // 
            // lblAlterAutor
            // 
            this.lblAlterAutor.Location = new System.Drawing.Point(69, 37);
            this.lblAlterAutor.Name = "lblAlterAutor";
            this.lblAlterAutor.Size = new System.Drawing.Size(90, 20);
            this.lblAlterAutor.TabIndex = 1;
            this.lblAlterAutor.Values.Text = "Digite o Autor:";
            // 
            // btnAlterSalvarAutor
            // 
            this.btnAlterSalvarAutor.Location = new System.Drawing.Point(32, 520);
            this.btnAlterSalvarAutor.Name = "btnAlterSalvarAutor";
            this.btnAlterSalvarAutor.Size = new System.Drawing.Size(112, 25);
            this.btnAlterSalvarAutor.TabIndex = 2;
            this.btnAlterSalvarAutor.Values.Text = "Salvar Alterações";
            // 
            // btnAlterExcluirAutor
            // 
            this.btnAlterExcluirAutor.Location = new System.Drawing.Point(168, 520);
            this.btnAlterExcluirAutor.Name = "btnAlterExcluirAutor";
            this.btnAlterExcluirAutor.Size = new System.Drawing.Size(90, 25);
            this.btnAlterExcluirAutor.TabIndex = 3;
            this.btnAlterExcluirAutor.Values.Text = "Excluir";
            // 
            // btnAlterFecharAutor
            // 
            this.btnAlterFecharAutor.Location = new System.Drawing.Point(345, 520);
            this.btnAlterFecharAutor.Name = "btnAlterFecharAutor";
            this.btnAlterFecharAutor.Size = new System.Drawing.Size(90, 25);
            this.btnAlterFecharAutor.TabIndex = 4;
            this.btnAlterFecharAutor.Values.Text = "Fechar";
            this.btnAlterFecharAutor.Click += new System.EventHandler(this.btnAlterFecharAutor_Click);
            // 
            // txbAlterAutor
            // 
            this.txbAlterAutor.Location = new System.Drawing.Point(165, 34);
            this.txbAlterAutor.Name = "txbAlterAutor";
            this.txbAlterAutor.Size = new System.Drawing.Size(207, 23);
            this.txbAlterAutor.TabIndex = 5;
            // 
            // toolStrip1
            // 
            this.toolStrip1.Dock = System.Windows.Forms.DockStyle.None;
            this.toolStrip1.Font = new System.Drawing.Font("Segoe UI", 9F);
            this.toolStrip1.GripStyle = System.Windows.Forms.ToolStripGripStyle.Hidden;
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnAlterAutorBusca});
            this.toolStrip1.Location = new System.Drawing.Point(378, 32);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(26, 25);
            this.toolStrip1.TabIndex = 7;
            // 
            // btnAlterAutorBusca
            // 
            this.btnAlterAutorBusca.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.btnAlterAutorBusca.Image = global::View.Properties.Resources.lupa;
            this.btnAlterAutorBusca.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnAlterAutorBusca.Name = "btnAlterAutorBusca";
            this.btnAlterAutorBusca.Size = new System.Drawing.Size(23, 22);
            // 
            // AlterAutor
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(471, 557);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.txbAlterAutor);
            this.Controls.Add(this.btnAlterFecharAutor);
            this.Controls.Add(this.btnAlterExcluirAutor);
            this.Controls.Add(this.btnAlterSalvarAutor);
            this.Controls.Add(this.lblAlterAutor);
            this.Controls.Add(this.dgvAutor);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "AlterAutor";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Alterar / Excluir Autor";
            ((System.ComponentModel.ISupportInitialize)(this.dgvAutor)).EndInit();
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private ComponentFactory.Krypton.Toolkit.KryptonDataGridView dgvAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblAlterAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnAlterSalvarAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnAlterExcluirAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnAlterFecharAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbAlterAutor;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAlterAu;
        private System.Windows.Forms.DataGridViewTextBoxColumn colAlterNomeAutor;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripButton btnAlterAutorBusca;
    }
}