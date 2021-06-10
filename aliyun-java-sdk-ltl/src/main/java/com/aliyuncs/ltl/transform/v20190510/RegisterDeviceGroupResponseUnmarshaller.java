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

package com.aliyuncs.ltl.transform.v20190510;

import com.aliyuncs.ltl.model.v20190510.RegisterDeviceGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterDeviceGroupResponseUnmarshaller {

	public static RegisterDeviceGroupResponse unmarshall(RegisterDeviceGroupResponse registerDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		registerDeviceGroupResponse.setRequestId(_ctx.stringValue("RegisterDeviceGroupResponse.RequestId"));
		registerDeviceGroupResponse.setCode(_ctx.integerValue("RegisterDeviceGroupResponse.Code"));
		registerDeviceGroupResponse.setSuccess(_ctx.booleanValue("RegisterDeviceGroupResponse.Success"));
		registerDeviceGroupResponse.setMessage(_ctx.stringValue("RegisterDeviceGroupResponse.Message"));
		registerDeviceGroupResponse.setData(_ctx.stringValue("RegisterDeviceGroupResponse.Data"));
	 
	 	return registerDeviceGroupResponse;
	}
}