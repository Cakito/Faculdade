using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Model
{
    public class Livro
    {
        public Int64 ISBN{ get; set; }
        public String Titulo { get; set; }
        public DateTime Ano { get; set; }
        public Int64 Edicao { get; set; }
        public Autor autor { get; set; }
        public Editora editora { get; set; }
    }
}
