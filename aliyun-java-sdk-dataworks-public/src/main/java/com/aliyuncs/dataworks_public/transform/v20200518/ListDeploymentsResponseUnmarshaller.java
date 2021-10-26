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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListDeploymentsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDeploymentsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListDeploymentsResponse.Data.Deployment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeploymentsResponseUnmarshaller {

	public static ListDeploymentsResponse unmarshall(ListDeploymentsResponse listDeploymentsResponse, UnmarshallerContext _ctx) {
		
		listDeploymentsResponse.setRequestId(_ctx.stringValue("ListDeploymentsResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.longValue("ListDeploymentsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListDeploymentsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("ListDeploymentsResponse.Data.TotalCount"));

		List<Deployment> deployments = new ArrayList<Deployment>();
		for (int i = 0; i < _ctx.lengthValue("ListDeploymentsResponse.Data.Deployments.Length"); i++) {
			Deployment deployment = new Deployment();
			deployment.setStatus(_ctx.integerValue("ListDeploymentsResponse.Data.Deployments["+ i +"].Status"));
			deployment.setErrorMessage(_ctx.integerValue("ListDeploymentsResponse.Data.Deployments["+ i +"].ErrorMessage"));
			deployment.setCreateTime(_ctx.longValue("ListDeploymentsResponse.Data.Deployments["+ i +"].CreateTime"));
			deployment.setExecutor(_ctx.stringValue("ListDeploymentsResponse.Data.Deployments["+ i +"].Executor"));
			deployment.setCreator(_ctx.stringValue("ListDeploymentsResponse.Data.Deployments["+ i +"].Creator"));
			deployment.setExecuteTime(_ctx.longValue("ListDeploymentsResponse.Data.Deployments["+ i +"].ExecuteTime"));
			deployment.setName(_ctx.stringValue("ListDeploymentsResponse.Data.Deployments["+ i +"].Name"));
			deployment.setId(_ctx.longValue("ListDeploymentsResponse.Data.Deployments["+ i +"].Id"));

			deployments.add(deployment);
		}
		data.setDeployments(deployments);
		listDeploymentsResponse.setData(data);
	 
	 	return listDeploymentsResponse;
	}
}