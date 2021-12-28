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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QueryGovernanceKubernetesClusterResponse;
import com.aliyuncs.mse.model.v20190531.QueryGovernanceKubernetesClusterResponse.Data;
import com.aliyuncs.mse.model.v20190531.QueryGovernanceKubernetesClusterResponse.Data.ClusterList;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGovernanceKubernetesClusterResponseUnmarshaller {

	public static QueryGovernanceKubernetesClusterResponse unmarshall(QueryGovernanceKubernetesClusterResponse queryGovernanceKubernetesClusterResponse, UnmarshallerContext _ctx) {
		
		queryGovernanceKubernetesClusterResponse.setRequestId(_ctx.stringValue("QueryGovernanceKubernetesClusterResponse.RequestId"));
		queryGovernanceKubernetesClusterResponse.setHttpStatusCode(_ctx.integerValue("QueryGovernanceKubernetesClusterResponse.HttpStatusCode"));
		queryGovernanceKubernetesClusterResponse.setMessage(_ctx.stringValue("QueryGovernanceKubernetesClusterResponse.Message"));
		queryGovernanceKubernetesClusterResponse.setCode(_ctx.integerValue("QueryGovernanceKubernetesClusterResponse.Code"));
		queryGovernanceKubernetesClusterResponse.setSuccess(_ctx.booleanValue("QueryGovernanceKubernetesClusterResponse.Success"));

		Data data = new Data();
		data.setTotalSize(_ctx.integerValue("QueryGovernanceKubernetesClusterResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("QueryGovernanceKubernetesClusterResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("QueryGovernanceKubernetesClusterResponse.Data.PageSize"));

		List<ClusterList> result = new ArrayList<ClusterList>();
		for (int i = 0; i < _ctx.lengthValue("QueryGovernanceKubernetesClusterResponse.Data.Result.Length"); i++) {
			ClusterList clusterList = new ClusterList();
			clusterList.setClusterName(_ctx.stringValue("QueryGovernanceKubernetesClusterResponse.Data.Result["+ i +"].ClusterName"));
			clusterList.setClusterId(_ctx.stringValue("QueryGovernanceKubernetesClusterResponse.Data.Result["+ i +"].ClusterId"));
			clusterList.setRegion(_ctx.stringValue("QueryGovernanceKubernetesClusterResponse.Data.Result["+ i +"].Region"));
			clusterList.setK8sVersion(_ctx.stringValue("QueryGovernanceKubernetesClusterResponse.Data.Result["+ i +"].K8sVersion"));
			clusterList.setNamespaceInfos(_ctx.stringValue("QueryGovernanceKubernetesClusterResponse.Data.Result["+ i +"].NamespaceInfos"));
			clusterList.setPilotStartTime(_ctx.stringValue("QueryGovernanceKubernetesClusterResponse.Data.Result["+ i +"].PilotStartTime"));

			result.add(clusterList);
		}
		data.setResult(result);
		queryGovernanceKubernetesClusterResponse.setData(data);
	 
	 	return queryGovernanceKubernetesClusterResponse;
	}
}