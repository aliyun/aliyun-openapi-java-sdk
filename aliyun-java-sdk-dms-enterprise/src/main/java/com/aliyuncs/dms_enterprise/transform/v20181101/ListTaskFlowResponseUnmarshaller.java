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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowResponse.TaskFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskFlowResponseUnmarshaller {

	public static ListTaskFlowResponse unmarshall(ListTaskFlowResponse listTaskFlowResponse, UnmarshallerContext _ctx) {
		
		listTaskFlowResponse.setRequestId(_ctx.stringValue("ListTaskFlowResponse.RequestId"));
		listTaskFlowResponse.setErrorCode(_ctx.stringValue("ListTaskFlowResponse.ErrorCode"));
		listTaskFlowResponse.setErrorMessage(_ctx.stringValue("ListTaskFlowResponse.ErrorMessage"));
		listTaskFlowResponse.setSuccess(_ctx.booleanValue("ListTaskFlowResponse.Success"));

		List<TaskFlow> taskFlowList = new ArrayList<TaskFlow>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskFlowResponse.TaskFlowList.Length"); i++) {
			TaskFlow taskFlow = new TaskFlow();
			taskFlow.setId(_ctx.longValue("ListTaskFlowResponse.TaskFlowList["+ i +"].Id"));
			taskFlow.setCreatorId(_ctx.stringValue("ListTaskFlowResponse.TaskFlowList["+ i +"].CreatorId"));
			taskFlow.setCreatorNickName(_ctx.stringValue("ListTaskFlowResponse.TaskFlowList["+ i +"].CreatorNickName"));
			taskFlow.setDagOwnerNickName(_ctx.stringValue("ListTaskFlowResponse.TaskFlowList["+ i +"].DagOwnerNickName"));
			taskFlow.setDeployId(_ctx.longValue("ListTaskFlowResponse.TaskFlowList["+ i +"].DeployId"));
			taskFlow.setStatus(_ctx.integerValue("ListTaskFlowResponse.TaskFlowList["+ i +"].Status"));
			taskFlow.setLatestInstanceStatus(_ctx.integerValue("ListTaskFlowResponse.TaskFlowList["+ i +"].LatestInstanceStatus"));
			taskFlow.setLatestInstanceTime(_ctx.stringValue("ListTaskFlowResponse.TaskFlowList["+ i +"].LatestInstanceTime"));

			taskFlowList.add(taskFlow);
		}
		listTaskFlowResponse.setTaskFlowList(taskFlowList);
	 
	 	return listTaskFlowResponse;
	}
}