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

	public static DeleteAsrVocabResponse unmarshall(DeleteAsrVocabResponse deleteAsrVocabResponse, UnmarshallerContext context) {
		
		deleteAsrVocabResponse.setRequestId(context.stringValue("DeleteAsrVocabResponse.RequestId"));
		deleteAsrVocabResponse.setSuccess(context.booleanValue("DeleteAsrVocabResponse.Success"));
		deleteAsrVocabResponse.setCode(context.stringValue("DeleteAsrVocabResponse.Code"));
		deleteAsrVocabResponse.setMessage(context.stringValue("DeleteAsrVocabResponse.Message"));
		deleteAsrVocabResponse.setData(context.stringValue("DeleteAsrVocabResponse.Data"));
	 
	 	return deleteAsrVocabResponse;
	}
}