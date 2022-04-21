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

package com.aliyuncs.voicenavigator.transform.v20180612;

import com.aliyuncs.voicenavigator.model.v20180612.ModifyAsrConfigResponse;
import com.aliyuncs.voicenavigator.model.v20180612.ModifyAsrConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyAsrConfigResponseUnmarshaller {

	public static ModifyAsrConfigResponse unmarshall(ModifyAsrConfigResponse modifyAsrConfigResponse, UnmarshallerContext _ctx) {
		
		modifyAsrConfigResponse.setRequestId(_ctx.stringValue("ModifyAsrConfigResponse.RequestId"));
		modifyAsrConfigResponse.setSuccess(_ctx.booleanValue("ModifyAsrConfigResponse.Success"));
		modifyAsrConfigResponse.setHttpStatusCode(_ctx.integerValue("ModifyAsrConfigResponse.HttpStatusCode"));
		modifyAsrConfigResponse.setCode(_ctx.stringValue("ModifyAsrConfigResponse.Code"));
		modifyAsrConfigResponse.setErrorMsg(_ctx.stringValue("ModifyAsrConfigResponse.ErrorMsg"));

		Data data = new Data();
		data.setAffectedRows(_ctx.integerValue("ModifyAsrConfigResponse.Data.AffectedRows"));
		modifyAsrConfigResponse.setData(data);
	 
	 	return modifyAsrConfigResponse;
	}
}