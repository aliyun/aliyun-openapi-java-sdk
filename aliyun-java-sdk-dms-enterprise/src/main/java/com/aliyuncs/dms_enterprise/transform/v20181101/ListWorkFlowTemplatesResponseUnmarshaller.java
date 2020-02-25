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

import com.aliyuncs.dms_enterprise.model.v20181101.ListWorkFlowTemplatesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListWorkFlowTemplatesResponse.WorkFlowTemplate;
import com.aliyuncs.dms_enterprise.model.v20181101.ListWorkFlowTemplatesResponse.WorkFlowTemplate.WorkflowNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkFlowTemplatesResponseUnmarshaller {

	public static ListWorkFlowTemplatesResponse unmarshall(ListWorkFlowTemplatesResponse listWorkFlowTemplatesResponse, UnmarshallerContext _ctx) {
		
		listWorkFlowTemplatesResponse.setRequestId(_ctx.stringValue("ListWorkFlowTemplatesResponse.RequestId"));
		listWorkFlowTemplatesResponse.setSuccess(_ctx.booleanValue("ListWorkFlowTemplatesResponse.Success"));
		listWorkFlowTemplatesResponse.setErrorMessage(_ctx.stringValue("ListWorkFlowTemplatesResponse.ErrorMessage"));
		listWorkFlowTemplatesResponse.setErrorCode(_ctx.stringValue("ListWorkFlowTemplatesResponse.ErrorCode"));

		List<WorkFlowTemplate> workFlowTemplates = new ArrayList<WorkFlowTemplate>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates.Length"); i++) {
			WorkFlowTemplate workFlowTemplate = new WorkFlowTemplate();
			workFlowTemplate.setTemplateName(_ctx.stringValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].TemplateName"));
			workFlowTemplate.setComment(_ctx.stringValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].Comment"));
			workFlowTemplate.setTemplateId(_ctx.longValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].TemplateId"));
			workFlowTemplate.setIsSystem(_ctx.integerValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].IsSystem"));
			workFlowTemplate.setEnabled(_ctx.stringValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].Enabled"));

			List<WorkflowNode> workflowNodes = new ArrayList<WorkflowNode>();
			for (int j = 0; j < _ctx.lengthValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].WorkflowNodes.Length"); j++) {
				WorkflowNode workflowNode = new WorkflowNode();
				workflowNode.setNodeId(_ctx.longValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].WorkflowNodes["+ j +"].NodeId"));
				workflowNode.setTemplateId(_ctx.longValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].WorkflowNodes["+ j +"].TemplateId"));
				workflowNode.setNodeName(_ctx.stringValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].WorkflowNodes["+ j +"].NodeName"));
				workflowNode.setNodeType(_ctx.stringValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].WorkflowNodes["+ j +"].NodeType"));
				workflowNode.setComment(_ctx.stringValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].WorkflowNodes["+ j +"].Comment"));
				workflowNode.setPosition(_ctx.integerValue("ListWorkFlowTemplatesResponse.WorkFlowTemplates["+ i +"].WorkflowNodes["+ j +"].Position"));

				workflowNodes.add(workflowNode);
			}
			workFlowTemplate.setWorkflowNodes(workflowNodes);

			workFlowTemplates.add(workFlowTemplate);
		}
		listWorkFlowTemplatesResponse.setWorkFlowTemplates(workFlowTemplates);
	 
	 	return listWorkFlowTemplatesResponse;
	}
}