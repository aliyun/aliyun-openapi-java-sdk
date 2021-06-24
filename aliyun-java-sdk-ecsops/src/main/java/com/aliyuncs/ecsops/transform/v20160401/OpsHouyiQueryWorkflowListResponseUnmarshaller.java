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

import com.aliyuncs.ecsops.model.v20160401.OpsHouyiQueryWorkflowListResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsHouyiQueryWorkflowListResponse.WorkflowInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsHouyiQueryWorkflowListResponseUnmarshaller {

	public static OpsHouyiQueryWorkflowListResponse unmarshall(OpsHouyiQueryWorkflowListResponse opsHouyiQueryWorkflowListResponse, UnmarshallerContext _ctx) {
		
		opsHouyiQueryWorkflowListResponse.setTotalCount(_ctx.integerValue("OpsHouyiQueryWorkflowListResponse.TotalCount"));

		List<WorkflowInstance> workflowInstances = new ArrayList<WorkflowInstance>();
		for (int i = 0; i < _ctx.lengthValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances.Length"); i++) {
			WorkflowInstance workflowInstance = new WorkflowInstance();
			workflowInstance.setExtColumn1(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].ExtColumn1"));
			workflowInstance.setUpdateTime(_ctx.longValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].UpdateTime"));
			workflowInstance.setExpireTime(_ctx.longValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].ExpireTime"));
			workflowInstance.setState(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].State"));
			workflowInstance.setCreateTime(_ctx.longValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].CreateTime"));
			workflowInstance.setInitAttributes(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].InitAttributes"));
			workflowInstance.setBizId(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].BizId"));
			workflowInstance.setPriority(_ctx.integerValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].Priority"));
			workflowInstance.setTag(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].Tag"));
			workflowInstance.setExtColumn2(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].ExtColumn2"));
			workflowInstance.setBizType(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].BizType"));
			workflowInstance.setParentId(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].ParentId"));
			workflowInstance.setExtColumn3(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].ExtColumn3"));
			workflowInstance.setVersion(_ctx.longValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].Version"));
			workflowInstance.setEndDateTime(_ctx.longValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].EndDateTime"));
			workflowInstance.setWorkflowId(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].WorkflowId"));
			workflowInstance.setDuration(_ctx.longValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].Duration"));
			workflowInstance.setExecutionNode(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].ExecutionNode"));
			workflowInstance.setStartDateTime(_ctx.longValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].StartDateTime"));
			workflowInstance.setWorkflowName(_ctx.stringValue("OpsHouyiQueryWorkflowListResponse.WorkflowInstances["+ i +"].WorkflowName"));

			workflowInstances.add(workflowInstance);
		}
		opsHouyiQueryWorkflowListResponse.setWorkflowInstances(workflowInstances);
	 
	 	return opsHouyiQueryWorkflowListResponse;
	}
}