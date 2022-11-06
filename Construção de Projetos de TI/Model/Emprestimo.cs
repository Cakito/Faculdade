using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Model
{
    public class Emprestimo
    {
        public Int64 Id_Emp { get; set; }
        public DateTime DataEmprest { get; set; }
        public DateTime DataDevol { get; set; }
        public Usuario usuario { get; set; }
        public Livro livro { get; set; }
    }
}
