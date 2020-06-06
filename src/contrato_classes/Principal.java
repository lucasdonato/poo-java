package contrato_classes;

/**
 *
 * @author Lucas Donato
 */
public class Principal {

    public static void main(String[] args) {

        //CRIANDO OS DISPOSITIVOS        
        Impressora impressora_1 = new Impressora("Brother", 5505, 220, "640x480", "Laser", "Colorido");
        Scanner scanner_1 = new Scanner("Multilaser", 1122, 110, "320x240");
        Copiadora copiadora_1 = new Copiadora("HP", 2020, 220, "Color");
        Computador computador_1 = new Computador("PC Cabuloso", "127.0.0.1", "255.255.255.ZZZ.YYY", "LINUX", 16, 1000);
        Computador computador_2 = new Computador("PC Cabuloso", "127.0.0.1", "255.255.255.ZZZ.YYY", "LINUX", 16, 1000);
        Computador computador_3 = new Computador("PC Cabuloso", "127.0.0.1", "255.255.255.ZZZ.YYY", "LINUX", 16, 1000);
        Multifuncional multifuncional_1 = new Multifuncional("EPSON", 9407, 220, "640x480", "impressão rápida", "P/B", "Laser", "320x240");

        //CRIA PRIMEIRA ASSOCIAÇÃO
        Associacao a1 = new Associacao(computador_1);
        a1.adicionarDispositivo(scanner_1);

        //CRIA SEGUNDA ASSOCIAÇÃO
        Associacao a2 = new Associacao(computador_2);
        a2.adicionarDispositivo(multifuncional_1);
        a2.adicionarDispositivo(copiadora_1);

        //CRIA TERCEIRA ASSOCIAÇÃO
        Associacao a3 = new Associacao(computador_3);
        a3.adicionarDispositivo(scanner_1);
        a3.adicionarDispositivo(copiadora_1);
        a3.adicionarDispositivo(multifuncional_1);
        a3.adicionarDispositivo(impressora_1);

        //CRIANDO REDES E ADD ASSOCIAÇÕES
        Rede rede_1 = new Rede(a1);
        rede_1.adicionarAssociacao(a2);

        Rede rede_2 = new Rede(a1);
        rede_2.adicionarAssociacao(a2);
        rede_2.adicionarAssociacao(a3);

        //EXIBINDO AS ASSOCIAÇÕES
        rede_2.listarAssociacoes();
        //a2.exibirAssociacao();
    }
}
