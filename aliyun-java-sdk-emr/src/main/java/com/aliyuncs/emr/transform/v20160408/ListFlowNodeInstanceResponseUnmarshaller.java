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

import com.aliyuncs.emr.model.v20160408.ListFlowNodeInstanceResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowNodeInstanceResponse.FlowNodeInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowNodeInstanceResponseUnmarshaller {

	public static ListFlowNodeInstanceResponse unmarshall(ListFlowNodeInstanceResponse listFlowNodeInstanceResponse, UnmarshallerContext _ctx) {
		
		listFlowNodeInstanceResponse.setRequestId(_ctx.stringValue("ListFlowNodeInstanceResponse.RequestId"));
		listFlowNodeInstanceResponse.setPageNumber(_ctx.integerValue("ListFlowNodeInstanceResponse.PageNumber"));
		listFlowNodeInstanceResponse.setPageSize(_ctx.integerValue("ListFlowNodeInstanceResponse.PageSize"));
		listFlowNodeInstanceResponse.setTotal(_ctx.integerValue("ListFlowNodeInstanceResponse.Total"));

		List<FlowNodeInstance> flowNodeInstances = new ArrayList<FlowNodeInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowNodeInstanceResponse.FlowNodeInstances.Length"); i++) {
			FlowNodeInstance flowNodeInstance = new FlowNodeInstance();
			flowNodeInstance.setId(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Id"));
			flowNodeInstance.setGmtCreate(_ctx.longValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].GmtCreate"));
			flowNodeInstance.setGmtModified(_ctx.longValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].GmtModified"));
			flowNodeInstance.setType(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Type"));
			flowNodeInstance.setStatus(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Status"));
			flowNodeInstance.setJobId(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].JobId"));
			flowNodeInstance.setJobName(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].JobName"));
			flowNodeInstance.setJobType(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].JobType"));
			flowNodeInstance.setJobParams(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].JobParams"));
			flowNodeInstance.setFailAct(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].FailAct"));
			flowNodeInstance.setMaxRetry(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].MaxRetry"));
			flowNodeInstance.setRetryInterval(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].RetryInterval"));
			flowNodeInstance.setNodeName(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].NodeName"));
			flowNodeInstance.setFlowId(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].FlowId"));
			flowNodeInstance.setFlowInstanceId(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].FlowInstanceId"));
			flowNodeInstance.setClusterId(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ClusterId"));
			flowNodeInstance.setHostName(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].HostName"));
			flowNodeInstance.setProjectId(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ProjectId"));
			flowNodeInstance.setPending(_ctx.booleanValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Pending"));
			flowNodeInstance.setStartTime(_ctx.longValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].StartTime"));
			flowNodeInstance.setEndTime(_ctx.longValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].EndTime"));
			flowNodeInstance.setDuration(_ctx.longValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Duration"));
			flowNodeInstance.setRetries(_ctx.integerValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Retries"));
			flowNodeInstance.setExternalId(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ExternalId"));
			flowNodeInstance.setExternalSubId(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ExternalSubId"));
			flowNodeInstance.setExternalChildIds(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ExternalChildIds"));
			flowNodeInstance.setExternalStatus(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ExternalStatus"));
			flowNodeInstance.setExternalInfo(_ctx.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ExternalInfo"));

			flowNodeInstances.add(flowNodeInstance);
		}
		listFlowNodeInstanceResponse.setFlowNodeInstances(flowNodeInstances);
	 
	 	return listFlowNodeInstanceResponse;
	}
}