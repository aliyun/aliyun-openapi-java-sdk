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

package com.aliyuncs.linkwan.transform.v20181230;

import com.aliyuncs.linkwan.model.v20181230.GetNodesAddingTaskResponse;
import com.aliyuncs.linkwan.model.v20181230.GetNodesAddingTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodesAddingTaskResponseUnmarshaller {

	public static GetNodesAddingTaskResponse unmarshall(GetNodesAddingTaskResponse getNodesAddingTaskResponse, UnmarshallerContext context) {
		
		getNodesAddingTaskResponse.setRequestId(context.stringValue("GetNodesAddingTaskResponse.RequestId"));
		getNodesAddingTaskResponse.setSuccess(context.booleanValue("GetNodesAddingTaskResponse.Success"));

		Data data = new Data();
		data.setAddingTaskId(context.stringValue("GetNodesAddingTaskResponse.Data.AddingTaskId"));
		data.setTaskState(context.stringValue("GetNodesAddingTaskResponse.Data.TaskState"));
		data.setTotalCount(context.longValue("GetNodesAddingTaskResponse.Data.TotalCount"));
		data.setSuccessCount(context.longValue("GetNodesAddingTaskResponse.Data.SuccessCount"));
		data.setFailedCount(context.longValue("GetNodesAddingTaskResponse.Data.FailedCount"));
		data.setDetailFileUrl(context.stringValue("GetNodesAddingTaskResponse.Data.DetailFileUrl"));
		getNodesAddingTaskResponse.setData(data);
	 
	 	return getNodesAddingTaskResponse;
	}
}