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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryShareTaskDeviceListResponse;
import com.aliyuncs.iot.model.v20180120.QueryShareTaskDeviceListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryShareTaskDeviceListResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryShareTaskDeviceListResponseUnmarshaller {

	public static QueryShareTaskDeviceListResponse unmarshall(QueryShareTaskDeviceListResponse queryShareTaskDeviceListResponse, UnmarshallerContext _ctx) {
		
		queryShareTaskDeviceListResponse.setRequestId(_ctx.stringValue("QueryShareTaskDeviceListResponse.RequestId"));
		queryShareTaskDeviceListResponse.setCode(_ctx.stringValue("QueryShareTaskDeviceListResponse.Code"));
		queryShareTaskDeviceListResponse.setErrorMessage(_ctx.stringValue("QueryShareTaskDeviceListResponse.ErrorMessage"));
		queryShareTaskDeviceListResponse.setSuccess(_ctx.booleanValue("QueryShareTaskDeviceListResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("QueryShareTaskDeviceListResponse.Data.PageSize"));
		data.setPageId(_ctx.integerValue("QueryShareTaskDeviceListResponse.Data.PageId"));
		data.setTotal(_ctx.integerValue("QueryShareTaskDeviceListResponse.Data.Total"));

		List<Items> deviceList = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QueryShareTaskDeviceListResponse.Data.DeviceList.Length"); i++) {
			Items items = new Items();
			items.setProductKey(_ctx.stringValue("QueryShareTaskDeviceListResponse.Data.DeviceList["+ i +"].ProductKey"));
			items.setGmtAdded(_ctx.longValue("QueryShareTaskDeviceListResponse.Data.DeviceList["+ i +"].GmtAdded"));
			items.setDeviceName(_ctx.stringValue("QueryShareTaskDeviceListResponse.Data.DeviceList["+ i +"].DeviceName"));
			items.setIotId(_ctx.stringValue("QueryShareTaskDeviceListResponse.Data.DeviceList["+ i +"].IotId"));

			deviceList.add(items);
		}
		data.setDeviceList(deviceList);
		queryShareTaskDeviceListResponse.setData(data);
	 
	 	return queryShareTaskDeviceListResponse;
	}
}