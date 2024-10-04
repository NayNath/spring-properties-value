package properties.value;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemasMensagens implements CommandLineRunner{

    @Value("${nome}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefone}")
    private List<Long> telefone;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: "+nome
                            +" Email: "+ email
                            +" Telefone: "+ telefone);
        System.out.println("Seu cadastro foi aprovado");
    }

    
}
