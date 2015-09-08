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
package com.aliyuncs.drds.transform.v20150413;

import com.aliyuncs.drds.model.v20150413.DescribeDDLTaskResponse;
import com.aliyuncs.drds.model.v20150413.DescribeDDLTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDDLTaskResponseUnmarshaller {

	public static DescribeDDLTaskResponse unmarshall(DescribeDDLTaskResponse describeDDLTaskResponse, UnmarshallerContext context) {
		

		Data  data = new Data();
		data.setRequestId(context.stringValue("DescribeDDLTaskResponse.Data.RequestId"));
		data.setTargetId(context.stringValue("DescribeDDLTaskResponse.Data.TargetId"));
		data.setTaskDetail(context.stringValue("DescribeDDLTaskResponse.Data.TaskDetail"));
		data.setTaskStatus(context.integerValue("DescribeDDLTaskResponse.Data.TaskStatus"));
		data.setTaskPhase(context.stringValue("DescribeDDLTaskResponse.Data.TaskPhase"));
		data.setTaskType(context.integerValue("DescribeDDLTaskResponse.Data.TaskType"));
		data.setTaskName(context.stringValue("DescribeDDLTaskResponse.Data.TaskName"));
		data.setGmtCreate(context.longValue("DescribeDDLTaskResponse.Data.GmtCreate"));
		data.setAllowCancel(context.stringValue("DescribeDDLTaskResponse.Data.AllowCancel"));
		data.setErrMsg(context.stringValue("DescribeDDLTaskResponse.Data.ErrMsg"));
		describeDDLTaskResponse.setData(data);
	 
	 	return describeDDLTaskResponse;
	}
}