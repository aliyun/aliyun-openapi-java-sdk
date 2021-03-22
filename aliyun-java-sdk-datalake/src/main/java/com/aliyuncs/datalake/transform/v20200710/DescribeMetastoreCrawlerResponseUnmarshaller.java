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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.DescribeMetastoreCrawlerResponse;
import com.aliyuncs.datalake.model.v20200710.DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetastoreCrawlerResponseUnmarshaller {

	public static DescribeMetastoreCrawlerResponse unmarshall(DescribeMetastoreCrawlerResponse describeMetastoreCrawlerResponse, UnmarshallerContext _ctx) {
		
		describeMetastoreCrawlerResponse.setRequestId(_ctx.stringValue("DescribeMetastoreCrawlerResponse.RequestId"));
		describeMetastoreCrawlerResponse.setRegionId(_ctx.stringValue("DescribeMetastoreCrawlerResponse.RegionId"));
		describeMetastoreCrawlerResponse.setId(_ctx.stringValue("DescribeMetastoreCrawlerResponse.Id"));
		describeMetastoreCrawlerResponse.setName(_ctx.stringValue("DescribeMetastoreCrawlerResponse.Name"));
		describeMetastoreCrawlerResponse.setDatasourceType(_ctx.stringValue("DescribeMetastoreCrawlerResponse.DatasourceType"));
		describeMetastoreCrawlerResponse.setDatasourcePath(_ctx.stringValue("DescribeMetastoreCrawlerResponse.DatasourcePath"));
		describeMetastoreCrawlerResponse.setDatasourceExcludePath(_ctx.stringValue("DescribeMetastoreCrawlerResponse.DatasourceExcludePath"));
		describeMetastoreCrawlerResponse.setFileFormat(_ctx.stringValue("DescribeMetastoreCrawlerResponse.FileFormat"));
		describeMetastoreCrawlerResponse.setFileFormatConfig(_ctx.stringValue("DescribeMetastoreCrawlerResponse.FileFormatConfig"));
		describeMetastoreCrawlerResponse.setTargetDatabase(_ctx.stringValue("DescribeMetastoreCrawlerResponse.TargetDatabase"));
		describeMetastoreCrawlerResponse.setTargetTablePrefix(_ctx.stringValue("DescribeMetastoreCrawlerResponse.TargetTablePrefix"));
		describeMetastoreCrawlerResponse.setTargetUpdateStrategy(_ctx.stringValue("DescribeMetastoreCrawlerResponse.TargetUpdateStrategy"));
		describeMetastoreCrawlerResponse.setExecuteType(_ctx.stringValue("DescribeMetastoreCrawlerResponse.ExecuteType"));
		describeMetastoreCrawlerResponse.setExecuteCron(_ctx.stringValue("DescribeMetastoreCrawlerResponse.ExecuteCron"));
		describeMetastoreCrawlerResponse.setRoleName(_ctx.stringValue("DescribeMetastoreCrawlerResponse.RoleName"));
		describeMetastoreCrawlerResponse.setCreator(_ctx.longValue("DescribeMetastoreCrawlerResponse.Creator"));
		describeMetastoreCrawlerResponse.setOwner(_ctx.longValue("DescribeMetastoreCrawlerResponse.Owner"));
		describeMetastoreCrawlerResponse.setGmtModified(_ctx.stringValue("DescribeMetastoreCrawlerResponse.GmtModified"));
		describeMetastoreCrawlerResponse.setGmtCreate(_ctx.stringValue("DescribeMetastoreCrawlerResponse.GmtCreate"));
		describeMetastoreCrawlerResponse.setSuccess(_ctx.booleanValue("DescribeMetastoreCrawlerResponse.Success"));
		describeMetastoreCrawlerResponse.setStatus(_ctx.stringValue("DescribeMetastoreCrawlerResponse.Status"));
		describeMetastoreCrawlerResponse.setExecuteMode(_ctx.stringValue("DescribeMetastoreCrawlerResponse.ExecuteMode"));

		WorkflowLastRunInstance workflowLastRunInstance = new WorkflowLastRunInstance();
		workflowLastRunInstance.setFlowInstanceId(_ctx.stringValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.FlowInstanceId"));
		workflowLastRunInstance.setFlowId(_ctx.stringValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.FlowId"));
		workflowLastRunInstance.setFlowName(_ctx.stringValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.FlowName"));
		workflowLastRunInstance.setDuration(_ctx.longValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.Duration"));
		workflowLastRunInstance.setStartTime(_ctx.longValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.StartTime"));
		workflowLastRunInstance.setEndTime(_ctx.longValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.EndTime"));
		workflowLastRunInstance.setStatus(_ctx.stringValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.Status"));
		workflowLastRunInstance.setProjectId(_ctx.stringValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.ProjectId"));
		workflowLastRunInstance.setClusterId(_ctx.stringValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.ClusterId"));
		workflowLastRunInstance.setFailureInfo(_ctx.stringValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.FailureInfo"));
		workflowLastRunInstance.setFlowExtendResult(_ctx.stringValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.FlowExtendResult"));
		workflowLastRunInstance.setBatchProgress(_ctx.integerValue("DescribeMetastoreCrawlerResponse.WorkflowLastRunInstance.BatchProgress"));
		describeMetastoreCrawlerResponse.setWorkflowLastRunInstance(workflowLastRunInstance);
	 
	 	return describeMetastoreCrawlerResponse;
	}
}