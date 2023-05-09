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

import com.aliyuncs.iot.model.v20180120.QuerySpeechLicenseDeviceListResponse;
import com.aliyuncs.iot.model.v20180120.QuerySpeechLicenseDeviceListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySpeechLicenseDeviceListResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechLicenseDeviceListResponseUnmarshaller {

	public static QuerySpeechLicenseDeviceListResponse unmarshall(QuerySpeechLicenseDeviceListResponse querySpeechLicenseDeviceListResponse, UnmarshallerContext _ctx) {
		
		querySpeechLicenseDeviceListResponse.setRequestId(_ctx.stringValue("QuerySpeechLicenseDeviceListResponse.RequestId"));
		querySpeechLicenseDeviceListResponse.setCode(_ctx.stringValue("QuerySpeechLicenseDeviceListResponse.Code"));
		querySpeechLicenseDeviceListResponse.setErrorMessage(_ctx.stringValue("QuerySpeechLicenseDeviceListResponse.ErrorMessage"));
		querySpeechLicenseDeviceListResponse.setSuccess(_ctx.booleanValue("QuerySpeechLicenseDeviceListResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("QuerySpeechLicenseDeviceListResponse.Data.PageSize"));
		data.setPageId(_ctx.integerValue("QuerySpeechLicenseDeviceListResponse.Data.PageId"));
		data.setTotal(_ctx.integerValue("QuerySpeechLicenseDeviceListResponse.Data.Total"));

		List<Item> deviceList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QuerySpeechLicenseDeviceListResponse.Data.DeviceList.Length"); i++) {
			Item item = new Item();
			item.setExpiryTime(_ctx.longValue("QuerySpeechLicenseDeviceListResponse.Data.DeviceList["+ i +"].ExpiryTime"));
			item.setProductKey(_ctx.stringValue("QuerySpeechLicenseDeviceListResponse.Data.DeviceList["+ i +"].ProductKey"));
			item.setLicenseStatus(_ctx.stringValue("QuerySpeechLicenseDeviceListResponse.Data.DeviceList["+ i +"].LicenseStatus"));
			item.setProductName(_ctx.stringValue("QuerySpeechLicenseDeviceListResponse.Data.DeviceList["+ i +"].ProductName"));
			item.setDeviceName(_ctx.stringValue("QuerySpeechLicenseDeviceListResponse.Data.DeviceList["+ i +"].DeviceName"));
			item.setInSpecifiedGroup(_ctx.booleanValue("QuerySpeechLicenseDeviceListResponse.Data.DeviceList["+ i +"].InSpecifiedGroup"));
			item.setDeviceStatus(_ctx.stringValue("QuerySpeechLicenseDeviceListResponse.Data.DeviceList["+ i +"].DeviceStatus"));
			item.setIotId(_ctx.stringValue("QuerySpeechLicenseDeviceListResponse.Data.DeviceList["+ i +"].IotId"));

			deviceList.add(item);
		}
		data.setDeviceList(deviceList);
		querySpeechLicenseDeviceListResponse.setData(data);
	 
	 	return querySpeechLicenseDeviceListResponse;
	}
}