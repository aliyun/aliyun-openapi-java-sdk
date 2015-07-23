/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.aliyuncs.auth.AuthTest;
import com.aliyuncs.auth.CredentialTest;
import com.aliyuncs.auth.ShaHmac256Test;
import com.aliyuncs.http.HttpTest;
import com.aliyuncs.oss.OssTest;
import com.aliyuncs.profile.DefaultProfileTest;
import com.aliyuncs.reader.JsonReaderTest;
import com.aliyuncs.reader.XmlReaderTest;
import com.aliyuncs.regions.EndpointTest;
import com.aliyuncs.regions.RegionsTest;
import com.aliyuncs.transform.UnmarshallerContextTest;
import com.aliyuncs.utils.ParameterHelperTest;
import com.aliyuncs.utils.UtilsTest;

@RunWith(Suite.class)
@SuiteClasses({ HttpTest.class, UtilsTest.class,RegionsTest.class, DefaultProfileTest.class, 
	AuthTest.class,ClientExceptionTest.class,DefaultAcsClientTest.class,OssTest.class,
	UnmarshallerContextTest.class,JsonReaderTest.class,XmlReaderTest.class,
	ShaHmac256Test.class,CredentialTest.class,ParameterHelperTest.class,EndpointTest.class})
public class AllTests {

}
