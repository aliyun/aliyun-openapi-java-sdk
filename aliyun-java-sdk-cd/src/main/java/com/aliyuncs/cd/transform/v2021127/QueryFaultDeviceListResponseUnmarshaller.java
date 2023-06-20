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

import com.aliyuncs.cd.model.v2021127.QueryFaultDeviceListResponse;
import com.aliyuncs.cd.model.v2021127.QueryFaultDeviceListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaultDeviceListResponseUnmarshaller {

	public static QueryFaultDeviceListResponse unmarshall(QueryFaultDeviceListResponse queryFaultDeviceListResponse, UnmarshallerContext _ctx) {
		
		queryFaultDeviceListResponse.setRequestId(_ctx.stringValue("QueryFaultDeviceListResponse.RequestId"));
		queryFaultDeviceListResponse.setSuccess(_ctx.booleanValue("QueryFaultDeviceListResponse.Success"));
		queryFaultDeviceListResponse.setMessage(_ctx.stringValue("QueryFaultDeviceListResponse.Message"));
		queryFaultDeviceListResponse.setCode(_ctx.stringValue("QueryFaultDeviceListResponse.Code"));
		queryFaultDeviceListResponse.setHttpStatusCode(_ctx.integerValue("QueryFaultDeviceListResponse.HttpStatusCode"));
		queryFaultDeviceListResponse.setTotalCount(_ctx.longValue("QueryFaultDeviceListResponse.TotalCount"));
		queryFaultDeviceListResponse.setPageNumber(_ctx.integerValue("QueryFaultDeviceListResponse.PageNumber"));
		queryFaultDeviceListResponse.setPageSize(_ctx.integerValue("QueryFaultDeviceListResponse.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaultDeviceListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDeviceName(_ctx.stringValue("QueryFaultDeviceListResponse.Data["+ i +"].DeviceName"));
			dataItem.setBelongShop(_ctx.stringValue("QueryFaultDeviceListResponse.Data["+ i +"].BelongShop"));
			dataItem.setTicketNum(_ctx.stringValue("QueryFaultDeviceListResponse.Data["+ i +"].TicketNum"));
			dataItem.setDailyOnlineTime(_ctx.stringValue("QueryFaultDeviceListResponse.Data["+ i +"].DailyOnlineTime"));
			dataItem.setVersion(_ctx.stringValue("QueryFaultDeviceListResponse.Data["+ i +"].Version"));
			dataItem.setLastOnlineTime(_ctx.stringValue("QueryFaultDeviceListResponse.Data["+ i +"].LastOnlineTime"));
			dataItem.setFaultNum(_ctx.integerValue("QueryFaultDeviceListResponse.Data["+ i +"].FaultNum"));
			dataItem.setStatus(_ctx.stringValue("QueryFaultDeviceListResponse.Data["+ i +"].Status"));
			dataItem.setMac(_ctx.stringValue("QueryFaultDeviceListResponse.Data["+ i +"].Mac"));

			data.add(dataItem);
		}
		queryFaultDeviceListResponse.setData(data);
	 
	 	return queryFaultDeviceListResponse;
	}
}