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

import com.aliyuncs.iot.model.v20180120.BatchCheckImportDeviceResponse;
import com.aliyuncs.iot.model.v20180120.BatchCheckImportDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCheckImportDeviceResponseUnmarshaller {

	public static BatchCheckImportDeviceResponse unmarshall(BatchCheckImportDeviceResponse batchCheckImportDeviceResponse, UnmarshallerContext _ctx) {
		
		batchCheckImportDeviceResponse.setRequestId(_ctx.stringValue("BatchCheckImportDeviceResponse.RequestId"));
		batchCheckImportDeviceResponse.setSuccess(_ctx.booleanValue("BatchCheckImportDeviceResponse.Success"));
		batchCheckImportDeviceResponse.setCode(_ctx.stringValue("BatchCheckImportDeviceResponse.Code"));
		batchCheckImportDeviceResponse.setErrorMessage(_ctx.stringValue("BatchCheckImportDeviceResponse.ErrorMessage"));

		Data data = new Data();

		List<String> invalidDeviceNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckImportDeviceResponse.Data.InvalidDeviceNameList.Length"); i++) {
			invalidDeviceNameList.add(_ctx.stringValue("BatchCheckImportDeviceResponse.Data.InvalidDeviceNameList["+ i +"]"));
		}
		data.setInvalidDeviceNameList(invalidDeviceNameList);

		List<String> invalidDeviceSecretList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckImportDeviceResponse.Data.InvalidDeviceSecretList.Length"); i++) {
			invalidDeviceSecretList.add(_ctx.stringValue("BatchCheckImportDeviceResponse.Data.InvalidDeviceSecretList["+ i +"]"));
		}
		data.setInvalidDeviceSecretList(invalidDeviceSecretList);

		List<String> invalidSnList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckImportDeviceResponse.Data.InvalidSnList.Length"); i++) {
			invalidSnList.add(_ctx.stringValue("BatchCheckImportDeviceResponse.Data.InvalidSnList["+ i +"]"));
		}
		data.setInvalidSnList(invalidSnList);

		List<String> repeatedDeviceNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckImportDeviceResponse.Data.RepeatedDeviceNameList.Length"); i++) {
			repeatedDeviceNameList.add(_ctx.stringValue("BatchCheckImportDeviceResponse.Data.RepeatedDeviceNameList["+ i +"]"));
		}
		data.setRepeatedDeviceNameList(repeatedDeviceNameList);
		batchCheckImportDeviceResponse.setData(data);
	 
	 	return batchCheckImportDeviceResponse;
	}
}