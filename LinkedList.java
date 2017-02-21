//http://blog.csdn.net/tanyujing/article/details/8479742
package com.coding.basic;

public class LinkedList implements List {
	
	private Node head;
	private Node tail;
	private int size;
	//将最后一个节点的指针指向要插入的元素
	public void add(Object o){
		Node newnode = new Node();
		newnode.setData(o);
		//linkedList头元素为空的话，把此插入的新元素作为头元素
		if (head==null) {
			head = newnode;
			size ++;
		}else {
		//若头元素不为空，则把插入的节点newnode设置为（LinkedList）的末节点
			tail.setNext(newnode);
			tail = newnode;
			size ++;
		}
	}
	//将index上一个索引的指针指向o，将o的指针指向原index元素
	public void add(int index , Object o){
		Node newnode = new Node();
		newnode.setData(o);
		
		newnode.next = null;
		
	}
	public Object get(int index){
		return null;
	}
	public Object remove(int index){
		return null;
	}
	
	public int size(){
		return -1;
	}
	
	public void addFirst(Object o){
		
	}
	public void addLast(Object o){
		
	}
	public Object removeFirst(){
		return null;
	}
	public Object removeLast(){
		return null;
	}
	public Iterator iterator(){
		return null;
	}
	
	
	private static  class Node{
		Object data;
		Node next;
		//获取当前节点数据
		public Object getData(){
			return data;
		}
		//设置当前节点数据
		public void setData(Object data){
			this.data = data;
		}
		//返回下一个节点
		public Node getNext(){
			return next;
		}
		//设置下一个节点
		public void setNext(Node next){
			this.next = next;
		}
	}
}
