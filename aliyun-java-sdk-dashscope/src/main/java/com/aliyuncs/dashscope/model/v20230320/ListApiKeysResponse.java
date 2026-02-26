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

package com.aliyuncs.dashscope.model.v20230320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dashscope.transform.v20230320.ListApiKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApiKeysResponse extends AcsResponse {

	private String requestId;

	private String accessDeniedDetail;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private Long pageSize;

		private Long pageNo;

		private List<ApiKey> apiKeys;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Long pageNo) {
			this.pageNo = pageNo;
		}

		public List<ApiKey> getApiKeys() {
			return this.apiKeys;
		}

		public void setApiKeys(List<ApiKey> apiKeys) {
			this.apiKeys = apiKeys;
		}

		public static class ApiKey {

			private Long id;

			private String userId;

			private String apiKey;

			private String gmtCreate;

			private String gmtExpire;

			private String latestActiveTime;

			private Boolean deleted;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getApiKey() {
				return this.apiKey;
			}

			public void setApiKey(String apiKey) {
				this.apiKey = apiKey;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtExpire() {
				return this.gmtExpire;
			}

			public void setGmtExpire(String gmtExpire) {
				this.gmtExpire = gmtExpire;
			}

			public String getLatestActiveTime() {
				return this.latestActiveTime;
			}

			public void setLatestActiveTime(String latestActiveTime) {
				this.latestActiveTime = latestActiveTime;
			}

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
			}
		}
	}

	@Override
	public ListApiKeysResponse getInstance(UnmarshallerContext context) {
		return	ListApiKeysResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
