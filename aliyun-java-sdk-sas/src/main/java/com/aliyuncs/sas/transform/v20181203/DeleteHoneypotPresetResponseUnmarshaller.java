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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DeleteHoneypotPresetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteHoneypotPresetResponseUnmarshaller {

	public static DeleteHoneypotPresetResponse unmarshall(DeleteHoneypotPresetResponse deleteHoneypotPresetResponse, UnmarshallerContext _ctx) {
		
		deleteHoneypotPresetResponse.setRequestId(_ctx.stringValue("DeleteHoneypotPresetResponse.RequestId"));
		deleteHoneypotPresetResponse.setSuccess(_ctx.booleanValue("DeleteHoneypotPresetResponse.Success"));
		deleteHoneypotPresetResponse.setCode(_ctx.stringValue("DeleteHoneypotPresetResponse.Code"));
		deleteHoneypotPresetResponse.setMessage(_ctx.stringValue("DeleteHoneypotPresetResponse.Message"));
		deleteHoneypotPresetResponse.setHttpStatusCode(_ctx.integerValue("DeleteHoneypotPresetResponse.HttpStatusCode"));
	 
	 	return deleteHoneypotPresetResponse;
	}
}