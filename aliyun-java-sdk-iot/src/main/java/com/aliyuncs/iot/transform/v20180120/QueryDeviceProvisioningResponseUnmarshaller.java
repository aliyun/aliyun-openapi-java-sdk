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

import com.aliyuncs.iot.model.v20180120.QueryDeviceProvisioningResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceProvisioningResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceProvisioningResponseUnmarshaller {

	public static QueryDeviceProvisioningResponse unmarshall(QueryDeviceProvisioningResponse queryDeviceProvisioningResponse, UnmarshallerContext _ctx) {
		
		queryDeviceProvisioningResponse.setRequestId(_ctx.stringValue("QueryDeviceProvisioningResponse.RequestId"));
		queryDeviceProvisioningResponse.setSuccess(_ctx.booleanValue("QueryDeviceProvisioningResponse.Success"));
		queryDeviceProvisioningResponse.setCode(_ctx.stringValue("QueryDeviceProvisioningResponse.Code"));
		queryDeviceProvisioningResponse.setErrorMessage(_ctx.stringValue("QueryDeviceProvisioningResponse.ErrorMessage"));

		Data data = new Data();
		data.setGmtCreate(_ctx.longValue("QueryDeviceProvisioningResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("QueryDeviceProvisioningResponse.Data.GmtModified"));
		data.setAliyunUid(_ctx.stringValue("QueryDeviceProvisioningResponse.Data.AliyunUid"));
		data.setProductKey(_ctx.stringValue("QueryDeviceProvisioningResponse.Data.ProductKey"));
		data.setDeviceName(_ctx.stringValue("QueryDeviceProvisioningResponse.Data.DeviceName"));
		data.setSourceIotInstanceId(_ctx.stringValue("QueryDeviceProvisioningResponse.Data.SourceIotInstanceId"));
		data.setTargetIotInstanceId(_ctx.stringValue("QueryDeviceProvisioningResponse.Data.TargetIotInstanceId"));
		data.setSourceRegion(_ctx.stringValue("QueryDeviceProvisioningResponse.Data.SourceRegion"));
		data.setTargetRegion(_ctx.stringValue("QueryDeviceProvisioningResponse.Data.TargetRegion"));
		queryDeviceProvisioningResponse.setData(data);
	 
	 	return queryDeviceProvisioningResponse;
	}
}