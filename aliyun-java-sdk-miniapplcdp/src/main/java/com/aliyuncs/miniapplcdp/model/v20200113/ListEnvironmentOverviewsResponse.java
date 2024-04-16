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

package com.aliyuncs.miniapplcdp.model.v20200113;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.miniapplcdp.transform.v20200113.ListEnvironmentOverviewsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnvironmentOverviewsResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<EnvironmentItem> items;

		public List<EnvironmentItem> getItems() {
			return this.items;
		}

		public void setItems(List<EnvironmentItem> items) {
			this.items = items;
		}

		public static class EnvironmentItem {

			private String appId;

			private Map<Object,Object> config;

			private Map<Object,Object> currentPublish;

			private String endpoint;

			private String envId;

			private String createTime;

			private String modifiedTime;

			private Map<Object,Object> opsRecord;

			private Map<Object,Object> publishing;

			private String envStatus;

			private String envType;

			private String latestAppAccessTime;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Map<Object,Object> getConfig() {
				return this.config;
			}

			public void setConfig(Map<Object,Object> config) {
				this.config = config;
			}

			public Map<Object,Object> getCurrentPublish() {
				return this.currentPublish;
			}

			public void setCurrentPublish(Map<Object,Object> currentPublish) {
				this.currentPublish = currentPublish;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getEnvId() {
				return this.envId;
			}

			public void setEnvId(String envId) {
				this.envId = envId;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public Map<Object,Object> getOpsRecord() {
				return this.opsRecord;
			}

			public void setOpsRecord(Map<Object,Object> opsRecord) {
				this.opsRecord = opsRecord;
			}

			public Map<Object,Object> getPublishing() {
				return this.publishing;
			}

			public void setPublishing(Map<Object,Object> publishing) {
				this.publishing = publishing;
			}

			public String getEnvStatus() {
				return this.envStatus;
			}

			public void setEnvStatus(String envStatus) {
				this.envStatus = envStatus;
			}

			public String getEnvType() {
				return this.envType;
			}

			public void setEnvType(String envType) {
				this.envType = envType;
			}

			public String getLatestAppAccessTime() {
				return this.latestAppAccessTime;
			}

			public void setLatestAppAccessTime(String latestAppAccessTime) {
				this.latestAppAccessTime = latestAppAccessTime;
			}
		}
	}

	@Override
	public ListEnvironmentOverviewsResponse getInstance(UnmarshallerContext context) {
		return	ListEnvironmentOverviewsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
