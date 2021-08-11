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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.ListDeviceResponse;
import com.aliyuncs.ltl.model.v20190510.ListDeviceResponse.Data;
import com.aliyuncs.ltl.model.v20190510.ListDeviceResponse.Data.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceResponseUnmarshaller {

	public static ListDeviceResponse unmarshall(ListDeviceResponse listDeviceResponse, UnmarshallerContext _ctx) {
		
		listDeviceResponse.setRequestId(_ctx.stringValue("ListDeviceResponse.RequestId"));
		listDeviceResponse.setCode(_ctx.integerValue("ListDeviceResponse.Code"));
		listDeviceResponse.setSuccess(_ctx.booleanValue("ListDeviceResponse.Success"));
		listDeviceResponse.setMessage(_ctx.stringValue("ListDeviceResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListDeviceResponse.Data.Total"));
		data.setNum(_ctx.integerValue("ListDeviceResponse.Data.Num"));
		data.setSize(_ctx.integerValue("ListDeviceResponse.Data.Size"));

		List<DeviceInfo> pageData = new ArrayList<DeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceResponse.Data.PageData.Length"); i++) {
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setDeviceId(_ctx.stringValue("ListDeviceResponse.Data.PageData["+ i +"].DeviceId"));
			deviceInfo.setIotId(_ctx.stringValue("ListDeviceResponse.Data.PageData["+ i +"].IotId"));
			deviceInfo.setStatus(_ctx.stringValue("ListDeviceResponse.Data.PageData["+ i +"].Status"));
			deviceInfo.setLastSaveTime(_ctx.longValue("ListDeviceResponse.Data.PageData["+ i +"].LastSaveTime"));

			pageData.add(deviceInfo);
		}
		data.setPageData(pageData);
		listDeviceResponse.setData(data);
	 
	 	return listDeviceResponse;
	}
}