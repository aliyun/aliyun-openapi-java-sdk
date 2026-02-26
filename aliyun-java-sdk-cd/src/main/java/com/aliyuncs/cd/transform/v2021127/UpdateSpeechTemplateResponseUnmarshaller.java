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

package com.aliyuncs.cd.transform.v2021127;

import com.aliyuncs.cd.model.v2021127.UpdateSpeechTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSpeechTemplateResponseUnmarshaller {

	public static UpdateSpeechTemplateResponse unmarshall(UpdateSpeechTemplateResponse updateSpeechTemplateResponse, UnmarshallerContext _ctx) {
		
		updateSpeechTemplateResponse.setRequestId(_ctx.stringValue("UpdateSpeechTemplateResponse.RequestId"));
		updateSpeechTemplateResponse.setSuccess(_ctx.booleanValue("UpdateSpeechTemplateResponse.Success"));
		updateSpeechTemplateResponse.setMessage(_ctx.stringValue("UpdateSpeechTemplateResponse.Message"));
		updateSpeechTemplateResponse.setCode(_ctx.stringValue("UpdateSpeechTemplateResponse.Code"));
		updateSpeechTemplateResponse.setHttpStatusCode(_ctx.integerValue("UpdateSpeechTemplateResponse.HttpStatusCode"));
	 
	 	return updateSpeechTemplateResponse;
	}
}