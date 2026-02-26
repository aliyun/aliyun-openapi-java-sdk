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

package com.aliyuncs.adcp.model.v20220101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.adcp.transform.v20220101.DescribePolicyDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyDetailsResponse extends AcsResponse {

	private String requestId;

	private Policy policy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Policy getPolicy() {
		return this.policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public static class Policy {

		private String name;

		private String category;

		private String description;

		private String action;

		private String severity;

		private String template;

		private Integer noConfig;

		private String created;

		private String updated;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}

		public Integer getNoConfig() {
			return this.noConfig;
		}

		public void setNoConfig(Integer noConfig) {
			this.noConfig = noConfig;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}
	}

	@Override
	public DescribePolicyDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribePolicyDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
