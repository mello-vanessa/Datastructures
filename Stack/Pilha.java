/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Pilha {
    private int tamanhoMaximo;
    private int topo;
    private int[] elementos;

    public Pilha(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.topo = -1;
        this.elementos = new int[tamanhoMaximo];
    }

    public void empilhar(int valor) {
        if (topo < tamanhoMaximo - 1) {
            elementos[++topo] = valor;
        } else {
            System.out.println("A pilha está cheia. Não é possível empilhar o valor: " + valor);
        }
    }

    public int desempilhar() {
        if (topo >= 0) {
            return elementos[topo--];
        } else {
            System.out.println("A pilha está vazia. Não é possível desempilhar.");
            return -1;
        }
    }

    public int topo() {
        if (topo >= 0) {
            return elementos[topo];
        } else {
            System.out.println("A pilha está vazia.");
            return -1;
        }
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == tamanhoMaximo - 1;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        System.out.println("Topo da pilha: " + pilha.topo());

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando: " + pilha.desempilhar());
        }
        
        System.out.println("Topo da pilha: " + pilha.topo());

    }
}
