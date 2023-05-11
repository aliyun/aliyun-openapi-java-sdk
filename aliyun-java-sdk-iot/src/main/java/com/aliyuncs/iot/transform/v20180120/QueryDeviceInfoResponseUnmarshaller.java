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

import com.aliyuncs.iot.model.v20180120.QueryDeviceInfoResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceInfoResponseUnmarshaller {

	public static QueryDeviceInfoResponse unmarshall(QueryDeviceInfoResponse queryDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		queryDeviceInfoResponse.setRequestId(_ctx.stringValue("QueryDeviceInfoResponse.RequestId"));
		queryDeviceInfoResponse.setSuccess(_ctx.booleanValue("QueryDeviceInfoResponse.Success"));
		queryDeviceInfoResponse.setCode(_ctx.stringValue("QueryDeviceInfoResponse.Code"));
		queryDeviceInfoResponse.setErrorMessage(_ctx.stringValue("QueryDeviceInfoResponse.ErrorMessage"));

		Data data = new Data();
		data.setIotId(_ctx.stringValue("QueryDeviceInfoResponse.Data.IotId"));
		data.setProductKey(_ctx.stringValue("QueryDeviceInfoResponse.Data.ProductKey"));
		data.setDeviceName(_ctx.stringValue("QueryDeviceInfoResponse.Data.DeviceName"));
		data.setDeviceSecret(_ctx.stringValue("QueryDeviceInfoResponse.Data.DeviceSecret"));
		data.setNickname(_ctx.stringValue("QueryDeviceInfoResponse.Data.Nickname"));
		queryDeviceInfoResponse.setData(data);
	 
	 	return queryDeviceInfoResponse;
	}
}