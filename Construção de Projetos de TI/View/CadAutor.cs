﻿using System;
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
    public partial class CadAutor : Form
    {
        public CadAutor()
        {
            InitializeComponent();
        }

        private void btnCancelAutor_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
