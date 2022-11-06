using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Model
{
    public class Usuario
    {
        public Int64 CPF { get; set; }
        public String Nome { get; set; }
        public String User { get; set; }
        public String Senha { get; set; }
        public String Email { get; set; }
        public String Cel { get; set; }
        public DateTime DataNasc { get; set; }
    }
}
