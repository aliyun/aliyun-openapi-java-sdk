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

import com.aliyuncs.iot.model.v20180120.QueryProjectShareDeviceListResponse;
import com.aliyuncs.iot.model.v20180120.QueryProjectShareDeviceListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryProjectShareDeviceListResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProjectShareDeviceListResponseUnmarshaller {

	public static QueryProjectShareDeviceListResponse unmarshall(QueryProjectShareDeviceListResponse queryProjectShareDeviceListResponse, UnmarshallerContext _ctx) {
		
		queryProjectShareDeviceListResponse.setRequestId(_ctx.stringValue("QueryProjectShareDeviceListResponse.RequestId"));
		queryProjectShareDeviceListResponse.setSuccess(_ctx.booleanValue("QueryProjectShareDeviceListResponse.Success"));
		queryProjectShareDeviceListResponse.setCode(_ctx.stringValue("QueryProjectShareDeviceListResponse.Code"));
		queryProjectShareDeviceListResponse.setErrorMessage(_ctx.stringValue("QueryProjectShareDeviceListResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("QueryProjectShareDeviceListResponse.Data.PageSize"));
		data.setPageId(_ctx.integerValue("QueryProjectShareDeviceListResponse.Data.PageId"));
		data.setTotal(_ctx.integerValue("QueryProjectShareDeviceListResponse.Data.Total"));

		List<Items> deviceList = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QueryProjectShareDeviceListResponse.Data.DeviceList.Length"); i++) {
			Items items = new Items();
			items.setProductKey(_ctx.stringValue("QueryProjectShareDeviceListResponse.Data.DeviceList["+ i +"].ProductKey"));
			items.setDeviceName(_ctx.stringValue("QueryProjectShareDeviceListResponse.Data.DeviceList["+ i +"].DeviceName"));
			items.setSharable(_ctx.longValue("QueryProjectShareDeviceListResponse.Data.DeviceList["+ i +"].Sharable"));
			items.setIotId(_ctx.stringValue("QueryProjectShareDeviceListResponse.Data.DeviceList["+ i +"].IotId"));

			deviceList.add(items);
		}
		data.setDeviceList(deviceList);
		queryProjectShareDeviceListResponse.setData(data);
	 
	 	return queryProjectShareDeviceListResponse;
	}
}