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
		return node.iterator();
	}

	@Override
	public void add(E element) {
		Node<E> newNode = new Node<>(element);
		if (node == null) {
			node = tail = newNode;
		} else {
			tail.setNextNode(newNode);
			tail = newNode;
		}
	}

	@Override
	public void add(int index, E element) {
		if (index == 0) {
			node = new Node<E>(element, node);
		} else {
			if (node == null) {
				throw new IllegalStateException();
			}
			int posithion = 0;
			NodeIterator<E> iter = (NodeIterator<E>) node.iterator();
			while (iter.hasNext() && (posithion != index - 1)) {
				iter.next();
				posithion++;
			}
			if (posithion != index - 1) {
				throw new IllegalArgumentException();
			}
			iter.nextNode().setNextNode(new Node<E>(element, iter.nextNode()));
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
		int position = 0;
		Iterator<E> iter = node.iterator();
		while (iter.hasNext() && (position != index)) {
			iter.next();
			position++;
		}
		if ((position != index) || !iter.hasNext()) {
			throw new IllegalArgumentException();
		}
		return iter.next();
	}

	@Override
	public int indexOf(E element) {
		if (node == null) {
			throw new IllegalStateException();
		}
		int index = 0;
		Iterator<E> iter = node.iterator();
		while (iter.hasNext()) {
			if (iter.next().equals(element)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	@Override
	public E remove(int index) {
		if (node == null) {
			throw new IllegalStateException();
		}
		int i = 0;
		Node<E> delNode = node;
		Node<E> prev = node;
		while ((delNode.getNextNode() != null) && (i != index)) {
			prev = delNode;
			delNode = delNode.getNextNode();
			i++;
		}
		if (i != index) {
			throw new IllegalArgumentException();
		}
		prev.setNextNode(delNode.getNextNode());
		return delNode.getElement();
	}

	@Override
	public E set(int index, E element) {
		if (node == null) {
			throw new IllegalStateException();
		}
		int i = 0;
		Node<E> change = node;
		while ((change.getNextNode() != null) && (i != index)) {
			change = change.getNextNode();
			i++;
		}
		if (i != index) {
			throw new IllegalArgumentException();
		}
		change.setElement(element);
		return change.getElement();
	}

	@Override
	public int size() {
		if (node == null) {
			return 0;
		}
		int size = 0;
		Iterator<E> iter = node.iterator();
		while (iter.hasNext()) {
			iter.next();
			size++;
		}
		return size;
	}

	@Override
	public E[] toArray() {
		if (node == null) {
			return null;
		}
		@SuppressWarnings("unchecked")
		Class<E> clazz = (Class<E>) node.getElement().getClass();
		@SuppressWarnings("unchecked")
		E[] arr = (E[]) Array.newInstance(clazz, this.size());
		int i = 0;
		Iterator<E> iter = node.iterator();
		while (iter.hasNext()) {
			arr[i] = iter.next();
			i++;
		}
		return arr;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("MyLinkedList[nodes={");
		Iterator<E> iter = node.iterator();
		while (iter.hasNext()) {
			sb.append(",");
			sb.append(iter.next());
		}
		sb.append("}]");
		return sb.toString();
	}

}
