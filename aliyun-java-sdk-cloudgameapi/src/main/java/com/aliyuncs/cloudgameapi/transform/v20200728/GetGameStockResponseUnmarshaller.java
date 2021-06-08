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

package com.aliyuncs.cloudgameapi.transform.v20200728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudgameapi.model.v20200728.GetGameStockResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.GetGameStockResponse.DataList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGameStockResponseUnmarshaller {

	public static GetGameStockResponse unmarshall(GetGameStockResponse getGameStockResponse, UnmarshallerContext _ctx) {
		
		getGameStockResponse.setRequestId(_ctx.stringValue("GetGameStockResponse.RequestId"));
		getGameStockResponse.setGameId(_ctx.stringValue("GetGameStockResponse.GameId"));
		getGameStockResponse.setMessage(_ctx.stringValue("GetGameStockResponse.Message"));

		List<DataList> instanceStockList = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("GetGameStockResponse.InstanceStockList.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setInstanceId(_ctx.stringValue("GetGameStockResponse.InstanceStockList["+ i +"].InstanceId"));
			dataList.setReginName(_ctx.stringValue("GetGameStockResponse.InstanceStockList["+ i +"].ReginName"));
			dataList.setUserLevel(_ctx.longValue("GetGameStockResponse.InstanceStockList["+ i +"].UserLevel"));
			dataList.setInstanceSpec(_ctx.stringValue("GetGameStockResponse.InstanceStockList["+ i +"].InstanceSpec"));
			dataList.setAvailableSlots(_ctx.longValue("GetGameStockResponse.InstanceStockList["+ i +"].AvailableSlots"));

			instanceStockList.add(dataList);
		}
		getGameStockResponse.setInstanceStockList(instanceStockList);
	 
	 	return getGameStockResponse;
	}
}