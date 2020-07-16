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

	private List<WordItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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
