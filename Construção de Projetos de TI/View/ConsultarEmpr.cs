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
    public partial class ConsultarEmpr : Form
    {
        public ConsultarEmpr()
        {
            InitializeComponent();
        }

        private void btnFecharEmpr_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
