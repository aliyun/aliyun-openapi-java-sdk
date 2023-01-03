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

import com.aliyuncs.iot.model.v20180120.BatchImportVehicleDeviceResponse;
import com.aliyuncs.iot.model.v20180120.BatchImportVehicleDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchImportVehicleDeviceResponseUnmarshaller {

	public static BatchImportVehicleDeviceResponse unmarshall(BatchImportVehicleDeviceResponse batchImportVehicleDeviceResponse, UnmarshallerContext _ctx) {
		
		batchImportVehicleDeviceResponse.setRequestId(_ctx.stringValue("BatchImportVehicleDeviceResponse.RequestId"));
		batchImportVehicleDeviceResponse.setSuccess(_ctx.booleanValue("BatchImportVehicleDeviceResponse.Success"));
		batchImportVehicleDeviceResponse.setCode(_ctx.stringValue("BatchImportVehicleDeviceResponse.Code"));
		batchImportVehicleDeviceResponse.setErrorMessage(_ctx.stringValue("BatchImportVehicleDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setApplyId(_ctx.longValue("BatchImportVehicleDeviceResponse.Data.ApplyId"));
		batchImportVehicleDeviceResponse.setData(data);
	 
	 	return batchImportVehicleDeviceResponse;
	}
}