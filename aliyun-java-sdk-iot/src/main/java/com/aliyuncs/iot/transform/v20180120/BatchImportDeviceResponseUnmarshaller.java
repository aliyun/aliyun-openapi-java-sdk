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

import com.aliyuncs.iot.model.v20180120.BatchImportDeviceResponse;
import com.aliyuncs.iot.model.v20180120.BatchImportDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchImportDeviceResponseUnmarshaller {

	public static BatchImportDeviceResponse unmarshall(BatchImportDeviceResponse batchImportDeviceResponse, UnmarshallerContext _ctx) {
		
		batchImportDeviceResponse.setRequestId(_ctx.stringValue("BatchImportDeviceResponse.RequestId"));
		batchImportDeviceResponse.setSuccess(_ctx.booleanValue("BatchImportDeviceResponse.Success"));
		batchImportDeviceResponse.setCode(_ctx.stringValue("BatchImportDeviceResponse.Code"));
		batchImportDeviceResponse.setErrorMessage(_ctx.stringValue("BatchImportDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setApplyId(_ctx.longValue("BatchImportDeviceResponse.Data.ApplyId"));

		List<String> repeatedDeviceNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchImportDeviceResponse.Data.RepeatedDeviceNameList.Length"); i++) {
			repeatedDeviceNameList.add(_ctx.stringValue("BatchImportDeviceResponse.Data.RepeatedDeviceNameList["+ i +"]"));
		}
		data.setRepeatedDeviceNameList(repeatedDeviceNameList);

		List<String> invalidDeviceNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchImportDeviceResponse.Data.InvalidDeviceNameList.Length"); i++) {
			invalidDeviceNameList.add(_ctx.stringValue("BatchImportDeviceResponse.Data.InvalidDeviceNameList["+ i +"]"));
		}
		data.setInvalidDeviceNameList(invalidDeviceNameList);

		List<String> invalidDeviceSecretList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchImportDeviceResponse.Data.InvalidDeviceSecretList.Length"); i++) {
			invalidDeviceSecretList.add(_ctx.stringValue("BatchImportDeviceResponse.Data.InvalidDeviceSecretList["+ i +"]"));
		}
		data.setInvalidDeviceSecretList(invalidDeviceSecretList);

		List<String> invalidSnList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchImportDeviceResponse.Data.InvalidSnList.Length"); i++) {
			invalidSnList.add(_ctx.stringValue("BatchImportDeviceResponse.Data.InvalidSnList["+ i +"]"));
		}
		data.setInvalidSnList(invalidSnList);
		batchImportDeviceResponse.setData(data);
	 
	 	return batchImportDeviceResponse;
	}
}