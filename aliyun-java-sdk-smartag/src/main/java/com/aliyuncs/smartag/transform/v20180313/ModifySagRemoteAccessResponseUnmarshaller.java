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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.ModifySagRemoteAccessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySagRemoteAccessResponseUnmarshaller {

	public static ModifySagRemoteAccessResponse unmarshall(ModifySagRemoteAccessResponse modifySagRemoteAccessResponse, UnmarshallerContext _ctx) {
		
		modifySagRemoteAccessResponse.setRequestId(_ctx.stringValue("ModifySagRemoteAccessResponse.RequestId"));
		modifySagRemoteAccessResponse.setSerialNumber(_ctx.stringValue("ModifySagRemoteAccessResponse.SerialNumber"));
		modifySagRemoteAccessResponse.setMessage(_ctx.stringValue("ModifySagRemoteAccessResponse.Message"));
		modifySagRemoteAccessResponse.setRemoteAccessIp(_ctx.stringValue("ModifySagRemoteAccessResponse.RemoteAccessIp"));
		modifySagRemoteAccessResponse.setCode(_ctx.stringValue("ModifySagRemoteAccessResponse.Code"));
		modifySagRemoteAccessResponse.setSuccess(_ctx.booleanValue("ModifySagRemoteAccessResponse.Success"));
	 
	 	return modifySagRemoteAccessResponse;
	}
}