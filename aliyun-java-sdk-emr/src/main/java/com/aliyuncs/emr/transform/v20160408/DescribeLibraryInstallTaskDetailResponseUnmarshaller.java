/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeLibraryInstallTaskDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLibraryInstallTaskDetailResponseUnmarshaller {

	public static DescribeLibraryInstallTaskDetailResponse unmarshall(DescribeLibraryInstallTaskDetailResponse describeLibraryInstallTaskDetailResponse, UnmarshallerContext _ctx) {
		
		describeLibraryInstallTaskDetailResponse.setRequestId(_ctx.stringValue("DescribeLibraryInstallTaskDetailResponse.RequestId"));
		describeLibraryInstallTaskDetailResponse.setLibraryBizId(_ctx.stringValue("DescribeLibraryInstallTaskDetailResponse.LibraryBizId"));
		describeLibraryInstallTaskDetailResponse.setTaskGroupId(_ctx.stringValue("DescribeLibraryInstallTaskDetailResponse.TaskGroupId"));
		describeLibraryInstallTaskDetailResponse.setTaskId(_ctx.stringValue("DescribeLibraryInstallTaskDetailResponse.TaskId"));
		describeLibraryInstallTaskDetailResponse.setTaskStatus(_ctx.stringValue("DescribeLibraryInstallTaskDetailResponse.TaskStatus"));
		describeLibraryInstallTaskDetailResponse.setStartTime(_ctx.longValue("DescribeLibraryInstallTaskDetailResponse.StartTime"));
		describeLibraryInstallTaskDetailResponse.setEndTime(_ctx.longValue("DescribeLibraryInstallTaskDetailResponse.EndTime"));
		describeLibraryInstallTaskDetailResponse.setExecuteTime(_ctx.longValue("DescribeLibraryInstallTaskDetailResponse.ExecuteTime"));
		describeLibraryInstallTaskDetailResponse.setTaskProcess(_ctx.integerValue("DescribeLibraryInstallTaskDetailResponse.TaskProcess"));
		describeLibraryInstallTaskDetailResponse.setTaskType(_ctx.stringValue("DescribeLibraryInstallTaskDetailResponse.TaskType"));
		describeLibraryInstallTaskDetailResponse.setDetail(_ctx.stringValue("DescribeLibraryInstallTaskDetailResponse.Detail"));
		describeLibraryInstallTaskDetailResponse.setClusterBizId(_ctx.stringValue("DescribeLibraryInstallTaskDetailResponse.ClusterBizId"));
		describeLibraryInstallTaskDetailResponse.setHostname(_ctx.stringValue("DescribeLibraryInstallTaskDetailResponse.Hostname"));
	 
	 	return describeLibraryInstallTaskDetailResponse;
	}
}