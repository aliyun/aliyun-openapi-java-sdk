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

import com.aliyuncs.cd.model.v2021127.DeleteSpeechTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSpeechTemplateResponseUnmarshaller {

	public static DeleteSpeechTemplateResponse unmarshall(DeleteSpeechTemplateResponse deleteSpeechTemplateResponse, UnmarshallerContext _ctx) {
		
		deleteSpeechTemplateResponse.setRequestId(_ctx.stringValue("DeleteSpeechTemplateResponse.RequestId"));
		deleteSpeechTemplateResponse.setSuccess(_ctx.booleanValue("DeleteSpeechTemplateResponse.Success"));
		deleteSpeechTemplateResponse.setMessage(_ctx.stringValue("DeleteSpeechTemplateResponse.Message"));
		deleteSpeechTemplateResponse.setCode(_ctx.stringValue("DeleteSpeechTemplateResponse.Code"));
		deleteSpeechTemplateResponse.setHttpStatusCode(_ctx.integerValue("DeleteSpeechTemplateResponse.HttpStatusCode"));
	 
	 	return deleteSpeechTemplateResponse;
	}
}