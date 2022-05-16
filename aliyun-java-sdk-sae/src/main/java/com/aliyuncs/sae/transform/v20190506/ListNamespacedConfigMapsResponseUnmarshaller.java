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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListNamespacedConfigMapsResponse;
import com.aliyuncs.sae.model.v20190506.ListNamespacedConfigMapsResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListNamespacedConfigMapsResponse.Data.ConfigMap;
import com.aliyuncs.sae.model.v20190506.ListNamespacedConfigMapsResponse.Data.ConfigMap.RelateApp;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNamespacedConfigMapsResponseUnmarshaller {

	public static ListNamespacedConfigMapsResponse unmarshall(ListNamespacedConfigMapsResponse listNamespacedConfigMapsResponse, UnmarshallerContext _ctx) {
		
		listNamespacedConfigMapsResponse.setRequestId(_ctx.stringValue("ListNamespacedConfigMapsResponse.RequestId"));
		listNamespacedConfigMapsResponse.setMessage(_ctx.stringValue("ListNamespacedConfigMapsResponse.Message"));
		listNamespacedConfigMapsResponse.setTraceId(_ctx.stringValue("ListNamespacedConfigMapsResponse.TraceId"));
		listNamespacedConfigMapsResponse.setErrorCode(_ctx.stringValue("ListNamespacedConfigMapsResponse.ErrorCode"));
		listNamespacedConfigMapsResponse.setCode(_ctx.stringValue("ListNamespacedConfigMapsResponse.Code"));
		listNamespacedConfigMapsResponse.setSuccess(_ctx.booleanValue("ListNamespacedConfigMapsResponse.Success"));

		Data data = new Data();

		List<ConfigMap> configMaps = new ArrayList<ConfigMap>();
		for (int i = 0; i < _ctx.lengthValue("ListNamespacedConfigMapsResponse.Data.ConfigMaps.Length"); i++) {
			ConfigMap configMap = new ConfigMap();
			configMap.setUpdateTime(_ctx.longValue("ListNamespacedConfigMapsResponse.Data.ConfigMaps["+ i +"].UpdateTime"));
			configMap.setData(_ctx.mapValue("ListNamespacedConfigMapsResponse.Data.ConfigMaps["+ i +"].Data"));
			configMap.setNamespaceId(_ctx.stringValue("ListNamespacedConfigMapsResponse.Data.ConfigMaps["+ i +"].NamespaceId"));
			configMap.setDescription(_ctx.stringValue("ListNamespacedConfigMapsResponse.Data.ConfigMaps["+ i +"].Description"));
			configMap.setCreateTime(_ctx.longValue("ListNamespacedConfigMapsResponse.Data.ConfigMaps["+ i +"].CreateTime"));
			configMap.setConfigMapId(_ctx.longValue("ListNamespacedConfigMapsResponse.Data.ConfigMaps["+ i +"].ConfigMapId"));
			configMap.setName(_ctx.stringValue("ListNamespacedConfigMapsResponse.Data.ConfigMaps["+ i +"].Name"));

			List<RelateApp> relateApps = new ArrayList<RelateApp>();
			for (int j = 0; j < _ctx.lengthValue("ListNamespacedConfigMapsResponse.Data.ConfigMaps["+ i +"].RelateApps.Length"); j++) {
				RelateApp relateApp = new RelateApp();
				relateApp.setAppName(_ctx.stringValue("ListNamespacedConfigMapsResponse.Data.ConfigMaps["+ i +"].RelateApps["+ j +"].AppName"));
				relateApp.setAppId(_ctx.stringValue("ListNamespacedConfigMapsResponse.Data.ConfigMaps["+ i +"].RelateApps["+ j +"].AppId"));

				relateApps.add(relateApp);
			}
			configMap.setRelateApps(relateApps);

			configMaps.add(configMap);
		}
		data.setConfigMaps(configMaps);
		listNamespacedConfigMapsResponse.setData(data);
	 
	 	return listNamespacedConfigMapsResponse;
	}
}