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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribePurchasedDevicesResponse;
import com.aliyuncs.vs.model.v20181212.DescribePurchasedDevicesResponse.Device;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePurchasedDevicesResponseUnmarshaller {

	public static DescribePurchasedDevicesResponse unmarshall(DescribePurchasedDevicesResponse describePurchasedDevicesResponse, UnmarshallerContext _ctx) {
		
		describePurchasedDevicesResponse.setRequestId(_ctx.stringValue("DescribePurchasedDevicesResponse.RequestId"));
		describePurchasedDevicesResponse.setPageSize(_ctx.longValue("DescribePurchasedDevicesResponse.PageSize"));
		describePurchasedDevicesResponse.setPageNum(_ctx.longValue("DescribePurchasedDevicesResponse.PageNum"));
		describePurchasedDevicesResponse.setPageCount(_ctx.longValue("DescribePurchasedDevicesResponse.PageCount"));
		describePurchasedDevicesResponse.setTotalCount(_ctx.longValue("DescribePurchasedDevicesResponse.TotalCount"));

		List<Device> devices = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("DescribePurchasedDevicesResponse.Devices.Length"); i++) {
			Device device = new Device();
			device.setId(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].Id"));
			device.setName(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].Name"));
			device.setDescription(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].Description"));
			device.setType(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].Type"));
			device.setSubType(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].SubType"));
			device.setRegisterCode(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].RegisterCode"));
			device.setVendor(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].Vendor"));
			device.setOrderId(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].OrderId"));
			device.setRegion(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].Region"));
			device.setGroupId(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].GroupId"));
			device.setGroupName(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].GroupName"));
			device.setCreatedTime(_ctx.stringValue("DescribePurchasedDevicesResponse.Devices["+ i +"].CreatedTime"));

			devices.add(device);
		}
		describePurchasedDevicesResponse.setDevices(devices);
	 
	 	return describePurchasedDevicesResponse;
	}
}