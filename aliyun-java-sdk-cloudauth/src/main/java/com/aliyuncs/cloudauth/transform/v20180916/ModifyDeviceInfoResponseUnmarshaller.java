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

package com.aliyuncs.cloudauth.transform.v20180916;

import com.aliyuncs.cloudauth.model.v20180916.ModifyDeviceInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDeviceInfoResponseUnmarshaller {

	public static ModifyDeviceInfoResponse unmarshall(ModifyDeviceInfoResponse modifyDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		modifyDeviceInfoResponse.setRequestId(_ctx.stringValue("ModifyDeviceInfoResponse.RequestId"));
		modifyDeviceInfoResponse.setDeviceId(_ctx.stringValue("ModifyDeviceInfoResponse.DeviceId"));
		modifyDeviceInfoResponse.setUserDeviceId(_ctx.stringValue("ModifyDeviceInfoResponse.UserDeviceId"));
		modifyDeviceInfoResponse.setBizType(_ctx.stringValue("ModifyDeviceInfoResponse.BizType"));
		modifyDeviceInfoResponse.setBeginDay(_ctx.stringValue("ModifyDeviceInfoResponse.BeginDay"));
		modifyDeviceInfoResponse.setExpiredDay(_ctx.stringValue("ModifyDeviceInfoResponse.ExpiredDay"));
	 
	 	return modifyDeviceInfoResponse;
	}
}