package com.userentrytest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.parametrizedtest.ValidateUserEntry;

public class UserEntryTest {

	@Test
	public void userTest() {
		ValidateUserEntry userEntry = new ValidateUserEntry();
		assertEquals("Kishlay", userEntry.firstName("Kishlay"));
		assertEquals("Kishan", userEntry.lastName("Kishan"));
		assertEquals("7979034653", userEntry.contactNumber("7979034653"));
		assertEquals("abc.abcd@bl.co.go", userEntry.contactNumber("abc.abcd@bl.co.go"));
	}
}
