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

package com.aliyuncs.mns.model.v20210319;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mns.transform.v20210319.ConsoleClearPretendStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ConsoleClearPretendStatusResponse extends AcsResponse {

	private String requestId;

	private Long code;

	private String status;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNum;

		private Long pageSize;

		private Long total;

		private List<PageDataItem> pageData;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<PageDataItem> getPageData() {
			return this.pageData;
		}

		public void setPageData(List<PageDataItem> pageData) {
			this.pageData = pageData;
		}

		public static class PageDataItem {

			private String topicName;

			private Long messageCount;

			private Long maxMessageSize;

			private Long messageRetentionPeriod;

			private Long createTime;

			private Long lastModifyTime;

			private String topicURL;

			private Boolean loggingEnabled;

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}

			public Long getMessageCount() {
				return this.messageCount;
			}

			public void setMessageCount(Long messageCount) {
				this.messageCount = messageCount;
			}

			public Long getMaxMessageSize() {
				return this.maxMessageSize;
			}

			public void setMaxMessageSize(Long maxMessageSize) {
				this.maxMessageSize = maxMessageSize;
			}

			public Long getMessageRetentionPeriod() {
				return this.messageRetentionPeriod;
			}

			public void setMessageRetentionPeriod(Long messageRetentionPeriod) {
				this.messageRetentionPeriod = messageRetentionPeriod;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getLastModifyTime() {
				return this.lastModifyTime;
			}

			public void setLastModifyTime(Long lastModifyTime) {
				this.lastModifyTime = lastModifyTime;
			}

			public String getTopicURL() {
				return this.topicURL;
			}

			public void setTopicURL(String topicURL) {
				this.topicURL = topicURL;
			}

			public Boolean getLoggingEnabled() {
				return this.loggingEnabled;
			}

			public void setLoggingEnabled(Boolean loggingEnabled) {
				this.loggingEnabled = loggingEnabled;
			}
		}
	}

	@Override
	public ConsoleClearPretendStatusResponse getInstance(UnmarshallerContext context) {
		return	ConsoleClearPretendStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
