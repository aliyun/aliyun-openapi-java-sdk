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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetFullRequestSampleByInstanceIdResponse;
import com.aliyuncs.das.model.v20200116.GetFullRequestSampleByInstanceIdResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFullRequestSampleByInstanceIdResponseUnmarshaller {

	public static GetFullRequestSampleByInstanceIdResponse unmarshall(GetFullRequestSampleByInstanceIdResponse getFullRequestSampleByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		getFullRequestSampleByInstanceIdResponse.setRequestId(_ctx.stringValue("GetFullRequestSampleByInstanceIdResponse.RequestId"));
		getFullRequestSampleByInstanceIdResponse.setMessage(_ctx.stringValue("GetFullRequestSampleByInstanceIdResponse.Message"));
		getFullRequestSampleByInstanceIdResponse.setCode(_ctx.longValue("GetFullRequestSampleByInstanceIdResponse.Code"));
		getFullRequestSampleByInstanceIdResponse.setSuccess(_ctx.booleanValue("GetFullRequestSampleByInstanceIdResponse.Success"));

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("GetFullRequestSampleByInstanceIdResponse.Data.Length"); i++) {
			Item item = new Item();
			item.setTimestamp(_ctx.longValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].Timestamp"));
			item.setSqlId(_ctx.stringValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].SqlId"));
			item.setSql(_ctx.stringValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].Sql"));
			item.setDatabase(_ctx.stringValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].Database"));
			item.setRt(_ctx.doubleValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].Rt"));
			item.setUser(_ctx.stringValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].User"));
			item.setLockWaitTime(_ctx.doubleValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].LockWaitTime"));
			item.setLogicalRead(_ctx.doubleValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].LogicalRead"));
			item.setPhysicalSyncRead(_ctx.doubleValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].PhysicalSyncRead"));
			item.setPhysicalAsyncRead(_ctx.doubleValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].PhysicalAsyncRead"));
			item.setRowsExamined(_ctx.longValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].RowsExamined"));
			item.setRowsReturned(_ctx.longValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].RowsReturned"));
			item.setOriginHost(_ctx.stringValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].OriginHost"));
			item.setScanRows(_ctx.longValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].ScanRows"));
			item.setUpdateRows(_ctx.longValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].UpdateRows"));
			item.setSqlType(_ctx.stringValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].SqlType"));
			item.setScnt(_ctx.longValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].Scnt"));
			item.setRows(_ctx.longValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].Rows"));
			item.setFrows(_ctx.longValue("GetFullRequestSampleByInstanceIdResponse.Data["+ i +"].Frows"));

			data.add(item);
		}
		getFullRequestSampleByInstanceIdResponse.setData(data);
	 
	 	return getFullRequestSampleByInstanceIdResponse;
	}
}