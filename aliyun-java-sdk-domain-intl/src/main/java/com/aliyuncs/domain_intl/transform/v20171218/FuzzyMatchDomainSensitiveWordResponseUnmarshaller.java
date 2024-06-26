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

package com.aliyuncs.domain_intl.transform.v20171218;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain_intl.model.v20171218.FuzzyMatchDomainSensitiveWordResponse;
import com.aliyuncs.domain_intl.model.v20171218.FuzzyMatchDomainSensitiveWordResponse.MatchedSensitiveWord;
import com.aliyuncs.transform.UnmarshallerContext;


public class FuzzyMatchDomainSensitiveWordResponseUnmarshaller {

	public static FuzzyMatchDomainSensitiveWordResponse unmarshall(FuzzyMatchDomainSensitiveWordResponse fuzzyMatchDomainSensitiveWordResponse, UnmarshallerContext _ctx) {
		
		fuzzyMatchDomainSensitiveWordResponse.setRequestId(_ctx.stringValue("FuzzyMatchDomainSensitiveWordResponse.RequestId"));
		fuzzyMatchDomainSensitiveWordResponse.setExist(_ctx.booleanValue("FuzzyMatchDomainSensitiveWordResponse.Exist"));
		fuzzyMatchDomainSensitiveWordResponse.setKeyword(_ctx.stringValue("FuzzyMatchDomainSensitiveWordResponse.Keyword"));

		List<MatchedSensitiveWord> matchedSentiveWords = new ArrayList<MatchedSensitiveWord>();
		for (int i = 0; i < _ctx.lengthValue("FuzzyMatchDomainSensitiveWordResponse.MatchedSentiveWords.Length"); i++) {
			MatchedSensitiveWord matchedSensitiveWord = new MatchedSensitiveWord();
			matchedSensitiveWord.setWord(_ctx.stringValue("FuzzyMatchDomainSensitiveWordResponse.MatchedSentiveWords["+ i +"].Word"));

			matchedSentiveWords.add(matchedSensitiveWord);
		}
		fuzzyMatchDomainSensitiveWordResponse.setMatchedSentiveWords(matchedSentiveWords);
	 
	 	return fuzzyMatchDomainSensitiveWordResponse;
	}
}