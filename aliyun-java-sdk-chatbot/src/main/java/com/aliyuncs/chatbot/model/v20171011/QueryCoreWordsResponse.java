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

package com.aliyuncs.chatbot.model.v20171011;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.chatbot.transform.v20171011.QueryCoreWordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCoreWordsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<CoreWord> coreWords;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<CoreWord> getCoreWords() {
		return this.coreWords;
	}

	public void setCoreWords(List<CoreWord> coreWords) {
		this.coreWords = coreWords;
	}

	public static class CoreWord {

		private String coreWordCode;

		private String coreWordName;

		private String modifyTime;

		private String createTime;

		private List<String> synonyms;

		public String getCoreWordCode() {
			return this.coreWordCode;
		}

		public void setCoreWordCode(String coreWordCode) {
			this.coreWordCode = coreWordCode;
		}

		public String getCoreWordName() {
			return this.coreWordName;
		}

		public void setCoreWordName(String coreWordName) {
			this.coreWordName = coreWordName;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<String> getSynonyms() {
			return this.synonyms;
		}

		public void setSynonyms(List<String> synonyms) {
			this.synonyms = synonyms;
		}
	}

	@Override
	public QueryCoreWordsResponse getInstance(UnmarshallerContext context) {
		return	QueryCoreWordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
