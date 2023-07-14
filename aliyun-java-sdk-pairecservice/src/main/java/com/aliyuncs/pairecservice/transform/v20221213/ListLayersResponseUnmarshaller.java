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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListLayersResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListLayersResponse.LayersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLayersResponseUnmarshaller {

	public static ListLayersResponse unmarshall(ListLayersResponse listLayersResponse, UnmarshallerContext _ctx) {
		
		listLayersResponse.setRequestId(_ctx.stringValue("ListLayersResponse.RequestId"));
		listLayersResponse.setTotalCount(_ctx.longValue("ListLayersResponse.TotalCount"));

		List<LayersItem> layers = new ArrayList<LayersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLayersResponse.Layers.Length"); i++) {
			LayersItem layersItem = new LayersItem();
			layersItem.setLayerId(_ctx.stringValue("ListLayersResponse.Layers["+ i +"].LayerId"));
			layersItem.setLaboratoryId(_ctx.stringValue("ListLayersResponse.Layers["+ i +"].LaboratoryId"));
			layersItem.setSceneId(_ctx.stringValue("ListLayersResponse.Layers["+ i +"].SceneId"));
			layersItem.setName(_ctx.stringValue("ListLayersResponse.Layers["+ i +"].Name"));
			layersItem.setDescription(_ctx.stringValue("ListLayersResponse.Layers["+ i +"].Description"));

			layers.add(layersItem);
		}
		listLayersResponse.setLayers(layers);
	 
	 	return listLayersResponse;
	}
}