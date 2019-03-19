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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.GetAsrVocabResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAsrVocabResponseUnmarshaller {

	public static GetAsrVocabResponse unmarshall(GetAsrVocabResponse getAsrVocabResponse, UnmarshallerContext context) {
		
		getAsrVocabResponse.setRequestId(context.stringValue("GetAsrVocabResponse.RequestId"));
		getAsrVocabResponse.setSuccess(context.booleanValue("GetAsrVocabResponse.Success"));
		getAsrVocabResponse.setCode(context.stringValue("GetAsrVocabResponse.Code"));
		getAsrVocabResponse.setMessage(context.stringValue("GetAsrVocabResponse.Message"));
		getAsrVocabResponse.setData(context.stringValue("GetAsrVocabResponse.Data"));
	 
	 	return getAsrVocabResponse;
	}
}