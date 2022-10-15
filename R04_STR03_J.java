//4.	Rule 04. Characters and Strings (STR)
//STR03-J. Do not encode noncharacter data as a string Given the non-compliant code below:
Big Integer x = new Big Integer (” 530500452766 ”); byte [ ]	byte Array = x . to ByteArray ( ) ;
S tri ng s = new S tri ng ( byte Array ) ; byte Array = s . get Bytes ( ) ;
x = new Big Integer ( byte Array ) ;
