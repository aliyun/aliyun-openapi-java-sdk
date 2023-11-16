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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.CreateRegistrationPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateRegistrationPolicyResponse extends AcsResponse {

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

		private String policyId;

		private String priority;

		private String description;

		private String status;

		private String matchMode;

		private String createTime;

		private List<LimitDetailItem> limitDetail;

		private List<String> whitelist;

		private List<String> userGroupIds;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMatchMode() {
			return this.matchMode;
		}

		public void setMatchMode(String matchMode) {
			this.matchMode = matchMode;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<LimitDetailItem> getLimitDetail() {
			return this.limitDetail;
		}

		public void setLimitDetail(List<LimitDetailItem> limitDetail) {
			this.limitDetail = limitDetail;
		}

		public List<String> getWhitelist() {
			return this.whitelist;
		}

		public void setWhitelist(List<String> whitelist) {
			this.whitelist = whitelist;
		}

		public List<String> getUserGroupIds() {
			return this.userGroupIds;
		}

		public void setUserGroupIds(List<String> userGroupIds) {
			this.userGroupIds = userGroupIds;
		}

		public static class LimitDetailItem {

			private String deviceBelong;

			private String limitType;

			private LimitCount limitCount;

			public String getDeviceBelong() {
				return this.deviceBelong;
			}

			public void setDeviceBelong(String deviceBelong) {
				this.deviceBelong = deviceBelong;
			}

			public String getLimitType() {
				return this.limitType;
			}

			public void setLimitType(String limitType) {
				this.limitType = limitType;
			}

			public LimitCount getLimitCount() {
				return this.limitCount;
			}

			public void setLimitCount(LimitCount limitCount) {
				this.limitCount = limitCount;
			}

			public static class LimitCount {

				private Integer all;

				private Integer pC;

				private Integer mobile;

				public Integer getAll() {
					return this.all;
				}

				public void setAll(Integer all) {
					this.all = all;
				}

				public Integer getPC() {
					return this.pC;
				}

				public void setPC(Integer pC) {
					this.pC = pC;
				}

				public Integer getMobile() {
					return this.mobile;
				}

				public void setMobile(Integer mobile) {
					this.mobile = mobile;
				}
			}
		}
	}

	@Override
	public CreateRegistrationPolicyResponse getInstance(UnmarshallerContext context) {
		return	CreateRegistrationPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
