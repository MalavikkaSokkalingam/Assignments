package junit5questions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class BankaccountTest {

	@Test
	 void Withdraw() throws InsufficientBalanceException {
        assertThrows(InsufficientBalanceException.class,new Executable() {
			public void execute() throws Throwable {
				Bankaccount.withdraw(800);
			}
		});
        assertEquals(500, Bankaccount.withdraw(100));
        System.out.println(Bankaccount.withdraw(100));
    }

}