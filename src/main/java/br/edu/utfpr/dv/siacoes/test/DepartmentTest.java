package br.edu.utfpr.dv.siacoes.test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.utfpr.dv.siacoes.model.Department;

public class DepartmentTest {
	Department model = new Department();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void getIdDepartmentTest() throws Exception {
		
		
		assertEquals(0,model.getIdDepartment());
		
	}

}
