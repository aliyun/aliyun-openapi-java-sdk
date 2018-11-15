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

package com.aliyuncs.chatbot.transform.v20171011;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.chatbot.model.v20171011.QueryCoreWordsResponse;
import com.aliyuncs.chatbot.model.v20171011.QueryCoreWordsResponse.CoreWord;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCoreWordsResponseUnmarshaller {

	public static QueryCoreWordsResponse unmarshall(QueryCoreWordsResponse queryCoreWordsResponse, UnmarshallerContext context) {
		
		queryCoreWordsResponse.setRequestId(context.stringValue("QueryCoreWordsResponse.RequestId"));
		queryCoreWordsResponse.setPageNumber(context.integerValue("QueryCoreWordsResponse.PageNumber"));
		queryCoreWordsResponse.setPageSize(context.integerValue("QueryCoreWordsResponse.PageSize"));
		queryCoreWordsResponse.setTotalCount(context.integerValue("QueryCoreWordsResponse.TotalCount"));

		List<CoreWord> coreWords = new ArrayList<CoreWord>();
		for (int i = 0; i < context.lengthValue("QueryCoreWordsResponse.CoreWords.Length"); i++) {
			CoreWord coreWord = new CoreWord();
			coreWord.setCoreWordCode(context.stringValue("QueryCoreWordsResponse.CoreWords["+ i +"].CoreWordCode"));
			coreWord.setCoreWordName(context.stringValue("QueryCoreWordsResponse.CoreWords["+ i +"].CoreWordName"));
			coreWord.setModifyTime(context.stringValue("QueryCoreWordsResponse.CoreWords["+ i +"].ModifyTime"));
			coreWord.setCreateTime(context.stringValue("QueryCoreWordsResponse.CoreWords["+ i +"].CreateTime"));

			List<String> synonyms = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryCoreWordsResponse.CoreWords["+ i +"].Synonyms.Length"); j++) {
				synonyms.add(context.stringValue("QueryCoreWordsResponse.CoreWords["+ i +"].Synonyms["+ j +"]"));
			}
			coreWord.setSynonyms(synonyms);

			coreWords.add(coreWord);
		}
		queryCoreWordsResponse.setCoreWords(coreWords);
	 
	 	return queryCoreWordsResponse;
	}
}