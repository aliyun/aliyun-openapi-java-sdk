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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.GetRepoTagLayersResponse;
import com.aliyuncs.cr.model.v20181201.GetRepoTagLayersResponse.LayersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepoTagLayersResponseUnmarshaller {

	public static GetRepoTagLayersResponse unmarshall(GetRepoTagLayersResponse getRepoTagLayersResponse, UnmarshallerContext _ctx) {
		
		getRepoTagLayersResponse.setRequestId(_ctx.stringValue("GetRepoTagLayersResponse.RequestId"));
		getRepoTagLayersResponse.setIsSuccess(_ctx.booleanValue("GetRepoTagLayersResponse.IsSuccess"));
		getRepoTagLayersResponse.setCode(_ctx.stringValue("GetRepoTagLayersResponse.Code"));

		List<LayersItem> layers = new ArrayList<LayersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRepoTagLayersResponse.Layers.Length"); i++) {
			LayersItem layersItem = new LayersItem();
			layersItem.setBlobDigest(_ctx.stringValue("GetRepoTagLayersResponse.Layers["+ i +"].BlobDigest"));
			layersItem.setBlobSize(_ctx.longValue("GetRepoTagLayersResponse.Layers["+ i +"].BlobSize"));
			layersItem.setLayerInstruction(_ctx.stringValue("GetRepoTagLayersResponse.Layers["+ i +"].LayerInstruction"));
			layersItem.setLayerCMD(_ctx.stringValue("GetRepoTagLayersResponse.Layers["+ i +"].LayerCMD"));
			layersItem.setLayerIndex(_ctx.integerValue("GetRepoTagLayersResponse.Layers["+ i +"].LayerIndex"));

			layers.add(layersItem);
		}
		getRepoTagLayersResponse.setLayers(layers);
	 
	 	return getRepoTagLayersResponse;
	}
}