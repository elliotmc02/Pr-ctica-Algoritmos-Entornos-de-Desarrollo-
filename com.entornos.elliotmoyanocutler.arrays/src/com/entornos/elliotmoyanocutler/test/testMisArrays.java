package com.entornos.elliotmoyanocutler.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.entornos.elliotmoyanocutler.arrays.MisArrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class testMisArrays {

	int[] array1;
	int[] array2;
	int[] array3;
	
	@BeforeAll
	void inicializar() {
		array1 = new int[] {5,5,5};
		array2 = new int[] {10,2,8,2,6};
		array3 = new int[] {3,1,8,9,5,3};
	}
	
	@Test
	void testMedia() {
		assertEquals(5, Math.round(MisArrays.media(array1)));
		assertEquals(6, Math.round(MisArrays.media(array2)));
		assertEquals(5, Math.round(MisArrays.media(array3)));
	}

}
