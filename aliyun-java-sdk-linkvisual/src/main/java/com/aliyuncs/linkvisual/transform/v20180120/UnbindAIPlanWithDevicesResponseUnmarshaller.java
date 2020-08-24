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

import com.aliyuncs.linkvisual.model.v20180120.UnbindAIPlanWithDevicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindAIPlanWithDevicesResponseUnmarshaller {

	public static UnbindAIPlanWithDevicesResponse unmarshall(UnbindAIPlanWithDevicesResponse unbindAIPlanWithDevicesResponse, UnmarshallerContext _ctx) {
		
		unbindAIPlanWithDevicesResponse.setRequestId(_ctx.stringValue("UnbindAIPlanWithDevicesResponse.RequestId"));
		unbindAIPlanWithDevicesResponse.setSuccess(_ctx.booleanValue("UnbindAIPlanWithDevicesResponse.Success"));
		unbindAIPlanWithDevicesResponse.setErrorMessage(_ctx.stringValue("UnbindAIPlanWithDevicesResponse.ErrorMessage"));
		unbindAIPlanWithDevicesResponse.setCode(_ctx.stringValue("UnbindAIPlanWithDevicesResponse.Code"));
	 
	 	return unbindAIPlanWithDevicesResponse;
	}
}