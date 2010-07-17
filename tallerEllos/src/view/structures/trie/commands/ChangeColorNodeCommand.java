package view.structures.trie.commands;

import view.commons.commands.Command;
import java.awt.Color;

import view.structures.trie.elements.AbstractTrieNodeView;

/**
 * Este comando debe ejecutarse cuando se desea cambiar el color de un nodo.
 * 
 * @author Agustina
 */
public class ChangeColorNodeCommand implements Command {
  private AbstractTrieNodeView node;
  private Color color;

  /**
   * Construye un ChangeNodeCommand
   * @param node nodo a cambiar de color
   * @param color color a aplicarle al nodo
   */
  public ChangeColorNodeCommand(AbstractTrieNodeView node, Color color) {
    this.node = node;
    this.color = color;
  }

  @Override
  public boolean canExecute() {
    return true;
  }

  @Override
  public void execute() {
    node.setColor(color);
  }

}
