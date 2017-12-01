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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DetachInstanceRamRoleResponse;
import com.aliyuncs.ecs.model.v20140526.DetachInstanceRamRoleResponse.DetachInstanceRamRoleResult;
import com.aliyuncs.ecs.model.v20140526.DetachInstanceRamRoleResponse.DetachInstanceRamRoleResult.InstanceRamRoleSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachInstanceRamRoleResponseUnmarshaller {

	public static DetachInstanceRamRoleResponse unmarshall(DetachInstanceRamRoleResponse detachInstanceRamRoleResponse, UnmarshallerContext context) {
		
		detachInstanceRamRoleResponse.setRequestId(context.stringValue("DetachInstanceRamRoleResponse.RequestId"));
		detachInstanceRamRoleResponse.setTotalCount(context.integerValue("DetachInstanceRamRoleResponse.TotalCount"));
		detachInstanceRamRoleResponse.setFailCount(context.integerValue("DetachInstanceRamRoleResponse.FailCount"));
		detachInstanceRamRoleResponse.setRamRoleName(context.stringValue("DetachInstanceRamRoleResponse.RamRoleName"));

		List<DetachInstanceRamRoleResult> detachInstanceRamRoleResults = new ArrayList<DetachInstanceRamRoleResult>();
		for (int i = 0; i < context.lengthValue("DetachInstanceRamRoleResponse.DetachInstanceRamRoleResults.Length"); i++) {
			DetachInstanceRamRoleResult detachInstanceRamRoleResult = new DetachInstanceRamRoleResult();
			detachInstanceRamRoleResult.setInstanceId(context.stringValue("DetachInstanceRamRoleResponse.DetachInstanceRamRoleResults["+ i +"].InstanceId"));
			detachInstanceRamRoleResult.setSuccess(context.booleanValue("DetachInstanceRamRoleResponse.DetachInstanceRamRoleResults["+ i +"].Success"));
			detachInstanceRamRoleResult.setCode(context.stringValue("DetachInstanceRamRoleResponse.DetachInstanceRamRoleResults["+ i +"].Code"));
			detachInstanceRamRoleResult.setMessage(context.stringValue("DetachInstanceRamRoleResponse.DetachInstanceRamRoleResults["+ i +"].Message"));

			List<InstanceRamRoleSet> instanceRamRoleSets = new ArrayList<InstanceRamRoleSet>();
			for (int j = 0; j < context.lengthValue("DetachInstanceRamRoleResponse.DetachInstanceRamRoleResults["+ i +"].InstanceRamRoleSets.Length"); j++) {
				InstanceRamRoleSet instanceRamRoleSet = new InstanceRamRoleSet();
				instanceRamRoleSet.setInstanceId(context.stringValue("DetachInstanceRamRoleResponse.DetachInstanceRamRoleResults["+ i +"].InstanceRamRoleSets["+ j +"].InstanceId"));
				instanceRamRoleSet.setRamRoleName(context.stringValue("DetachInstanceRamRoleResponse.DetachInstanceRamRoleResults["+ i +"].InstanceRamRoleSets["+ j +"].RamRoleName"));

				instanceRamRoleSets.add(instanceRamRoleSet);
			}
			detachInstanceRamRoleResult.setInstanceRamRoleSets(instanceRamRoleSets);

			detachInstanceRamRoleResults.add(detachInstanceRamRoleResult);
		}
		detachInstanceRamRoleResponse.setDetachInstanceRamRoleResults(detachInstanceRamRoleResults);
	 
	 	return detachInstanceRamRoleResponse;
	}
}