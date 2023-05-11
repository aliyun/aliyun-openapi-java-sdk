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

import com.aliyuncs.iot.model.v20180120.GetThingTopoResponse;
import com.aliyuncs.iot.model.v20180120.GetThingTopoResponse.Data;
import com.aliyuncs.iot.model.v20180120.GetThingTopoResponse.Data.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetThingTopoResponseUnmarshaller {

	public static GetThingTopoResponse unmarshall(GetThingTopoResponse getThingTopoResponse, UnmarshallerContext _ctx) {
		
		getThingTopoResponse.setRequestId(_ctx.stringValue("GetThingTopoResponse.RequestId"));
		getThingTopoResponse.setSuccess(_ctx.booleanValue("GetThingTopoResponse.Success"));
		getThingTopoResponse.setCode(_ctx.stringValue("GetThingTopoResponse.Code"));
		getThingTopoResponse.setErrorMessage(_ctx.stringValue("GetThingTopoResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetThingTopoResponse.Data.Total"));
		data.setCurrentPage(_ctx.integerValue("GetThingTopoResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("GetThingTopoResponse.Data.PageSize"));
		data.setPageCount(_ctx.longValue("GetThingTopoResponse.Data.PageCount"));

		List<DeviceInfo> list = new ArrayList<DeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetThingTopoResponse.Data.List.Length"); i++) {
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setIotId(_ctx.stringValue("GetThingTopoResponse.Data.List["+ i +"].IotId"));
			deviceInfo.setProductKey(_ctx.stringValue("GetThingTopoResponse.Data.List["+ i +"].ProductKey"));
			deviceInfo.setDeviceName(_ctx.stringValue("GetThingTopoResponse.Data.List["+ i +"].DeviceName"));

			list.add(deviceInfo);
		}
		data.setList(list);
		getThingTopoResponse.setData(data);
	 
	 	return getThingTopoResponse;
	}
}