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

	public static DescribeFlowNodeInstanceResponse unmarshall(DescribeFlowNodeInstanceResponse describeFlowNodeInstanceResponse, UnmarshallerContext _ctx) {
		
		describeFlowNodeInstanceResponse.setRequestId(_ctx.stringValue("DescribeFlowNodeInstanceResponse.RequestId"));
		describeFlowNodeInstanceResponse.setId(_ctx.stringValue("DescribeFlowNodeInstanceResponse.Id"));
		describeFlowNodeInstanceResponse.setGmtCreate(_ctx.longValue("DescribeFlowNodeInstanceResponse.GmtCreate"));
		describeFlowNodeInstanceResponse.setGmtModified(_ctx.longValue("DescribeFlowNodeInstanceResponse.GmtModified"));
		describeFlowNodeInstanceResponse.setType(_ctx.stringValue("DescribeFlowNodeInstanceResponse.Type"));
		describeFlowNodeInstanceResponse.setStatus(_ctx.stringValue("DescribeFlowNodeInstanceResponse.Status"));
		describeFlowNodeInstanceResponse.setJobId(_ctx.stringValue("DescribeFlowNodeInstanceResponse.JobId"));
		describeFlowNodeInstanceResponse.setJobName(_ctx.stringValue("DescribeFlowNodeInstanceResponse.JobName"));
		describeFlowNodeInstanceResponse.setJobType(_ctx.stringValue("DescribeFlowNodeInstanceResponse.JobType"));
		describeFlowNodeInstanceResponse.setJobParams(_ctx.stringValue("DescribeFlowNodeInstanceResponse.JobParams"));
		describeFlowNodeInstanceResponse.setFailAct(_ctx.stringValue("DescribeFlowNodeInstanceResponse.FailAct"));
		describeFlowNodeInstanceResponse.setMaxRetry(_ctx.stringValue("DescribeFlowNodeInstanceResponse.MaxRetry"));
		describeFlowNodeInstanceResponse.setRetryInterval(_ctx.stringValue("DescribeFlowNodeInstanceResponse.RetryInterval"));
		describeFlowNodeInstanceResponse.setNodeName(_ctx.stringValue("DescribeFlowNodeInstanceResponse.NodeName"));
		describeFlowNodeInstanceResponse.setFlowId(_ctx.stringValue("DescribeFlowNodeInstanceResponse.FlowId"));
		describeFlowNodeInstanceResponse.setFlowInstanceId(_ctx.stringValue("DescribeFlowNodeInstanceResponse.FlowInstanceId"));
		describeFlowNodeInstanceResponse.setClusterId(_ctx.stringValue("DescribeFlowNodeInstanceResponse.ClusterId"));
		describeFlowNodeInstanceResponse.setHostName(_ctx.stringValue("DescribeFlowNodeInstanceResponse.HostName"));
		describeFlowNodeInstanceResponse.setProjectId(_ctx.stringValue("DescribeFlowNodeInstanceResponse.ProjectId"));
		describeFlowNodeInstanceResponse.setPending(_ctx.booleanValue("DescribeFlowNodeInstanceResponse.Pending"));
		describeFlowNodeInstanceResponse.setStartTime(_ctx.longValue("DescribeFlowNodeInstanceResponse.StartTime"));
		describeFlowNodeInstanceResponse.setEndTime(_ctx.longValue("DescribeFlowNodeInstanceResponse.EndTime"));
		describeFlowNodeInstanceResponse.setDuration(_ctx.longValue("DescribeFlowNodeInstanceResponse.Duration"));
		describeFlowNodeInstanceResponse.setRetries(_ctx.integerValue("DescribeFlowNodeInstanceResponse.Retries"));
		describeFlowNodeInstanceResponse.setExternalId(_ctx.stringValue("DescribeFlowNodeInstanceResponse.ExternalId"));
		describeFlowNodeInstanceResponse.setExternalSubId(_ctx.stringValue("DescribeFlowNodeInstanceResponse.ExternalSubId"));
		describeFlowNodeInstanceResponse.setExternalChildIds(_ctx.stringValue("DescribeFlowNodeInstanceResponse.ExternalChildIds"));
		describeFlowNodeInstanceResponse.setExternalStatus(_ctx.stringValue("DescribeFlowNodeInstanceResponse.ExternalStatus"));
		describeFlowNodeInstanceResponse.setExternalInfo(_ctx.stringValue("DescribeFlowNodeInstanceResponse.ExternalInfo"));
		describeFlowNodeInstanceResponse.setParamConf(_ctx.stringValue("DescribeFlowNodeInstanceResponse.ParamConf"));
		describeFlowNodeInstanceResponse.setEnvConf(_ctx.stringValue("DescribeFlowNodeInstanceResponse.EnvConf"));
		describeFlowNodeInstanceResponse.setRunConf(_ctx.stringValue("DescribeFlowNodeInstanceResponse.RunConf"));
		describeFlowNodeInstanceResponse.setAdhoc(_ctx.booleanValue("DescribeFlowNodeInstanceResponse.Adhoc"));
		describeFlowNodeInstanceResponse.setMonitorConf(_ctx.stringValue("DescribeFlowNodeInstanceResponse.MonitorConf"));
		describeFlowNodeInstanceResponse.setMode(_ctx.stringValue("DescribeFlowNodeInstanceResponse.Mode"));
		describeFlowNodeInstanceResponse.setClusterName(_ctx.stringValue("DescribeFlowNodeInstanceResponse.ClusterName"));
	 
	 	return describeFlowNodeInstanceResponse;
	}
}