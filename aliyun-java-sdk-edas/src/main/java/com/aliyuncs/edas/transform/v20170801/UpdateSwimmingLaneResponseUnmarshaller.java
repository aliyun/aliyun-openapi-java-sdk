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

import com.aliyuncs.edas.model.v20170801.UpdateSwimmingLaneResponse;
import com.aliyuncs.edas.model.v20170801.UpdateSwimmingLaneResponse.Data;
import com.aliyuncs.edas.model.v20170801.UpdateSwimmingLaneResponse.Data.SwimmingLaneAppRelationShip;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSwimmingLaneResponseUnmarshaller {

	public static UpdateSwimmingLaneResponse unmarshall(UpdateSwimmingLaneResponse updateSwimmingLaneResponse, UnmarshallerContext _ctx) {
		
		updateSwimmingLaneResponse.setRequestId(_ctx.stringValue("UpdateSwimmingLaneResponse.RequestId"));
		updateSwimmingLaneResponse.setCode(_ctx.integerValue("UpdateSwimmingLaneResponse.Code"));
		updateSwimmingLaneResponse.setMessage(_ctx.stringValue("UpdateSwimmingLaneResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.longValue("UpdateSwimmingLaneResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateSwimmingLaneResponse.Data.Name"));
		data.setTag(_ctx.stringValue("UpdateSwimmingLaneResponse.Data.Tag"));
		data.setNamespaceId(_ctx.stringValue("UpdateSwimmingLaneResponse.Data.NamespaceId"));
		data.setGroupId(_ctx.longValue("UpdateSwimmingLaneResponse.Data.GroupId"));
		data.setEntryRule(_ctx.stringValue("UpdateSwimmingLaneResponse.Data.EntryRule"));

		List<SwimmingLaneAppRelationShip> swimmingLaneAppRelationShipList = new ArrayList<SwimmingLaneAppRelationShip>();
		for (int i = 0; i < _ctx.lengthValue("UpdateSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList.Length"); i++) {
			SwimmingLaneAppRelationShip swimmingLaneAppRelationShip = new SwimmingLaneAppRelationShip();
			swimmingLaneAppRelationShip.setLaneId(_ctx.longValue("UpdateSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].LaneId"));
			swimmingLaneAppRelationShip.setAppId(_ctx.stringValue("UpdateSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].AppId"));
			swimmingLaneAppRelationShip.setRules(_ctx.stringValue("UpdateSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].Rules"));
			swimmingLaneAppRelationShip.setAppName(_ctx.stringValue("UpdateSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].AppName"));

			swimmingLaneAppRelationShipList.add(swimmingLaneAppRelationShip);
		}
		data.setSwimmingLaneAppRelationShipList(swimmingLaneAppRelationShipList);
		updateSwimmingLaneResponse.setData(data);
	 
	 	return updateSwimmingLaneResponse;
	}
}