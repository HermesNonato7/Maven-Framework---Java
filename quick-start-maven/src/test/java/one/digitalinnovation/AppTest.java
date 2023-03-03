package one.digitalinnovation;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
class TestComponent
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestComponent(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestComponent.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void TestComponent()
    {
        assertTrue( true );
    }
}
