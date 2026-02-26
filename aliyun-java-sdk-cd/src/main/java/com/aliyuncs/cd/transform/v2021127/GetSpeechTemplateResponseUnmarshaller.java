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

import com.aliyuncs.cd.model.v2021127.GetSpeechTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSpeechTemplateResponseUnmarshaller {

	public static GetSpeechTemplateResponse unmarshall(GetSpeechTemplateResponse getSpeechTemplateResponse, UnmarshallerContext _ctx) {
		
		getSpeechTemplateResponse.setRequestId(_ctx.stringValue("GetSpeechTemplateResponse.RequestId"));
		getSpeechTemplateResponse.setSuccess(_ctx.booleanValue("GetSpeechTemplateResponse.Success"));
		getSpeechTemplateResponse.setMessage(_ctx.stringValue("GetSpeechTemplateResponse.Message"));
		getSpeechTemplateResponse.setCode(_ctx.stringValue("GetSpeechTemplateResponse.Code"));
		getSpeechTemplateResponse.setHttpStatusCode(_ctx.integerValue("GetSpeechTemplateResponse.HttpStatusCode"));
		getSpeechTemplateResponse.setData(_ctx.stringValue("GetSpeechTemplateResponse.Data"));
	 
	 	return getSpeechTemplateResponse;
	}
}