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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListLiveMessageAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLiveMessageAppsResponse extends AcsResponse {

	private String requestId;

	private Boolean hasMore;

	private Long nextPageToken;

	private List<Apps> appList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getHasMore() {
		return this.hasMore;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	public Long getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(Long nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public List<Apps> getAppList() {
		return this.appList;
	}

	public void setAppList(List<Apps> appList) {
		this.appList = appList;
	}

	public static class Apps {

		private String appId;

		private String appKey;

		private String appSign;

		private String disable;

		private String appName;

		private Long createTime;

		private Long modifyTime;

		private String dataCenter;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}

		public String getAppSign() {
			return this.appSign;
		}

		public void setAppSign(String appSign) {
			this.appSign = appSign;
		}

		public String getDisable() {
			return this.disable;
		}

		public void setDisable(String disable) {
			this.disable = disable;
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

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getDataCenter() {
			return this.dataCenter;
		}

		public void setDataCenter(String dataCenter) {
			this.dataCenter = dataCenter;
		}
	}

	@Override
	public ListLiveMessageAppsResponse getInstance(UnmarshallerContext context) {
		return	ListLiveMessageAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
