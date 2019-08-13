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

	public static ListFlowJobHistoryResponse unmarshall(ListFlowJobHistoryResponse listFlowJobHistoryResponse, UnmarshallerContext _ctx) {
		
		listFlowJobHistoryResponse.setRequestId(_ctx.stringValue("ListFlowJobHistoryResponse.RequestId"));
		listFlowJobHistoryResponse.setPageNumber(_ctx.integerValue("ListFlowJobHistoryResponse.PageNumber"));
		listFlowJobHistoryResponse.setPageSize(_ctx.integerValue("ListFlowJobHistoryResponse.PageSize"));
		listFlowJobHistoryResponse.setTotal(_ctx.integerValue("ListFlowJobHistoryResponse.Total"));

		List<NodeInstance> nodeInstances = new ArrayList<NodeInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowJobHistoryResponse.NodeInstances.Length"); i++) {
			NodeInstance nodeInstance = new NodeInstance();
			nodeInstance.setId(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].Id"));
			nodeInstance.setGmtCreate(_ctx.longValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].GmtCreate"));
			nodeInstance.setGmtModified(_ctx.longValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].GmtModified"));
			nodeInstance.setType(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].Type"));
			nodeInstance.setStatus(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].Status"));
			nodeInstance.setJobId(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].JobId"));
			nodeInstance.setJobName(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].JobName"));
			nodeInstance.setJobType(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].JobType"));
			nodeInstance.setJobParams(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].JobParams"));
			nodeInstance.setFailAct(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].FailAct"));
			nodeInstance.setMaxRetry(_ctx.integerValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].MaxRetry"));
			nodeInstance.setRetryInterval(_ctx.longValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].RetryInterval"));
			nodeInstance.setNodeName(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].NodeName"));
			nodeInstance.setClusterId(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ClusterId"));
			nodeInstance.setHostName(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].HostName"));
			nodeInstance.setProjectId(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ProjectId"));
			nodeInstance.setStartTime(_ctx.longValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].StartTime"));
			nodeInstance.setEndTime(_ctx.longValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].EndTime"));
			nodeInstance.setPending(_ctx.booleanValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].pending"));
			nodeInstance.setRetries(_ctx.integerValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].Retries"));
			nodeInstance.setExternalId(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ExternalId"));
			nodeInstance.setExternalStatus(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ExternalStatus"));
			nodeInstance.setExternalInfo(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ExternalInfo"));
			nodeInstance.setParamConf(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].ParamConf"));
			nodeInstance.setEnvConf(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].EnvConf"));
			nodeInstance.setRunConf(_ctx.stringValue("ListFlowJobHistoryResponse.NodeInstances["+ i +"].RunConf"));

			nodeInstances.add(nodeInstance);
		}
		listFlowJobHistoryResponse.setNodeInstances(nodeInstances);
	 
	 	return listFlowJobHistoryResponse;
	}
}