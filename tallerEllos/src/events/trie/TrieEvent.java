package events.trie;

import java.util.EventObject;

import model.structures.trie.Trie;
import model.structures.trie.TrieNode;

/**
 * Representa un evento que se origina en un trie.
 * 
 * @author Agustina
 * 
 * @param <Data> Tipo de dato almacenado en los nodos del Trie.
 */
public class TrieEvent<Data> extends EventObject {
  private static final long serialVersionUID = 1L;

  private Trie<Data> trie;
  private TrieNode<Data> current;

  /**
   * Construye un TrieEvent
   * @param trie el trie
   */
  public TrieEvent(Trie<Data> trie) {
    super(trie);
    this.current = null;
    this.trie = trie;
  }

  /**
   * Construye un TrieEvent
   * @param trie un trie
   * @param current nodo que esta procesando el trie cuando se origina el evento
   */
  public TrieEvent(Trie<Data> trie, TrieNode<Data> current) {
    super(trie);
    this.current = current;
  }

  /**
   * Obtiene el nodo en proceso.
   * @return el nodo en proceso.
   */
  public TrieNode<Data> getCurrent() {
    return current;
  }

  @Override
  public Trie<Data> getSource() {
    return trie;
  }
}
