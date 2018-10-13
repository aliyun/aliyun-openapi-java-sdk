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

import com.aliyuncs.iot.model.v20180120.QueryDeviceGroupInfoResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceGroupInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceGroupInfoResponseUnmarshaller {

	public static QueryDeviceGroupInfoResponse unmarshall(QueryDeviceGroupInfoResponse queryDeviceGroupInfoResponse, UnmarshallerContext context) {
		
		queryDeviceGroupInfoResponse.setRequestId(context.stringValue("QueryDeviceGroupInfoResponse.RequestId"));
		queryDeviceGroupInfoResponse.setSuccess(context.booleanValue("QueryDeviceGroupInfoResponse.Success"));
		queryDeviceGroupInfoResponse.setCode(context.stringValue("QueryDeviceGroupInfoResponse.Code"));
		queryDeviceGroupInfoResponse.setErrorMessage(context.stringValue("QueryDeviceGroupInfoResponse.ErrorMessage"));

		Data data = new Data();
		data.setGroupId(context.stringValue("QueryDeviceGroupInfoResponse.Data.GroupId"));
		data.setUtcCreate(context.stringValue("QueryDeviceGroupInfoResponse.Data.UtcCreate"));
		data.setGroupName(context.stringValue("QueryDeviceGroupInfoResponse.Data.GroupName"));
		data.setGroupDesc(context.stringValue("QueryDeviceGroupInfoResponse.Data.GroupDesc"));
		data.setDeviceCount(context.integerValue("QueryDeviceGroupInfoResponse.Data.DeviceCount"));
		data.setDeviceActive(context.integerValue("QueryDeviceGroupInfoResponse.Data.DeviceActive"));
		data.setDeviceOnline(context.integerValue("QueryDeviceGroupInfoResponse.Data.DeviceOnline"));
		queryDeviceGroupInfoResponse.setData(data);
	 
	 	return queryDeviceGroupInfoResponse;
	}
}