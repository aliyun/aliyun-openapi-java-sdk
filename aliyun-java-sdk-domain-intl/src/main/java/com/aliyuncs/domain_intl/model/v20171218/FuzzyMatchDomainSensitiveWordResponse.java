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

package com.aliyuncs.domain_intl.model.v20171218;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain_intl.transform.v20171218.FuzzyMatchDomainSensitiveWordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FuzzyMatchDomainSensitiveWordResponse extends AcsResponse {

	private String requestId;

	private String keyword;

	private Boolean exist;

	private List<MatchedSensitiveWord> matchedSentiveWords;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Boolean getExist() {
		return this.exist;
	}

	public void setExist(Boolean exist) {
		this.exist = exist;
	}

	public List<MatchedSensitiveWord> getMatchedSentiveWords() {
		return this.matchedSentiveWords;
	}

	public void setMatchedSentiveWords(List<MatchedSensitiveWord> matchedSentiveWords) {
		this.matchedSentiveWords = matchedSentiveWords;
	}

	public static class MatchedSensitiveWord {

		private String word;

		public String getWord() {
			return this.word;
		}

		public void setWord(String word) {
			this.word = word;
		}
	}

	@Override
	public FuzzyMatchDomainSensitiveWordResponse getInstance(UnmarshallerContext context) {
		return	FuzzyMatchDomainSensitiveWordResponseUnmarshaller.unmarshall(this, context);
	}
}
