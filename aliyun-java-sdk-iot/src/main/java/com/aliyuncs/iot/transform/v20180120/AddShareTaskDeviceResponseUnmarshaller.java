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

import com.aliyuncs.iot.model.v20180120.AddShareTaskDeviceResponse;
import com.aliyuncs.iot.model.v20180120.AddShareTaskDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddShareTaskDeviceResponseUnmarshaller {

	public static AddShareTaskDeviceResponse unmarshall(AddShareTaskDeviceResponse addShareTaskDeviceResponse, UnmarshallerContext _ctx) {
		
		addShareTaskDeviceResponse.setRequestId(_ctx.stringValue("AddShareTaskDeviceResponse.RequestId"));
		addShareTaskDeviceResponse.setCode(_ctx.stringValue("AddShareTaskDeviceResponse.Code"));
		addShareTaskDeviceResponse.setErrorMessage(_ctx.stringValue("AddShareTaskDeviceResponse.ErrorMessage"));
		addShareTaskDeviceResponse.setSuccess(_ctx.booleanValue("AddShareTaskDeviceResponse.Success"));

		Data data = new Data();
		data.setProgressId(_ctx.stringValue("AddShareTaskDeviceResponse.Data.ProgressId"));
		data.setSuccessSum(_ctx.integerValue("AddShareTaskDeviceResponse.Data.SuccessSum"));
		data.setProgress(_ctx.integerValue("AddShareTaskDeviceResponse.Data.Progress"));
		data.setFailedResultCsvFile(_ctx.stringValue("AddShareTaskDeviceResponse.Data.FailedResultCsvFile"));
		data.setFailSum(_ctx.integerValue("AddShareTaskDeviceResponse.Data.FailSum"));
		addShareTaskDeviceResponse.setData(data);
	 
	 	return addShareTaskDeviceResponse;
	}
}