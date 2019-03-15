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

	public static DescribeFlowInstanceResponse unmarshall(DescribeFlowInstanceResponse describeFlowInstanceResponse, UnmarshallerContext context) {
		
		describeFlowInstanceResponse.setRequestId(context.stringValue("DescribeFlowInstanceResponse.RequestId"));
		describeFlowInstanceResponse.setId(context.stringValue("DescribeFlowInstanceResponse.Id"));
		describeFlowInstanceResponse.setGmtCreate(context.longValue("DescribeFlowInstanceResponse.GmtCreate"));
		describeFlowInstanceResponse.setGmtModified(context.longValue("DescribeFlowInstanceResponse.GmtModified"));
		describeFlowInstanceResponse.setFlowId(context.stringValue("DescribeFlowInstanceResponse.FlowId"));
		describeFlowInstanceResponse.setFlowName(context.stringValue("DescribeFlowInstanceResponse.FlowName"));
		describeFlowInstanceResponse.setProjectId(context.stringValue("DescribeFlowInstanceResponse.ProjectId"));
		describeFlowInstanceResponse.setStatus(context.stringValue("DescribeFlowInstanceResponse.Status"));
		describeFlowInstanceResponse.setClusterId(context.stringValue("DescribeFlowInstanceResponse.ClusterId"));
		describeFlowInstanceResponse.setStartTime(context.longValue("DescribeFlowInstanceResponse.StartTime"));
		describeFlowInstanceResponse.setEndTime(context.longValue("DescribeFlowInstanceResponse.EndTime"));
		describeFlowInstanceResponse.setDuration(context.longValue("DescribeFlowInstanceResponse.Duration"));
		describeFlowInstanceResponse.setScheduleTime(context.longValue("DescribeFlowInstanceResponse.ScheduleTime"));
		describeFlowInstanceResponse.setGraph(context.stringValue("DescribeFlowInstanceResponse.Graph"));
		describeFlowInstanceResponse.setCronExpression(context.stringValue("DescribeFlowInstanceResponse.CronExpression"));
		describeFlowInstanceResponse.setHasNodeFailed(context.booleanValue("DescribeFlowInstanceResponse.HasNodeFailed"));

		List<ParentFlow> dependencyFlowList = new ArrayList<ParentFlow>();
		for (int i = 0; i < context.lengthValue("DescribeFlowInstanceResponse.DependencyFlowList.Length"); i++) {
			ParentFlow parentFlow = new ParentFlow();
			parentFlow.setProjectId(context.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].ProjectId"));
			parentFlow.setFlowId(context.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].FlowId"));
			parentFlow.setDependencyFlowId(context.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].DependencyFlowId"));
			parentFlow.setFlowInstanceId(context.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].FlowInstanceId"));
			parentFlow.setDependencyInstanceId(context.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].DependencyInstanceId"));
			parentFlow.setScheduleKey(context.stringValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].ScheduleKey"));
			parentFlow.setBizDate(context.longValue("DescribeFlowInstanceResponse.DependencyFlowList["+ i +"].BizDate"));

			dependencyFlowList.add(parentFlow);
		}
		describeFlowInstanceResponse.setDependencyFlowList(dependencyFlowList);

		List<NodeInstanceItem> nodeInstance = new ArrayList<NodeInstanceItem>();
		for (int i = 0; i < context.lengthValue("DescribeFlowInstanceResponse.NodeInstance.Length"); i++) {
			NodeInstanceItem nodeInstanceItem = new NodeInstanceItem();
			nodeInstanceItem.setId(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Id"));
			nodeInstanceItem.setGmtCreate(context.longValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].GmtCreate"));
			nodeInstanceItem.setGmtModified(context.longValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].GmtModified"));
			nodeInstanceItem.setType(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Type"));
			nodeInstanceItem.setStatus(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Status"));
			nodeInstanceItem.setJobId(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].JobId"));
			nodeInstanceItem.setJobName(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].JobName"));
			nodeInstanceItem.setJobType(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].JobType"));
			nodeInstanceItem.setFailAct(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].FailAct"));
			nodeInstanceItem.setMaxRetry(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].MaxRetry"));
			nodeInstanceItem.setRetryInterval(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].RetryInterval"));
			nodeInstanceItem.setNodeName(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].NodeName"));
			nodeInstanceItem.setClusterId(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].ClusterId"));
			nodeInstanceItem.setHostName(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].HostName"));
			nodeInstanceItem.setProjectId(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].ProjectId"));
			nodeInstanceItem.setPending(context.booleanValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Pending"));
			nodeInstanceItem.setStartTime(context.longValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].StartTime"));
			nodeInstanceItem.setEndTime(context.longValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].EndTime"));
			nodeInstanceItem.setDuration(context.longValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Duration"));
			nodeInstanceItem.setRetries(context.integerValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].Retries"));
			nodeInstanceItem.setExternalId(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].ExternalId"));
			nodeInstanceItem.setExternalStatus(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].ExternalStatus"));
			nodeInstanceItem.setExternalInfo(context.stringValue("DescribeFlowInstanceResponse.NodeInstance["+ i +"].ExternalInfo"));

			nodeInstance.add(nodeInstanceItem);
		}
		describeFlowInstanceResponse.setNodeInstance(nodeInstance);
	 
	 	return describeFlowInstanceResponse;
	}
}