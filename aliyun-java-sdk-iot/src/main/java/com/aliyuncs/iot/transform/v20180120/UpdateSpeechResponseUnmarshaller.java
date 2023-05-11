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

import com.aliyuncs.iot.model.v20180120.UpdateSpeechResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSpeechResponseUnmarshaller {

	public static UpdateSpeechResponse unmarshall(UpdateSpeechResponse updateSpeechResponse, UnmarshallerContext _ctx) {
		
		updateSpeechResponse.setRequestId(_ctx.stringValue("UpdateSpeechResponse.RequestId"));
		updateSpeechResponse.setSuccess(_ctx.booleanValue("UpdateSpeechResponse.Success"));
		updateSpeechResponse.setCode(_ctx.stringValue("UpdateSpeechResponse.Code"));
		updateSpeechResponse.setErrorMessage(_ctx.stringValue("UpdateSpeechResponse.ErrorMessage"));
	 
	 	return updateSpeechResponse;
	}
}