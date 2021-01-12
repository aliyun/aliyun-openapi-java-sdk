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

import com.aliyuncs.edas.model.v20170801.InsertSwimmingLaneResponse;
import com.aliyuncs.edas.model.v20170801.InsertSwimmingLaneResponse.Data;
import com.aliyuncs.edas.model.v20170801.InsertSwimmingLaneResponse.Data.SwimmingLaneAppRelationShip;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertSwimmingLaneResponseUnmarshaller {

	public static InsertSwimmingLaneResponse unmarshall(InsertSwimmingLaneResponse insertSwimmingLaneResponse, UnmarshallerContext _ctx) {
		
		insertSwimmingLaneResponse.setRequestId(_ctx.stringValue("InsertSwimmingLaneResponse.RequestId"));
		insertSwimmingLaneResponse.setCode(_ctx.integerValue("InsertSwimmingLaneResponse.Code"));
		insertSwimmingLaneResponse.setMessage(_ctx.stringValue("InsertSwimmingLaneResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.longValue("InsertSwimmingLaneResponse.Data.Id"));
		data.setName(_ctx.stringValue("InsertSwimmingLaneResponse.Data.Name"));
		data.setTag(_ctx.stringValue("InsertSwimmingLaneResponse.Data.Tag"));
		data.setNamespaceId(_ctx.stringValue("InsertSwimmingLaneResponse.Data.NamespaceId"));
		data.setGroupId(_ctx.longValue("InsertSwimmingLaneResponse.Data.GroupId"));
		data.setEntryRule(_ctx.stringValue("InsertSwimmingLaneResponse.Data.EntryRule"));
		data.setAppInfos(_ctx.stringValue("InsertSwimmingLaneResponse.Data.AppInfos"));

		List<SwimmingLaneAppRelationShip> swimmingLaneAppRelationShipList = new ArrayList<SwimmingLaneAppRelationShip>();
		for (int i = 0; i < _ctx.lengthValue("InsertSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList.Length"); i++) {
			SwimmingLaneAppRelationShip swimmingLaneAppRelationShip = new SwimmingLaneAppRelationShip();
			swimmingLaneAppRelationShip.setLaneId(_ctx.longValue("InsertSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].LaneId"));
			swimmingLaneAppRelationShip.setAppId(_ctx.stringValue("InsertSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].AppId"));
			swimmingLaneAppRelationShip.setRules(_ctx.stringValue("InsertSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].Rules"));
			swimmingLaneAppRelationShip.setAppName(_ctx.stringValue("InsertSwimmingLaneResponse.Data.SwimmingLaneAppRelationShipList["+ i +"].AppName"));

			swimmingLaneAppRelationShipList.add(swimmingLaneAppRelationShip);
		}
		data.setSwimmingLaneAppRelationShipList(swimmingLaneAppRelationShipList);
		insertSwimmingLaneResponse.setData(data);
	 
	 	return insertSwimmingLaneResponse;
	}
}