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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListIntentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIntentsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Intents intents;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Intents getIntents() {
		return this.intents;
	}

	public void setIntents(Intents intents) {
		this.intents = intents;
	}

	public static class Intents {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<Intent> list;

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

		public List<Intent> getList() {
			return this.list;
		}

		public void setList(List<Intent> list) {
			this.list = list;
		}

		public static class Intent {

			private String utterances;

			private String intentDescription;

			private Long updateTime;

			private Long createTime;

			private String keywords;

			private String scriptId;

			private String intentId;

			private String intentName;

			public String getUtterances() {
				return this.utterances;
			}

			public void setUtterances(String utterances) {
				this.utterances = utterances;
			}

			public String getIntentDescription() {
				return this.intentDescription;
			}

			public void setIntentDescription(String intentDescription) {
				this.intentDescription = intentDescription;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getKeywords() {
				return this.keywords;
			}

			public void setKeywords(String keywords) {
				this.keywords = keywords;
			}

			public String getScriptId() {
				return this.scriptId;
			}

			public void setScriptId(String scriptId) {
				this.scriptId = scriptId;
			}

			public String getIntentId() {
				return this.intentId;
			}

			public void setIntentId(String intentId) {
				this.intentId = intentId;
			}

			public String getIntentName() {
				return this.intentName;
			}

			public void setIntentName(String intentName) {
				this.intentName = intentName;
			}
		}
	}

	@Override
	public ListIntentsResponse getInstance(UnmarshallerContext context) {
		return	ListIntentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
