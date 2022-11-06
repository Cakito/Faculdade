
namespace View
{
    partial class CadAutor
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
            this.gpbAutor = new System.Windows.Forms.GroupBox();
            this.kryptonTextBox2 = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.kryptonTextBox1 = new ComponentFactory.Krypton.Toolkit.KryptonTextBox();
            this.lblNomeAutor = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.lblIdAutor = new ComponentFactory.Krypton.Toolkit.KryptonLabel();
            this.btnConfirmAutor = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.btnCancelAutor = new ComponentFactory.Krypton.Toolkit.KryptonButton();
            this.gpbAutor.SuspendLayout();
            this.SuspendLayout();
            // 
            // gpbAutor
            // 
            this.gpbAutor.Controls.Add(this.kryptonTextBox2);
            this.gpbAutor.Controls.Add(this.kryptonTextBox1);
            this.gpbAutor.Controls.Add(this.lblNomeAutor);
            this.gpbAutor.Controls.Add(this.lblIdAutor);
            this.gpbAutor.Location = new System.Drawing.Point(40, 34);
            this.gpbAutor.Name = "gpbAutor";
            this.gpbAutor.Size = new System.Drawing.Size(411, 199);
            this.gpbAutor.TabIndex = 0;
            this.gpbAutor.TabStop = false;
            this.gpbAutor.Text = "Dados Autor";
            // 
            // kryptonTextBox2
            // 
            this.kryptonTextBox2.Location = new System.Drawing.Point(104, 120);
            this.kryptonTextBox2.Name = "kryptonTextBox2";
            this.kryptonTextBox2.Size = new System.Drawing.Size(134, 23);
            this.kryptonTextBox2.TabIndex = 3;
            // 
            // kryptonTextBox1
            // 
            this.kryptonTextBox1.Location = new System.Drawing.Point(104, 48);
            this.kryptonTextBox1.Name = "kryptonTextBox1";
            this.kryptonTextBox1.Size = new System.Drawing.Size(112, 23);
            this.kryptonTextBox1.TabIndex = 2;
            // 
            // lblNomeAutor
            // 
            this.lblNomeAutor.Location = new System.Drawing.Point(54, 120);
            this.lblNomeAutor.Name = "lblNomeAutor";
            this.lblNomeAutor.Size = new System.Drawing.Size(44, 20);
            this.lblNomeAutor.TabIndex = 1;
            this.lblNomeAutor.Values.Text = "Nome";
            // 
            // lblIdAutor
            // 
            this.lblIdAutor.Location = new System.Drawing.Point(73, 48);
            this.lblIdAutor.Name = "lblIdAutor";
            this.lblIdAutor.Size = new System.Drawing.Size(25, 20);
            this.lblIdAutor.TabIndex = 0;
            this.lblIdAutor.Values.Text = "ID: ";
            // 
            // btnConfirmAutor
            // 
            this.btnConfirmAutor.Location = new System.Drawing.Point(271, 247);
            this.btnConfirmAutor.Name = "btnConfirmAutor";
            this.btnConfirmAutor.Size = new System.Drawing.Size(90, 25);
            this.btnConfirmAutor.TabIndex = 1;
            this.btnConfirmAutor.Values.Text = "Confirmar";
            // 
            // btnCancelAutor
            // 
            this.btnCancelAutor.Location = new System.Drawing.Point(84, 247);
            this.btnCancelAutor.Name = "btnCancelAutor";
            this.btnCancelAutor.Size = new System.Drawing.Size(90, 25);
            this.btnCancelAutor.TabIndex = 2;
            this.btnCancelAutor.Values.Text = "Cancelar";
            this.btnCancelAutor.Click += new System.EventHandler(this.btnCancelAutor_Click);
            // 
            // CadAutor
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(496, 284);
            this.Controls.Add(this.btnCancelAutor);
            this.Controls.Add(this.btnConfirmAutor);
            this.Controls.Add(this.gpbAutor);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "CadAutor";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Cadastro Autor";
            this.gpbAutor.ResumeLayout(false);
            this.gpbAutor.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gpbAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox kryptonTextBox2;
        private ComponentFactory.Krypton.Toolkit.KryptonTextBox kryptonTextBox1;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblNomeAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonLabel lblIdAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnConfirmAutor;
        private ComponentFactory.Krypton.Toolkit.KryptonButton btnCancelAutor;
    }
}