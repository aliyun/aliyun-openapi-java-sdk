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

import com.aliyuncs.datalake.model.v20200710.ListMetastoreCrawlerResponse;
import com.aliyuncs.datalake.model.v20200710.ListMetastoreCrawlerResponse.MetastoreCrawlerList;
import com.aliyuncs.datalake.model.v20200710.ListMetastoreCrawlerResponse.MetastoreCrawlerList.WorkflowLastRunInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMetastoreCrawlerResponseUnmarshaller {

	public static ListMetastoreCrawlerResponse unmarshall(ListMetastoreCrawlerResponse listMetastoreCrawlerResponse, UnmarshallerContext _ctx) {
		
		listMetastoreCrawlerResponse.setRequestId(_ctx.stringValue("ListMetastoreCrawlerResponse.RequestId"));
		listMetastoreCrawlerResponse.setTotalCount(_ctx.integerValue("ListMetastoreCrawlerResponse.TotalCount"));
		listMetastoreCrawlerResponse.setSuccess(_ctx.booleanValue("ListMetastoreCrawlerResponse.Success"));

		List<MetastoreCrawlerList> data = new ArrayList<MetastoreCrawlerList>();
		for (int i = 0; i < _ctx.lengthValue("ListMetastoreCrawlerResponse.Data.Length"); i++) {
			MetastoreCrawlerList metastoreCrawlerList = new MetastoreCrawlerList();
			metastoreCrawlerList.setOwner(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].Owner"));
			metastoreCrawlerList.setTargetDatabase(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].TargetDatabase"));
			metastoreCrawlerList.setTargetUpdateStrategy(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].TargetUpdateStrategy"));
			metastoreCrawlerList.setExecuteType(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].ExecuteType"));
			metastoreCrawlerList.setGmtModified(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].GmtModified"));
			metastoreCrawlerList.setDatasourceType(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].DatasourceType"));
			metastoreCrawlerList.setCreator(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].Creator"));
			metastoreCrawlerList.setFileFormat(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].FileFormat"));
			metastoreCrawlerList.setTargetTablePrefix(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].TargetTablePrefix"));
			metastoreCrawlerList.setSuccess(_ctx.booleanValue("ListMetastoreCrawlerResponse.Data["+ i +"].Success"));
			metastoreCrawlerList.setName(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].Name"));
			metastoreCrawlerList.setRoleName(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].RoleName"));
			metastoreCrawlerList.setGmtCreate(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].GmtCreate"));
			metastoreCrawlerList.setFileFormatConfig(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].FileFormatConfig"));
			metastoreCrawlerList.setDatasourceExcludePath(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].DatasourceExcludePath"));
			metastoreCrawlerList.setRegionId(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].RegionId"));
			metastoreCrawlerList.setId(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].Id"));
			metastoreCrawlerList.setDatasourcePath(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].DatasourcePath"));
			metastoreCrawlerList.setStatus(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].Status"));
			metastoreCrawlerList.setCreatorLoginName(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].CreatorLoginName"));

			WorkflowLastRunInstance workflowLastRunInstance = new WorkflowLastRunInstance();
			workflowLastRunInstance.setFlowId(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].WorkflowLastRunInstance.FlowId"));
			workflowLastRunInstance.setStatus(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].WorkflowLastRunInstance.Status"));
			workflowLastRunInstance.setEndTime(_ctx.longValue("ListMetastoreCrawlerResponse.Data["+ i +"].WorkflowLastRunInstance.EndTime"));
			workflowLastRunInstance.setClusterId(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].WorkflowLastRunInstance.ClusterId"));
			workflowLastRunInstance.setFlowName(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].WorkflowLastRunInstance.FlowName"));
			workflowLastRunInstance.setStartTime(_ctx.longValue("ListMetastoreCrawlerResponse.Data["+ i +"].WorkflowLastRunInstance.StartTime"));
			workflowLastRunInstance.setProjectId(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].WorkflowLastRunInstance.ProjectId"));
			workflowLastRunInstance.setFlowInstanceId(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].WorkflowLastRunInstance.FlowInstanceId"));
			workflowLastRunInstance.setDuration(_ctx.integerValue("ListMetastoreCrawlerResponse.Data["+ i +"].WorkflowLastRunInstance.Duration"));
			workflowLastRunInstance.setFailureInfo(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].WorkflowLastRunInstance.FailureInfo"));
			workflowLastRunInstance.setFlowExtendResult(_ctx.stringValue("ListMetastoreCrawlerResponse.Data["+ i +"].WorkflowLastRunInstance.FlowExtendResult"));
			metastoreCrawlerList.setWorkflowLastRunInstance(workflowLastRunInstance);

			data.add(metastoreCrawlerList);
		}
		listMetastoreCrawlerResponse.setData(data);
	 
	 	return listMetastoreCrawlerResponse;
	}
}