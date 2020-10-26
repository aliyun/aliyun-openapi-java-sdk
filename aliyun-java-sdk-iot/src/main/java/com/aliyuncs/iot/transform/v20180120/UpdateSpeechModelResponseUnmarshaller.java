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

import com.aliyuncs.iot.model.v20180120.UpdateSpeechModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSpeechModelResponseUnmarshaller {

	public static UpdateSpeechModelResponse unmarshall(UpdateSpeechModelResponse updateSpeechModelResponse, UnmarshallerContext _ctx) {
		
		updateSpeechModelResponse.setRequestId(_ctx.stringValue("UpdateSpeechModelResponse.RequestId"));
		updateSpeechModelResponse.setSuccess(_ctx.booleanValue("UpdateSpeechModelResponse.Success"));
		updateSpeechModelResponse.setCode(_ctx.stringValue("UpdateSpeechModelResponse.Code"));
		updateSpeechModelResponse.setErrorMessage(_ctx.stringValue("UpdateSpeechModelResponse.ErrorMessage"));
	 
	 	return updateSpeechModelResponse;
	}
}