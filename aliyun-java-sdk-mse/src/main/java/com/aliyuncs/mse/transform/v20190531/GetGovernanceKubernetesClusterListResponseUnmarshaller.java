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

import com.aliyuncs.mse.model.v20190531.GetGovernanceKubernetesClusterListResponse;
import com.aliyuncs.mse.model.v20190531.GetGovernanceKubernetesClusterListResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetGovernanceKubernetesClusterListResponse.Data.ClusterList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGovernanceKubernetesClusterListResponseUnmarshaller {

	public static GetGovernanceKubernetesClusterListResponse unmarshall(GetGovernanceKubernetesClusterListResponse getGovernanceKubernetesClusterListResponse, UnmarshallerContext _ctx) {
		
		getGovernanceKubernetesClusterListResponse.setRequestId(_ctx.stringValue("GetGovernanceKubernetesClusterListResponse.RequestId"));
		getGovernanceKubernetesClusterListResponse.setHttpStatusCode(_ctx.integerValue("GetGovernanceKubernetesClusterListResponse.HttpStatusCode"));
		getGovernanceKubernetesClusterListResponse.setMessage(_ctx.stringValue("GetGovernanceKubernetesClusterListResponse.Message"));
		getGovernanceKubernetesClusterListResponse.setCode(_ctx.integerValue("GetGovernanceKubernetesClusterListResponse.Code"));
		getGovernanceKubernetesClusterListResponse.setSuccess(_ctx.booleanValue("GetGovernanceKubernetesClusterListResponse.Success"));

		Data data = new Data();
		data.setTotalSize(_ctx.integerValue("GetGovernanceKubernetesClusterListResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("GetGovernanceKubernetesClusterListResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetGovernanceKubernetesClusterListResponse.Data.PageSize"));

		List<ClusterList> result = new ArrayList<ClusterList>();
		for (int i = 0; i < _ctx.lengthValue("GetGovernanceKubernetesClusterListResponse.Data.Result.Length"); i++) {
			ClusterList clusterList = new ClusterList();
			clusterList.setClusterName(_ctx.stringValue("GetGovernanceKubernetesClusterListResponse.Data.Result["+ i +"].ClusterName"));
			clusterList.setClusterId(_ctx.stringValue("GetGovernanceKubernetesClusterListResponse.Data.Result["+ i +"].ClusterId"));
			clusterList.setRegion(_ctx.stringValue("GetGovernanceKubernetesClusterListResponse.Data.Result["+ i +"].Region"));
			clusterList.setK8sVersion(_ctx.stringValue("GetGovernanceKubernetesClusterListResponse.Data.Result["+ i +"].K8sVersion"));
			clusterList.setNamespaceInfos(_ctx.stringValue("GetGovernanceKubernetesClusterListResponse.Data.Result["+ i +"].NamespaceInfos"));
			clusterList.setPilotStartTime(_ctx.stringValue("GetGovernanceKubernetesClusterListResponse.Data.Result["+ i +"].PilotStartTime"));

			result.add(clusterList);
		}
		data.setResult(result);
		getGovernanceKubernetesClusterListResponse.setData(data);
	 
	 	return getGovernanceKubernetesClusterListResponse;
	}
}