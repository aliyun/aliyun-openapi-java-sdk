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

import com.aliyuncs.voicenavigator.model.v20180612.GetAsrConfigResponse;
import com.aliyuncs.voicenavigator.model.v20180612.GetAsrConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAsrConfigResponseUnmarshaller {

	public static GetAsrConfigResponse unmarshall(GetAsrConfigResponse getAsrConfigResponse, UnmarshallerContext _ctx) {
		
		getAsrConfigResponse.setRequestId(_ctx.stringValue("GetAsrConfigResponse.RequestId"));
		getAsrConfigResponse.setSuccess(_ctx.booleanValue("GetAsrConfigResponse.Success"));
		getAsrConfigResponse.setHttpStatusCode(_ctx.integerValue("GetAsrConfigResponse.HttpStatusCode"));
		getAsrConfigResponse.setCode(_ctx.stringValue("GetAsrConfigResponse.Code"));
		getAsrConfigResponse.setErrorMsg(_ctx.stringValue("GetAsrConfigResponse.ErrorMsg"));

		Data data = new Data();
		data.setAsrVocabularyId(_ctx.stringValue("GetAsrConfigResponse.Data.AsrVocabularyId"));
		data.setAsrCustomizationId(_ctx.stringValue("GetAsrConfigResponse.Data.AsrCustomizationId"));
		data.setAsrAcousticModelId(_ctx.stringValue("GetAsrConfigResponse.Data.AsrAcousticModelId"));
		data.setAsrClassVocabularyId(_ctx.stringValue("GetAsrConfigResponse.Data.AsrClassVocabularyId"));
		getAsrConfigResponse.setData(data);
	 
	 	return getAsrConfigResponse;
	}
}