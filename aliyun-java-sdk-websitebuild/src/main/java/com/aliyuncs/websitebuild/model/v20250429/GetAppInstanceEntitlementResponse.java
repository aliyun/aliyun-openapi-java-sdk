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

package com.aliyuncs.websitebuild.model.v20250429;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.GetAppInstanceEntitlementResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppInstanceEntitlementResponse extends AcsResponse {

	private String requestId;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String accessDeniedDetail;

	private String rootErrorMsg;

	private String rootErrorCode;

	private Boolean allowRetry;

	private String appName;

	private List<String> errorArgs;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Boolean getSynchro() {
		return this.synchro;
	}

	public void setSynchro(Boolean synchro) {
		this.synchro = synchro;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRootErrorMsg() {
		return this.rootErrorMsg;
	}

	public void setRootErrorMsg(String rootErrorMsg) {
		this.rootErrorMsg = rootErrorMsg;
	}

	public String getRootErrorCode() {
		return this.rootErrorCode;
	}

	public void setRootErrorCode(String rootErrorCode) {
		this.rootErrorCode = rootErrorCode;
	}

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private String bizId;

		private List<Item> items;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String code;

			private String name;

			private String type;

			private String resourceCode;

			private Boolean entitled;

			private Boolean available;

			private String featureType;

			private String pluginId;

			private Boolean configured;

			private String resourceType;

			private Long quota;

			private Long used;

			private Long remaining;

			private Integer usagePercent;

			private String instanceId;

			private Boolean allocated;

			private Boolean running;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getResourceCode() {
				return this.resourceCode;
			}

			public void setResourceCode(String resourceCode) {
				this.resourceCode = resourceCode;
			}

			public Boolean getEntitled() {
				return this.entitled;
			}

			public void setEntitled(Boolean entitled) {
				this.entitled = entitled;
			}

			public Boolean getAvailable() {
				return this.available;
			}

			public void setAvailable(Boolean available) {
				this.available = available;
			}

			public String getFeatureType() {
				return this.featureType;
			}

			public void setFeatureType(String featureType) {
				this.featureType = featureType;
			}

			public String getPluginId() {
				return this.pluginId;
			}

			public void setPluginId(String pluginId) {
				this.pluginId = pluginId;
			}

			public Boolean getConfigured() {
				return this.configured;
			}

			public void setConfigured(Boolean configured) {
				this.configured = configured;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public Long getQuota() {
				return this.quota;
			}

			public void setQuota(Long quota) {
				this.quota = quota;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getRemaining() {
				return this.remaining;
			}

			public void setRemaining(Long remaining) {
				this.remaining = remaining;
			}

			public Integer getUsagePercent() {
				return this.usagePercent;
			}

			public void setUsagePercent(Integer usagePercent) {
				this.usagePercent = usagePercent;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Boolean getAllocated() {
				return this.allocated;
			}

			public void setAllocated(Boolean allocated) {
				this.allocated = allocated;
			}

			public Boolean getRunning() {
				return this.running;
			}

			public void setRunning(Boolean running) {
				this.running = running;
			}
		}
	}

	@Override
	public GetAppInstanceEntitlementResponse getInstance(UnmarshallerContext context) {
		return	GetAppInstanceEntitlementResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
