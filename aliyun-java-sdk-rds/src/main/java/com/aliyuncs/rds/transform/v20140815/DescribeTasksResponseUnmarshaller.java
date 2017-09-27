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

import com.aliyuncs.rds.model.v20140815.DescribeTasksResponse;
import com.aliyuncs.rds.model.v20140815.DescribeTasksResponse.TaskProgressInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext context) {
		
		describeTasksResponse.setRequestId(context.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setTotalRecordCount(context.integerValue("DescribeTasksResponse.TotalRecordCount"));
		describeTasksResponse.setPageNumber(context.integerValue("DescribeTasksResponse.PageNumber"));
		describeTasksResponse.setPageRecordCount(context.integerValue("DescribeTasksResponse.PageRecordCount"));

		List<TaskProgressInfo> items = new ArrayList<TaskProgressInfo>();
		for (int i = 0; i < context.lengthValue("DescribeTasksResponse.Items.Length"); i++) {
			TaskProgressInfo taskProgressInfo = new TaskProgressInfo();
			taskProgressInfo.setDBName(context.stringValue("DescribeTasksResponse.Items["+ i +"].DBName"));
			taskProgressInfo.setBeginTime(context.stringValue("DescribeTasksResponse.Items["+ i +"].BeginTime"));
			taskProgressInfo.setProgressInfo(context.stringValue("DescribeTasksResponse.Items["+ i +"].ProgressInfo"));
			taskProgressInfo.setFinishTime(context.stringValue("DescribeTasksResponse.Items["+ i +"].FinishTime"));
			taskProgressInfo.setTaskAction(context.stringValue("DescribeTasksResponse.Items["+ i +"].TaskAction"));
			taskProgressInfo.setTaskId(context.stringValue("DescribeTasksResponse.Items["+ i +"].TaskId"));
			taskProgressInfo.setProgress(context.stringValue("DescribeTasksResponse.Items["+ i +"].Progress"));
			taskProgressInfo.setExpectedFinishTime(context.stringValue("DescribeTasksResponse.Items["+ i +"].ExpectedFinishTime"));
			taskProgressInfo.setStatus(context.stringValue("DescribeTasksResponse.Items["+ i +"].Status"));
			taskProgressInfo.setTaskErrorCode(context.stringValue("DescribeTasksResponse.Items["+ i +"].TaskErrorCode"));
			taskProgressInfo.setTaskErrorMessage(context.stringValue("DescribeTasksResponse.Items["+ i +"].TaskErrorMessage"));

			items.add(taskProgressInfo);
		}
		describeTasksResponse.setItems(items);
	 
	 	return describeTasksResponse;
	}
}