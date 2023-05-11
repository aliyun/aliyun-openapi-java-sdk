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

import com.aliyuncs.iot.model.v20180120.BatchRegisterDeviceResponse;
import com.aliyuncs.iot.model.v20180120.BatchRegisterDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchRegisterDeviceResponseUnmarshaller {

	public static BatchRegisterDeviceResponse unmarshall(BatchRegisterDeviceResponse batchRegisterDeviceResponse, UnmarshallerContext _ctx) {
		
		batchRegisterDeviceResponse.setRequestId(_ctx.stringValue("BatchRegisterDeviceResponse.RequestId"));
		batchRegisterDeviceResponse.setSuccess(_ctx.booleanValue("BatchRegisterDeviceResponse.Success"));
		batchRegisterDeviceResponse.setCode(_ctx.stringValue("BatchRegisterDeviceResponse.Code"));
		batchRegisterDeviceResponse.setErrorMessage(_ctx.stringValue("BatchRegisterDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setApplyId(_ctx.longValue("BatchRegisterDeviceResponse.Data.ApplyId"));
		batchRegisterDeviceResponse.setData(data);
	 
	 	return batchRegisterDeviceResponse;
	}
}