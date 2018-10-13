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

import com.aliyuncs.iot.model.v20180120.ForceSetDeviceGroupTagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ForceSetDeviceGroupTagResponseUnmarshaller {

	public static ForceSetDeviceGroupTagResponse unmarshall(ForceSetDeviceGroupTagResponse forceSetDeviceGroupTagResponse, UnmarshallerContext context) {
		
		forceSetDeviceGroupTagResponse.setRequestId(context.stringValue("ForceSetDeviceGroupTagResponse.RequestId"));
		forceSetDeviceGroupTagResponse.setSuccess(context.booleanValue("ForceSetDeviceGroupTagResponse.Success"));
		forceSetDeviceGroupTagResponse.setCode(context.stringValue("ForceSetDeviceGroupTagResponse.Code"));
		forceSetDeviceGroupTagResponse.setErrorMessage(context.stringValue("ForceSetDeviceGroupTagResponse.ErrorMessage"));
	 
	 	return forceSetDeviceGroupTagResponse;
	}
}