package by.jrr.architectureandmock.service;

import by.jrr.architectureandmock.bean.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LegalCapacityServiceTest {

    @Mock
    LegalCapable legalCapableBel;
    @Mock
    LegalCapable legalCapableBrit;

    @InjectMocks
    LegalCapacityService legalCapacityService;

    @Before
    public void setup() {
        legalCapacityService = new LegalCapacityService(legalCapableBrit, legalCapableBel);
    }

    @Test
    public void isCouldBeMarriad() {
        var person = new Person(21, "Maria", "belarus");
        var person2 = new Person(17, "vika", "british");

        when(legalCapableBel.isMariable(eq(person))).thenReturn(true);
        when(legalCapableBrit.isMariable(eq(person2))).thenReturn(true);

        assertEquals(true, legalCapacityService.isCouldBeMarriad(person));
        assertEquals(true, legalCapacityService.isCouldBeMarriad(person2));
    }
}
