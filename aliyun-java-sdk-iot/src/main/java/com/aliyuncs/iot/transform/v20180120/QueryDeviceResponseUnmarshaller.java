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

import com.aliyuncs.iot.model.v20180120.QueryDeviceResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceResponse.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceResponseUnmarshaller {

	public static QueryDeviceResponse unmarshall(QueryDeviceResponse queryDeviceResponse, UnmarshallerContext _ctx) {
		
		queryDeviceResponse.setRequestId(_ctx.stringValue("QueryDeviceResponse.RequestId"));
		queryDeviceResponse.setSuccess(_ctx.booleanValue("QueryDeviceResponse.Success"));
		queryDeviceResponse.setCode(_ctx.stringValue("QueryDeviceResponse.Code"));
		queryDeviceResponse.setErrorMessage(_ctx.stringValue("QueryDeviceResponse.ErrorMessage"));
		queryDeviceResponse.setTotal(_ctx.integerValue("QueryDeviceResponse.Total"));
		queryDeviceResponse.setPageSize(_ctx.integerValue("QueryDeviceResponse.PageSize"));
		queryDeviceResponse.setPageCount(_ctx.integerValue("QueryDeviceResponse.PageCount"));
		queryDeviceResponse.setPage(_ctx.integerValue("QueryDeviceResponse.Page"));
		queryDeviceResponse.setNextToken(_ctx.stringValue("QueryDeviceResponse.NextToken"));

		List<DeviceInfo> data = new ArrayList<DeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceResponse.Data.Length"); i++) {
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setDeviceId(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].DeviceId"));
			deviceInfo.setDeviceSecret(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].DeviceSecret"));
			deviceInfo.setProductKey(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].ProductKey"));
			deviceInfo.setDeviceStatus(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].DeviceStatus"));
			deviceInfo.setDeviceName(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].DeviceName"));
			deviceInfo.setDeviceType(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].DeviceType"));
			deviceInfo.setGmtCreate(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].GmtCreate"));
			deviceInfo.setGmtModified(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].GmtModified"));
			deviceInfo.setUtcCreate(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].UtcCreate"));
			deviceInfo.setUtcModified(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].UtcModified"));
			deviceInfo.setIotId(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].IotId"));
			deviceInfo.setNickname(_ctx.stringValue("QueryDeviceResponse.Data["+ i +"].Nickname"));

			data.add(deviceInfo);
		}
		queryDeviceResponse.setData(data);
	 
	 	return queryDeviceResponse;
	}
}