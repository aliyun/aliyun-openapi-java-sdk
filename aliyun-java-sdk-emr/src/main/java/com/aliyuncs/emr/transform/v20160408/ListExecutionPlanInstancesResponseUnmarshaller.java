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
package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListExecutionPlanInstancesResponse;
import com.aliyuncs.emr.model.v20160408.ListExecutionPlanInstancesResponse.ExecutionPlanInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutionPlanInstancesResponseUnmarshaller {

	public static ListExecutionPlanInstancesResponse unmarshall(ListExecutionPlanInstancesResponse listExecutionPlanInstancesResponse, UnmarshallerContext context) {
		
		listExecutionPlanInstancesResponse.setRequestId(context.stringValue("ListExecutionPlanInstancesResponse.RequestId"));
		listExecutionPlanInstancesResponse.setTotalCount(context.integerValue("ListExecutionPlanInstancesResponse.TotalCount"));
		listExecutionPlanInstancesResponse.setPageNumber(context.integerValue("ListExecutionPlanInstancesResponse.PageNumber"));
		listExecutionPlanInstancesResponse.setPageSize(context.integerValue("ListExecutionPlanInstancesResponse.PageSize"));

		List<ExecutionPlanInstance> executionPlanInstances = new ArrayList<ExecutionPlanInstance>();
		for (int i = 0; i < context.lengthValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances.Length"); i++) {
			ExecutionPlanInstance executionPlanInstance = new ExecutionPlanInstance();
			executionPlanInstance.setId(context.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].Id"));
			executionPlanInstance.setExecutionPlanId(context.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].ExecutionPlanId"));
			executionPlanInstance.setExecutionPlanName(context.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].ExecutionPlanName"));
			executionPlanInstance.setStartTime(context.longValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].StartTime"));
			executionPlanInstance.setRunTime(context.integerValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].RunTime"));
			executionPlanInstance.setClusterId(context.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].ClusterId"));
			executionPlanInstance.setClusterName(context.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].ClusterName"));
			executionPlanInstance.setClusterType(context.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].ClusterType"));
			executionPlanInstance.setStatus(context.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].Status"));
			executionPlanInstance.setLogEnable(context.booleanValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].LogEnable"));
			executionPlanInstance.setLogPath(context.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].LogPath"));

			executionPlanInstances.add(executionPlanInstance);
		}
		listExecutionPlanInstancesResponse.setExecutionPlanInstances(executionPlanInstances);
	 
	 	return listExecutionPlanInstancesResponse;
	}
}