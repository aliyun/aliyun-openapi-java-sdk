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

import com.aliyuncs.edas.model.v20170801.ListSwimmingLaneResponse;
import com.aliyuncs.edas.model.v20170801.ListSwimmingLaneResponse.SwimmingLane;
import com.aliyuncs.edas.model.v20170801.ListSwimmingLaneResponse.SwimmingLane.SwimmingLaneAppRelationShip;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSwimmingLaneResponseUnmarshaller {

	public static ListSwimmingLaneResponse unmarshall(ListSwimmingLaneResponse listSwimmingLaneResponse, UnmarshallerContext _ctx) {
		
		listSwimmingLaneResponse.setRequestId(_ctx.stringValue("ListSwimmingLaneResponse.RequestId"));
		listSwimmingLaneResponse.setCode(_ctx.integerValue("ListSwimmingLaneResponse.Code"));
		listSwimmingLaneResponse.setMessage(_ctx.stringValue("ListSwimmingLaneResponse.Message"));

		List<SwimmingLane> data = new ArrayList<SwimmingLane>();
		for (int i = 0; i < _ctx.lengthValue("ListSwimmingLaneResponse.Data.Length"); i++) {
			SwimmingLane swimmingLane = new SwimmingLane();
			swimmingLane.setId(_ctx.longValue("ListSwimmingLaneResponse.Data["+ i +"].Id"));
			swimmingLane.setName(_ctx.stringValue("ListSwimmingLaneResponse.Data["+ i +"].Name"));
			swimmingLane.setTag(_ctx.stringValue("ListSwimmingLaneResponse.Data["+ i +"].Tag"));
			swimmingLane.setNamespaceId(_ctx.stringValue("ListSwimmingLaneResponse.Data["+ i +"].NamespaceId"));
			swimmingLane.setGroupId(_ctx.longValue("ListSwimmingLaneResponse.Data["+ i +"].GroupId"));
			swimmingLane.setEntryRule(_ctx.stringValue("ListSwimmingLaneResponse.Data["+ i +"].EntryRule"));
			swimmingLane.setEnableRules(_ctx.booleanValue("ListSwimmingLaneResponse.Data["+ i +"].EnableRules"));
			swimmingLane.setScenarioSign(_ctx.stringValue("ListSwimmingLaneResponse.Data["+ i +"].ScenarioSign"));

			List<SwimmingLaneAppRelationShip> swimmingLaneAppRelationShipList = new ArrayList<SwimmingLaneAppRelationShip>();
			for (int j = 0; j < _ctx.lengthValue("ListSwimmingLaneResponse.Data["+ i +"].SwimmingLaneAppRelationShipList.Length"); j++) {
				SwimmingLaneAppRelationShip swimmingLaneAppRelationShip = new SwimmingLaneAppRelationShip();
				swimmingLaneAppRelationShip.setLaneId(_ctx.longValue("ListSwimmingLaneResponse.Data["+ i +"].SwimmingLaneAppRelationShipList["+ j +"].LaneId"));
				swimmingLaneAppRelationShip.setAppId(_ctx.stringValue("ListSwimmingLaneResponse.Data["+ i +"].SwimmingLaneAppRelationShipList["+ j +"].AppId"));
				swimmingLaneAppRelationShip.setAppName(_ctx.stringValue("ListSwimmingLaneResponse.Data["+ i +"].SwimmingLaneAppRelationShipList["+ j +"].AppName"));
				swimmingLaneAppRelationShip.setRules(_ctx.stringValue("ListSwimmingLaneResponse.Data["+ i +"].SwimmingLaneAppRelationShipList["+ j +"].Rules"));

				swimmingLaneAppRelationShipList.add(swimmingLaneAppRelationShip);
			}
			swimmingLane.setSwimmingLaneAppRelationShipList(swimmingLaneAppRelationShipList);

			data.add(swimmingLane);
		}
		listSwimmingLaneResponse.setData(data);
	 
	 	return listSwimmingLaneResponse;
	}
}