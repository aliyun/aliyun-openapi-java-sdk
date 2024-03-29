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

	public static ListAsrVocabResponse unmarshall(ListAsrVocabResponse listAsrVocabResponse, UnmarshallerContext _ctx) {
		
		listAsrVocabResponse.setRequestId(_ctx.stringValue("ListAsrVocabResponse.RequestId"));
		listAsrVocabResponse.setCode(_ctx.stringValue("ListAsrVocabResponse.Code"));
		listAsrVocabResponse.setMessage(_ctx.stringValue("ListAsrVocabResponse.Message"));
		listAsrVocabResponse.setSuccess(_ctx.booleanValue("ListAsrVocabResponse.Success"));

		List<AsrVocab> data = new ArrayList<AsrVocab>();
		for (int i = 0; i < _ctx.lengthValue("ListAsrVocabResponse.Data.Length"); i++) {
			AsrVocab asrVocab = new AsrVocab();
			asrVocab.setVocabularyId(_ctx.stringValue("ListAsrVocabResponse.Data["+ i +"].VocabularyId"));
			asrVocab.setUpdateTime(_ctx.stringValue("ListAsrVocabResponse.Data["+ i +"].UpdateTime"));
			asrVocab.setName(_ctx.stringValue("ListAsrVocabResponse.Data["+ i +"].Name"));
			asrVocab.setCreateTime(_ctx.stringValue("ListAsrVocabResponse.Data["+ i +"].CreateTime"));
			asrVocab.setId(_ctx.stringValue("ListAsrVocabResponse.Data["+ i +"].Id"));

			data.add(asrVocab);
		}
		listAsrVocabResponse.setData(data);
	 
	 	return listAsrVocabResponse;
	}
}