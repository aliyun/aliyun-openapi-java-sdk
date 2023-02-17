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

package com.aliyuncs.mns_open.model.v20220119;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mns_open.transform.v20220119.ListSubscriptionByTopicResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSubscriptionByTopicResponse extends AcsResponse {

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

		private Long size;

		private Long pages;

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

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Long getPages() {
			return this.pages;
		}

		public void setPages(Long pages) {
			this.pages = pages;
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

			private String subscriptionName;

			private String topicOwner;

			private String topicName;

			private String endpoint;

			private String filterTag;

			private Long createTime;

			private Long lastModifyTime;

			private String notifyStrategy;

			private String notifyContentFormat;

			public String getSubscriptionName() {
				return this.subscriptionName;
			}

			public void setSubscriptionName(String subscriptionName) {
				this.subscriptionName = subscriptionName;
			}

			public String getTopicOwner() {
				return this.topicOwner;
			}

			public void setTopicOwner(String topicOwner) {
				this.topicOwner = topicOwner;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getFilterTag() {
				return this.filterTag;
			}

			public void setFilterTag(String filterTag) {
				this.filterTag = filterTag;
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

			public String getNotifyStrategy() {
				return this.notifyStrategy;
			}

			public void setNotifyStrategy(String notifyStrategy) {
				this.notifyStrategy = notifyStrategy;
			}

			public String getNotifyContentFormat() {
				return this.notifyContentFormat;
			}

			public void setNotifyContentFormat(String notifyContentFormat) {
				this.notifyContentFormat = notifyContentFormat;
			}
		}
	}

	@Override
	public ListSubscriptionByTopicResponse getInstance(UnmarshallerContext context) {
		return	ListSubscriptionByTopicResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
