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

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceRamRoleResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceRamRoleResponse.InstanceRamRoleSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceRamRoleResponseUnmarshaller {

	public static DescribeInstanceRamRoleResponse unmarshall(DescribeInstanceRamRoleResponse describeInstanceRamRoleResponse, UnmarshallerContext context) {
		
		describeInstanceRamRoleResponse.setRequestId(context.stringValue("DescribeInstanceRamRoleResponse.RequestId"));
		describeInstanceRamRoleResponse.setRegionId(context.stringValue("DescribeInstanceRamRoleResponse.RegionId"));
		describeInstanceRamRoleResponse.setTotalCount(context.integerValue("DescribeInstanceRamRoleResponse.TotalCount"));

		List<InstanceRamRoleSet> instanceRamRoleSets = new ArrayList<InstanceRamRoleSet>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceRamRoleResponse.InstanceRamRoleSets.Length"); i++) {
			InstanceRamRoleSet instanceRamRoleSet = new InstanceRamRoleSet();
			instanceRamRoleSet.setInstanceId(context.stringValue("DescribeInstanceRamRoleResponse.InstanceRamRoleSets["+ i +"].InstanceId"));
			instanceRamRoleSet.setRamRoleName(context.stringValue("DescribeInstanceRamRoleResponse.InstanceRamRoleSets["+ i +"].RamRoleName"));

			instanceRamRoleSets.add(instanceRamRoleSet);
		}
		describeInstanceRamRoleResponse.setInstanceRamRoleSets(instanceRamRoleSets);
	 
	 	return describeInstanceRamRoleResponse;
	}
}