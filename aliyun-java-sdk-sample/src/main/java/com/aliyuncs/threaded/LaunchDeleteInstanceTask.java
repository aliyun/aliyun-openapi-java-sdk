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
package com.aliyuncs.threaded;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.ecs.model.v20140526.AllocatePublicIpAddressRequest;
import com.aliyuncs.ecs.model.v20140526.CreateInstanceRequest;
import com.aliyuncs.ecs.model.v20140526.CreateInstanceResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.StartInstanceRequest;
import com.aliyuncs.ecs.model.v20140526.StopInstanceRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;

public class LaunchDeleteInstanceTask extends Thread {

	private CreateInstanceRequest create = new CreateInstanceRequest();
	private AllocatePublicIpAddressRequest allocate = new AllocatePublicIpAddressRequest();
	private StartInstanceRequest start = new StartInstanceRequest();
	private StopInstanceRequest stop = new StopInstanceRequest();
	private DescribeInstancesRequest describe = new DescribeInstancesRequest();
	
	public LaunchDeleteInstanceTask() {
		create.setImageId("centos7u0_64_20G_aliaegis_20141117.vhd");
		create.setInstanceType("ecs.t1.xsmall");
		create.setSecurityGroupId("sg-25jepif73");
	}
	
	private void setInstanceId(String instanceId) {
		allocate.setInstanceId(instanceId);
		start.setInstanceId(instanceId);
		stop.setInstanceId(instanceId);
		describe.setInstanceIds(instanceId);
	}

    @Override
    public void run() {
		
		DefaultProfile profile = DefaultProfile.getProfile("cn-beijing",
				FiledCredentialProvider.getICredentialProvider());
		DefaultAcsClient client = new DefaultAcsClient(profile);
		
		try {
			CreateInstanceResponse createResponse = client.getAcsResponse(create);
			setInstanceId(createResponse.getInstanceId());
			client.doAction(allocate);
			client.doAction(start);
			client.doAction(stop);
		} catch (ServerException e) {
			e.printStackTrace();
		} catch (ClientException e) {
			e.printStackTrace();
		}
    }
}
