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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeSceneDefensePoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSceneDefensePoliciesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Policy> policies;

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

	public List<Policy> getPolicies() {
		return this.policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}

	public static class Policy {

		private String policyId;

		private String name;

		private String template;

		private Long startTime;

		private Long endTime;

		private Integer status;

		private Integer done;

		private Integer objectCount;

		private List<Policy1> runtimePolicies;

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getDone() {
			return this.done;
		}

		public void setDone(Integer done) {
			this.done = done;
		}

		public Integer getObjectCount() {
			return this.objectCount;
		}

		public void setObjectCount(Integer objectCount) {
			this.objectCount = objectCount;
		}

		public List<Policy1> getRuntimePolicies() {
			return this.runtimePolicies;
		}

		public void setRuntimePolicies(List<Policy1> runtimePolicies) {
			this.runtimePolicies = runtimePolicies;
		}

		public static class Policy1 {

			private Integer policyType;

			private Integer status;

			private String oldValue;

			private String newValue;

			public Integer getPolicyType() {
				return this.policyType;
			}

			public void setPolicyType(Integer policyType) {
				this.policyType = policyType;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getOldValue() {
				return this.oldValue;
			}

			public void setOldValue(String oldValue) {
				this.oldValue = oldValue;
			}

			public String getNewValue() {
				return this.newValue;
			}

			public void setNewValue(String newValue) {
				this.newValue = newValue;
			}
		}
	}

	@Override
	public DescribeSceneDefensePoliciesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSceneDefensePoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
