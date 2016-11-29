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
package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRealtimeDiagnosesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRealtimeDiagnosesResponse.RealtimeDiagnoseTasks;
import com.aliyuncs.rds.model.v20140815.DescribeRealtimeDiagnosesResponse.RealtimeDiagnoseTasks.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRealtimeDiagnosesResponseUnmarshaller {

	public static DescribeRealtimeDiagnosesResponse unmarshall(DescribeRealtimeDiagnosesResponse describeRealtimeDiagnosesResponse, UnmarshallerContext context) {
		
		describeRealtimeDiagnosesResponse.setRequestId(context.stringValue("DescribeRealtimeDiagnosesResponse.RequestId"));
		describeRealtimeDiagnosesResponse.setEngine(context.stringValue("DescribeRealtimeDiagnosesResponse.Engine"));
		describeRealtimeDiagnosesResponse.setTotalRecordCount(context.integerValue("DescribeRealtimeDiagnosesResponse.TotalRecordCount"));
		describeRealtimeDiagnosesResponse.setPageNumber(context.integerValue("DescribeRealtimeDiagnosesResponse.PageNumber"));
		describeRealtimeDiagnosesResponse.setPageRecordCount(context.integerValue("DescribeRealtimeDiagnosesResponse.PageRecordCount"));

		List<RealtimeDiagnoseTasks> tasks = new ArrayList<RealtimeDiagnoseTasks>();
		for (int i = 0; i < context.lengthValue("DescribeRealtimeDiagnosesResponse.Tasks.Length"); i++) {
			RealtimeDiagnoseTasks realtimeDiagnoseTasks = new RealtimeDiagnoseTasks();
			realtimeDiagnoseTasks.setCreateTime(context.stringValue("DescribeRealtimeDiagnosesResponse.Tasks["+ i +"].CreateTime"));
			realtimeDiagnoseTasks.setTaskId(context.stringValue("DescribeRealtimeDiagnosesResponse.Tasks["+ i +"].TaskId"));
			realtimeDiagnoseTasks.setHealthScore(context.stringValue("DescribeRealtimeDiagnosesResponse.Tasks["+ i +"].HealthScore"));
			realtimeDiagnoseTasks.setStatus(Status.getEnum(context.stringValue("DescribeRealtimeDiagnosesResponse.Tasks["+ i +"].Status")));

			tasks.add(realtimeDiagnoseTasks);
		}
		describeRealtimeDiagnosesResponse.setTasks(tasks);
	 
	 	return describeRealtimeDiagnosesResponse;
	}
}