package assignment3;

import java.io.*;

public class LinkedList {
	//creates the head of linked list
	private Node head;
	
	//set head to null
	public LinkedList() {
		this.head = null;
	}
	
	//scans .txt to add to the linked list
	public void construct(String fileName) {
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String line;
			while ((line = br.readLine()) != null) {
	            checkInt(line);
	        }
		} 
		catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	//checks the requirements to see if a node needed to be changed to count
	public void process() {
		if (head == null || head.getNext() == null) {
			return;
		}
		
	    int count = -100;
		Node tempHead = new Node(count);
        tempHead.setNext(head);
		Node prev = tempHead;
		Node temp = head;
  
        
        while (temp != null && temp.getNext() != null) {
            Node next = temp.getNext();
            int compare = temp.getData() * 2 + 7;
            if (next.getData() == compare) {
                Node newNode = new Node(count++);
                prev.setNext(newNode);
                newNode.setNext(next.getNext());
                temp = newNode.getNext();
                prev = newNode;
            } else {
                prev = temp;
                temp = temp.getNext();
            }
        }
        head = tempHead.getNext();
        if (temp!=null) {
        	append(count); 
        }
    }
	
	//checks if the data is positive to be added to linked list
	private void checkInt(String line) {
        String[] tokens = line.trim().split(" ");
        for (String token : tokens) {
            try {
                int data = Integer.parseInt(token);
                if (data > 0) {
                    append(data);
                }
            } catch (NumberFormatException e) {
            	//
            }
        }
    }
	
	//function to add data to linked list
	private void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

	//function to print it to the .txt provided
	public void printFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Node temp = head;
            while (temp != null) {
                writer.write(Integer.toString(temp.getData()) + " ");
                temp = temp.getNext();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
