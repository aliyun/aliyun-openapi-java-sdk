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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListCrawlerWorkflowInstanceResponse;
import com.aliyuncs.datalake.model.v20200710.ListCrawlerWorkflowInstanceResponse.WorkflowInstanceList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCrawlerWorkflowInstanceResponseUnmarshaller {

	public static ListCrawlerWorkflowInstanceResponse unmarshall(ListCrawlerWorkflowInstanceResponse listCrawlerWorkflowInstanceResponse, UnmarshallerContext _ctx) {
		
		listCrawlerWorkflowInstanceResponse.setRequestId(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.RequestId"));
		listCrawlerWorkflowInstanceResponse.setSuccess(_ctx.booleanValue("ListCrawlerWorkflowInstanceResponse.Success"));
		listCrawlerWorkflowInstanceResponse.setTotalCount(_ctx.integerValue("ListCrawlerWorkflowInstanceResponse.TotalCount"));

		List<WorkflowInstanceList> data = new ArrayList<WorkflowInstanceList>();
		for (int i = 0; i < _ctx.lengthValue("ListCrawlerWorkflowInstanceResponse.Data.Length"); i++) {
			WorkflowInstanceList workflowInstanceList = new WorkflowInstanceList();
			workflowInstanceList.setGmtModified(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].GmtModified"));
			workflowInstanceList.setGmtCreate(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].GmtCreate"));
			workflowInstanceList.setRegionId(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].RegionId"));
			workflowInstanceList.setCrawlerId(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].CrawlerId"));
			workflowInstanceList.setName(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].Name"));
			workflowInstanceList.setDatasourceType(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].DatasourceType"));
			workflowInstanceList.setDatasourcePath(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].DatasourcePath"));
			workflowInstanceList.setDatasourceExcludePath(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].DatasourceExcludePath"));
			workflowInstanceList.setFileFormat(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].FileFormat"));
			workflowInstanceList.setFileFormatConfig(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].FileFormatConfig"));
			workflowInstanceList.setTargetDatabase(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].TargetDatabase"));
			workflowInstanceList.setTargetTablePrefix(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].TargetTablePrefix"));
			workflowInstanceList.setTargetUpdateStrategy(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].TargetUpdateStrategy"));
			workflowInstanceList.setExecuteType(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].ExecuteType"));
			workflowInstanceList.setExecuteCron(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].ExecuteCron"));
			workflowInstanceList.setRoleName(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].RoleName"));
			workflowInstanceList.setCreator(_ctx.longValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].Creator"));
			workflowInstanceList.setOwner(_ctx.longValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].Owner"));
			workflowInstanceList.setFlowInstanceId(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].FlowInstanceId"));
			workflowInstanceList.setFlowId(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].FlowId"));
			workflowInstanceList.setFlowName(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].FlowName"));
			workflowInstanceList.setDuration(_ctx.integerValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].Duration"));
			workflowInstanceList.setStartTime(_ctx.longValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].StartTime"));
			workflowInstanceList.setEndTime(_ctx.longValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].EndTime"));
			workflowInstanceList.setStatus(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].Status"));
			workflowInstanceList.setProjectId(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].ProjectId"));
			workflowInstanceList.setClusterId(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].ClusterId"));
			workflowInstanceList.setFailureInfo(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].FailureInfo"));
			workflowInstanceList.setFlowExtendResult(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].FlowExtendResult"));
			workflowInstanceList.setCrawlerIsDelete(_ctx.booleanValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].CrawlerIsDelete"));
			workflowInstanceList.setBatchProgress(_ctx.integerValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].BatchProgress"));
			workflowInstanceList.setExecuteMode(_ctx.stringValue("ListCrawlerWorkflowInstanceResponse.Data["+ i +"].ExecuteMode"));

			data.add(workflowInstanceList);
		}
		listCrawlerWorkflowInstanceResponse.setData(data);
	 
	 	return listCrawlerWorkflowInstanceResponse;
	}
}