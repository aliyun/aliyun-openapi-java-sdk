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

import com.aliyuncs.iot.model.v20180120.BatchImportVehicleDeviceResponse;
import com.aliyuncs.iot.model.v20180120.BatchImportVehicleDeviceResponse.Data;
import com.aliyuncs.iot.model.v20180120.BatchImportVehicleDeviceResponse.Data.InvalidDetailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchImportVehicleDeviceResponseUnmarshaller {

	public static BatchImportVehicleDeviceResponse unmarshall(BatchImportVehicleDeviceResponse batchImportVehicleDeviceResponse, UnmarshallerContext _ctx) {
		
		batchImportVehicleDeviceResponse.setRequestId(_ctx.stringValue("BatchImportVehicleDeviceResponse.RequestId"));
		batchImportVehicleDeviceResponse.setCode(_ctx.stringValue("BatchImportVehicleDeviceResponse.Code"));
		batchImportVehicleDeviceResponse.setErrorMessage(_ctx.stringValue("BatchImportVehicleDeviceResponse.ErrorMessage"));
		batchImportVehicleDeviceResponse.setSuccess(_ctx.booleanValue("BatchImportVehicleDeviceResponse.Success"));

		Data data = new Data();
		data.setApplyId(_ctx.longValue("BatchImportVehicleDeviceResponse.Data.ApplyId"));

		List<String> invalidManufacturerList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchImportVehicleDeviceResponse.Data.InvalidManufacturerList.Length"); i++) {
			invalidManufacturerList.add(_ctx.stringValue("BatchImportVehicleDeviceResponse.Data.InvalidManufacturerList["+ i +"]"));
		}
		data.setInvalidManufacturerList(invalidManufacturerList);

		List<String> repeatedDeviceIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchImportVehicleDeviceResponse.Data.RepeatedDeviceIdList.Length"); i++) {
			repeatedDeviceIdList.add(_ctx.stringValue("BatchImportVehicleDeviceResponse.Data.RepeatedDeviceIdList["+ i +"]"));
		}
		data.setRepeatedDeviceIdList(repeatedDeviceIdList);

		List<String> repeatedDeviceNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchImportVehicleDeviceResponse.Data.RepeatedDeviceNameList.Length"); i++) {
			repeatedDeviceNameList.add(_ctx.stringValue("BatchImportVehicleDeviceResponse.Data.RepeatedDeviceNameList["+ i +"]"));
		}
		data.setRepeatedDeviceNameList(repeatedDeviceNameList);

		List<String> invalidDeviceIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchImportVehicleDeviceResponse.Data.InvalidDeviceIdList.Length"); i++) {
			invalidDeviceIdList.add(_ctx.stringValue("BatchImportVehicleDeviceResponse.Data.InvalidDeviceIdList["+ i +"]"));
		}
		data.setInvalidDeviceIdList(invalidDeviceIdList);

		List<String> invalidDeviceModelList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchImportVehicleDeviceResponse.Data.InvalidDeviceModelList.Length"); i++) {
			invalidDeviceModelList.add(_ctx.stringValue("BatchImportVehicleDeviceResponse.Data.InvalidDeviceModelList["+ i +"]"));
		}
		data.setInvalidDeviceModelList(invalidDeviceModelList);

		List<String> invalidDeviceNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchImportVehicleDeviceResponse.Data.InvalidDeviceNameList.Length"); i++) {
			invalidDeviceNameList.add(_ctx.stringValue("BatchImportVehicleDeviceResponse.Data.InvalidDeviceNameList["+ i +"]"));
		}
		data.setInvalidDeviceNameList(invalidDeviceNameList);

		List<InvalidDetailListItem> invalidDetailList = new ArrayList<InvalidDetailListItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchImportVehicleDeviceResponse.Data.InvalidDetailList.Length"); i++) {
			InvalidDetailListItem invalidDetailListItem = new InvalidDetailListItem();
			invalidDetailListItem.setErrorMsg(_ctx.stringValue("BatchImportVehicleDeviceResponse.Data.InvalidDetailList["+ i +"].ErrorMsg"));
			invalidDetailListItem.setDeviceModel(_ctx.stringValue("BatchImportVehicleDeviceResponse.Data.InvalidDetailList["+ i +"].DeviceModel"));
			invalidDetailListItem.setDeviceName(_ctx.stringValue("BatchImportVehicleDeviceResponse.Data.InvalidDetailList["+ i +"].DeviceName"));
			invalidDetailListItem.setDeviceId(_ctx.stringValue("BatchImportVehicleDeviceResponse.Data.InvalidDetailList["+ i +"].DeviceId"));
			invalidDetailListItem.setManufacturer(_ctx.stringValue("BatchImportVehicleDeviceResponse.Data.InvalidDetailList["+ i +"].Manufacturer"));

			invalidDetailList.add(invalidDetailListItem);
		}
		data.setInvalidDetailList(invalidDetailList);
		batchImportVehicleDeviceResponse.setData(data);
	 
	 	return batchImportVehicleDeviceResponse;
	}
}