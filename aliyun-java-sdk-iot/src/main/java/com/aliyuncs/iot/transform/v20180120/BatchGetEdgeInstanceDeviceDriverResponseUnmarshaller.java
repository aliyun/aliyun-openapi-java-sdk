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

import com.aliyuncs.iot.model.v20180120.BatchGetEdgeInstanceDeviceDriverResponse;
import com.aliyuncs.iot.model.v20180120.BatchGetEdgeInstanceDeviceDriverResponse.DeviceDriver;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetEdgeInstanceDeviceDriverResponseUnmarshaller {

	public static BatchGetEdgeInstanceDeviceDriverResponse unmarshall(BatchGetEdgeInstanceDeviceDriverResponse batchGetEdgeInstanceDeviceDriverResponse, UnmarshallerContext _ctx) {
		
		batchGetEdgeInstanceDeviceDriverResponse.setRequestId(_ctx.stringValue("BatchGetEdgeInstanceDeviceDriverResponse.RequestId"));
		batchGetEdgeInstanceDeviceDriverResponse.setSuccess(_ctx.booleanValue("BatchGetEdgeInstanceDeviceDriverResponse.Success"));
		batchGetEdgeInstanceDeviceDriverResponse.setCode(_ctx.stringValue("BatchGetEdgeInstanceDeviceDriverResponse.Code"));
		batchGetEdgeInstanceDeviceDriverResponse.setErrorMessage(_ctx.stringValue("BatchGetEdgeInstanceDeviceDriverResponse.ErrorMessage"));

		List<DeviceDriver> deviceDriverList = new ArrayList<DeviceDriver>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetEdgeInstanceDeviceDriverResponse.DeviceDriverList.Length"); i++) {
			DeviceDriver deviceDriver = new DeviceDriver();
			deviceDriver.setDriverId(_ctx.stringValue("BatchGetEdgeInstanceDeviceDriverResponse.DeviceDriverList["+ i +"].DriverId"));
			deviceDriver.setIotId(_ctx.stringValue("BatchGetEdgeInstanceDeviceDriverResponse.DeviceDriverList["+ i +"].IotId"));

			deviceDriverList.add(deviceDriver);
		}
		batchGetEdgeInstanceDeviceDriverResponse.setDeviceDriverList(deviceDriverList);
	 
	 	return batchGetEdgeInstanceDeviceDriverResponse;
	}
}