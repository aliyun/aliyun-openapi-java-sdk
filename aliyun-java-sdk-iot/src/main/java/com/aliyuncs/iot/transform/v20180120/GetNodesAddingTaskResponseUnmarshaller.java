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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.GetNodesAddingTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodesAddingTaskResponseUnmarshaller {

	public static GetNodesAddingTaskResponse unmarshall(GetNodesAddingTaskResponse getNodesAddingTaskResponse, UnmarshallerContext context) {
		
		getNodesAddingTaskResponse.setRequestId(context.stringValue("GetNodesAddingTaskResponse.RequestId"));
		getNodesAddingTaskResponse.setSuccess(context.booleanValue("GetNodesAddingTaskResponse.Success"));
		getNodesAddingTaskResponse.setCode(context.stringValue("GetNodesAddingTaskResponse.Code"));
		getNodesAddingTaskResponse.setErrorMessage(context.stringValue("GetNodesAddingTaskResponse.ErrorMessage"));
		getNodesAddingTaskResponse.setTaskId(context.stringValue("GetNodesAddingTaskResponse.TaskId"));
		getNodesAddingTaskResponse.setTaskState(context.stringValue("GetNodesAddingTaskResponse.TaskState"));
		getNodesAddingTaskResponse.setTotalCount(context.longValue("GetNodesAddingTaskResponse.TotalCount"));
		getNodesAddingTaskResponse.setSuccessCount(context.longValue("GetNodesAddingTaskResponse.SuccessCount"));

		List<String> successDevEuis = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetNodesAddingTaskResponse.SuccessDevEuis.Length"); i++) {
			successDevEuis.add(context.stringValue("GetNodesAddingTaskResponse.SuccessDevEuis["+ i +"]"));
		}
		getNodesAddingTaskResponse.setSuccessDevEuis(successDevEuis);
	 
	 	return getNodesAddingTaskResponse;
	}
}