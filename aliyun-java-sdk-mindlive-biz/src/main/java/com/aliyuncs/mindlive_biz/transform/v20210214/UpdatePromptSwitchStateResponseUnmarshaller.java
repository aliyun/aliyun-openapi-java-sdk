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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.UpdatePromptSwitchStateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePromptSwitchStateResponseUnmarshaller {

	public static UpdatePromptSwitchStateResponse unmarshall(UpdatePromptSwitchStateResponse updatePromptSwitchStateResponse, UnmarshallerContext _ctx) {
		
		updatePromptSwitchStateResponse.setRequestId(_ctx.stringValue("UpdatePromptSwitchStateResponse.RequestId"));
		updatePromptSwitchStateResponse.setData(_ctx.booleanValue("UpdatePromptSwitchStateResponse.Data"));
		updatePromptSwitchStateResponse.setErrorMessage(_ctx.stringValue("UpdatePromptSwitchStateResponse.ErrorMessage"));
		updatePromptSwitchStateResponse.setErrorCode(_ctx.stringValue("UpdatePromptSwitchStateResponse.ErrorCode"));
		updatePromptSwitchStateResponse.setSuccess(_ctx.booleanValue("UpdatePromptSwitchStateResponse.Success"));
	 
	 	return updatePromptSwitchStateResponse;
	}
}