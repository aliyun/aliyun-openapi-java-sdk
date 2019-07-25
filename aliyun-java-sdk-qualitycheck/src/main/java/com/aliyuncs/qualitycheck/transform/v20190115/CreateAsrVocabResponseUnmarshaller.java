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

import com.aliyuncs.qualitycheck.model.v20190115.CreateAsrVocabResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAsrVocabResponseUnmarshaller {

	public static CreateAsrVocabResponse unmarshall(CreateAsrVocabResponse createAsrVocabResponse, UnmarshallerContext _ctx) {
		
		createAsrVocabResponse.setRequestId(_ctx.stringValue("CreateAsrVocabResponse.RequestId"));
		createAsrVocabResponse.setSuccess(_ctx.booleanValue("CreateAsrVocabResponse.Success"));
		createAsrVocabResponse.setCode(_ctx.stringValue("CreateAsrVocabResponse.Code"));
		createAsrVocabResponse.setMessage(_ctx.stringValue("CreateAsrVocabResponse.Message"));
		createAsrVocabResponse.setData(_ctx.stringValue("CreateAsrVocabResponse.Data"));
	 
	 	return createAsrVocabResponse;
	}
}