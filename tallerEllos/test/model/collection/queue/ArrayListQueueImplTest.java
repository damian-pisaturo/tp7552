package model.collection.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListQueueImplTest {

    private static final Integer QUEUE_ITEM_1 = 1;
    private static final Integer QUEUE_ITEM_2 = 2;

    @Test
    public void testIsEmptyUsingTrueCondition() {
        ArrayListQueueImpl<Integer> queue = new ArrayListQueueImpl<Integer>();
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmptyUsingFalseCondition() {
    	ArrayListQueueImpl<Integer> queue = new ArrayListQueueImpl<Integer>();
        queue.enqueue(QUEUE_ITEM_1);

        Assert.assertFalse(queue.isEmpty());
    }

    @Test
    public void testGetLength() {
    	ArrayListQueueImpl<Integer> queue = new ArrayListQueueImpl<Integer>();
        queue.enqueue(QUEUE_ITEM_1);

        Assert.assertEquals(1, queue.getLength());
    }

    @Test
    public void testEnqueue() {
    	ArrayListQueueImpl<Integer> queue = new ArrayListQueueImpl<Integer>();

        queue.enqueue(QUEUE_ITEM_1);
        Assert.assertEquals(1, queue.getLength());

        queue.enqueue(QUEUE_ITEM_2);
        Assert.assertEquals(2, queue.getLength());
    }

    @Test
    public void testDequeueUsingEmptyQueue() {
    	ArrayListQueueImpl<Integer> queue = new ArrayListQueueImpl<Integer>();

        try {
            queue.dequeue();
            Assert.fail();
        } catch (NoSuchElementException e) {
        } catch (Exception e) {
            Assert.fail(e.getClass().getName());
        }
    }

    @Test
    public void testDequeue() {
    	ArrayListQueueImpl<Integer> queue = new ArrayListQueueImpl<Integer>();
        queue.enqueue(QUEUE_ITEM_1);
        queue.enqueue(QUEUE_ITEM_2);

        Assert.assertEquals(QUEUE_ITEM_1, queue.dequeue());
        Assert.assertEquals(1, queue.getLength());
        Assert.assertEquals(QUEUE_ITEM_2, queue.dequeue());
        Assert.assertEquals(0, queue.getLength());
    }

    @Test
    public void testIterator() {
    	ArrayListQueueImpl<Integer> queue = new ArrayListQueueImpl<Integer>();

        Iterator<Integer> iterator = queue.iterator();

        Assert.assertNotNull(iterator);
    }

}
