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

package com.aliyuncs.cs.model.v20151215;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribePolicyInstancesStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyInstancesStatusResponse extends AcsResponse {

	private Map<Object,Object> instances_severity_count;

	private List<Policy_instancesItem> policy_instances;

	public Map<Object,Object> getInstances_severity_count() {
		return this.instances_severity_count;
	}

	public void setInstances_severity_count(Map<Object,Object> instances_severity_count) {
		this.instances_severity_count = instances_severity_count;
	}

	public List<Policy_instancesItem> getPolicy_instances() {
		return this.policy_instances;
	}

	public void setPolicy_instances(List<Policy_instancesItem> policy_instances) {
		this.policy_instances = policy_instances;
	}

	public static class Policy_instancesItem {

		private String policy_category;

		private String policy_name;

		private String policy_description;

		private String policy_severity;

		private Long policy_instances_count;

		public String getPolicy_category() {
			return this.policy_category;
		}

		public void setPolicy_category(String policy_category) {
			this.policy_category = policy_category;
		}

		public String getPolicy_name() {
			return this.policy_name;
		}

		public void setPolicy_name(String policy_name) {
			this.policy_name = policy_name;
		}

		public String getPolicy_description() {
			return this.policy_description;
		}

		public void setPolicy_description(String policy_description) {
			this.policy_description = policy_description;
		}

		public String getPolicy_severity() {
			return this.policy_severity;
		}

		public void setPolicy_severity(String policy_severity) {
			this.policy_severity = policy_severity;
		}

		public Long getPolicy_instances_count() {
			return this.policy_instances_count;
		}

		public void setPolicy_instances_count(Long policy_instances_count) {
			this.policy_instances_count = policy_instances_count;
		}
	}

	@Override
	public DescribePolicyInstancesStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribePolicyInstancesStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
