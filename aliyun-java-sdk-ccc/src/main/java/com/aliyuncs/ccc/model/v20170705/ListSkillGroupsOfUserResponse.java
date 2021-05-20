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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListSkillGroupsOfUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSkillGroupsOfUserResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<SkillLevel> skillLevels;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public List<SkillLevel> getSkillLevels() {
		return this.skillLevels;
	}

	public void setSkillLevels(List<SkillLevel> skillLevels) {
		this.skillLevels = skillLevels;
	}

	public static class SkillLevel {

		private String skillLevelId;

		private Integer level;

		private Skill skill;

		public String getSkillLevelId() {
			return this.skillLevelId;
		}

		public void setSkillLevelId(String skillLevelId) {
			this.skillLevelId = skillLevelId;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}

		public Skill getSkill() {
			return this.skill;
		}

		public void setSkill(Skill skill) {
			this.skill = skill;
		}

		public static class Skill {

			private String skillGroupId;

			private String instanceId;

			private String skillGroupName;

			private String skillGroupDescription;

			private String routingStrategy;

			private List<PhoneNumber> outboundPhoneNumbers;

			public String getSkillGroupId() {
				return this.skillGroupId;
			}

			public void setSkillGroupId(String skillGroupId) {
				this.skillGroupId = skillGroupId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getSkillGroupName() {
				return this.skillGroupName;
			}

			public void setSkillGroupName(String skillGroupName) {
				this.skillGroupName = skillGroupName;
			}

			public String getSkillGroupDescription() {
				return this.skillGroupDescription;
			}

			public void setSkillGroupDescription(String skillGroupDescription) {
				this.skillGroupDescription = skillGroupDescription;
			}

			public String getRoutingStrategy() {
				return this.routingStrategy;
			}

			public void setRoutingStrategy(String routingStrategy) {
				this.routingStrategy = routingStrategy;
			}

			public List<PhoneNumber> getOutboundPhoneNumbers() {
				return this.outboundPhoneNumbers;
			}

			public void setOutboundPhoneNumbers(List<PhoneNumber> outboundPhoneNumbers) {
				this.outboundPhoneNumbers = outboundPhoneNumbers;
			}

			public static class PhoneNumber {

				private String phoneNumberId;

				private String instanceId;

				private String number;

				private String phoneNumberDescription;

				private Boolean testOnly;

				private Integer remainingTime;

				private Boolean allowOutbound;

				private String usage;

				private Integer trunks;

				private String province;

				private String city;

				public String getPhoneNumberId() {
					return this.phoneNumberId;
				}

				public void setPhoneNumberId(String phoneNumberId) {
					this.phoneNumberId = phoneNumberId;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getNumber() {
					return this.number;
				}

				public void setNumber(String number) {
					this.number = number;
				}

				public String getPhoneNumberDescription() {
					return this.phoneNumberDescription;
				}

				public void setPhoneNumberDescription(String phoneNumberDescription) {
					this.phoneNumberDescription = phoneNumberDescription;
				}

				public Boolean getTestOnly() {
					return this.testOnly;
				}

				public void setTestOnly(Boolean testOnly) {
					this.testOnly = testOnly;
				}

				public Integer getRemainingTime() {
					return this.remainingTime;
				}

				public void setRemainingTime(Integer remainingTime) {
					this.remainingTime = remainingTime;
				}

				public Boolean getAllowOutbound() {
					return this.allowOutbound;
				}

				public void setAllowOutbound(Boolean allowOutbound) {
					this.allowOutbound = allowOutbound;
				}

				public String getUsage() {
					return this.usage;
				}

				public void setUsage(String usage) {
					this.usage = usage;
				}

				public Integer getTrunks() {
					return this.trunks;
				}

				public void setTrunks(Integer trunks) {
					this.trunks = trunks;
				}

				public String getProvince() {
					return this.province;
				}

				public void setProvince(String province) {
					this.province = province;
				}

				public String getCity() {
					return this.city;
				}

				public void setCity(String city) {
					this.city = city;
				}
			}
		}
	}

	@Override
	public ListSkillGroupsOfUserResponse getInstance(UnmarshallerContext context) {
		return	ListSkillGroupsOfUserResponseUnmarshaller.unmarshall(this, context);
	}
}
