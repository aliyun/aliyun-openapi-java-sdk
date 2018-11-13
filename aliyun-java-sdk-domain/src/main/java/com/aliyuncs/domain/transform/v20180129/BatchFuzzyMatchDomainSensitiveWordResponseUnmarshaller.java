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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.BatchFuzzyMatchDomainSensitiveWordResponse;
import com.aliyuncs.domain.model.v20180129.BatchFuzzyMatchDomainSensitiveWordResponse.SensitiveWordMatchResult;
import com.aliyuncs.domain.model.v20180129.BatchFuzzyMatchDomainSensitiveWordResponse.SensitiveWordMatchResult.MatchedSensitiveWord;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchFuzzyMatchDomainSensitiveWordResponseUnmarshaller {

	public static BatchFuzzyMatchDomainSensitiveWordResponse unmarshall(BatchFuzzyMatchDomainSensitiveWordResponse batchFuzzyMatchDomainSensitiveWordResponse, UnmarshallerContext context) {
		
		batchFuzzyMatchDomainSensitiveWordResponse.setRequestId(context.stringValue("BatchFuzzyMatchDomainSensitiveWordResponse.RequestId"));

		List<SensitiveWordMatchResult> sensitiveWordMatchResultList = new ArrayList<SensitiveWordMatchResult>();
		for (int i = 0; i < context.lengthValue("BatchFuzzyMatchDomainSensitiveWordResponse.SensitiveWordMatchResultList.Length"); i++) {
			SensitiveWordMatchResult sensitiveWordMatchResult = new SensitiveWordMatchResult();
			sensitiveWordMatchResult.setKeyword(context.stringValue("BatchFuzzyMatchDomainSensitiveWordResponse.SensitiveWordMatchResultList["+ i +"].Keyword"));
			sensitiveWordMatchResult.setExist(context.booleanValue("BatchFuzzyMatchDomainSensitiveWordResponse.SensitiveWordMatchResultList["+ i +"].Exist"));

			List<MatchedSensitiveWord> matchedSentiveWords = new ArrayList<MatchedSensitiveWord>();
			for (int j = 0; j < context.lengthValue("BatchFuzzyMatchDomainSensitiveWordResponse.SensitiveWordMatchResultList["+ i +"].MatchedSentiveWords.Length"); j++) {
				MatchedSensitiveWord matchedSensitiveWord = new MatchedSensitiveWord();
				matchedSensitiveWord.setWord(context.stringValue("BatchFuzzyMatchDomainSensitiveWordResponse.SensitiveWordMatchResultList["+ i +"].MatchedSentiveWords["+ j +"].Word"));

				matchedSentiveWords.add(matchedSensitiveWord);
			}
			sensitiveWordMatchResult.setMatchedSentiveWords(matchedSentiveWords);

			sensitiveWordMatchResultList.add(sensitiveWordMatchResult);
		}
		batchFuzzyMatchDomainSensitiveWordResponse.setSensitiveWordMatchResultList(sensitiveWordMatchResultList);
	 
	 	return batchFuzzyMatchDomainSensitiveWordResponse;
	}
}