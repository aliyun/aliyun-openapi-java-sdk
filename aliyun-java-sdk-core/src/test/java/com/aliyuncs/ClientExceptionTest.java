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

import static org.junit.Assert.*;

import org.junit.Test;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.ecs.v20140526.model.CreateInstanceRequest;
import com.aliyuncs.ecs.v20140526.model.DescribeRegionsRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;

public class ClientExceptionTest extends BaseTest {

	@Test
	public void test() {
		testMissingProfile();
		testRegionId();
		testServerUnreachable();
		testExceptionRequstId();
	}
	
	private void testMissingProfile() {
		DefaultAcsClient client = new DefaultAcsClient(null);
		AcsRequest request = new DescribeRegionsRequest();
		
		try {
			client.doAction(request, null);
		} catch (ServerException e) {
			fail(e.toString());
		} catch (ClientException e) {
			assertEquals("SDK.InvalidProfile", e.getErrCode());
		}
	}
	
	private void testRegionId() {
		DefaultAcsClient client = new DefaultAcsClient(DefaultProfile.getProfile());
		AcsRequest request = new DescribeRegionsRequest();
		
		try {
			client.doAction(request, "cn-lizuhe", new Credential("testid", "testsecret"));
		} catch (ServerException e) {
			fail(e.toString());
		} catch (ClientException e) {
			assertEquals("SDK.InvalidRegionId", e.getErrCode());
		}
	}
	
	private void testServerUnreachable() {
		DefaultAcsClient client = new DefaultAcsClient(DefaultProfile.getProfile());
		AcsRequest request = new DescribeRegionsRequest();
		
		try {
			client.doAction(request, "cn-beijing", new Credential("testid", "testsecret"));
		} catch (ServerException e) {
			fail(e.toString());
		} catch (ClientException e) {
			assertEquals("SDK.ServerUnreachable", e.getErrCode());
		}
	}
	
	private void testExceptionRequstId() {
		AcsRequest request = new CreateInstanceRequest();
		try {
			client.getAcsResponse(request);
		}  catch (ClientException e) {
			assertNotNull(e.getRequestId());
		}
		
	}
}
