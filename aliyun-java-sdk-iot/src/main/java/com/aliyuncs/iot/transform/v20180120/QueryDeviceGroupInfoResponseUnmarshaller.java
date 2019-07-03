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

	public static QueryDeviceGroupInfoResponse unmarshall(QueryDeviceGroupInfoResponse queryDeviceGroupInfoResponse, UnmarshallerContext _ctx) {
		
		queryDeviceGroupInfoResponse.setRequestId(_ctx.stringValue("QueryDeviceGroupInfoResponse.RequestId"));
		queryDeviceGroupInfoResponse.setSuccess(_ctx.booleanValue("QueryDeviceGroupInfoResponse.Success"));
		queryDeviceGroupInfoResponse.setCode(_ctx.stringValue("QueryDeviceGroupInfoResponse.Code"));
		queryDeviceGroupInfoResponse.setErrorMessage(_ctx.stringValue("QueryDeviceGroupInfoResponse.ErrorMessage"));

		Data data = new Data();
		data.setGroupId(_ctx.stringValue("QueryDeviceGroupInfoResponse.Data.GroupId"));
		data.setUtcCreate(_ctx.stringValue("QueryDeviceGroupInfoResponse.Data.UtcCreate"));
		data.setGroupName(_ctx.stringValue("QueryDeviceGroupInfoResponse.Data.GroupName"));
		data.setGroupDesc(_ctx.stringValue("QueryDeviceGroupInfoResponse.Data.GroupDesc"));
		data.setDeviceCount(_ctx.integerValue("QueryDeviceGroupInfoResponse.Data.DeviceCount"));
		data.setDeviceActive(_ctx.integerValue("QueryDeviceGroupInfoResponse.Data.DeviceActive"));
		data.setDeviceOnline(_ctx.integerValue("QueryDeviceGroupInfoResponse.Data.DeviceOnline"));
		queryDeviceGroupInfoResponse.setData(data);
	 
	 	return queryDeviceGroupInfoResponse;
	}
}