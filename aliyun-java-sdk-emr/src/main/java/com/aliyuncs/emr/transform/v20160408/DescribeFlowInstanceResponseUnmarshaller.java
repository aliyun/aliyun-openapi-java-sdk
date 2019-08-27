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

import com.aliyuncs.emr.model.v20160408.DescribeFlowInstanceResponse;
import com.aliyuncs.emr.model.v20160408.DescribeFlowInstanceResponse.NodeInstanceItem;
import com.aliyuncs.emr.model.v20160408.DescribeFlowInstanceResponse.ParentFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowInstanceResponseUnmarshaller {

	public static DescribeFlowInstanceResponse unmarshall(DescribeFlowInstanceResponse describeFlowInstanceResponse, UnmarshallerContext _ctx) {
		
		describeFlowInstanceResponse.setRequestId(_ctx.stringValue("DescribeFlowInstanceResponse.RequestId"));
		describeFlowInstanceResponse.setId(_ctx.stringValue("DescribeFlowInstanceResponse.Id"));
		describeFlowInstanceResponse.setGmtCreate(_ctx.longValue("DescribeFlowInstanceResponse.GmtCreate"));
		describeFlowInstanceResponse.setGmtModified(_ctx.longValue("DescribeFlowInstanceResponse.GmtModified"));
		describeFlowInstanceResponse.setFlowId(_ctx.stringValue("DescribeFlowInstanceResponse.FlowId"));
		describeFlowInstanceResponse.setFlowName(_ctx.stringValue("DescribeFlowInstanceResponse.FlowName"));
		describeFlowInstanceResponse.setProjectId(_ctx.stringValue("DescribeFlowInstanceResponse.ProjectId"));
		describeFlowInstanceResponse.setStatus(_ctx.stringValue("DescribeFlowInstanceResponse.Status"));
		describeFlowInstanceResponse.setClusterId(_ctx.stringValue("DescribeFlowInstanceResponse.ClusterId"));
		describeFlowInstanceResponse.setStartTime(_ctx.longValue("DescribeFlowInstanceResponse.StartTime"));
		describeFlowInstanceResponse.setEndTime(_ctx.longValue("DescribeFlowInstanceResponse.EndTime"));
		describeFlowInstanceResponse.setDuration(_ctx.longValue("DescribeFlowInstanceResponse.Duration"));
		describeFlowInstanceResponse.setScheduleTime(_ctx.longValue("DescribeFlowInstanceResponse.ScheduleTime"));
		describeFlowInstanceResponse.setGraph(_ctx.stringValue("DescribeFlowInstanceResponse.Graph"));
		describeFlowInstanceResponse.setCronExpression(_ctx.stringValue("DescribeFlowInstanceResponse.CronExpression"));
		describeFlowInstanceResponse.setHasNodeFailed(_ctx.booleanValue("DescribeFlowInstanceResponse.HasNodeFailed"));

		List<ParentFlow> dependencyFlowList = new ArrayList<ParentFlow>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowInstanceResponse.DependencyFlowList.Length"); i++) {
			ParentFlow parentFlow = new ParentFlow();
			parentFlow.setProjectId(_ctx.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].ProjectId"));
			parentFlow.setFlowId(_ctx.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].FlowId"));
			parentFlow.setDependencyFlowId(_ctx.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].DependencyFlowId"));
			parentFlow.setFlowInstanceId(_ctx.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].FlowInstanceId"));
			parentFlow.setDependencyInstanceId(_ctx.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].DependencyInstanceId"));
			parentFlow.setScheduleKey(_ctx.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].ScheduleKey"));
			parentFlow.setBizDate(_ctx.longValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].BizDate"));

			dependencyFlowList.add(parentFlow);
		}
		describeFlowInstanceResponse.setDependencyFlowList(dependencyFlowList);

		List<NodeInstanceItem> nodeInstance = new ArrayList<NodeInstanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowInstanceResponse.NodeInstance.Length"); i++) {
			NodeInstanceItem nodeInstanceItem = new NodeInstanceItem();
			nodeInstanceItem.setId(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Id"));
			nodeInstanceItem.setGmtCreate(_ctx.longValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].GmtCreate"));
			nodeInstanceItem.setGmtModified(_ctx.longValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].GmtModified"));
			nodeInstanceItem.setType(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Type"));
			nodeInstanceItem.setStatus(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Status"));
			nodeInstanceItem.setJobId(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].JobId"));
			nodeInstanceItem.setJobName(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].JobName"));
			nodeInstanceItem.setJobType(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].JobType"));
			nodeInstanceItem.setFailAct(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].FailAct"));
			nodeInstanceItem.setMaxRetry(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].MaxRetry"));
			nodeInstanceItem.setRetryInterval(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].RetryInterval"));
			nodeInstanceItem.setNodeName(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].NodeName"));
			nodeInstanceItem.setClusterId(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].ClusterId"));
			nodeInstanceItem.setHostName(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].HostName"));
			nodeInstanceItem.setProjectId(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].ProjectId"));
			nodeInstanceItem.setPending(_ctx.booleanValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Pending"));
			nodeInstanceItem.setStartTime(_ctx.longValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].StartTime"));
			nodeInstanceItem.setEndTime(_ctx.longValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].EndTime"));
			nodeInstanceItem.setDuration(_ctx.longValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Duration"));
			nodeInstanceItem.setRetries(_ctx.integerValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Retries"));
			nodeInstanceItem.setExternalId(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].ExternalId"));
			nodeInstanceItem.setExternalStatus(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].ExternalStatus"));
			nodeInstanceItem.setExternalInfo(_ctx.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].ExternalInfo"));

			nodeInstance.add(nodeInstanceItem);
		}
		describeFlowInstanceResponse.setNodeInstance(nodeInstance);
	 
	 	return describeFlowInstanceResponse;
	}
}