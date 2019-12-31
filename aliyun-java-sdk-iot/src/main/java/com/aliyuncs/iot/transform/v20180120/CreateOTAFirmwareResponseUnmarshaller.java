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

import com.aliyuncs.iot.model.v20180120.CreateOTAFirmwareResponse;
import com.aliyuncs.iot.model.v20180120.CreateOTAFirmwareResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOTAFirmwareResponseUnmarshaller {

	public static CreateOTAFirmwareResponse unmarshall(CreateOTAFirmwareResponse createOTAFirmwareResponse, UnmarshallerContext _ctx) {
		
		createOTAFirmwareResponse.setRequestId(_ctx.stringValue("CreateOTAFirmwareResponse.RequestId"));
		createOTAFirmwareResponse.setSuccess(_ctx.booleanValue("CreateOTAFirmwareResponse.Success"));
		createOTAFirmwareResponse.setCode(_ctx.stringValue("CreateOTAFirmwareResponse.Code"));
		createOTAFirmwareResponse.setErrorMessage(_ctx.stringValue("CreateOTAFirmwareResponse.ErrorMessage"));

		Data data = new Data();
		data.setFirmwareId(_ctx.stringValue("CreateOTAFirmwareResponse.Data.FirmwareId"));
		data.setUtcCreate(_ctx.stringValue("CreateOTAFirmwareResponse.Data.UtcCreate"));
		createOTAFirmwareResponse.setData(data);
	 
	 	return createOTAFirmwareResponse;
	}
}