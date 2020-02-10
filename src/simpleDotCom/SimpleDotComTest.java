package simpleDotCom;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleDotComTest {

    SimpleDotCom simpleDotCom;

    @Before
    public void setUp(){

        simpleDotCom = new SimpleDotCom();
        int[] locationCells = {2, 3, 4};
        simpleDotCom.setLocationCells(locationCells);
    }

    @Test
    public void checkYourselfHit() {

       String result = simpleDotCom.checkYourself("2");
       Assert.assertEquals("HIT", result);
    }

    @Test
    public void checkYourselfHit1() {

        String result = simpleDotCom.checkYourself("3");
        Assert.assertEquals("HIT", result);
    }

    @Test
    public void checkYourselfMiss() {

       String result =  simpleDotCom.checkYourself("1");
       Assert.assertEquals("MISS",result);
    }

    @Test
    public void checkYourselfKill(){

        String result = simpleDotCom.checkYourself("2");
        result = simpleDotCom.checkYourself("3");
        result = simpleDotCom.checkYourself("4");

        Assert.assertEquals("KILL", result);
    }


}