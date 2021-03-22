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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListWorkflowInstantencesResponse;
import com.aliyuncs.datalake.model.v20200710.ListWorkflowInstantencesResponse.FlowInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkflowInstantencesResponseUnmarshaller {

	public static ListWorkflowInstantencesResponse unmarshall(ListWorkflowInstantencesResponse listWorkflowInstantencesResponse, UnmarshallerContext _ctx) {
		
		listWorkflowInstantencesResponse.setRequestId(_ctx.stringValue("ListWorkflowInstantencesResponse.RequestId"));
		listWorkflowInstantencesResponse.setSuccess(_ctx.longValue("ListWorkflowInstantencesResponse.Success"));
		listWorkflowInstantencesResponse.setTotalCount(_ctx.longValue("ListWorkflowInstantencesResponse.TotalCount"));

		List<FlowInstance> flowInstances = new ArrayList<FlowInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkflowInstantencesResponse.FlowInstances.Length"); i++) {
			FlowInstance flowInstance = new FlowInstance();
			flowInstance.setFlowInstanceId(_ctx.stringValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].FlowInstanceId"));
			flowInstance.setFlowId(_ctx.stringValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].FlowId"));
			flowInstance.setFlowName(_ctx.stringValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].FlowName"));
			flowInstance.setDuration(_ctx.longValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].Duration"));
			flowInstance.setStartTime(_ctx.stringValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].StartTime"));
			flowInstance.setEndTime(_ctx.stringValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].EndTime"));
			flowInstance.setStatus(_ctx.stringValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].Status"));
			flowInstance.setProjectId(_ctx.stringValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].ProjectId"));
			flowInstance.setClusterId(_ctx.stringValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].ClusterId"));
			flowInstance.setTotalCuUsage(_ctx.floatValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].TotalCuUsage"));
			flowInstance.setOffsetTime(_ctx.integerValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].OffsetTime"));
			flowInstance.setBatchProgress(_ctx.integerValue("ListWorkflowInstantencesResponse.FlowInstances["+ i +"].BatchProgress"));

			flowInstances.add(flowInstance);
		}
		listWorkflowInstantencesResponse.setFlowInstances(flowInstances);
	 
	 	return listWorkflowInstantencesResponse;
	}
}