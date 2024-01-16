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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.DeleteGbDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGbDeviceResponseUnmarshaller {

	public static DeleteGbDeviceResponse unmarshall(DeleteGbDeviceResponse deleteGbDeviceResponse, UnmarshallerContext _ctx) {
		
		deleteGbDeviceResponse.setRequestId(_ctx.stringValue("DeleteGbDeviceResponse.RequestId"));
		deleteGbDeviceResponse.setCode(_ctx.stringValue("DeleteGbDeviceResponse.Code"));
		deleteGbDeviceResponse.setErrorMessage(_ctx.stringValue("DeleteGbDeviceResponse.ErrorMessage"));
		deleteGbDeviceResponse.setSuccess(_ctx.booleanValue("DeleteGbDeviceResponse.Success"));
	 
	 	return deleteGbDeviceResponse;
	}
}