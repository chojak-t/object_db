/*
 * Testing class that represents single Point with coordinates (x,y)
 */
package warsztat;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Tomasz Chojak
 */
@Entity
public class Point implements Serializable {
    @Id @GeneratedValue
    private long id; //klucz?
    
    private int x;
    private int y;
    
    public Point() {
    }
 
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
 
    public Long getId() {
        return id;
    }
 
    public int getX() {
         return x;
    }
 
    public int getY() {
         return y;
    }
 
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
