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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceResponse extends AcsResponse {

	private String requestId;

	private Instance instance;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Instance getInstance() {
		return this.instance;
	}

	public void setInstance(Instance instance) {
		this.instance = instance;
	}

	public static class Instance {

		private String instanceId;

		private Long createTime;

		private String status;

		private String description;

		private String logoUrl;

		private String faviconUrl;

		private String title;

		private List<CustomEndpoint> customEndpoints;

		private List<String> egressAddresses;

		private DefaultEndpoint defaultEndpoint;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLogoUrl() {
			return this.logoUrl;
		}

		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}

		public String getFaviconUrl() {
			return this.faviconUrl;
		}

		public void setFaviconUrl(String faviconUrl) {
			this.faviconUrl = faviconUrl;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<CustomEndpoint> getCustomEndpoints() {
			return this.customEndpoints;
		}

		public void setCustomEndpoints(List<CustomEndpoint> customEndpoints) {
			this.customEndpoints = customEndpoints;
		}

		public List<String> getEgressAddresses() {
			return this.egressAddresses;
		}

		public void setEgressAddresses(List<String> egressAddresses) {
			this.egressAddresses = egressAddresses;
		}

		public DefaultEndpoint getDefaultEndpoint() {
			return this.defaultEndpoint;
		}

		public void setDefaultEndpoint(DefaultEndpoint defaultEndpoint) {
			this.defaultEndpoint = defaultEndpoint;
		}

		public static class CustomEndpoint {

			private String endpoint;

			private String status;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class DefaultEndpoint {

			private String endpoint;

			private String status;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public GetInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
