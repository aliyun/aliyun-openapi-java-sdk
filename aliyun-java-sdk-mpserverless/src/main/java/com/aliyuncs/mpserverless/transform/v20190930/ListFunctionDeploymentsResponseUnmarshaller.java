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

package com.aliyuncs.mpserverless.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpserverless.model.v20190930.ListFunctionDeploymentsResponse;
import com.aliyuncs.mpserverless.model.v20190930.ListFunctionDeploymentsResponse.DeploymentsItem;
import com.aliyuncs.mpserverless.model.v20190930.ListFunctionDeploymentsResponse.DeploymentsItem.DeploymentStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionDeploymentsResponseUnmarshaller {

	public static ListFunctionDeploymentsResponse unmarshall(ListFunctionDeploymentsResponse listFunctionDeploymentsResponse, UnmarshallerContext _ctx) {
		
		listFunctionDeploymentsResponse.setRequestId(_ctx.stringValue("ListFunctionDeploymentsResponse.RequestId"));
		listFunctionDeploymentsResponse.setHttpStatusCode(_ctx.stringValue("ListFunctionDeploymentsResponse.HttpStatusCode"));
		listFunctionDeploymentsResponse.setSuccess(_ctx.booleanValue("ListFunctionDeploymentsResponse.Success"));
		listFunctionDeploymentsResponse.setCode(_ctx.stringValue("ListFunctionDeploymentsResponse.Code"));
		listFunctionDeploymentsResponse.setMessage(_ctx.stringValue("ListFunctionDeploymentsResponse.Message"));
		listFunctionDeploymentsResponse.setCode1(_ctx.stringValue("ListFunctionDeploymentsResponse.Code"));
		listFunctionDeploymentsResponse.setMessage2(_ctx.stringValue("ListFunctionDeploymentsResponse.Message"));
		listFunctionDeploymentsResponse.setPageSize(_ctx.integerValue("ListFunctionDeploymentsResponse.PageSize"));
		listFunctionDeploymentsResponse.setPageNumber(_ctx.integerValue("ListFunctionDeploymentsResponse.PageNumber"));
		listFunctionDeploymentsResponse.setTotalCount(_ctx.integerValue("ListFunctionDeploymentsResponse.TotalCount"));

		List<DeploymentsItem> deployments = new ArrayList<DeploymentsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionDeploymentsResponse.Deployments.Length"); i++) {
			DeploymentsItem deploymentsItem = new DeploymentsItem();
			deploymentsItem.setDeploymentId(_ctx.stringValue("ListFunctionDeploymentsResponse.Deployments["+ i +"].DeploymentId"));
			deploymentsItem.setDeploymentVersion(_ctx.stringValue("ListFunctionDeploymentsResponse.Deployments["+ i +"].DeploymentVersion"));
			deploymentsItem.setArtifactDownloadUrl(_ctx.stringValue("ListFunctionDeploymentsResponse.Deployments["+ i +"].ArtifactDownloadUrl"));
			deploymentsItem.setCreateTime(_ctx.stringValue("ListFunctionDeploymentsResponse.Deployments["+ i +"].CreateTime"));
			deploymentsItem.setUpdateTime(_ctx.stringValue("ListFunctionDeploymentsResponse.Deployments["+ i +"].UpdateTime"));

			DeploymentStatus deploymentStatus = new DeploymentStatus();
			deploymentStatus.setMessage(_ctx.stringValue("ListFunctionDeploymentsResponse.Deployments["+ i +"].DeploymentStatus.Message"));
			deploymentStatus.setStatus(_ctx.stringValue("ListFunctionDeploymentsResponse.Deployments["+ i +"].DeploymentStatus.Status"));
			deploymentStatus.setLabel(_ctx.stringValue("ListFunctionDeploymentsResponse.Deployments["+ i +"].DeploymentStatus.Label"));
			deploymentsItem.setDeploymentStatus(deploymentStatus);

			deployments.add(deploymentsItem);
		}
		listFunctionDeploymentsResponse.setDeployments(deployments);
	 
	 	return listFunctionDeploymentsResponse;
	}
}