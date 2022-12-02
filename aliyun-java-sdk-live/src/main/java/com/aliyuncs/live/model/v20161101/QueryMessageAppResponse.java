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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.QueryMessageAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMessageAppResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Integer totalCount;

		private Boolean hasMore;

		private List<AppListItem> appList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Boolean getHasMore() {
			return this.hasMore;
		}

		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}

		public List<AppListItem> getAppList() {
			return this.appList;
		}

		public void setAppList(List<AppListItem> appList) {
			this.appList = appList;
		}

		public static class AppListItem {

			private String appId;

			private String appName;

			private Long createTime;

			private Integer status;

			private Map<Object,Object> appConfig;

			private Map<Object,Object> extension;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Map<Object,Object> getAppConfig() {
				return this.appConfig;
			}

			public void setAppConfig(Map<Object,Object> appConfig) {
				this.appConfig = appConfig;
			}

			public Map<Object,Object> getExtension() {
				return this.extension;
			}

			public void setExtension(Map<Object,Object> extension) {
				this.extension = extension;
			}
		}
	}

	@Override
	public QueryMessageAppResponse getInstance(UnmarshallerContext context) {
		return	QueryMessageAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
