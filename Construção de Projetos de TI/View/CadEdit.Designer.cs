
namespace View
{
    partial class CadEdit
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
            this.gpbEdit = new System.Windows.Forms.GroupBox();
            this.txbNomeEdit = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.txbIdEdit = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.lblNomeEdit = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.lblIdEdit = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.btnConfirmEdit = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.btnCancelEdit = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.gpbEdit.SuspendLayout();
            this.SuspendLayout();
            // 
            // gpbEdit
            // 
            this.gpbEdit.Controls.Add(this.txbNomeEdit);
            this.gpbEdit.Controls.Add(this.txbIdEdit);
            this.gpbEdit.Controls.Add(this.lblNomeEdit);
            this.gpbEdit.Controls.Add(this.lblIdEdit);
            this.gpbEdit.Location = new System.Drawing.Point(36, 26);
            this.gpbEdit.Name = "gpbEdit";
            this.gpbEdit.Size = new System.Drawing.Size(409, 216);
            this.gpbEdit.TabIndex = 0;
            this.gpbEdit.TabStop = false;
            this.gpbEdit.Text = "Dados Editora";
            // 
            // txbNomeEdit
            // 
            this.txbNomeEdit.Location = new System.Drawing.Point(106, 125);
            this.txbNomeEdit.Name = "txbNomeEdit";
            this.txbNomeEdit.Size = new System.Drawing.Size(139, 23);
            this.txbNomeEdit.TabIndex = 3;
            // 
            // txbIdEdit
            // 
            this.txbIdEdit.Location = new System.Drawing.Point(106, 53);
            this.txbIdEdit.Name = "txbIdEdit";
            this.txbIdEdit.Size = new System.Drawing.Size(116, 23);
            this.txbIdEdit.TabIndex = 2;
            // 
            // lblNomeEdit
            // 
            this.lblNomeEdit.Location = new System.Drawing.Point(53, 128);
            this.lblNomeEdit.Name = "lblNomeEdit";
            this.lblNomeEdit.Size = new System.Drawing.Size(47, 20);
            this.lblNomeEdit.TabIndex = 1;
            this.lblNomeEdit.Values.Text = "Nome:";
            // 
            // lblIdEdit
            // 
            this.lblIdEdit.Location = new System.Drawing.Point(75, 53);
            this.lblIdEdit.Name = "lblIdEdit";
            this.lblIdEdit.Size = new System.Drawing.Size(25, 20);
            this.lblIdEdit.TabIndex = 0;
            this.lblIdEdit.Values.Text = "ID:";
            // 
            // btnConfirmEdit
            // 
            this.btnConfirmEdit.Location = new System.Drawing.Point(290, 264);
            this.btnConfirmEdit.Name = "btnConfirmEdit";
            this.btnConfirmEdit.Size = new System.Drawing.Size(90, 25);
            this.btnConfirmEdit.TabIndex = 4;
            this.btnConfirmEdit.Values.Text = "Confirmar";
            // 
            // btnCancelEdit
            // 
            this.btnCancelEdit.Location = new System.Drawing.Point(100, 264);
            this.btnCancelEdit.Name = "btnCancelEdit";
            this.btnCancelEdit.Size = new System.Drawing.Size(90, 25);
            this.btnCancelEdit.TabIndex = 5;
            this.btnCancelEdit.Values.Text = "Cancelar";
            this.btnCancelEdit.Click += new System.EventHandler(this.btnCancelEdit_Click);
            // 
            // CadEdit
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(503, 301);
            this.Controls.Add(this.btnConfirmEdit);
            this.Controls.Add(this.btnCancelEdit);
            this.Controls.Add(this.gpbEdit);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "CadEdit";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Cadastrar Editora";
            this.gpbEdit.ResumeLayout(false);
            this.gpbEdit.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gpbEdit;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbNomeEdit;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox txbIdEdit;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblNomeEdit;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblIdEdit;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnConfirmEdit;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnCancelEdit;
    }
}