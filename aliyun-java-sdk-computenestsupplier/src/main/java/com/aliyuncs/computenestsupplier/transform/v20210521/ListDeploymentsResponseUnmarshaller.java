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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ListDeploymentsResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListDeploymentsResponse.Deployment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeploymentsResponseUnmarshaller {

	public static ListDeploymentsResponse unmarshall(ListDeploymentsResponse listDeploymentsResponse, UnmarshallerContext _ctx) {
		
		listDeploymentsResponse.setRequestId(_ctx.stringValue("ListDeploymentsResponse.RequestId"));
		listDeploymentsResponse.setTotalCount(_ctx.integerValue("ListDeploymentsResponse.TotalCount"));
		listDeploymentsResponse.setNextToken(_ctx.stringValue("ListDeploymentsResponse.NextToken"));
		listDeploymentsResponse.setMaxResults(_ctx.integerValue("ListDeploymentsResponse.MaxResults"));

		List<Deployment> deployments = new ArrayList<Deployment>();
		for (int i = 0; i < _ctx.lengthValue("ListDeploymentsResponse.Deployments.Length"); i++) {
			Deployment deployment = new Deployment();
			deployment.setDeploymentId(_ctx.stringValue("ListDeploymentsResponse.Deployments["+ i +"].DeploymentId"));
			deployment.setName(_ctx.stringValue("ListDeploymentsResponse.Deployments["+ i +"].Name"));
			deployment.setDeployType(_ctx.stringValue("ListDeploymentsResponse.Deployments["+ i +"].DeployType"));
			deployment.setServiceId(_ctx.stringValue("ListDeploymentsResponse.Deployments["+ i +"].ServiceId"));
			deployment.setDefaultVersion(_ctx.stringValue("ListDeploymentsResponse.Deployments["+ i +"].DefaultVersion"));

			deployments.add(deployment);
		}
		listDeploymentsResponse.setDeployments(deployments);
	 
	 	return listDeploymentsResponse;
	}
}