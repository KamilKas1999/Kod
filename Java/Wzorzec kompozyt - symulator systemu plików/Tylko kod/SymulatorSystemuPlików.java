package symulator.systemu.plików;

public class SymulatorSystemuPlików {

    public static void main(String[] args) {

        System.out.println("Witaj w prostym symulatorze cmd!");
        System.out.println("Możesz tu używać takich komend jak:");
        System.out.println("dir");
        System.out.println("cd ..");
        System.out.println("cd <nazwa katalogu>");
        System.out.println("exit");
        System.out.println("");
        
        CMD cmd = new CMD();
        cmd.cmd();

    }

}
