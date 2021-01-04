package collections1;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {

	private Node<E> node;
	private Node<E> tail;

	public MyLinkedList() {
		node = null;
		tail = null;
	}

	public boolean isEmpty() {
		if (node == null)
			return true;
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		if (node == null)
			return null;
		Node<E> temp = new Node<E>(node.getNode(), node);
		Iterator<E> iter = temp.iterator();
		return iter;
	}

	@Override
	public void add(E element) {
		if (node == null) {
			node = new Node<E>(element);
			tail = node;
		} else {
			tail.setNextNode(new Node<E>(element));
			tail = tail.getNextNode();
		}
	}

	@Override
	public void add(int index, E element) {
		int i = 0;
		Node<E> B = node;
		if (index == 0) {
			node = new Node<E>(element, node);
		} else {
			if (node == null) {
				throw new IllegalStateException();
			}
			while ((B.getNextNode() != null) && (i != index - 1)) {
				B = B.getNextNode();
				i++;
			}
			if (i != index - 1) {
				throw new IllegalArgumentException();
			}
			B.setNextNode(new Node<E>(element, B.getNextNode()));
		}
	}

	@Override
	public void clear() {
		node = null;
	}

	@Override
	public E get(int index) {
		if (node == null) {
			throw new IllegalStateException();
		}
		int i = 0;
		Node<E> B = node;
		while ((B.getNextNode() != null) && (i != index)) {
			B = B.getNextNode();
			i++;
		}
		if (i != index) {
			throw new IllegalArgumentException();
		}
		return B.getNode();
	}

	@Override
	public int indexOf(E element) {
		if (node == null) {
			throw new IllegalStateException();
		}
		int i = 0;
		Node<E> B = node;
		while ((B.getNextNode() != null) && (!B.getNode().equals(element))) {
			B = B.getNextNode();
			i++;
		}
		if (!B.getNode().equals(element)) {
			throw new IllegalArgumentException();
		}
		return i;
	}

	@Override
	public E remove(int index) {
		if (node == null) {
			throw new IllegalStateException();
		}
		int i = 0;
		Node<E> B = node;
		Node<E> C = node;
		while ((B.getNextNode() != null) && (i != index)) {
			C = B;
			B = B.getNextNode();
			i++;
		}
		if (i != index) {
			throw new IllegalArgumentException();
		}
		C.setNextNode(B.getNextNode());
		return B.getNode();
	}

	@Override
	public E set(int index, E element) {
		if (node == null) {
			throw new IllegalStateException();
		}
		int i = 0;
		Node<E> B = node;
		while ((B.getNextNode() != null) && (i != index)) {
			B = B.getNextNode();
			i++;
		}
		if (i != index) {
			throw new IllegalArgumentException();
		}
		B.setElement(element);
		return B.getNode();
	}

	@Override
	public int size() {
		int i = 1;
		if (node == null) {
			return 0;
		}
		Node<E> B = node;
		while (B.getNextNode() != null) {
			B = B.getNextNode();
			i++;
		}
		return i;
	}

	@Override
	public E[] toArray() {
		if (node == null) {
			return null;
		}
		@SuppressWarnings("unchecked")
		Class<E> clazz = (Class<E>) node.getNode().getClass();
		@SuppressWarnings("unchecked")
		E[] arr = (E[]) Array.newInstance(clazz, this.size());
		Node<E> B = node;
		int i = 0;
		arr[i] = B.getNode();
		while ((B.getNextNode() != null)) {
			B = B.getNextNode();
			i++;
			arr[i] = B.getNode();
		}
		return arr;
	}

	@Override
	public String toString() {
		Node<E> B = node;
		String res = "MyLinkedList[nodes={" + B.toString();
		while ((B.getNextNode() != null)) {
			B = B.getNextNode();
			res += "," + B.toString();
		}
		res += "}]";
		return res;
	}

}
