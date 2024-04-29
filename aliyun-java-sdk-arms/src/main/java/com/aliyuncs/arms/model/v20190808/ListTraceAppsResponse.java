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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListTraceAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTraceAppsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<TraceApp> traceApps;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public List<TraceApp> getTraceApps() {
		return this.traceApps;
	}

	public void setTraceApps(List<TraceApp> traceApps) {
		this.traceApps = traceApps;
	}

	public static class TraceApp {

		private String type;

		private String appName;

		private Long updateTime;

		private Boolean show;

		private Long createTime;

		private String pid;

		private Long appId;

		private String userId;

		private String regionId;

		private String resourceGroupId;

		private String source;

		private String workloadName;

		private String workloadKind;

		private String namespace;

		private String clusterId;

		private String language;

		private List<TagsItem> tags;

		private List<String> labels;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Boolean getShow() {
			return this.show;
		}

		public void setShow(Boolean show) {
			this.show = show;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getWorkloadName() {
			return this.workloadName;
		}

		public void setWorkloadName(String workloadName) {
			this.workloadName = workloadName;
		}

		public String getWorkloadKind() {
			return this.workloadKind;
		}

		public void setWorkloadKind(String workloadKind) {
			this.workloadKind = workloadKind;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<String> getLabels() {
			return this.labels;
		}

		public void setLabels(List<String> labels) {
			this.labels = labels;
		}

		public static class TagsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListTraceAppsResponse getInstance(UnmarshallerContext context) {
		return	ListTraceAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
