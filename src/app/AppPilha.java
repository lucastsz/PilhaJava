package app;

import model.Pilha;

public class AppPilha {
   public static void main(String[] args) {
        Pilha<Integer> p = new Pilha<>();
        
        System.out.println("A pilha está vazia? " + p.isEmpty());
        
        p.Push(1); //ultimo
        p.Push(2);
        p.Push(3);
        p.Push(4);
        p.Push(5);
        p.Push(6);
        p.Push(7);
        p.Push(8);
        p.Push(9);
        p.Push(10); //Topo
        
        System.out.println("\n"+ p);
        System.out.println("\nExiste 7?: " + p.existeDado(7));
        System.out.println("Existe 52?: " + p.existeDado(52));
        
        System.out.println("\nA pilha está vazia? " + p.isEmpty());
        
        System.out.println("\nRecuperando o topo da lista: " + p.Top());
        
        p.Pull(70);
        System.out.println("\nAlterei o topo para 70");
        System.out.println(p);
        p.Pop();
        System.out.println("\nRemovendo o Topo da lista");
        System.out.println(p);
        System.out.println("\nTamanho: " + p.tamanho());
        
        System.out.println("\nlimpando a pilha...");
        p.limpa();
        System.out.println(p);
        
    }
}
