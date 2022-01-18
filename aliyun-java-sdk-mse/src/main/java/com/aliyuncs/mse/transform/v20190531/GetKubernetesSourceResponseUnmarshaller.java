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

import com.aliyuncs.mse.model.v20190531.GetKubernetesSourceResponse;
import com.aliyuncs.mse.model.v20190531.GetKubernetesSourceResponse.K8sSources;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetKubernetesSourceResponseUnmarshaller {

	public static GetKubernetesSourceResponse unmarshall(GetKubernetesSourceResponse getKubernetesSourceResponse, UnmarshallerContext _ctx) {
		
		getKubernetesSourceResponse.setRequestId(_ctx.stringValue("GetKubernetesSourceResponse.RequestId"));
		getKubernetesSourceResponse.setHttpStatusCode(_ctx.integerValue("GetKubernetesSourceResponse.HttpStatusCode"));
		getKubernetesSourceResponse.setMessage(_ctx.stringValue("GetKubernetesSourceResponse.Message"));
		getKubernetesSourceResponse.setCode(_ctx.integerValue("GetKubernetesSourceResponse.Code"));
		getKubernetesSourceResponse.setSuccess(_ctx.booleanValue("GetKubernetesSourceResponse.Success"));

		List<K8sSources> data = new ArrayList<K8sSources>();
		for (int i = 0; i < _ctx.lengthValue("GetKubernetesSourceResponse.Data.Length"); i++) {
			K8sSources k8sSources = new K8sSources();
			k8sSources.setName(_ctx.stringValue("GetKubernetesSourceResponse.Data["+ i +"].Name"));
			k8sSources.setCluster(_ctx.stringValue("GetKubernetesSourceResponse.Data["+ i +"].Cluster"));

			data.add(k8sSources);
		}
		getKubernetesSourceResponse.setData(data);
	 
	 	return getKubernetesSourceResponse;
	}
}