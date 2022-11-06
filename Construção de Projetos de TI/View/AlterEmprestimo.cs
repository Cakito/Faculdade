using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace View
{
    public partial class AlterEmprestimo : Form
    {
        public AlterEmprestimo()
        {
            InitializeComponent();
        }

        private void btnAlterEmprFechar_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
