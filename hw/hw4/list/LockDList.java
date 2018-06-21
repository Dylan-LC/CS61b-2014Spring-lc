package list;

public class LockDList extends DList {

    protected LockDListNode newNode(Object item, DListNode prev, DListNode next) {
      return new LockDListNode(item, prev, next);
    }

    public void lockNode(DListNode node) {
      LockDListNode tempNode = (LockDListNode)node;
      tempNode.locked = true;
    }

    public LockDListNode front() {
      return (LockDListNode)(super.front());
    }

    public LockDListNode back() {
      return (LockDListNode)(super.back());
    }

    public LockDListNode next(DListNode node) {
      return (LockDListNode)(super.next(node));
    }

    public LockDListNode prev(DListNode node) {
      return (LockDListNode)(super.prev(node));
    }

    public void remove(DListNode node) {
      if (!node.equals(null)) {
        if (!(((LockDListNode)node).locked)) {
          node.prev.next = node.next;
          node.next.prev = node.prev;
          node.item = null;
          size--;
        }
      }
    }

}
