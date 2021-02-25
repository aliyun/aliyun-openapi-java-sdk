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

package com.aliyuncs.onsmqtt.transform.v20200420;

import com.aliyuncs.onsmqtt.model.v20200420.RefreshDeviceCredentialResponse;
import com.aliyuncs.onsmqtt.model.v20200420.RefreshDeviceCredentialResponse.DeviceCredential;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefreshDeviceCredentialResponseUnmarshaller {

	public static RefreshDeviceCredentialResponse unmarshall(RefreshDeviceCredentialResponse refreshDeviceCredentialResponse, UnmarshallerContext _ctx) {
		
		refreshDeviceCredentialResponse.setRequestId(_ctx.stringValue("RefreshDeviceCredentialResponse.RequestId"));

		DeviceCredential deviceCredential = new DeviceCredential();
		deviceCredential.setClientId(_ctx.stringValue("RefreshDeviceCredentialResponse.DeviceCredential.ClientId"));
		deviceCredential.setDeviceAccessKeyId(_ctx.stringValue("RefreshDeviceCredentialResponse.DeviceCredential.DeviceAccessKeyId"));
		deviceCredential.setDeviceAccessKeySecret(_ctx.stringValue("RefreshDeviceCredentialResponse.DeviceCredential.DeviceAccessKeySecret"));
		deviceCredential.setInstanceId(_ctx.stringValue("RefreshDeviceCredentialResponse.DeviceCredential.InstanceId"));
		deviceCredential.setCreateTime(_ctx.longValue("RefreshDeviceCredentialResponse.DeviceCredential.CreateTime"));
		deviceCredential.setUpdateTime(_ctx.longValue("RefreshDeviceCredentialResponse.DeviceCredential.UpdateTime"));
		refreshDeviceCredentialResponse.setDeviceCredential(deviceCredential);
	 
	 	return refreshDeviceCredentialResponse;
	}
}