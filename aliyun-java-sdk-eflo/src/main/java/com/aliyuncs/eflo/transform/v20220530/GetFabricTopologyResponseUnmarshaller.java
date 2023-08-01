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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.GetFabricTopologyResponse;
import com.aliyuncs.eflo.model.v20220530.GetFabricTopologyResponse.Content;
import com.aliyuncs.eflo.model.v20220530.GetFabricTopologyResponse.Content.Layer;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFabricTopologyResponseUnmarshaller {

	public static GetFabricTopologyResponse unmarshall(GetFabricTopologyResponse getFabricTopologyResponse, UnmarshallerContext _ctx) {
		
		getFabricTopologyResponse.setRequestId(_ctx.stringValue("GetFabricTopologyResponse.RequestId"));
		getFabricTopologyResponse.setCode(_ctx.integerValue("GetFabricTopologyResponse.Code"));
		getFabricTopologyResponse.setMessage(_ctx.stringValue("GetFabricTopologyResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetFabricTopologyResponse.Content.RegionId"));
		content.setVpdId(_ctx.stringValue("GetFabricTopologyResponse.Content.VpdId"));

		List<Layer> topoInfo = new ArrayList<Layer>();
		for (int i = 0; i < _ctx.lengthValue("GetFabricTopologyResponse.Content.TopoInfo.Length"); i++) {
			Layer layer = new Layer();
			layer.setLayerType(_ctx.stringValue("GetFabricTopologyResponse.Content.TopoInfo["+ i +"].LayerType"));
			layer.setLayerName(_ctx.stringValue("GetFabricTopologyResponse.Content.TopoInfo["+ i +"].LayerName"));

			List<String> nextLayer = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetFabricTopologyResponse.Content.TopoInfo["+ i +"].NextLayer.Length"); j++) {
				nextLayer.add(_ctx.stringValue("GetFabricTopologyResponse.Content.TopoInfo["+ i +"].NextLayer["+ j +"]"));
			}
			layer.setNextLayer(nextLayer);

			topoInfo.add(layer);
		}
		content.setTopoInfo(topoInfo);
		getFabricTopologyResponse.setContent(content);
	 
	 	return getFabricTopologyResponse;
	}
}