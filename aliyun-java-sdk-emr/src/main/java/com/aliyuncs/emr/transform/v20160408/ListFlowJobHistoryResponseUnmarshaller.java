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

import com.aliyuncs.emr.model.v20160408.ListFlowJobHistoryResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowJobHistoryResponse.NodeInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowJobHistoryResponseUnmarshaller {

	public static ListFlowJobHistoryResponse unmarshall(ListFlowJobHistoryResponse listFlowJobHistoryResponse, UnmarshallerContext context) {
		
		listFlowJobHistoryResponse.setRequestId(context.stringValue("ListFlowJobHistoryResponse.RequestId"));
		listFlowJobHistoryResponse.setPageNumber(context.integerValue("ListFlowJobHistoryResponse.PageNumber"));
		listFlowJobHistoryResponse.setPageSize(context.integerValue("ListFlowJobHistoryResponse.PageSize"));
		listFlowJobHistoryResponse.setTotal(context.integerValue("ListFlowJobHistoryResponse.Total"));

		List<NodeInstance> nodeInstances = new ArrayList<NodeInstance>();
		for (int i = 0; i < context.lengthValue("ListFlowJobHistoryResponse.NodeInstances.Length"); i++) {
			NodeInstance nodeInstance = new NodeInstance();
			nodeInstance.setId(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].Id"));
			nodeInstance.setGmtCreate(context.longValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].GmtCreate"));
			nodeInstance.setGmtModified(context.longValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].GmtModified"));
			nodeInstance.setType(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].Type"));
			nodeInstance.setStatus(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].Status"));
			nodeInstance.setJobId(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].JobId"));
			nodeInstance.setJobName(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].JobName"));
			nodeInstance.setJobType(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].JobType"));
			nodeInstance.setJobParams(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].JobParams"));
			nodeInstance.setFailAct(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].FailAct"));
			nodeInstance.setMaxRetry(context.integerValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].MaxRetry"));
			nodeInstance.setRetryInterval(context.longValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].RetryInterval"));
			nodeInstance.setNodeName(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].NodeName"));
			nodeInstance.setClusterId(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ClusterId"));
			nodeInstance.setHostName(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].HostName"));
			nodeInstance.setProjectId(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ProjectId"));
			nodeInstance.setStartTime(context.longValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].StartTime"));
			nodeInstance.setEndTime(context.longValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].EndTime"));
			nodeInstance.setPending(context.booleanValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].pending"));
			nodeInstance.setRetries(context.integerValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].Retries"));
			nodeInstance.setExternalId(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ExternalId"));
			nodeInstance.setExternalStatus(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ExternalStatus"));
			nodeInstance.setExternalInfo(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ExternalInfo"));
			nodeInstance.setParamConf(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ParamConf"));
			nodeInstance.setEnvConf(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].EnvConf"));
			nodeInstance.setRunConf(context.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].RunConf"));

			nodeInstances.add(nodeInstance);
		}
		listFlowJobHistoryResponse.setNodeInstances(nodeInstances);
	 
	 	return listFlowJobHistoryResponse;
	}
}