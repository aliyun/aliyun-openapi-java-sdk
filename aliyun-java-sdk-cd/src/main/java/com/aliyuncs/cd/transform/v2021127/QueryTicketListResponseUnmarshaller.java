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

package com.aliyuncs.cd.transform.v2021127;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cd.model.v2021127.QueryTicketListResponse;
import com.aliyuncs.cd.model.v2021127.QueryTicketListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTicketListResponseUnmarshaller {

	public static QueryTicketListResponse unmarshall(QueryTicketListResponse queryTicketListResponse, UnmarshallerContext _ctx) {
		
		queryTicketListResponse.setRequestId(_ctx.stringValue("QueryTicketListResponse.RequestId"));
		queryTicketListResponse.setSuccess(_ctx.booleanValue("QueryTicketListResponse.Success"));
		queryTicketListResponse.setMessage(_ctx.stringValue("QueryTicketListResponse.Message"));
		queryTicketListResponse.setCode(_ctx.stringValue("QueryTicketListResponse.Code"));
		queryTicketListResponse.setHttpStatusCode(_ctx.integerValue("QueryTicketListResponse.HttpStatusCode"));
		queryTicketListResponse.setTotalCount(_ctx.longValue("QueryTicketListResponse.TotalCount"));
		queryTicketListResponse.setPageNumber(_ctx.integerValue("QueryTicketListResponse.PageNumber"));
		queryTicketListResponse.setPageSize(_ctx.integerValue("QueryTicketListResponse.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTicketListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTicketId(_ctx.stringValue("QueryTicketListResponse.Data["+ i +"].TicketId"));
			dataItem.setDeviceSn(_ctx.stringValue("QueryTicketListResponse.Data["+ i +"].DeviceSn"));
			dataItem.setDeviceAlias(_ctx.stringValue("QueryTicketListResponse.Data["+ i +"].DeviceAlias"));
			dataItem.setShopName(_ctx.stringValue("QueryTicketListResponse.Data["+ i +"].ShopName"));
			dataItem.setShopId(_ctx.stringValue("QueryTicketListResponse.Data["+ i +"].ShopId"));
			dataItem.setTicketType(_ctx.stringValue("QueryTicketListResponse.Data["+ i +"].TicketType"));
			dataItem.setStatus(_ctx.integerValue("QueryTicketListResponse.Data["+ i +"].Status"));
			dataItem.setSubmitDate(_ctx.longValue("QueryTicketListResponse.Data["+ i +"].SubmitDate"));
			dataItem.setUpdateDate(_ctx.longValue("QueryTicketListResponse.Data["+ i +"].UpdateDate"));

			data.add(dataItem);
		}
		queryTicketListResponse.setData(data);
	 
	 	return queryTicketListResponse;
	}
}