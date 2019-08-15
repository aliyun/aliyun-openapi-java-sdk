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

package com.aliyuncs.emas_appmonitor.transform.v20190611;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_appmonitor.model.v20190611.GetAppDailyDeviceCountResponse;
import com.aliyuncs.emas_appmonitor.model.v20190611.GetAppDailyDeviceCountResponse.DeviceCountItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppDailyDeviceCountResponseUnmarshaller {

	public static GetAppDailyDeviceCountResponse unmarshall(GetAppDailyDeviceCountResponse getAppDailyDeviceCountResponse, UnmarshallerContext _ctx) {
		
		getAppDailyDeviceCountResponse.setRequestId(_ctx.stringValue("GetAppDailyDeviceCountResponse.RequestId"));

		List<DeviceCountItem> deviceCountList = new ArrayList<DeviceCountItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppDailyDeviceCountResponse.DeviceCountList.Length"); i++) {
			DeviceCountItem deviceCountItem = new DeviceCountItem();
			deviceCountItem.setDateTime(_ctx.longValue("GetAppDailyDeviceCountResponse.DeviceCountList["+ i +"].DateTime"));
			deviceCountItem.setDeviceCount(_ctx.longValue("GetAppDailyDeviceCountResponse.DeviceCountList["+ i +"].DeviceCount"));

			deviceCountList.add(deviceCountItem);
		}
		getAppDailyDeviceCountResponse.setDeviceCountList(deviceCountList);
	 
	 	return getAppDailyDeviceCountResponse;
	}
}