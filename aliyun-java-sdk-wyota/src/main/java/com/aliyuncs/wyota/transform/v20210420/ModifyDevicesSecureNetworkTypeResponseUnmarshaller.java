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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.ModifyDevicesSecureNetworkTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDevicesSecureNetworkTypeResponseUnmarshaller {

	public static ModifyDevicesSecureNetworkTypeResponse unmarshall(ModifyDevicesSecureNetworkTypeResponse modifyDevicesSecureNetworkTypeResponse, UnmarshallerContext _ctx) {
		
		modifyDevicesSecureNetworkTypeResponse.setRequestId(_ctx.stringValue("ModifyDevicesSecureNetworkTypeResponse.RequestId"));
		modifyDevicesSecureNetworkTypeResponse.setMessage(_ctx.stringValue("ModifyDevicesSecureNetworkTypeResponse.Message"));
		modifyDevicesSecureNetworkTypeResponse.setCode(_ctx.stringValue("ModifyDevicesSecureNetworkTypeResponse.Code"));
	 
	 	return modifyDevicesSecureNetworkTypeResponse;
	}
}