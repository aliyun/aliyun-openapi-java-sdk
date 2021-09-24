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

import com.aliyuncs.mse.model.v20190531.GetGovernanceKubernetesClusterResponse;
import com.aliyuncs.mse.model.v20190531.GetGovernanceKubernetesClusterResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetGovernanceKubernetesClusterResponse.Data.KubernetesNamespace;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGovernanceKubernetesClusterResponseUnmarshaller {

	public static GetGovernanceKubernetesClusterResponse unmarshall(GetGovernanceKubernetesClusterResponse getGovernanceKubernetesClusterResponse, UnmarshallerContext _ctx) {
		
		getGovernanceKubernetesClusterResponse.setRequestId(_ctx.stringValue("GetGovernanceKubernetesClusterResponse.RequestId"));
		getGovernanceKubernetesClusterResponse.setHttpStatusCode(_ctx.integerValue("GetGovernanceKubernetesClusterResponse.HttpStatusCode"));
		getGovernanceKubernetesClusterResponse.setMessage(_ctx.stringValue("GetGovernanceKubernetesClusterResponse.Message"));
		getGovernanceKubernetesClusterResponse.setCode(_ctx.integerValue("GetGovernanceKubernetesClusterResponse.Code"));
		getGovernanceKubernetesClusterResponse.setSuccess(_ctx.booleanValue("GetGovernanceKubernetesClusterResponse.Success"));

		Data data = new Data();
		data.setClusterId(_ctx.stringValue("GetGovernanceKubernetesClusterResponse.Data.ClusterId"));
		data.setClusterName(_ctx.stringValue("GetGovernanceKubernetesClusterResponse.Data.ClusterName"));
		data.setRegion(_ctx.stringValue("GetGovernanceKubernetesClusterResponse.Data.Region"));
		data.setK8sVersion(_ctx.stringValue("GetGovernanceKubernetesClusterResponse.Data.K8sVersion"));
		data.setNamespaceInfos(_ctx.stringValue("GetGovernanceKubernetesClusterResponse.Data.NamespaceInfos"));
		data.setPilotStartTime(_ctx.stringValue("GetGovernanceKubernetesClusterResponse.Data.PilotStartTime"));
		data.setUpdateTime(_ctx.stringValue("GetGovernanceKubernetesClusterResponse.Data.UpdateTime"));

		List<KubernetesNamespace> namespaces = new ArrayList<KubernetesNamespace>();
		for (int i = 0; i < _ctx.lengthValue("GetGovernanceKubernetesClusterResponse.Data.Namespaces.Length"); i++) {
			KubernetesNamespace kubernetesNamespace = new KubernetesNamespace();
			kubernetesNamespace.setName(_ctx.stringValue("GetGovernanceKubernetesClusterResponse.Data.Namespaces["+ i +"].Name"));
			kubernetesNamespace.setTags(_ctx.stringValue("GetGovernanceKubernetesClusterResponse.Data.Namespaces["+ i +"].Tags"));

			namespaces.add(kubernetesNamespace);
		}
		data.setNamespaces(namespaces);
		getGovernanceKubernetesClusterResponse.setData(data);
	 
	 	return getGovernanceKubernetesClusterResponse;
	}
}