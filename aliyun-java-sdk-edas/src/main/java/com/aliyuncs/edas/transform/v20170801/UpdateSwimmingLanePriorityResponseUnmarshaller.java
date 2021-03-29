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

import com.aliyuncs.edas.model.v20170801.UpdateSwimmingLanePriorityResponse;
import com.aliyuncs.edas.model.v20170801.UpdateSwimmingLanePriorityResponse.Data;
import com.aliyuncs.edas.model.v20170801.UpdateSwimmingLanePriorityResponse.Data.SwimmingLaneAppRelationShip;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSwimmingLanePriorityResponseUnmarshaller {

	public static UpdateSwimmingLanePriorityResponse unmarshall(UpdateSwimmingLanePriorityResponse updateSwimmingLanePriorityResponse, UnmarshallerContext _ctx) {
		
		updateSwimmingLanePriorityResponse.setRequestId(_ctx.stringValue("UpdateSwimmingLanePriorityResponse.RequestId"));
		updateSwimmingLanePriorityResponse.setCode(_ctx.integerValue("UpdateSwimmingLanePriorityResponse.Code"));
		updateSwimmingLanePriorityResponse.setMessage(_ctx.stringValue("UpdateSwimmingLanePriorityResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.longValue("UpdateSwimmingLanePriorityResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateSwimmingLanePriorityResponse.Data.Name"));
		data.setTag(_ctx.stringValue("UpdateSwimmingLanePriorityResponse.Data.Tag"));
		data.setNamespaceId(_ctx.stringValue("UpdateSwimmingLanePriorityResponse.Data.NamespaceId"));
		data.setGroupId(_ctx.longValue("UpdateSwimmingLanePriorityResponse.Data.GroupId"));
		data.setEntryRule(_ctx.stringValue("UpdateSwimmingLanePriorityResponse.Data.EntryRule"));

		List<SwimmingLaneAppRelationShip> swimmingLaneAppRelationShipList = new ArrayList<SwimmingLaneAppRelationShip>();
		for (int i = 0; i < _ctx.lengthValue("UpdateSwimmingLanePriorityResponse.Data.SwimmingLaneAppRelationShipList.Length"); i++) {
			SwimmingLaneAppRelationShip swimmingLaneAppRelationShip = new SwimmingLaneAppRelationShip();
			swimmingLaneAppRelationShip.setLaneId(_ctx.longValue("UpdateSwimmingLanePriorityResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].LaneId"));
			swimmingLaneAppRelationShip.setAppId(_ctx.stringValue("UpdateSwimmingLanePriorityResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].AppId"));
			swimmingLaneAppRelationShip.setRules(_ctx.stringValue("UpdateSwimmingLanePriorityResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].Rules"));
			swimmingLaneAppRelationShip.setAppName(_ctx.stringValue("UpdateSwimmingLanePriorityResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].AppName"));

			swimmingLaneAppRelationShipList.add(swimmingLaneAppRelationShip);
		}
		data.setSwimmingLaneAppRelationShipList(swimmingLaneAppRelationShipList);
		updateSwimmingLanePriorityResponse.setData(data);
	 
	 	return updateSwimmingLanePriorityResponse;
	}
}