package main.java.middleoflinkedlist;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList
{

    public static void main(String[] args)
    {
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
                System.out.println(middleNode(node1).val);
    }

    public static ListNode middleNode(ListNode head)
    {
        List<ListNode> ls = new ArrayList<>();
        buildList(head, ls);
        int nodeCount = ls.size();
        return ls.get((nodeCount/2));
    }

    private static void buildList(ListNode head, List<ListNode> ls)
    {
        ls.add(head);
        if (head.next != null)
        {
            buildList(head.next, ls);
        }
    }

}
