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

import com.aliyuncs.pairecservice.model.v20221213.ListScenesResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListScenesResponse.ScenesItem;
import com.aliyuncs.pairecservice.model.v20221213.ListScenesResponse.ScenesItem.FlowsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScenesResponseUnmarshaller {

	public static ListScenesResponse unmarshall(ListScenesResponse listScenesResponse, UnmarshallerContext _ctx) {
		
		listScenesResponse.setRequestId(_ctx.stringValue("ListScenesResponse.RequestId"));
		listScenesResponse.setTotalCount(_ctx.longValue("ListScenesResponse.TotalCount"));

		List<ScenesItem> scenes = new ArrayList<ScenesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListScenesResponse.Scenes.Length"); i++) {
			ScenesItem scenesItem = new ScenesItem();
			scenesItem.setSceneId(_ctx.stringValue("ListScenesResponse.Scenes["+ i +"].SceneId"));
			scenesItem.setName(_ctx.stringValue("ListScenesResponse.Scenes["+ i +"].Name"));
			scenesItem.setDescription(_ctx.stringValue("ListScenesResponse.Scenes["+ i +"].Description"));

			List<FlowsItem> flows = new ArrayList<FlowsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListScenesResponse.Scenes["+ i +"].Flows.Length"); j++) {
				FlowsItem flowsItem = new FlowsItem();
				flowsItem.setFlowName(_ctx.stringValue("ListScenesResponse.Scenes["+ i +"].Flows["+ j +"].FlowName"));
				flowsItem.setFlowCode(_ctx.stringValue("ListScenesResponse.Scenes["+ i +"].Flows["+ j +"].FlowCode"));

				flows.add(flowsItem);
			}
			scenesItem.setFlows(flows);

			scenes.add(scenesItem);
		}
		listScenesResponse.setScenes(scenes);
	 
	 	return listScenesResponse;
	}
}