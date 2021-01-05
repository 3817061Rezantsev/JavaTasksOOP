package collections1;

import java.util.Iterator;

public class NodeIterator<E> implements Iterator<E> {
	private Node<E> node;

	public NodeIterator(Node<E> node) {
		this.node = node;
	}

	@Override
	public boolean hasNext() {
		if ((node != null) && (node.getNextNode() != null)) {
			node = node.getNextNode();
			return true;
		}
		return false;
	}

	@Override
	public E next() {
		return node.getElement();
	}

}
