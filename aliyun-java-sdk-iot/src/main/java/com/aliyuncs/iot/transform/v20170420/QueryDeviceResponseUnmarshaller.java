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

package com.aliyuncs.iot.transform.v20170420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20170420.QueryDeviceResponse;
import com.aliyuncs.iot.model.v20170420.QueryDeviceResponse.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceResponseUnmarshaller {

	public static QueryDeviceResponse unmarshall(QueryDeviceResponse queryDeviceResponse, UnmarshallerContext context) {
		
		queryDeviceResponse.setRequestId(context.stringValue("QueryDeviceResponse.RequestId"));
		queryDeviceResponse.setSuccess(context.booleanValue("QueryDeviceResponse.Success"));
		queryDeviceResponse.setErrorMessage(context.stringValue("QueryDeviceResponse.ErrorMessage"));
		queryDeviceResponse.setTotal(context.integerValue("QueryDeviceResponse.Total"));
		queryDeviceResponse.setPageSize(context.integerValue("QueryDeviceResponse.PageSize"));
		queryDeviceResponse.setPageCount(context.integerValue("QueryDeviceResponse.PageCount"));
		queryDeviceResponse.setPage(context.integerValue("QueryDeviceResponse.Page"));

		List<DeviceInfo> data = new ArrayList<DeviceInfo>();
		for (int i = 0; i < context.lengthValue("QueryDeviceResponse.Data.Length"); i++) {
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setDeviceId(context.stringValue("QueryDeviceResponse.Data["+ i +"].DeviceId"));
			deviceInfo.setDeviceSecret(context.stringValue("QueryDeviceResponse.Data["+ i +"].DeviceSecret"));
			deviceInfo.setProductKey(context.stringValue("QueryDeviceResponse.Data["+ i +"].ProductKey"));
			deviceInfo.setDeviceStatus(context.stringValue("QueryDeviceResponse.Data["+ i +"].DeviceStatus"));
			deviceInfo.setDeviceName(context.stringValue("QueryDeviceResponse.Data["+ i +"].DeviceName"));
			deviceInfo.setDeviceType(context.stringValue("QueryDeviceResponse.Data["+ i +"].DeviceType"));
			deviceInfo.setGmtCreate(context.stringValue("QueryDeviceResponse.Data["+ i +"].GmtCreate"));
			deviceInfo.setGmtModified(context.stringValue("QueryDeviceResponse.Data["+ i +"].GmtModified"));

			data.add(deviceInfo);
		}
		queryDeviceResponse.setData(data);
	 
	 	return queryDeviceResponse;
	}
}