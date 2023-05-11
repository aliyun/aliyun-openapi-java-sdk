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

import com.aliyuncs.iot.model.v20180120.DeleteSoundCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSoundCodeResponseUnmarshaller {

	public static DeleteSoundCodeResponse unmarshall(DeleteSoundCodeResponse deleteSoundCodeResponse, UnmarshallerContext _ctx) {
		
		deleteSoundCodeResponse.setRequestId(_ctx.stringValue("DeleteSoundCodeResponse.RequestId"));
		deleteSoundCodeResponse.setSuccess(_ctx.booleanValue("DeleteSoundCodeResponse.Success"));
		deleteSoundCodeResponse.setCode(_ctx.stringValue("DeleteSoundCodeResponse.Code"));
		deleteSoundCodeResponse.setErrorMessage(_ctx.stringValue("DeleteSoundCodeResponse.ErrorMessage"));
	 
	 	return deleteSoundCodeResponse;
	}
}