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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeTasksResponse;
import com.aliyuncs.baas.model.v20181221.DescribeTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext _ctx) {
		
		describeTasksResponse.setRequestId(_ctx.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setSuccess(_ctx.booleanValue("DescribeTasksResponse.Success"));
		describeTasksResponse.setErrorCode(_ctx.integerValue("DescribeTasksResponse.ErrorCode"));
		describeTasksResponse.setDynamicCode(_ctx.stringValue("DescribeTasksResponse.DynamicCode"));
		describeTasksResponse.setDynamicMessage(_ctx.stringValue("DescribeTasksResponse.DynamicMessage"));

		List<Task> result = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTasksResponse.Result.Length"); i++) {
			Task task = new Task();
			task.setTaskId(_ctx.integerValue("DescribeTasksResponse.Result["+ i +"].TaskId"));
			task.setAction(_ctx.stringValue("DescribeTasksResponse.Result["+ i +"].Action"));
			task.setTarget(_ctx.stringValue("DescribeTasksResponse.Result["+ i +"].Target"));
			task.setSender(_ctx.stringValue("DescribeTasksResponse.Result["+ i +"].Sender"));
			task.setRequestTime(_ctx.longValue("DescribeTasksResponse.Result["+ i +"].RequestTime"));
			task.setResponseTime(_ctx.stringValue("DescribeTasksResponse.Result["+ i +"].ResponseTime"));
			task.setHandled(_ctx.booleanValue("DescribeTasksResponse.Result["+ i +"].Handled"));
			task.setResult(_ctx.stringValue("DescribeTasksResponse.Result["+ i +"].Result"));
			task.setOperationType(_ctx.stringValue("DescribeTasksResponse.Result["+ i +"].OperationType"));

			result.add(task);
		}
		describeTasksResponse.setResult(result);
	 
	 	return describeTasksResponse;
	}
}