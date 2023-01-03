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

import com.aliyuncs.iot.model.v20180120.BatchCheckVehicleDeviceResponse;
import com.aliyuncs.iot.model.v20180120.BatchCheckVehicleDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCheckVehicleDeviceResponseUnmarshaller {

	public static BatchCheckVehicleDeviceResponse unmarshall(BatchCheckVehicleDeviceResponse batchCheckVehicleDeviceResponse, UnmarshallerContext _ctx) {
		
		batchCheckVehicleDeviceResponse.setRequestId(_ctx.stringValue("BatchCheckVehicleDeviceResponse.RequestId"));
		batchCheckVehicleDeviceResponse.setSuccess(_ctx.booleanValue("BatchCheckVehicleDeviceResponse.Success"));
		batchCheckVehicleDeviceResponse.setCode(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Code"));
		batchCheckVehicleDeviceResponse.setErrorMessage(_ctx.stringValue("BatchCheckVehicleDeviceResponse.ErrorMessage"));

		Data data = new Data();

		List<String> invalidManufacturerList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckVehicleDeviceResponse.Data.InvalidManufacturerList.Length"); i++) {
			invalidManufacturerList.add(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidManufacturerList["+ i +"]"));
		}
		data.setInvalidManufacturerList(invalidManufacturerList);

		List<String> invalidDeviceModelList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckVehicleDeviceResponse.Data.InvalidDeviceModelList.Length"); i++) {
			invalidDeviceModelList.add(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidDeviceModelList["+ i +"]"));
		}
		data.setInvalidDeviceModelList(invalidDeviceModelList);

		List<String> invalidDeviceIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckVehicleDeviceResponse.Data.InvalidDeviceIdList.Length"); i++) {
			invalidDeviceIdList.add(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidDeviceIdList["+ i +"]"));
		}
		data.setInvalidDeviceIdList(invalidDeviceIdList);

		List<String> repeatedDeviceIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckVehicleDeviceResponse.Data.RepeatedDeviceIdList.Length"); i++) {
			repeatedDeviceIdList.add(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.RepeatedDeviceIdList["+ i +"]"));
		}
		data.setRepeatedDeviceIdList(repeatedDeviceIdList);
		batchCheckVehicleDeviceResponse.setData(data);
	 
	 	return batchCheckVehicleDeviceResponse;
	}
}