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

import com.aliyuncs.emr.model.v20160408.DescribeFlowNodeInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowNodeInstanceResponseUnmarshaller {

	public static DescribeFlowNodeInstanceResponse unmarshall(DescribeFlowNodeInstanceResponse describeFlowNodeInstanceResponse, UnmarshallerContext context) {
		
		describeFlowNodeInstanceResponse.setRequestId(context.stringValue("DescribeFlowNodeInstanceResponse.RequestId"));
		describeFlowNodeInstanceResponse.setId(context.stringValue("DescribeFlowNodeInstanceResponse.Id"));
		describeFlowNodeInstanceResponse.setGmtCreate(context.longValue("DescribeFlowNodeInstanceResponse.GmtCreate"));
		describeFlowNodeInstanceResponse.setGmtModified(context.longValue("DescribeFlowNodeInstanceResponse.GmtModified"));
		describeFlowNodeInstanceResponse.setType(context.stringValue("DescribeFlowNodeInstanceResponse.Type"));
		describeFlowNodeInstanceResponse.setStatus(context.stringValue("DescribeFlowNodeInstanceResponse.Status"));
		describeFlowNodeInstanceResponse.setJobId(context.stringValue("DescribeFlowNodeInstanceResponse.JobId"));
		describeFlowNodeInstanceResponse.setJobName(context.stringValue("DescribeFlowNodeInstanceResponse.JobName"));
		describeFlowNodeInstanceResponse.setJobType(context.stringValue("DescribeFlowNodeInstanceResponse.JobType"));
		describeFlowNodeInstanceResponse.setJobParams(context.stringValue("DescribeFlowNodeInstanceResponse.JobParams"));
		describeFlowNodeInstanceResponse.setFailAct(context.stringValue("DescribeFlowNodeInstanceResponse.FailAct"));
		describeFlowNodeInstanceResponse.setMaxRetry(context.stringValue("DescribeFlowNodeInstanceResponse.MaxRetry"));
		describeFlowNodeInstanceResponse.setRetryInterval(context.stringValue("DescribeFlowNodeInstanceResponse.RetryInterval"));
		describeFlowNodeInstanceResponse.setNodeName(context.stringValue("DescribeFlowNodeInstanceResponse.NodeName"));
		describeFlowNodeInstanceResponse.setFlowId(context.stringValue("DescribeFlowNodeInstanceResponse.FlowId"));
		describeFlowNodeInstanceResponse.setClusterId(context.stringValue("DescribeFlowNodeInstanceResponse.ClusterId"));
		describeFlowNodeInstanceResponse.setHostName(context.stringValue("DescribeFlowNodeInstanceResponse.HostName"));
		describeFlowNodeInstanceResponse.setProjectId(context.stringValue("DescribeFlowNodeInstanceResponse.ProjectId"));
		describeFlowNodeInstanceResponse.setStartTime(context.longValue("DescribeFlowNodeInstanceResponse.StartTime"));
		describeFlowNodeInstanceResponse.setEndTime(context.longValue("DescribeFlowNodeInstanceResponse.EndTime"));
		describeFlowNodeInstanceResponse.setRetries(context.integerValue("DescribeFlowNodeInstanceResponse.Retries"));
		describeFlowNodeInstanceResponse.setExternalId(context.stringValue("DescribeFlowNodeInstanceResponse.ExternalId"));
		describeFlowNodeInstanceResponse.setExternalStatus(context.stringValue("DescribeFlowNodeInstanceResponse.ExternalStatus"));
		describeFlowNodeInstanceResponse.setExternalInfo(context.stringValue("DescribeFlowNodeInstanceResponse.ExternalInfo"));
		describeFlowNodeInstanceResponse.setParamConf(context.stringValue("DescribeFlowNodeInstanceResponse.ParamConf"));
		describeFlowNodeInstanceResponse.setEnvConf(context.stringValue("DescribeFlowNodeInstanceResponse.EnvConf"));
		describeFlowNodeInstanceResponse.setRunConf(context.stringValue("DescribeFlowNodeInstanceResponse.RunConf"));
		describeFlowNodeInstanceResponse.setClusterName(context.stringValue("DescribeFlowNodeInstanceResponse.ClusterName"));
	 
	 	return describeFlowNodeInstanceResponse;
	}
}