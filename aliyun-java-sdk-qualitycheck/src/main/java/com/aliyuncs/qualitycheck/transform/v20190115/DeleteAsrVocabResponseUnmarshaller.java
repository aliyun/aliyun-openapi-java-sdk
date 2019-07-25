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

import com.aliyuncs.qualitycheck.model.v20190115.DeleteAsrVocabResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAsrVocabResponseUnmarshaller {

	public static DeleteAsrVocabResponse unmarshall(DeleteAsrVocabResponse deleteAsrVocabResponse, UnmarshallerContext _ctx) {
		
		deleteAsrVocabResponse.setRequestId(_ctx.stringValue("DeleteAsrVocabResponse.RequestId"));
		deleteAsrVocabResponse.setSuccess(_ctx.booleanValue("DeleteAsrVocabResponse.Success"));
		deleteAsrVocabResponse.setCode(_ctx.stringValue("DeleteAsrVocabResponse.Code"));
		deleteAsrVocabResponse.setMessage(_ctx.stringValue("DeleteAsrVocabResponse.Message"));
		deleteAsrVocabResponse.setData(_ctx.stringValue("DeleteAsrVocabResponse.Data"));
	 
	 	return deleteAsrVocabResponse;
	}
}