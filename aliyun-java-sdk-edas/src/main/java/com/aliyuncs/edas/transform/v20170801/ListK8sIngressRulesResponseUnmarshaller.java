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

import com.aliyuncs.edas.model.v20170801.ListK8sIngressRulesResponse;
import com.aliyuncs.edas.model.v20170801.ListK8sIngressRulesResponse.DataItem;
import com.aliyuncs.edas.model.v20170801.ListK8sIngressRulesResponse.DataItem.IngressConfsItem;
import com.aliyuncs.edas.model.v20170801.ListK8sIngressRulesResponse.DataItem.IngressConfsItem.RulesItem;
import com.aliyuncs.edas.model.v20170801.ListK8sIngressRulesResponse.DataItem.IngressConfsItem.RulesItem.PathsItem;
import com.aliyuncs.edas.model.v20170801.ListK8sIngressRulesResponse.DataItem.IngressConfsItem.RulesItem.PathsItem.Backend;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListK8sIngressRulesResponseUnmarshaller {

	public static ListK8sIngressRulesResponse unmarshall(ListK8sIngressRulesResponse listK8sIngressRulesResponse, UnmarshallerContext _ctx) {
		
		listK8sIngressRulesResponse.setRequestId(_ctx.stringValue("ListK8sIngressRulesResponse.RequestId"));
		listK8sIngressRulesResponse.setCode(_ctx.integerValue("ListK8sIngressRulesResponse.Code"));
		listK8sIngressRulesResponse.setMessage(_ctx.stringValue("ListK8sIngressRulesResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListK8sIngressRulesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setClusterId(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].ClusterId"));
			dataItem.setClusterName(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].ClusterName"));
			dataItem.setRegionId(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].RegionId"));

			List<IngressConfsItem> ingressConfs = new ArrayList<IngressConfsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs.Length"); j++) {
				IngressConfsItem ingressConfsItem = new IngressConfsItem();
				ingressConfsItem.setName(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Name"));
				ingressConfsItem.setNamespace(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Namespace"));
				ingressConfsItem.setEndpoint(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Endpoint"));
				ingressConfsItem.setCreationTime(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].CreationTime"));
				ingressConfsItem.setDashboardUrl(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].DashboardUrl"));

				List<RulesItem> rules = new ArrayList<RulesItem>();
				for (int k = 0; k < _ctx.lengthValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Rules.Length"); k++) {
					RulesItem rulesItem = new RulesItem();
					rulesItem.setHost(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Rules["+ k +"].Host"));
					rulesItem.setSecretName(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Rules["+ k +"].SecretName"));

					List<PathsItem> paths = new ArrayList<PathsItem>();
					for (int l = 0; l < _ctx.lengthValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Rules["+ k +"].Paths.Length"); l++) {
						PathsItem pathsItem = new PathsItem();
						pathsItem.setPath(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Rules["+ k +"].Paths["+ l +"].Path"));
						pathsItem.setAppId(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Rules["+ k +"].Paths["+ l +"].AppId"));
						pathsItem.setAppName(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Rules["+ k +"].Paths["+ l +"].AppName"));
						pathsItem.setStatus(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Rules["+ k +"].Paths["+ l +"].Status"));

						Backend backend = new Backend();
						backend.setServiceName(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Rules["+ k +"].Paths["+ l +"].Backend.ServiceName"));
						backend.setServicePort(_ctx.stringValue("ListK8sIngressRulesResponse.Data["+ i +"].IngressConfs["+ j +"].Rules["+ k +"].Paths["+ l +"].Backend.ServicePort"));
						pathsItem.setBackend(backend);

						paths.add(pathsItem);
					}
					rulesItem.setPaths(paths);

					rules.add(rulesItem);
				}
				ingressConfsItem.setRules(rules);

				ingressConfs.add(ingressConfsItem);
			}
			dataItem.setIngressConfs(ingressConfs);

			data.add(dataItem);
		}
		listK8sIngressRulesResponse.setData(data);
	 
	 	return listK8sIngressRulesResponse;
	}
}