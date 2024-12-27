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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListEnvironmentKubeResourcesResponse;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentKubeResourcesResponse.DataItem;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentKubeResourcesResponse.DataItem.Metadata;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvironmentKubeResourcesResponseUnmarshaller {

	public static ListEnvironmentKubeResourcesResponse unmarshall(ListEnvironmentKubeResourcesResponse listEnvironmentKubeResourcesResponse, UnmarshallerContext _ctx) {
		
		listEnvironmentKubeResourcesResponse.setRequestId(_ctx.stringValue("ListEnvironmentKubeResourcesResponse.RequestId"));
		listEnvironmentKubeResourcesResponse.setCode(_ctx.integerValue("ListEnvironmentKubeResourcesResponse.Code"));
		listEnvironmentKubeResourcesResponse.setSuccess(_ctx.booleanValue("ListEnvironmentKubeResourcesResponse.Success"));
		listEnvironmentKubeResourcesResponse.setMessage(_ctx.stringValue("ListEnvironmentKubeResourcesResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvironmentKubeResourcesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setApiVersion(_ctx.stringValue("ListEnvironmentKubeResourcesResponse.Data["+ i +"].ApiVersion"));
			dataItem.setKind(_ctx.stringValue("ListEnvironmentKubeResourcesResponse.Data["+ i +"].Kind"));

			Metadata metadata = new Metadata();
			metadata.setAnnotations(_ctx.mapValue("ListEnvironmentKubeResourcesResponse.Data["+ i +"].Metadata.Annotations"));
			metadata.setLabels(_ctx.mapValue("ListEnvironmentKubeResourcesResponse.Data["+ i +"].Metadata.Labels"));
			metadata.setName(_ctx.stringValue("ListEnvironmentKubeResourcesResponse.Data["+ i +"].Metadata.Name"));
			metadata.setNamespace(_ctx.stringValue("ListEnvironmentKubeResourcesResponse.Data["+ i +"].Metadata.Namespace"));
			dataItem.setMetadata(metadata);

			data.add(dataItem);
		}
		listEnvironmentKubeResourcesResponse.setData(data);
	 
	 	return listEnvironmentKubeResourcesResponse;
	}
}