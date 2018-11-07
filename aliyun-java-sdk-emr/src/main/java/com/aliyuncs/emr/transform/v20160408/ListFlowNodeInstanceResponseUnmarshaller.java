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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowNodeInstanceResponseUnmarshaller {

	public static ListFlowNodeInstanceResponse unmarshall(ListFlowNodeInstanceResponse listFlowNodeInstanceResponse, UnmarshallerContext context) {
		
		listFlowNodeInstanceResponse.setRequestId(context.stringValue("ListFlowNodeInstanceResponse.RequestId"));
		listFlowNodeInstanceResponse.setPageNumber(context.integerValue("ListFlowNodeInstanceResponse.PageNumber"));
		listFlowNodeInstanceResponse.setPageSize(context.integerValue("ListFlowNodeInstanceResponse.PageSize"));
		listFlowNodeInstanceResponse.setTotal(context.integerValue("ListFlowNodeInstanceResponse.Total"));

		List<FlowNodeInstance> flowNodeInstances = new ArrayList<FlowNodeInstance>();
		for (int i = 0; i < context.lengthValue("ListFlowNodeInstanceResponse.FlowNodeInstances.Length"); i++) {
			FlowNodeInstance flowNodeInstance = new FlowNodeInstance();
			flowNodeInstance.setId(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Id"));
			flowNodeInstance.setGmtCreate(context.longValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].GmtCreate"));
			flowNodeInstance.setGmtModified(context.longValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].GmtModified"));
			flowNodeInstance.setType(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Type"));
			flowNodeInstance.setStatus(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Status"));
			flowNodeInstance.setJobId(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].JobId"));
			flowNodeInstance.setJobName(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].JobName"));
			flowNodeInstance.setJobType(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].JobType"));
			flowNodeInstance.setJobParams(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].JobParams"));
			flowNodeInstance.setFailAct(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].FailAct"));
			flowNodeInstance.setMaxRetry(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].MaxRetry"));
			flowNodeInstance.setRetryInterval(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].RetryInterval"));
			flowNodeInstance.setNodeName(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].NodeName"));
			flowNodeInstance.setFlowId(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].FlowId"));
			flowNodeInstance.setFlowInstanceId(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].FlowInstanceId"));
			flowNodeInstance.setClusterId(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ClusterId"));
			flowNodeInstance.setHostName(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].HostName"));
			flowNodeInstance.setProjectId(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ProjectId"));
			flowNodeInstance.setPending(context.booleanValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Pending"));
			flowNodeInstance.setStartTime(context.longValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].StartTime"));
			flowNodeInstance.setEndTime(context.longValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].EndTime"));
			flowNodeInstance.setDuration(context.longValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Duration"));
			flowNodeInstance.setRetries(context.integerValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].Retries"));
			flowNodeInstance.setExternalId(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ExternalId"));
			flowNodeInstance.setExternalSubId(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ExternalSubId"));
			flowNodeInstance.setExternalChildIds(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ExternalChildIds"));
			flowNodeInstance.setExternalStatus(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ExternalStatus"));
			flowNodeInstance.setExternalInfo(context.stringValue("ListFlowNodeInstanceResponse.FlowNodeInstances["+ i +"].ExternalInfo"));

			flowNodeInstances.add(flowNodeInstance);
		}
		listFlowNodeInstanceResponse.setFlowNodeInstances(flowNodeInstances);
	 
	 	return listFlowNodeInstanceResponse;
	}
}