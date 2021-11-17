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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.UnbindDeviceByUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindDeviceByUserResponseUnmarshaller {

	public static UnbindDeviceByUserResponse unmarshall(UnbindDeviceByUserResponse unbindDeviceByUserResponse, UnmarshallerContext _ctx) {
		
		unbindDeviceByUserResponse.setRequestId(_ctx.stringValue("UnbindDeviceByUserResponse.RequestId"));
		unbindDeviceByUserResponse.setErrorMessage(_ctx.stringValue("UnbindDeviceByUserResponse.ErrorMessage"));
		unbindDeviceByUserResponse.setSuccess(_ctx.booleanValue("UnbindDeviceByUserResponse.Success"));
		unbindDeviceByUserResponse.setErrorCode(_ctx.stringValue("UnbindDeviceByUserResponse.ErrorCode"));
	 
	 	return unbindDeviceByUserResponse;
	}
}