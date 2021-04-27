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

import com.aliyuncs.edas.model.v20170801.ListK8sConfigMapsResponse;
import com.aliyuncs.edas.model.v20170801.ListK8sConfigMapsResponse.ResultItem;
import com.aliyuncs.edas.model.v20170801.ListK8sConfigMapsResponse.ResultItem.ConfigMapsItem;
import com.aliyuncs.edas.model.v20170801.ListK8sConfigMapsResponse.ResultItem.ConfigMapsItem.DataItem;
import com.aliyuncs.edas.model.v20170801.ListK8sConfigMapsResponse.ResultItem.ConfigMapsItem.RelatedAppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListK8sConfigMapsResponseUnmarshaller {

	public static ListK8sConfigMapsResponse unmarshall(ListK8sConfigMapsResponse listK8sConfigMapsResponse, UnmarshallerContext _ctx) {
		
		listK8sConfigMapsResponse.setRequestId(_ctx.stringValue("ListK8sConfigMapsResponse.RequestId"));
		listK8sConfigMapsResponse.setCode(_ctx.integerValue("ListK8sConfigMapsResponse.Code"));
		listK8sConfigMapsResponse.setMessage(_ctx.stringValue("ListK8sConfigMapsResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListK8sConfigMapsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTotal(_ctx.integerValue("ListK8sConfigMapsResponse.Result["+ i +"].Total"));

			List<ConfigMapsItem> configMaps = new ArrayList<ConfigMapsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps.Length"); j++) {
				ConfigMapsItem configMapsItem = new ConfigMapsItem();
				configMapsItem.setName(_ctx.stringValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps["+ j +"].Name"));
				configMapsItem.setNamespace(_ctx.stringValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps["+ j +"].Namespace"));
				configMapsItem.setClusterId(_ctx.stringValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps["+ j +"].ClusterId"));
				configMapsItem.setClusterName(_ctx.stringValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps["+ j +"].ClusterName"));
				configMapsItem.setCreationTime(_ctx.stringValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps["+ j +"].CreationTime"));

				List<DataItem> data = new ArrayList<DataItem>();
				for (int k = 0; k < _ctx.lengthValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps["+ j +"].Data.Length"); k++) {
					DataItem dataItem = new DataItem();
					dataItem.setKey(_ctx.stringValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps["+ j +"].Data["+ k +"].Key"));
					dataItem.setValue(_ctx.stringValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps["+ j +"].Data["+ k +"].Value"));

					data.add(dataItem);
				}
				configMapsItem.setData(data);

				List<RelatedAppsItem> relatedApps = new ArrayList<RelatedAppsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps["+ j +"].RelatedApps.Length"); k++) {
					RelatedAppsItem relatedAppsItem = new RelatedAppsItem();
					relatedAppsItem.setAppName(_ctx.stringValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps["+ j +"].RelatedApps["+ k +"].AppName"));
					relatedAppsItem.setAppId(_ctx.stringValue("ListK8sConfigMapsResponse.Result["+ i +"].ConfigMaps["+ j +"].RelatedApps["+ k +"].AppId"));

					relatedApps.add(relatedAppsItem);
				}
				configMapsItem.setRelatedApps(relatedApps);

				configMaps.add(configMapsItem);
			}
			resultItem.setConfigMaps(configMaps);

			result.add(resultItem);
		}
		listK8sConfigMapsResponse.setResult(result);
	 
	 	return listK8sConfigMapsResponse;
	}
}