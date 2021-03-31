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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse;
import com.aliyuncs.edas.model.v20170801.ListK8sSecretsResponse.K8sSecretsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListK8sSecretsResponseUnmarshaller {

	public static ListK8sSecretsResponse unmarshall(ListK8sSecretsResponse listK8sSecretsResponse, UnmarshallerContext _ctx) {
		
		listK8sSecretsResponse.setRequestId(_ctx.stringValue("ListK8sSecretsResponse.RequestId"));
		listK8sSecretsResponse.setCode(_ctx.integerValue("ListK8sSecretsResponse.Code"));
		listK8sSecretsResponse.setMessage(_ctx.stringValue("ListK8sSecretsResponse.Message"));

		List<K8sSecretsItem> k8sSecrets = new ArrayList<K8sSecretsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListK8sSecretsResponse.K8sSecrets.Length"); i++) {
			K8sSecretsItem k8sSecretsItem = new K8sSecretsItem();
			k8sSecretsItem.setName(_ctx.stringValue("ListK8sSecretsResponse.K8sSecrets["+ i +"].Name"));
			k8sSecretsItem.setNamespace(_ctx.stringValue("ListK8sSecretsResponse.K8sSecrets["+ i +"].Namespace"));
			k8sSecretsItem.setCreationTime(_ctx.stringValue("ListK8sSecretsResponse.K8sSecrets["+ i +"].CreationTime"));
			k8sSecretsItem.setType(_ctx.stringValue("ListK8sSecretsResponse.K8sSecrets["+ i +"].Type"));

			k8sSecrets.add(k8sSecretsItem);
		}
		listK8sSecretsResponse.setK8sSecrets(k8sSecrets);
	 
	 	return listK8sSecretsResponse;
	}
}