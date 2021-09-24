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

import com.aliyuncs.mse.model.v20190531.CreateGovernanceKubernetesClusterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGovernanceKubernetesClusterResponseUnmarshaller {

	public static CreateGovernanceKubernetesClusterResponse unmarshall(CreateGovernanceKubernetesClusterResponse createGovernanceKubernetesClusterResponse, UnmarshallerContext _ctx) {
		
		createGovernanceKubernetesClusterResponse.setRequestId(_ctx.stringValue("CreateGovernanceKubernetesClusterResponse.RequestId"));
		createGovernanceKubernetesClusterResponse.setMessage(_ctx.stringValue("CreateGovernanceKubernetesClusterResponse.Message"));
		createGovernanceKubernetesClusterResponse.setData(_ctx.longValue("CreateGovernanceKubernetesClusterResponse.Data"));
		createGovernanceKubernetesClusterResponse.setCode(_ctx.integerValue("CreateGovernanceKubernetesClusterResponse.Code"));
		createGovernanceKubernetesClusterResponse.setSuccess(_ctx.stringValue("CreateGovernanceKubernetesClusterResponse.Success"));
		createGovernanceKubernetesClusterResponse.setHttpStatusCode(_ctx.integerValue("CreateGovernanceKubernetesClusterResponse.HttpStatusCode"));
	 
	 	return createGovernanceKubernetesClusterResponse;
	}
}