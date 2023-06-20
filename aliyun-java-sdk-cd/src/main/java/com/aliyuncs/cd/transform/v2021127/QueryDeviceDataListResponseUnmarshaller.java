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

import com.aliyuncs.cd.model.v2021127.QueryDeviceDataListResponse;
import com.aliyuncs.cd.model.v2021127.QueryDeviceDataListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceDataListResponseUnmarshaller {

	public static QueryDeviceDataListResponse unmarshall(QueryDeviceDataListResponse queryDeviceDataListResponse, UnmarshallerContext _ctx) {
		
		queryDeviceDataListResponse.setRequestId(_ctx.stringValue("QueryDeviceDataListResponse.RequestId"));
		queryDeviceDataListResponse.setSuccess(_ctx.booleanValue("QueryDeviceDataListResponse.Success"));
		queryDeviceDataListResponse.setMessage(_ctx.stringValue("QueryDeviceDataListResponse.Message"));
		queryDeviceDataListResponse.setCode(_ctx.stringValue("QueryDeviceDataListResponse.Code"));
		queryDeviceDataListResponse.setHttpStatusCode(_ctx.integerValue("QueryDeviceDataListResponse.HttpStatusCode"));
		queryDeviceDataListResponse.setTotalCount(_ctx.longValue("QueryDeviceDataListResponse.TotalCount"));
		queryDeviceDataListResponse.setPageNumber(_ctx.integerValue("QueryDeviceDataListResponse.PageNumber"));
		queryDeviceDataListResponse.setPageSize(_ctx.integerValue("QueryDeviceDataListResponse.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceDataListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDeviceName(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].DeviceName"));
			dataItem.setSn(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].Sn"));
			dataItem.setMac(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].Mac"));
			dataItem.setDeviceGroupList(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].DeviceGroupList"));
			dataItem.setDeviceModel(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].DeviceModel"));
			dataItem.setDeviceType(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].DeviceType"));
			dataItem.setShopName(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].ShopName"));
			dataItem.setShopId(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].ShopId"));
			dataItem.setRegionAddress(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].RegionAddress"));
			dataItem.setStatus(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].Status"));
			dataItem.setBusinessStatus(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].BusinessStatus"));
			dataItem.setAppVersion(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].AppVersion"));
			dataItem.setProvince(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].Province"));
			dataItem.setCity(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].City"));
			dataItem.setRegion(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].Region"));
			dataItem.setLastOnlineTime(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].LastOnlineTime"));
			dataItem.setDeviceSpecificModel(_ctx.stringValue("QueryDeviceDataListResponse.Data["+ i +"].DeviceSpecificModel"));

			data.add(dataItem);
		}
		queryDeviceDataListResponse.setData(data);
	 
	 	return queryDeviceDataListResponse;
	}
}