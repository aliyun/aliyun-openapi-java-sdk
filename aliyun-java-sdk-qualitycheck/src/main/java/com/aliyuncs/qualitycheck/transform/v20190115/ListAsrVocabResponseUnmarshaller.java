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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListAsrVocabResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListAsrVocabResponse.AsrVocab;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAsrVocabResponseUnmarshaller {

	public static ListAsrVocabResponse unmarshall(ListAsrVocabResponse listAsrVocabResponse, UnmarshallerContext context) {
		
		listAsrVocabResponse.setRequestId(context.stringValue("ListAsrVocabResponse.RequestId"));
		listAsrVocabResponse.setSuccess(context.booleanValue("ListAsrVocabResponse.Success"));
		listAsrVocabResponse.setCode(context.stringValue("ListAsrVocabResponse.Code"));
		listAsrVocabResponse.setMessage(context.stringValue("ListAsrVocabResponse.Message"));

		List<AsrVocab> data = new ArrayList<AsrVocab>();
		for (int i = 0; i < context.lengthValue("ListAsrVocabResponse.Data.Length"); i++) {
			AsrVocab asrVocab = new AsrVocab();
			asrVocab.setName(context.stringValue("ListAsrVocabResponse.Data["+ i +"].Name"));
			asrVocab.setCreateTime(context.stringValue("ListAsrVocabResponse.Data["+ i +"].CreateTime"));
			asrVocab.setUpdateTime(context.stringValue("ListAsrVocabResponse.Data["+ i +"].UpdateTime"));
			asrVocab.setVocabularyId(context.stringValue("ListAsrVocabResponse.Data["+ i +"].VocabularyId"));

			data.add(asrVocab);
		}
		listAsrVocabResponse.setData(data);
	 
	 	return listAsrVocabResponse;
	}
}