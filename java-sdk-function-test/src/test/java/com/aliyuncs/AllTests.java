package com.aliyuncs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ErrorHandlingTest.class, ClientExceptionTest.class, DefaultAcsClientTest.class, APIEncapsulateTest.class,
        CoreTest.class, NewEndpointTest.class})
public class AllTests {
}