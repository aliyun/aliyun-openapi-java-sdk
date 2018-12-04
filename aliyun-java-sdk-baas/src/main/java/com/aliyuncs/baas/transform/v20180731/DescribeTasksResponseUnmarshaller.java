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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeTasksResponse;
import com.aliyuncs.baas.model.v20180731.DescribeTasksResponse.Task;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext context) {
		
		describeTasksResponse.setRequestId(context.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setSuccess(context.booleanValue("DescribeTasksResponse.Success"));
		describeTasksResponse.setErrorCode(context.integerValue("DescribeTasksResponse.ErrorCode"));
		describeTasksResponse.setDynamicCode(context.stringValue("DescribeTasksResponse.DynamicCode"));
		describeTasksResponse.setDynamicMessage(context.stringValue("DescribeTasksResponse.DynamicMessage"));

		List<Task> result = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("DescribeTasksResponse.Result.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.integerValue("DescribeTasksResponse.Result["+ i +"].TaskId"));
			task.setAction(context.stringValue("DescribeTasksResponse.Result["+ i +"].Action"));
			task.setTarget(context.stringValue("DescribeTasksResponse.Result["+ i +"].Target"));
			task.setSender(context.stringValue("DescribeTasksResponse.Result["+ i +"].Sender"));
			task.setRequestTime(context.longValue("DescribeTasksResponse.Result["+ i +"].RequestTime"));
			task.setResponseTime(context.stringValue("DescribeTasksResponse.Result["+ i +"].ResponseTime"));
			task.setHandled(context.booleanValue("DescribeTasksResponse.Result["+ i +"].Handled"));
			task.setResult(context.stringValue("DescribeTasksResponse.Result["+ i +"].Result"));
			task.setOperationType(context.stringValue("DescribeTasksResponse.Result["+ i +"].OperationType"));

			result.add(task);
		}
		describeTasksResponse.setResult(result);
	 
	 	return describeTasksResponse;
	}
}