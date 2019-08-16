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

import com.aliyuncs.iot.model.v20180120.BatchGetDeviceDriverResponse;
import com.aliyuncs.iot.model.v20180120.BatchGetDeviceDriverResponse.DeviceDriver;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetDeviceDriverResponseUnmarshaller {

	public static BatchGetDeviceDriverResponse unmarshall(BatchGetDeviceDriverResponse batchGetDeviceDriverResponse, UnmarshallerContext _ctx) {
		
		batchGetDeviceDriverResponse.setRequestId(_ctx.stringValue("BatchGetDeviceDriverResponse.RequestId"));
		batchGetDeviceDriverResponse.setSuccess(_ctx.booleanValue("BatchGetDeviceDriverResponse.Success"));
		batchGetDeviceDriverResponse.setCode(_ctx.stringValue("BatchGetDeviceDriverResponse.Code"));
		batchGetDeviceDriverResponse.setErrorMessage(_ctx.stringValue("BatchGetDeviceDriverResponse.ErrorMessage"));

		List<DeviceDriver> deviceDriverList = new ArrayList<DeviceDriver>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetDeviceDriverResponse.DeviceDriverList.Length"); i++) {
			DeviceDriver deviceDriver = new DeviceDriver();
			deviceDriver.setDriverId(_ctx.stringValue("BatchGetDeviceDriverResponse.DeviceDriverList["+ i +"].DriverId"));
			deviceDriver.setIotId(_ctx.stringValue("BatchGetDeviceDriverResponse.DeviceDriverList["+ i +"].IotId"));

			deviceDriverList.add(deviceDriver);
		}
		batchGetDeviceDriverResponse.setDeviceDriverList(deviceDriverList);
	 
	 	return batchGetDeviceDriverResponse;
	}
}