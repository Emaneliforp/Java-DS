package Lecture1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDateTime;


public class EventTest {
    LocalDateTime start1 = LocalDateTime.of(2021, 9, 1, 8, 30);
    LocalDateTime end1 = LocalDateTime.of(2021, 9, 1, 10, 0);

    LocalDateTime start2 = LocalDateTime.of(2021, 9, 1, 7, 30);
    LocalDateTime end2 = LocalDateTime.of(2021, 9, 1, 10, 0);


    //test constructor
    @Test
    public void testConstructor(){
        Event e1 = new Event(start1, end1, "Dank Store");

        assertEquals(start1, e1.start);
        assertEquals(end1, e1.end);
        assertEquals("Dank Store", e1.location);
    }

    @Test
    public void testConflictDiffLocation(){
        Event e1 = new Event(start1, end1, "Dank Store");
        Event e2 = new Event(start2, end2, "Dank Trades");

        assertEquals(false, e1.conflict(e2));
    }

    @Test
    public void testConflictComOverlap1(){
        Event e1 = new Event(start1, end1, "Dank Store");
        Event e2 = new Event(start2, end2, "Dank Store");

        assertEquals(true, e1.conflict(e2));
    }

    @Test
    public void testConflictComOverlap2(){
        LocalDateTime start3 = LocalDateTime.of(2021, 9, 1, 9, 30);
        LocalDateTime end3 = LocalDateTime.of(2021, 9, 1, 10, 0);
        Event e1 = new Event(start1, end1, "Dank Store");
        Event e2 = new Event(start3, end3, "Dank Store");

        assertEquals(true, e1.conflict(e2));
    }
    @Test
    public void testConflictParOverlap1(){
        LocalDateTime start3 = LocalDateTime.of(2021, 9, 1, 9, 30);
        LocalDateTime end3 = LocalDateTime.of(2021, 9, 1, 10, 0);
        Event e1 = new Event(start3, end3, "Dank Store");
        Event e2 = new Event(start1, end1, "Dank Store");

        assertEquals(true, e1.conflict(e2));
    }
}
