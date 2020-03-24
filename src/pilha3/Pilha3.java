
package pilha;

public class Pilha {
    private int topo;
    private int dados[];
    private int MAX;
    
    private Pilha() {}
    
    public Pilha(int n) {
        this.topo = -1;
        this.MAX = n;
        this.dados = new int [MAX];
        
    }
    public int getTopo() {
        return topo;
    }
    public int[] getDados() {
        return dados;
    }   
    
    public void topo(){
        if(!vazia()){
            System.out.println(dados[topo]);
        }
    }
    public boolean vazia(){
        if(topo == -1){
            return true;
        }
        return false;
    }
    private boolean cheia(){
        if(topo == MAX -1){
            return true;
        }
        return false;
    }
    public void empilha(int valor){
        if(!cheia()){
            topo = topo +1;
            dados[topo] = valor;
        }else{
            System.out.println("Pilha Cheia");
        }
    }
    public void desempilha(){
        if(!vazia()){
            dados[topo] = topo -1;
            topo = topo -1;
        }else{
            System.out.println("Pilha esta vazia");
        }
    }
    
    
    public static void main(String[] args) {
        Pilha p = new Pilha(3);
        System.out.println(p.vazia());
        System.out.println(p.cheia());
        p.empilha(1);
        System.out.println(p.vazia());
        p.desempilha();
        System.out.println(p.vazia());
        p.empilha(1);
        System.out.println(p.vazia());
        p.empilha(2);
        System.out.println(p.vazia());
        System.out.println(p.cheia());
        p.empilha(3);
        System.out.println(p.cheia());
        p.empilha(4);
        System.out.println(p.cheia());
        p.empilha(5);
        p.empilha(6);
        p.empilha(7);
        p.empilha(8);
        p.empilha(9);
        p.empilha(10);
        p.empilha(11);
        p.topo();

        
    }    
    
}
