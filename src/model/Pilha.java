package model;


public class Pilha<T> {

    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    public Pilha() {

    }

    public void Push(T elemento) {

        Celula nova = new Celula(this.primeira, elemento);
        this.primeira = nova;

        if (this.totalDeElementos == 0) {
            // caso especial da lista vazia
            this.ultima = this.primeira;
        }
        this.totalDeElementos++;
    }

    public boolean existeDado(T elemento) {
        Celula atual = this.primeira;

        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }

    public boolean isFull() {

        return true;
    }

    public boolean isEmpty() {
        return totalDeElementos == 0;
    }

    public T Top() {
        return (T) this.primeira.getElemento();
    }

    public void Pull(T elemento) {
        this.primeira = this.primeira.getProxima();
        this.totalDeElementos--;

        if (this.totalDeElementos == 0) {
            this.ultima = null;
        }
        Push(elemento);
    }

    public void Pop() {

        if (totalDeElementos == 0) {
            throw new IllegalArgumentException("Não há elementos");
        } else {
            this.primeira = this.primeira.getProxima();
            this.totalDeElementos--;

            if (this.totalDeElementos == 0) {
                this.ultima = null;
            }
        }
    }

    public int tamanho() {
        return totalDeElementos;
    }

    public void limpa() {
        this.primeira = null;
        this.ultima = null;
        this.totalDeElementos = 0;
    }

    @Override
    public String toString() {
        // Verificando se a Lista está vazia
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        Celula atual = primeira;

        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append("[" + atual.getElemento() + "]<-");

            atual = atual.getProxima();
        }

        // último elemento
        builder.append("[" + atual.getElemento() + "]");

        return builder.toString();
    }
}
