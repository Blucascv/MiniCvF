
package br.com.minic;

import java.io.FileReader;

import br.com.minic.analisadorlexico.AnalisadorLexico;
import br.com.minic.analisadorsintatico.parser;
import br.com.modelos.ProgramaMiniC;
import java_cup.runtime.Symbol;

public class CompiladorMiniC {

  public static void main(String[] args) throws Exception {
  
    FileReader arquivoTeste = 
    		new FileReader( "programas/ProgramaTeste3.txt" );
        
    AnalisadorLexico analisadorLexico = 
    		new AnalisadorLexico( arquivoTeste );

    parser analisadorSintatico = new parser( analisadorLexico );
    
    Symbol symbol = analisadorSintatico.parse();
    
    ProgramaMiniC programaMiniC = (ProgramaMiniC) symbol.value;
    
    System.out.println( programaMiniC );
    
  }
  
}
