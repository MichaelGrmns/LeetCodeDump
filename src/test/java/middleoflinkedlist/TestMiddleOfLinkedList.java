package test.java.middleoflinkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.java.middleoflinkedlist.ListNode;
import main.java.middleoflinkedlist.MiddleOfLinkedList;

public class TestMiddleOfLinkedList
{

    @Test
    public void testOne()
    {
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        
        ListNode res = middleOfLinkedList.middleNode(node1);
        assertEquals(node4, res);
    }
    
    @Test
    public void testTwo()
    {
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        
        ListNode res = middleOfLinkedList.middleNode(node1);
        assertEquals(node3, res);
        
    }
}
