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

import com.aliyuncs.iot.model.v20180120.QueryDeviceDetailResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceDetailResponseUnmarshaller {

	public static QueryDeviceDetailResponse unmarshall(QueryDeviceDetailResponse queryDeviceDetailResponse, UnmarshallerContext _ctx) {
		
		queryDeviceDetailResponse.setRequestId(_ctx.stringValue("QueryDeviceDetailResponse.RequestId"));
		queryDeviceDetailResponse.setCode(_ctx.stringValue("QueryDeviceDetailResponse.Code"));
		queryDeviceDetailResponse.setErrorMessage(_ctx.stringValue("QueryDeviceDetailResponse.ErrorMessage"));
		queryDeviceDetailResponse.setSuccess(_ctx.booleanValue("QueryDeviceDetailResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("QueryDeviceDetailResponse.Data.Status"));
		data.setOwner(_ctx.booleanValue("QueryDeviceDetailResponse.Data.Owner"));
		data.setUtcActive(_ctx.stringValue("QueryDeviceDetailResponse.Data.UtcActive"));
		data.setProductName(_ctx.stringValue("QueryDeviceDetailResponse.Data.ProductName"));
		data.setDeviceName(_ctx.stringValue("QueryDeviceDetailResponse.Data.DeviceName"));
		data.setUtcCreate(_ctx.stringValue("QueryDeviceDetailResponse.Data.UtcCreate"));
		data.setFirmwareVersion(_ctx.stringValue("QueryDeviceDetailResponse.Data.FirmwareVersion"));
		data.setGmtOnline(_ctx.stringValue("QueryDeviceDetailResponse.Data.GmtOnline"));
		data.setUtcOnline(_ctx.stringValue("QueryDeviceDetailResponse.Data.UtcOnline"));
		data.setProductKey(_ctx.stringValue("QueryDeviceDetailResponse.Data.ProductKey"));
		data.setIpAddress(_ctx.stringValue("QueryDeviceDetailResponse.Data.IpAddress"));
		data.setNodeType(_ctx.integerValue("QueryDeviceDetailResponse.Data.NodeType"));
		data.setRegion(_ctx.stringValue("QueryDeviceDetailResponse.Data.Region"));
		data.setDeviceSecret(_ctx.stringValue("QueryDeviceDetailResponse.Data.DeviceSecret"));
		data.setGmtActive(_ctx.stringValue("QueryDeviceDetailResponse.Data.GmtActive"));
		data.setGmtCreate(_ctx.stringValue("QueryDeviceDetailResponse.Data.GmtCreate"));
		data.setNickname(_ctx.stringValue("QueryDeviceDetailResponse.Data.Nickname"));
		data.setIotId(_ctx.stringValue("QueryDeviceDetailResponse.Data.IotId"));
		queryDeviceDetailResponse.setData(data);
	 
	 	return queryDeviceDetailResponse;
	}
}