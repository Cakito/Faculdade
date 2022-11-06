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
    public partial class CadLivro : Form
    {
        public CadLivro()
        {
            InitializeComponent();
        }

        private void btnCancelLivro_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
