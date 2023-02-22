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

import com.aliyuncs.sas.model.v20181203.CreateHoneypotPresetResponse;
import com.aliyuncs.sas.model.v20181203.CreateHoneypotPresetResponse.HoneypotPreset;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHoneypotPresetResponseUnmarshaller {

	public static CreateHoneypotPresetResponse unmarshall(CreateHoneypotPresetResponse createHoneypotPresetResponse, UnmarshallerContext _ctx) {
		
		createHoneypotPresetResponse.setRequestId(_ctx.stringValue("CreateHoneypotPresetResponse.RequestId"));
		createHoneypotPresetResponse.setSuccess(_ctx.booleanValue("CreateHoneypotPresetResponse.Success"));
		createHoneypotPresetResponse.setCode(_ctx.stringValue("CreateHoneypotPresetResponse.Code"));
		createHoneypotPresetResponse.setMessage(_ctx.stringValue("CreateHoneypotPresetResponse.Message"));
		createHoneypotPresetResponse.setHttpStatusCode(_ctx.integerValue("CreateHoneypotPresetResponse.HttpStatusCode"));

		HoneypotPreset honeypotPreset = new HoneypotPreset();
		honeypotPreset.setHoneypotPresetId(_ctx.stringValue("CreateHoneypotPresetResponse.HoneypotPreset.HoneypotPresetId"));
		createHoneypotPresetResponse.setHoneypotPreset(honeypotPreset);
	 
	 	return createHoneypotPresetResponse;
	}
}