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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListWorkflowResponse;
import com.aliyuncs.vod.model.v20170321.ListWorkflowResponse.WorkflowInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkflowResponseUnmarshaller {

	public static ListWorkflowResponse unmarshall(ListWorkflowResponse listWorkflowResponse, UnmarshallerContext context) {
		
		listWorkflowResponse.setRequestId(context.stringValue("ListWorkflowResponse.RequestId"));

		List<WorkflowInfo> workflowInfoList = new ArrayList<WorkflowInfo>();
		for (int i = 0; i < context.lengthValue("ListWorkflowResponse.WorkflowInfoList.Length"); i++) {
			WorkflowInfo workflowInfo = new WorkflowInfo();
			workflowInfo.setWorkflowId(context.stringValue("ListWorkflowResponse.WorkflowInfoList["+ i +"].WorkflowId"));
			workflowInfo.setName(context.stringValue("ListWorkflowResponse.WorkflowInfoList["+ i +"].Name"));
			workflowInfo.setActionList(context.stringValue("ListWorkflowResponse.WorkflowInfoList["+ i +"].ActionList"));
			workflowInfo.setCreationTime(context.stringValue("ListWorkflowResponse.WorkflowInfoList["+ i +"].CreationTime"));
			workflowInfo.setModifyTime(context.stringValue("ListWorkflowResponse.WorkflowInfoList["+ i +"].ModifyTime"));

			workflowInfoList.add(workflowInfo);
		}
		listWorkflowResponse.setWorkflowInfoList(workflowInfoList);
	 
	 	return listWorkflowResponse;
	}
}