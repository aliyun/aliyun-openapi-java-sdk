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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.DisableDeviceGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableDeviceGroupResponseUnmarshaller {

	public static DisableDeviceGroupResponse unmarshall(DisableDeviceGroupResponse disableDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		disableDeviceGroupResponse.setRequestId(_ctx.stringValue("DisableDeviceGroupResponse.RequestId"));
		disableDeviceGroupResponse.setCode(_ctx.stringValue("DisableDeviceGroupResponse.Code"));
		disableDeviceGroupResponse.setHttpStatusCode(_ctx.integerValue("DisableDeviceGroupResponse.HttpStatusCode"));
		disableDeviceGroupResponse.setMessage(_ctx.stringValue("DisableDeviceGroupResponse.Message"));
		disableDeviceGroupResponse.setSuccess(_ctx.booleanValue("DisableDeviceGroupResponse.Success"));
	 
	 	return disableDeviceGroupResponse;
	}
}