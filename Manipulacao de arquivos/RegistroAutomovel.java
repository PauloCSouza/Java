class RegistroAutomovel	 
{	 
 int vcod;	 
 String vnome;	 
 int    vtipo;
 double vvalor;	 
	 
 // construtor	 
 RegistroAutomovel () {	 
  this(0,"" ,0,0.0);	 
 }	 
	 
    RegistroAutomovel ( int cod,String nome,int tipo,double valor )	 
 {	 
  vcod = cod;
  vnome   = nome;	 
  vtipo  = tipo;	 
  vvalor  = valor;	 
 }	 
}	 
