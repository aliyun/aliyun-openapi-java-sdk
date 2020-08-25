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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricMsgbinginginfoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricMsgbinginginfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricMsgbinginginfoResponseUnmarshaller {

	public static QueryLinkefabricFabricMsgbinginginfoResponse unmarshall(QueryLinkefabricFabricMsgbinginginfoResponse queryLinkefabricFabricMsgbinginginfoResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricMsgbinginginfoResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.RequestId"));
		queryLinkefabricFabricMsgbinginginfoResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.ResultCode"));
		queryLinkefabricFabricMsgbinginginfoResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.ResultMessage"));
		queryLinkefabricFabricMsgbinginginfoResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Message"));
		queryLinkefabricFabricMsgbinginginfoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricMsgbinginginfoResponse.ResponseStatusCode"));
		queryLinkefabricFabricMsgbinginginfoResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricMsgbinginginfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAction(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].Action"));
			dataItem.setAppName(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].AppName"));
			dataItem.setClusterName(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].ClusterName"));
			dataItem.setEventcode(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].Eventcode"));
			dataItem.setExchangeType(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].ExchangeType"));
			dataItem.setExpression(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].Expression"));
			dataItem.setFilterType(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].FilterType"));
			dataItem.setFilterValue(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].FilterValue"));
			dataItem.setGroup(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].Group"));
			dataItem.setPersistence(_ctx.booleanValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].Persistence"));
			dataItem.setRoomInfo(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].RoomInfo"));
			dataItem.setTopic(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].Topic"));
			dataItem.setZoneInfo(_ctx.stringValue("QueryLinkefabricFabricMsgbinginginfoResponse.Data["+ i +"].ZoneInfo"));

			data.add(dataItem);
		}
		queryLinkefabricFabricMsgbinginginfoResponse.setData(data);
	 
	 	return queryLinkefabricFabricMsgbinginginfoResponse;
	}
}