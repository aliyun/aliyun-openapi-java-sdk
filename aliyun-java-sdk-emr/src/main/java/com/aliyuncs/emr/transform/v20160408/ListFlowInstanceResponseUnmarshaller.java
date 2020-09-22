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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListFlowInstanceResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowInstanceResponse.FlowInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowInstanceResponseUnmarshaller {

	public static ListFlowInstanceResponse unmarshall(ListFlowInstanceResponse listFlowInstanceResponse, UnmarshallerContext _ctx) {
		
		listFlowInstanceResponse.setRequestId(_ctx.stringValue("ListFlowInstanceResponse.RequestId"));
		listFlowInstanceResponse.setPageNumber(_ctx.integerValue("ListFlowInstanceResponse.PageNumber"));
		listFlowInstanceResponse.setPageSize(_ctx.integerValue("ListFlowInstanceResponse.PageSize"));
		listFlowInstanceResponse.setTotal(_ctx.integerValue("ListFlowInstanceResponse.Total"));

		List<FlowInstance> flowInstances = new ArrayList<FlowInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowInstanceResponse.FlowInstances.Length"); i++) {
			FlowInstance flowInstance = new FlowInstance();
			flowInstance.setId(_ctx.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].Id"));
			flowInstance.setGmtCreate(_ctx.longValue("ListFlowInstanceResponse.FlowInstances["+ i +"].GmtCreate"));
			flowInstance.setGmtModified(_ctx.longValue("ListFlowInstanceResponse.FlowInstances["+ i +"].GmtModified"));
			flowInstance.setFlowId(_ctx.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].FlowId"));
			flowInstance.setFlowName(_ctx.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].FlowName"));
			flowInstance.setProjectId(_ctx.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].ProjectId"));
			flowInstance.setStatus(_ctx.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].Status"));
			flowInstance.setClusterId(_ctx.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].ClusterId"));
			flowInstance.setOwner(_ctx.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].Owner"));
			flowInstance.setScheduleTime(_ctx.longValue("ListFlowInstanceResponse.FlowInstances["+ i +"].ScheduleTime"));
			flowInstance.setStartTime(_ctx.longValue("ListFlowInstanceResponse.FlowInstances["+ i +"].StartTime"));
			flowInstance.setEndTime(_ctx.longValue("ListFlowInstanceResponse.FlowInstances["+ i +"].EndTime"));
			flowInstance.setDuration(_ctx.longValue("ListFlowInstanceResponse.FlowInstances["+ i +"].Duration"));
			flowInstance.setHasNodeFailed(_ctx.booleanValue("ListFlowInstanceResponse.FlowInstances["+ i +"].HasNodeFailed"));

			flowInstances.add(flowInstance);
		}
		listFlowInstanceResponse.setFlowInstances(flowInstances);
	 
	 	return listFlowInstanceResponse;
	}
}