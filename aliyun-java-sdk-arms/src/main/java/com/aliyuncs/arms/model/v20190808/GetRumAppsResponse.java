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
import com.aliyuncs.arms.transform.v20190808.GetRumAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRumAppsResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Boolean success;

	private String message;

	private Integer httpStatusCode;

	private List<AppListItem> appList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<AppListItem> getAppList() {
		return this.appList;
	}

	public void setAppList(List<AppListItem> appList) {
		this.appList = appList;
	}

	public static class AppListItem {

		private Object createTime;

		private String name;

		private String pid;

		private String type;

		private String nickName;

		private String regionId;

		private String appType;

		private String status;

		private String resourceGroupId;

		private Boolean isSubscription;

		private String description;

		private String packageName;

		private String endpoint;

		private String slsProject;

		private String slsLogstore;

		private List<TagsItem> tags;

		private List<ServiceDomainConfigsItem> serviceDomainConfigs;

		public Object getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Object createTime) {
			this.createTime = createTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Boolean getIsSubscription() {
			return this.isSubscription;
		}

		public void setIsSubscription(Boolean isSubscription) {
			this.isSubscription = isSubscription;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getSlsProject() {
			return this.slsProject;
		}

		public void setSlsProject(String slsProject) {
			this.slsProject = slsProject;
		}

		public String getSlsLogstore() {
			return this.slsLogstore;
		}

		public void setSlsLogstore(String slsLogstore) {
			this.slsLogstore = slsLogstore;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<ServiceDomainConfigsItem> getServiceDomainConfigs() {
			return this.serviceDomainConfigs;
		}

		public void setServiceDomainConfigs(List<ServiceDomainConfigsItem> serviceDomainConfigs) {
			this.serviceDomainConfigs = serviceDomainConfigs;
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

		public static class ServiceDomainConfigsItem {

			private String domain;

			private String description;

			private String tracing;

			private List<String> propagatorTypes;

			public String getDomain() {
				return this.domain;
			}

			public void setDomain(String domain) {
				this.domain = domain;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getTracing() {
				return this.tracing;
			}

			public void setTracing(String tracing) {
				this.tracing = tracing;
			}

			public List<String> getPropagatorTypes() {
				return this.propagatorTypes;
			}

			public void setPropagatorTypes(List<String> propagatorTypes) {
				this.propagatorTypes = propagatorTypes;
			}
		}
	}

	@Override
	public GetRumAppsResponse getInstance(UnmarshallerContext context) {
		return	GetRumAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
