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
import com.aliyuncs.arms.transform.v20190808.CreateIntegrationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateIntegrationResponse extends AcsResponse {

	private String requestId;

	private Integration integration;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integration getIntegration() {
		return this.integration;
	}

	public void setIntegration(Integration integration) {
		this.integration = integration;
	}

	public static class Integration {

		private Long integrationId;

		private String integrationName;

		private String integrationProductType;

		private String description;

		private Boolean autoRecover;

		private Long recoverTime;

		public Long getIntegrationId() {
			return this.integrationId;
		}

		public void setIntegrationId(Long integrationId) {
			this.integrationId = integrationId;
		}

		public String getIntegrationName() {
			return this.integrationName;
		}

		public void setIntegrationName(String integrationName) {
			this.integrationName = integrationName;
		}

		public String getIntegrationProductType() {
			return this.integrationProductType;
		}

		public void setIntegrationProductType(String integrationProductType) {
			this.integrationProductType = integrationProductType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getAutoRecover() {
			return this.autoRecover;
		}

		public void setAutoRecover(Boolean autoRecover) {
			this.autoRecover = autoRecover;
		}

		public Long getRecoverTime() {
			return this.recoverTime;
		}

		public void setRecoverTime(Long recoverTime) {
			this.recoverTime = recoverTime;
		}
	}

	@Override
	public CreateIntegrationResponse getInstance(UnmarshallerContext context) {
		return	CreateIntegrationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
