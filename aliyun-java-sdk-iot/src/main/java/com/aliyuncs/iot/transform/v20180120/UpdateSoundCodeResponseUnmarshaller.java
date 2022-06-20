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

import com.aliyuncs.iot.model.v20180120.UpdateSoundCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSoundCodeResponseUnmarshaller {

	public static UpdateSoundCodeResponse unmarshall(UpdateSoundCodeResponse updateSoundCodeResponse, UnmarshallerContext _ctx) {
		
		updateSoundCodeResponse.setRequestId(_ctx.stringValue("UpdateSoundCodeResponse.RequestId"));
		updateSoundCodeResponse.setSuccess(_ctx.booleanValue("UpdateSoundCodeResponse.Success"));
		updateSoundCodeResponse.setCode(_ctx.stringValue("UpdateSoundCodeResponse.Code"));
		updateSoundCodeResponse.setErrorMessage(_ctx.stringValue("UpdateSoundCodeResponse.ErrorMessage"));
	 
	 	return updateSoundCodeResponse;
	}
}