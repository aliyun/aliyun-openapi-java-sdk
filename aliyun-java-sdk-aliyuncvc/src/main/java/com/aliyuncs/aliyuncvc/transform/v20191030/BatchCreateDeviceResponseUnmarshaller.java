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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20191030.BatchCreateDeviceResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.BatchCreateDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateDeviceResponseUnmarshaller {

	public static BatchCreateDeviceResponse unmarshall(BatchCreateDeviceResponse batchCreateDeviceResponse, UnmarshallerContext _ctx) {
		
		batchCreateDeviceResponse.setErrorCode(_ctx.integerValue("BatchCreateDeviceResponse.ErrorCode"));
		batchCreateDeviceResponse.setMessage(_ctx.stringValue("BatchCreateDeviceResponse.Message"));
		batchCreateDeviceResponse.setSuccess(_ctx.booleanValue("BatchCreateDeviceResponse.Success"));

		List<Data> devices = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("BatchCreateDeviceResponse.Devices.Length"); i++) {
			Data data = new Data();
			data.setDeviceErrorCode(_ctx.integerValue("BatchCreateDeviceResponse.Devices["+ i +"].DeviceErrorCode"));
			data.setDeviceMessage(_ctx.stringValue("BatchCreateDeviceResponse.Devices["+ i +"].DeviceMessage"));
			data.setSN(_ctx.stringValue("BatchCreateDeviceResponse.Devices["+ i +"].SN"));
			data.setActiveCode(_ctx.stringValue("BatchCreateDeviceResponse.Devices["+ i +"].ActiveCode"));

			devices.add(data);
		}
		batchCreateDeviceResponse.setDevices(devices);
	 
	 	return batchCreateDeviceResponse;
	}
}