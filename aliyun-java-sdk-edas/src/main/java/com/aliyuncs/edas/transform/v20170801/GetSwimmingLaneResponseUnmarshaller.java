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

import com.aliyuncs.edas.model.v20170801.GetSwimmingLaneResponse;
import com.aliyuncs.edas.model.v20170801.GetSwimmingLaneResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetSwimmingLaneResponse.Data.SwimmingLaneAppRelationShip;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSwimmingLaneResponseUnmarshaller {

	public static GetSwimmingLaneResponse unmarshall(GetSwimmingLaneResponse getSwimmingLaneResponse, UnmarshallerContext _ctx) {
		
		getSwimmingLaneResponse.setRequestId(_ctx.stringValue("GetSwimmingLaneResponse.RequestId"));
		getSwimmingLaneResponse.setCode(_ctx.integerValue("GetSwimmingLaneResponse.Code"));
		getSwimmingLaneResponse.setMessage(_ctx.stringValue("GetSwimmingLaneResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.stringValue("GetSwimmingLaneResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetSwimmingLaneResponse.Data.Name"));
		data.setTag(_ctx.stringValue("GetSwimmingLaneResponse.Data.Tag"));
		data.setNamespaceId(_ctx.stringValue("GetSwimmingLaneResponse.Data.NamespaceId"));
		data.setGroupId(_ctx.longValue("GetSwimmingLaneResponse.Data.GroupId"));
		data.setEntryRule(_ctx.stringValue("GetSwimmingLaneResponse.Data.EntryRule"));
		data.setEnableRules(_ctx.booleanValue("GetSwimmingLaneResponse.Data.EnableRules"));

		List<SwimmingLaneAppRelationShip> swimmingLaneAppRelationShipList = new ArrayList<SwimmingLaneAppRelationShip>();
		for (int i = 0; i < _ctx.lengthValue("GetSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList.Length"); i++) {
			SwimmingLaneAppRelationShip swimmingLaneAppRelationShip = new SwimmingLaneAppRelationShip();
			swimmingLaneAppRelationShip.setLaneId(_ctx.longValue("GetSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].LaneId"));
			swimmingLaneAppRelationShip.setAppId(_ctx.stringValue("GetSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].AppId"));
			swimmingLaneAppRelationShip.setAppName(_ctx.stringValue("GetSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].AppName"));
			swimmingLaneAppRelationShip.setRules(_ctx.stringValue("GetSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].Rules"));

			swimmingLaneAppRelationShipList.add(swimmingLaneAppRelationShip);
		}
		data.setSwimmingLaneAppRelationShipList(swimmingLaneAppRelationShipList);
		getSwimmingLaneResponse.setData(data);
	 
	 	return getSwimmingLaneResponse;
	}
}