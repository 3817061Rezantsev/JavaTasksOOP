package collections1;

import java.util.Iterator;

public class Node<E> {
	private E element;
	private Node<E> nextNode;

	public Node() {
	}

	public Node(E element) {
		this.element = element;
		nextNode = null;
	}

	public Node(E element, Node<E> nextNode) {
		this.element = element;
		this.nextNode = nextNode;
	}

	public E getNode() {
		return element;
	}

	public Node<E> getNextNode() {
		return nextNode;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node[element=" + element.toString() + "]";
	}

	public Iterator<E> iterator() {
		return new NodeIterator<E>(this);
	}
}
