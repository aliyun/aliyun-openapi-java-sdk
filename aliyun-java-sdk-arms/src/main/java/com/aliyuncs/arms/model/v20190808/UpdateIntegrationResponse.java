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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.UpdateIntegrationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateIntegrationResponse extends AcsResponse {

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

		private String apiEndpoint;

		private String shortToken;

		private Boolean autoRecover;

		private Long recoverTime;

		private String duplicateKey;

		private Boolean state;

		private String liveness;

		private List<Long> stat;

		private List<Map<Object,Object>> fieldRedefineRules;

		private List<Map<Object,Object>> extendedFieldRedefineRules;

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

		public String getApiEndpoint() {
			return this.apiEndpoint;
		}

		public void setApiEndpoint(String apiEndpoint) {
			this.apiEndpoint = apiEndpoint;
		}

		public String getShortToken() {
			return this.shortToken;
		}

		public void setShortToken(String shortToken) {
			this.shortToken = shortToken;
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

		public String getDuplicateKey() {
			return this.duplicateKey;
		}

		public void setDuplicateKey(String duplicateKey) {
			this.duplicateKey = duplicateKey;
		}

		public Boolean getState() {
			return this.state;
		}

		public void setState(Boolean state) {
			this.state = state;
		}

		public String getLiveness() {
			return this.liveness;
		}

		public void setLiveness(String liveness) {
			this.liveness = liveness;
		}

		public List<Long> getStat() {
			return this.stat;
		}

		public void setStat(List<Long> stat) {
			this.stat = stat;
		}

		public List<Map<Object,Object>> getFieldRedefineRules() {
			return this.fieldRedefineRules;
		}

		public void setFieldRedefineRules(List<Map<Object,Object>> fieldRedefineRules) {
			this.fieldRedefineRules = fieldRedefineRules;
		}

		public List<Map<Object,Object>> getExtendedFieldRedefineRules() {
			return this.extendedFieldRedefineRules;
		}

		public void setExtendedFieldRedefineRules(List<Map<Object,Object>> extendedFieldRedefineRules) {
			this.extendedFieldRedefineRules = extendedFieldRedefineRules;
		}
	}

	@Override
	public UpdateIntegrationResponse getInstance(UnmarshallerContext context) {
		return	UpdateIntegrationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
