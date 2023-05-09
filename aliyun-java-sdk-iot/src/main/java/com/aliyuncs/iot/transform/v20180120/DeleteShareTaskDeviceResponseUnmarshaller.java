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

import com.aliyuncs.iot.model.v20180120.DeleteShareTaskDeviceResponse;
import com.aliyuncs.iot.model.v20180120.DeleteShareTaskDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteShareTaskDeviceResponseUnmarshaller {

	public static DeleteShareTaskDeviceResponse unmarshall(DeleteShareTaskDeviceResponse deleteShareTaskDeviceResponse, UnmarshallerContext _ctx) {
		
		deleteShareTaskDeviceResponse.setRequestId(_ctx.stringValue("DeleteShareTaskDeviceResponse.RequestId"));
		deleteShareTaskDeviceResponse.setCode(_ctx.stringValue("DeleteShareTaskDeviceResponse.Code"));
		deleteShareTaskDeviceResponse.setErrorMessage(_ctx.stringValue("DeleteShareTaskDeviceResponse.ErrorMessage"));
		deleteShareTaskDeviceResponse.setSuccess(_ctx.booleanValue("DeleteShareTaskDeviceResponse.Success"));

		Data data = new Data();
		data.setProgressId(_ctx.stringValue("DeleteShareTaskDeviceResponse.Data.ProgressId"));
		data.setProgress(_ctx.integerValue("DeleteShareTaskDeviceResponse.Data.Progress"));
		deleteShareTaskDeviceResponse.setData(data);
	 
	 	return deleteShareTaskDeviceResponse;
	}
}