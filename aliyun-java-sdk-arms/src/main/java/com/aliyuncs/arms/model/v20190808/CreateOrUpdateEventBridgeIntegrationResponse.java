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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CreateOrUpdateEventBridgeIntegrationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateEventBridgeIntegrationResponse extends AcsResponse {

	private String requestId;

	private EventBridgeIntegration eventBridgeIntegration;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public EventBridgeIntegration getEventBridgeIntegration() {
		return this.eventBridgeIntegration;
	}

	public void setEventBridgeIntegration(EventBridgeIntegration eventBridgeIntegration) {
		this.eventBridgeIntegration = eventBridgeIntegration;
	}

	public static class EventBridgeIntegration {

		private Long id;

		private String name;

		private String description;

		private String endpoint;

		private String accessKey;

		private String accessSecret;

		private String eventBusName;

		private String source;

		private String eventBusRegionId;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getAccessKey() {
			return this.accessKey;
		}

		public void setAccessKey(String accessKey) {
			this.accessKey = accessKey;
		}

		public String getAccessSecret() {
			return this.accessSecret;
		}

		public void setAccessSecret(String accessSecret) {
			this.accessSecret = accessSecret;
		}

		public String getEventBusName() {
			return this.eventBusName;
		}

		public void setEventBusName(String eventBusName) {
			this.eventBusName = eventBusName;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getEventBusRegionId() {
			return this.eventBusRegionId;
		}

		public void setEventBusRegionId(String eventBusRegionId) {
			this.eventBusRegionId = eventBusRegionId;
		}
	}

	@Override
	public CreateOrUpdateEventBridgeIntegrationResponse getInstance(UnmarshallerContext context) {
		return	CreateOrUpdateEventBridgeIntegrationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
