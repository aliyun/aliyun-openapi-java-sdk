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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.ListInterventionDictionaryEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInterventionDictionaryEntriesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<WordItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<WordItem> getResult() {
		return this.result;
	}

	public void setResult(List<WordItem> result) {
		this.result = result;
	}

	public static class WordItem {

		private String cmd;

		private String word;

		private Long created;

		private Long updated;

		private String status;

		private Map<Object,Object> relevance;

		private List<Token> tokens;

		public String getCmd() {
			return this.cmd;
		}

		public void setCmd(String cmd) {
			this.cmd = cmd;
		}

		public String getWord() {
			return this.word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public Long getUpdated() {
			return this.updated;
		}

		public void setUpdated(Long updated) {
			this.updated = updated;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Map<Object,Object> getRelevance() {
			return this.relevance;
		}

		public void setRelevance(Map<Object,Object> relevance) {
			this.relevance = relevance;
		}

		public List<Token> getTokens() {
			return this.tokens;
		}

		public void setTokens(List<Token> tokens) {
			this.tokens = tokens;
		}

		public static class Token {

			private String tag;

			private String token;

			private Integer order;

			private String tagLabel;

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}

			public Integer getOrder() {
				return this.order;
			}

			public void setOrder(Integer order) {
				this.order = order;
			}

			public String getTagLabel() {
				return this.tagLabel;
			}

			public void setTagLabel(String tagLabel) {
				this.tagLabel = tagLabel;
			}
		}
	}

	@Override
	public ListInterventionDictionaryEntriesResponse getInstance(UnmarshallerContext context) {
		return	ListInterventionDictionaryEntriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
