//MET01-J. Never use assertions to validate method arguments Given the non-compliant
//code below:
publ i c	s t a t i c	i nt getAbsAdd ( i nt x ,	i nt  y ) {
a s s e r t x != Inte g e r . MIN VALUE; a s s e r t y != Inte g e r . MIN VALUE; i nt absX = Math . abs ( x ) ;
i nt absY = Math . abs ( y ) ;
a s s e r t	( absX <= Inte g e r .MAX VALUE − absY ) ; return absX + absY ;
}
// Usage :	getAbsAdd ( Inte g e r . MIN VALUE,	1 ) ;
