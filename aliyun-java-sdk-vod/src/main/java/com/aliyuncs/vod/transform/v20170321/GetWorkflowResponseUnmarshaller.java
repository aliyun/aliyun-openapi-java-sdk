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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.GetWorkflowResponse;
import com.aliyuncs.vod.model.v20170321.GetWorkflowResponse.WorkflowInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkflowResponseUnmarshaller {

	public static GetWorkflowResponse unmarshall(GetWorkflowResponse getWorkflowResponse, UnmarshallerContext context) {
		
		getWorkflowResponse.setRequestId(context.stringValue("GetWorkflowResponse.RequestId"));

		WorkflowInfo workflowInfo = new WorkflowInfo();
		workflowInfo.setWorkflowId(context.stringValue("GetWorkflowResponse.WorkflowInfo.WorkflowId"));
		workflowInfo.setName(context.stringValue("GetWorkflowResponse.WorkflowInfo.Name"));
		workflowInfo.setActionList(context.stringValue("GetWorkflowResponse.WorkflowInfo.ActionList"));
		workflowInfo.setCreationTime(context.stringValue("GetWorkflowResponse.WorkflowInfo.CreationTime"));
		workflowInfo.setModifyTime(context.stringValue("GetWorkflowResponse.WorkflowInfo.ModifyTime"));
		getWorkflowResponse.setWorkflowInfo(workflowInfo);
	 
	 	return getWorkflowResponse;
	}
}