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
package com.aliyuncs.reusable;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.ecs.model.v20140526.DeleteInstanceRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.StopInstanceRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;

public class MultiDeleteSample {
	
	
	private static boolean ifRunningInstances(DescribeInstancesResponse describeResponse) {
		for(DescribeInstancesResponse.Instance instance 
				: describeResponse.getInstances())
			if ("running".equals(instance.getStatus().toString().toLowerCase()))
				return true;
		return false;
	}

	public static void main(String args[]) throws InterruptedException {
		DescribeInstancesRequest describe = new DescribeInstancesRequest();
		StopInstanceRequest stop = new StopInstanceRequest();
		DeleteInstanceRequest delete = new DeleteInstanceRequest();
		
		DefaultProfile profile = DefaultProfile.getProfile("cn-beijing",
				FiledCredentialProvider.getICredentialProvider());
		DefaultAcsClient client = new DefaultAcsClient(profile);
		try {
			DescribeInstancesResponse describeResponse = client.getAcsResponse(describe);
			for(DescribeInstancesResponse.Instance instance 
					: describeResponse.getInstances()) {
				stop.setInstanceId(instance.getInstanceId());
				try {
					client.doAction(stop);
				} catch (ClientException exp) {
					if (! exp.getErrCode().toLowerCase().contains("incorrectinstancestatus"))
						throw exp; 
					continue;
				}
			}
			while(ifRunningInstances(client.getAcsResponse(describe)))
				Thread.sleep(3000);
			for(DescribeInstancesResponse.Instance instance
					: describeResponse.getInstances()) {
				delete.setInstanceId(instance.getInstanceId());
				client.doAction(delete);
			}
			System.out.print("All ECS Instances are deleted.");
		} catch (ServerException e) {
			e.printStackTrace();
		} catch (ClientException e) {
			e.printStackTrace();
		}
	}
}
