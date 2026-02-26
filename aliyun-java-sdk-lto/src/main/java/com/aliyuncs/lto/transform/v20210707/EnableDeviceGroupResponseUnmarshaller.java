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

import com.aliyuncs.lto.model.v20210707.EnableDeviceGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableDeviceGroupResponseUnmarshaller {

	public static EnableDeviceGroupResponse unmarshall(EnableDeviceGroupResponse enableDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		enableDeviceGroupResponse.setRequestId(_ctx.stringValue("EnableDeviceGroupResponse.RequestId"));
		enableDeviceGroupResponse.setCode(_ctx.stringValue("EnableDeviceGroupResponse.Code"));
		enableDeviceGroupResponse.setHttpStatusCode(_ctx.integerValue("EnableDeviceGroupResponse.HttpStatusCode"));
		enableDeviceGroupResponse.setMessage(_ctx.stringValue("EnableDeviceGroupResponse.Message"));
		enableDeviceGroupResponse.setSuccess(_ctx.booleanValue("EnableDeviceGroupResponse.Success"));
	 
	 	return enableDeviceGroupResponse;
	}
}