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
package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeServerRelatedGlobalAccelerationInstancesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServerRelatedGlobalAccelerationInstancesResponseUnmarshaller {

	public static DescribeServerRelatedGlobalAccelerationInstancesResponse unmarshall(DescribeServerRelatedGlobalAccelerationInstancesResponse describeServerRelatedGlobalAccelerationInstancesResponse, UnmarshallerContext context) {
		
		describeServerRelatedGlobalAccelerationInstancesResponse.setRequestId(context.stringValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.RequestId"));

		List<GlobalAccelerationInstance> globalAccelerationInstances = new ArrayList<GlobalAccelerationInstance>();
		for (int i = 0; i < context.lengthValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstances.Length"); i++) {
			GlobalAccelerationInstance globalAccelerationInstance = new GlobalAccelerationInstance();
			globalAccelerationInstance.setRegionId(context.stringValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].RegionId"));
			globalAccelerationInstance.setGlobalAccelerationInstanceId(context.stringValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].GlobalAccelerationInstanceId"));
			globalAccelerationInstance.setIpAddress(context.stringValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].IpAddress"));
			globalAccelerationInstance.setServerIpAddress(context.stringValue("DescribeServerRelatedGlobalAccelerationInstancesResponse.GlobalAccelerationInstances["+ i +"].ServerIpAddress"));

			globalAccelerationInstances.add(globalAccelerationInstance);
		}
		describeServerRelatedGlobalAccelerationInstancesResponse.setGlobalAccelerationInstances(globalAccelerationInstances);
	 
	 	return describeServerRelatedGlobalAccelerationInstancesResponse;
	}
}