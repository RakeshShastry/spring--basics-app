package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class PointsCordinatesTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void computeDistanceBetweenTwoPoints(){
        PointsCordinates p1 = new PointsCordinates(1,2);
        PointsCordinates p2 = new PointsCordinates(3,4);
        double distanceofpoints=PointsCordinates.distance(p1,p2);
        assertEquals(2.0,distanceofpoints,0.1);

        double slopeofpoint=PointsCordinates.slope(p1,p2);
        assertEquals(1.0,slopeofpoint,0.1);
    }
    @Test
    public void computeSlopBetweenPoints(){
        PointsCordinates p1 = new PointsCordinates(1,2);
        PointsCordinates p2 = new PointsCordinates(3,4);

        double slopeofpoint=PointsCordinates.slope(p1,p2);
        assertEquals(1.0,slopeofpoint,0.1);
    }

    @Test
    public void computeyintercept(){
        PointsCordinates p1 = new PointsCordinates(1,2);
        PointsCordinates p2 = new PointsCordinates(3,4);

        double yintercept=PointsCordinates.yintercept(p1,p2);
        assertEquals(1.0,yintercept,0.1);
    }

}