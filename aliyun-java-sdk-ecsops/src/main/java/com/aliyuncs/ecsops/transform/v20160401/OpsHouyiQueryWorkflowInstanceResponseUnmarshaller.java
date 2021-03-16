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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsHouyiQueryWorkflowInstanceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsHouyiQueryWorkflowInstanceResponseUnmarshaller {

	public static OpsHouyiQueryWorkflowInstanceResponse unmarshall(OpsHouyiQueryWorkflowInstanceResponse opsHouyiQueryWorkflowInstanceResponse, UnmarshallerContext _ctx) {
		

		List<WorkflowInstance> workflowInstances = new ArrayList<WorkflowInstance>();
		for (int i = 0; i < _ctx.lengthValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances.Length"); i++) {
			WorkflowInstance workflowInstance = new WorkflowInstance();
			workflowInstance.setWorkflowId(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].WorkflowId"));
			workflowInstance.setParentId(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].ParentId"));
			workflowInstance.setWorkflowName(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].WorkflowName"));
			workflowInstance.setVersion(_ctx.longValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].Version"));
			workflowInstance.setBizType(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].BizType"));
			workflowInstance.setBizId(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].BizId"));
			workflowInstance.setPriority(_ctx.integerValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].Priority"));
			workflowInstance.setInitAttributes(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].InitAttributes"));
			workflowInstance.setState(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].State"));
			workflowInstance.setExecutionNode(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].ExecutionNode"));
			workflowInstance.setStartDateTime(_ctx.longValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].StartDateTime"));
			workflowInstance.setExpireTime(_ctx.longValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].ExpireTime"));
			workflowInstance.setEndDateTime(_ctx.longValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].EndDateTime"));
			workflowInstance.setDuration(_ctx.longValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].Duration"));
			workflowInstance.setCreateTime(_ctx.longValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].CreateTime"));
			workflowInstance.setUpdateTime(_ctx.longValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].UpdateTime"));
			workflowInstance.setTag(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].Tag"));
			workflowInstance.setExtColumn1(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].ExtColumn1"));
			workflowInstance.setExtColumn2(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].ExtColumn2"));
			workflowInstance.setExtColumn3(_ctx.stringValue("OpsHouyiQueryWorkflowInstanceResponse.WorkflowInstances["+ i +"].ExtColumn3"));

			workflowInstances.add(workflowInstance);
		}
		opsHouyiQueryWorkflowInstanceResponse.setWorkflowInstances(workflowInstances);
	 
	 	return opsHouyiQueryWorkflowInstanceResponse;
	}
}