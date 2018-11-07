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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowInstanceResponseUnmarshaller {

	public static ListFlowInstanceResponse unmarshall(ListFlowInstanceResponse listFlowInstanceResponse, UnmarshallerContext context) {
		
		listFlowInstanceResponse.setRequestId(context.stringValue("ListFlowInstanceResponse.RequestId"));
		listFlowInstanceResponse.setPageNumber(context.integerValue("ListFlowInstanceResponse.PageNumber"));
		listFlowInstanceResponse.setPageSize(context.integerValue("ListFlowInstanceResponse.PageSize"));
		listFlowInstanceResponse.setTotal(context.integerValue("ListFlowInstanceResponse.Total"));

		List<FlowInstance> flowInstances = new ArrayList<FlowInstance>();
		for (int i = 0; i < context.lengthValue("ListFlowInstanceResponse.FlowInstances.Length"); i++) {
			FlowInstance flowInstance = new FlowInstance();
			flowInstance.setId(context.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].Id"));
			flowInstance.setGmtCreate(context.longValue("ListFlowInstanceResponse.FlowInstances["+ i +"].GmtCreate"));
			flowInstance.setGmtModified(context.longValue("ListFlowInstanceResponse.FlowInstances["+ i +"].GmtModified"));
			flowInstance.setFlowId(context.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].FlowId"));
			flowInstance.setFlowName(context.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].FlowName"));
			flowInstance.setProjectId(context.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].ProjectId"));
			flowInstance.setStatus(context.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].Status"));
			flowInstance.setClusterId(context.stringValue("ListFlowInstanceResponse.FlowInstances["+ i +"].ClusterId"));
			flowInstance.setStartTime(context.longValue("ListFlowInstanceResponse.FlowInstances["+ i +"].StartTime"));
			flowInstance.setEndTime(context.longValue("ListFlowInstanceResponse.FlowInstances["+ i +"].EndTime"));
			flowInstance.setDuration(context.longValue("ListFlowInstanceResponse.FlowInstances["+ i +"].Duration"));

			flowInstances.add(flowInstance);
		}
		listFlowInstanceResponse.setFlowInstances(flowInstances);
	 
	 	return listFlowInstanceResponse;
	}
}