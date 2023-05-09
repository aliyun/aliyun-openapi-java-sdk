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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceHistoricDeploymentResponse;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceHistoricDeploymentResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceHistoricDeploymentResponse.Data.Deployment;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEdgeInstanceHistoricDeploymentResponseUnmarshaller {

	public static QueryEdgeInstanceHistoricDeploymentResponse unmarshall(QueryEdgeInstanceHistoricDeploymentResponse queryEdgeInstanceHistoricDeploymentResponse, UnmarshallerContext _ctx) {
		
		queryEdgeInstanceHistoricDeploymentResponse.setRequestId(_ctx.stringValue("QueryEdgeInstanceHistoricDeploymentResponse.RequestId"));
		queryEdgeInstanceHistoricDeploymentResponse.setCode(_ctx.stringValue("QueryEdgeInstanceHistoricDeploymentResponse.Code"));
		queryEdgeInstanceHistoricDeploymentResponse.setErrorMessage(_ctx.stringValue("QueryEdgeInstanceHistoricDeploymentResponse.ErrorMessage"));
		queryEdgeInstanceHistoricDeploymentResponse.setSuccess(_ctx.booleanValue("QueryEdgeInstanceHistoricDeploymentResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.Total"));

		List<Deployment> deploymentList = new ArrayList<Deployment>();
		for (int i = 0; i < _ctx.lengthValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.DeploymentList.Length"); i++) {
			Deployment deployment = new Deployment();
			deployment.setGmtCreateTimestamp(_ctx.longValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.DeploymentList["+ i +"].GmtCreateTimestamp"));
			deployment.setType(_ctx.stringValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.DeploymentList["+ i +"].Type"));
			deployment.setStatus(_ctx.integerValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.DeploymentList["+ i +"].Status"));
			deployment.setDeploymentId(_ctx.stringValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.DeploymentList["+ i +"].DeploymentId"));
			deployment.setDescription(_ctx.stringValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.DeploymentList["+ i +"].Description"));
			deployment.setGmtModifiedTimestamp(_ctx.longValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.DeploymentList["+ i +"].GmtModifiedTimestamp"));
			deployment.setGmtCompleted(_ctx.stringValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.DeploymentList["+ i +"].GmtCompleted"));
			deployment.setGmtCreate(_ctx.stringValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.DeploymentList["+ i +"].GmtCreate"));
			deployment.setGmtCompletedTimestamp(_ctx.longValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.DeploymentList["+ i +"].GmtCompletedTimestamp"));
			deployment.setGmtModified(_ctx.stringValue("QueryEdgeInstanceHistoricDeploymentResponse.Data.DeploymentList["+ i +"].GmtModified"));

			deploymentList.add(deployment);
		}
		data.setDeploymentList(deploymentList);
		queryEdgeInstanceHistoricDeploymentResponse.setData(data);
	 
	 	return queryEdgeInstanceHistoricDeploymentResponse;
	}
}