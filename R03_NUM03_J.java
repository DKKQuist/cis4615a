//3.	Rule 03. Numeric Types and Operations (NUM)
//NUM03-J. Use integer types that can fully represent the possible range of unsigned data
//Given the non-compliant code below:
publ i c	s t a t i c	i nt	g e t I nte g e r ( DataInputStream	i s ) throws IOException {
return	i s . read Int ( ) ;
}
