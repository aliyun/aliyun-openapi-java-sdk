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
import com.aliyuncs.edas.model.v20170801.ListK8sConfigMapsResponse.Result;
import com.aliyuncs.edas.model.v20170801.ListK8sConfigMapsResponse.Result.ConfigMapsItem;
import com.aliyuncs.edas.model.v20170801.ListK8sConfigMapsResponse.Result.ConfigMapsItem.DataItem;
import com.aliyuncs.edas.model.v20170801.ListK8sConfigMapsResponse.Result.ConfigMapsItem.RelatedAppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListK8sConfigMapsResponseUnmarshaller {

	public static ListK8sConfigMapsResponse unmarshall(ListK8sConfigMapsResponse listK8sConfigMapsResponse, UnmarshallerContext _ctx) {
		
		listK8sConfigMapsResponse.setRequestId(_ctx.stringValue("ListK8sConfigMapsResponse.RequestId"));
		listK8sConfigMapsResponse.setCode(_ctx.integerValue("ListK8sConfigMapsResponse.Code"));
		listK8sConfigMapsResponse.setMessage(_ctx.stringValue("ListK8sConfigMapsResponse.Message"));

		Result result = new Result();
		result.setTotal(_ctx.integerValue("ListK8sConfigMapsResponse.Result.Total"));

		List<ConfigMapsItem> configMaps = new ArrayList<ConfigMapsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListK8sConfigMapsResponse.Result.ConfigMaps.Length"); i++) {
			ConfigMapsItem configMapsItem = new ConfigMapsItem();
			configMapsItem.setCreationTime(_ctx.stringValue("ListK8sConfigMapsResponse.Result.ConfigMaps["+ i +"].CreationTime"));
			configMapsItem.setClusterName(_ctx.stringValue("ListK8sConfigMapsResponse.Result.ConfigMaps["+ i +"].ClusterName"));
			configMapsItem.setNamespace(_ctx.stringValue("ListK8sConfigMapsResponse.Result.ConfigMaps["+ i +"].Namespace"));
			configMapsItem.setName(_ctx.stringValue("ListK8sConfigMapsResponse.Result.ConfigMaps["+ i +"].Name"));
			configMapsItem.setClusterId(_ctx.stringValue("ListK8sConfigMapsResponse.Result.ConfigMaps["+ i +"].ClusterId"));

			List<DataItem> data = new ArrayList<DataItem>();
			for (int j = 0; j < _ctx.lengthValue("ListK8sConfigMapsResponse.Result.ConfigMaps["+ i +"].Data.Length"); j++) {
				DataItem dataItem = new DataItem();
				dataItem.setKey(_ctx.stringValue("ListK8sConfigMapsResponse.Result.ConfigMaps["+ i +"].Data["+ j +"].Key"));
				dataItem.setValue(_ctx.stringValue("ListK8sConfigMapsResponse.Result.ConfigMaps["+ i +"].Data["+ j +"].Value"));

				data.add(dataItem);
			}
			configMapsItem.setData(data);

			List<RelatedAppsItem> relatedApps = new ArrayList<RelatedAppsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListK8sConfigMapsResponse.Result.ConfigMaps["+ i +"].RelatedApps.Length"); j++) {
				RelatedAppsItem relatedAppsItem = new RelatedAppsItem();
				relatedAppsItem.setAppName(_ctx.stringValue("ListK8sConfigMapsResponse.Result.ConfigMaps["+ i +"].RelatedApps["+ j +"].AppName"));
				relatedAppsItem.setAppId(_ctx.stringValue("ListK8sConfigMapsResponse.Result.ConfigMaps["+ i +"].RelatedApps["+ j +"].AppId"));

				relatedApps.add(relatedAppsItem);
			}
			configMapsItem.setRelatedApps(relatedApps);

			configMaps.add(configMapsItem);
		}
		result.setConfigMaps(configMaps);
		listK8sConfigMapsResponse.setResult(result);
	 
	 	return listK8sConfigMapsResponse;
	}
}