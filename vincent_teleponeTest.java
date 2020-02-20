package telephone;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class teleponeTest {
telephone.Telephone phone = new telephone.Telephone();
	 @Test
	    void numLengthTest() {
	        assertEquals(true, phone.isFormatted("(570)529-2319"));
	    }
	    
	    @Test
	    void isNumTest() {
	    	 assertEquals(true, phone.isFormatted("Super"));
	    }
	    @Test
	    void notNullTest() {
	    	 assertEquals(true, phone.isFormatted(""));
	    }
	    

}
