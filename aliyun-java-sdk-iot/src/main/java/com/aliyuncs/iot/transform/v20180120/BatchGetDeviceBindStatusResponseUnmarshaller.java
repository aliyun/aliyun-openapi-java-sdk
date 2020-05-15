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

import com.aliyuncs.iot.model.v20180120.BatchGetDeviceBindStatusResponse;
import com.aliyuncs.iot.model.v20180120.BatchGetDeviceBindStatusResponse.DeviceStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetDeviceBindStatusResponseUnmarshaller {

	public static BatchGetDeviceBindStatusResponse unmarshall(BatchGetDeviceBindStatusResponse batchGetDeviceBindStatusResponse, UnmarshallerContext _ctx) {
		
		batchGetDeviceBindStatusResponse.setRequestId(_ctx.stringValue("BatchGetDeviceBindStatusResponse.RequestId"));
		batchGetDeviceBindStatusResponse.setSuccess(_ctx.booleanValue("BatchGetDeviceBindStatusResponse.Success"));
		batchGetDeviceBindStatusResponse.setCode(_ctx.stringValue("BatchGetDeviceBindStatusResponse.Code"));
		batchGetDeviceBindStatusResponse.setErrorMessage(_ctx.stringValue("BatchGetDeviceBindStatusResponse.ErrorMessage"));

		List<DeviceStatus> data = new ArrayList<DeviceStatus>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetDeviceBindStatusResponse.Data.Length"); i++) {
			DeviceStatus deviceStatus = new DeviceStatus();
			deviceStatus.setIotId(_ctx.stringValue("BatchGetDeviceBindStatusResponse.Data["+ i +"].IotId"));
			deviceStatus.setBindStatus(_ctx.integerValue("BatchGetDeviceBindStatusResponse.Data["+ i +"].BindStatus"));

			data.add(deviceStatus);
		}
		batchGetDeviceBindStatusResponse.setData(data);
	 
	 	return batchGetDeviceBindStatusResponse;
	}
}