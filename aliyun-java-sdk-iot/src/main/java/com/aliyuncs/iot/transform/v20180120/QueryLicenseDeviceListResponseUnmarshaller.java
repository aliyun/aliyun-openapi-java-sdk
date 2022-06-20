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

import com.aliyuncs.iot.model.v20180120.QueryLicenseDeviceListResponse;
import com.aliyuncs.iot.model.v20180120.QueryLicenseDeviceListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryLicenseDeviceListResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLicenseDeviceListResponseUnmarshaller {

	public static QueryLicenseDeviceListResponse unmarshall(QueryLicenseDeviceListResponse queryLicenseDeviceListResponse, UnmarshallerContext _ctx) {
		
		queryLicenseDeviceListResponse.setRequestId(_ctx.stringValue("QueryLicenseDeviceListResponse.RequestId"));
		queryLicenseDeviceListResponse.setSuccess(_ctx.booleanValue("QueryLicenseDeviceListResponse.Success"));
		queryLicenseDeviceListResponse.setCode(_ctx.stringValue("QueryLicenseDeviceListResponse.Code"));
		queryLicenseDeviceListResponse.setErrorMessage(_ctx.stringValue("QueryLicenseDeviceListResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("QueryLicenseDeviceListResponse.Data.PageSize"));
		data.setPageId(_ctx.integerValue("QueryLicenseDeviceListResponse.Data.PageId"));
		data.setTotal(_ctx.integerValue("QueryLicenseDeviceListResponse.Data.Total"));

		List<Item> deviceList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryLicenseDeviceListResponse.Data.DeviceList.Length"); i++) {
			Item item = new Item();
			item.setProductName(_ctx.stringValue("QueryLicenseDeviceListResponse.Data.DeviceList["+ i +"].ProductName"));
			item.setLicenseCode(_ctx.stringValue("QueryLicenseDeviceListResponse.Data.DeviceList["+ i +"].LicenseCode"));
			item.setProductKey(_ctx.stringValue("QueryLicenseDeviceListResponse.Data.DeviceList["+ i +"].ProductKey"));
			item.setDeviceName(_ctx.stringValue("QueryLicenseDeviceListResponse.Data.DeviceList["+ i +"].DeviceName"));
			item.setExpiryTime(_ctx.longValue("QueryLicenseDeviceListResponse.Data.DeviceList["+ i +"].ExpiryTime"));
			item.setGmtCreate(_ctx.longValue("QueryLicenseDeviceListResponse.Data.DeviceList["+ i +"].GmtCreate"));
			item.setIotId(_ctx.stringValue("QueryLicenseDeviceListResponse.Data.DeviceList["+ i +"].IotId"));

			deviceList.add(item);
		}
		data.setDeviceList(deviceList);
		queryLicenseDeviceListResponse.setData(data);
	 
	 	return queryLicenseDeviceListResponse;
	}
}