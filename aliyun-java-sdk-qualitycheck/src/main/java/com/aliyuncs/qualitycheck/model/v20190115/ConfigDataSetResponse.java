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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ConfigDataSetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ConfigDataSetResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer roleConfigStatus;

		private Integer judgeType;

		private Long setId;

		private Integer channelType;

		private RuleInfo ruleInfo;

		public Integer getRoleConfigStatus() {
			return this.roleConfigStatus;
		}

		public void setRoleConfigStatus(Integer roleConfigStatus) {
			this.roleConfigStatus = roleConfigStatus;
		}

		public Integer getJudgeType() {
			return this.judgeType;
		}

		public void setJudgeType(Integer judgeType) {
			this.judgeType = judgeType;
		}

		public Long getSetId() {
			return this.setId;
		}

		public void setSetId(Long setId) {
			this.setId = setId;
		}

		public Integer getChannelType() {
			return this.channelType;
		}

		public void setChannelType(Integer channelType) {
			this.channelType = channelType;
		}

		public RuleInfo getRuleInfo() {
			return this.ruleInfo;
		}

		public void setRuleInfo(RuleInfo ruleInfo) {
			this.ruleInfo = ruleInfo;
		}

		public static class RuleInfo {

			private List<ConditionBasicInfo> conditions;

			private List<RuleBasicInfo> rules;

			public List<ConditionBasicInfo> getConditions() {
				return this.conditions;
			}

			public void setConditions(List<ConditionBasicInfo> conditions) {
				this.conditions = conditions;
			}

			public List<RuleBasicInfo> getRules() {
				return this.rules;
			}

			public void setRules(List<RuleBasicInfo> rules) {
				this.rules = rules;
			}

			public static class ConditionBasicInfo {

				private String cid;

				private String lambda;

				private List<OperatorBasicInfo> operators;

				private CheckRange checkRange;

				public String getCid() {
					return this.cid;
				}

				public void setCid(String cid) {
					this.cid = cid;
				}

				public String getLambda() {
					return this.lambda;
				}

				public void setLambda(String lambda) {
					this.lambda = lambda;
				}

				public List<OperatorBasicInfo> getOperators() {
					return this.operators;
				}

				public void setOperators(List<OperatorBasicInfo> operators) {
					this.operators = operators;
				}

				public CheckRange getCheckRange() {
					return this.checkRange;
				}

				public void setCheckRange(CheckRange checkRange) {
					this.checkRange = checkRange;
				}

				public static class OperatorBasicInfo {

					private String oid;

					private String type;

					private Param param;

					public String getOid() {
						return this.oid;
					}

					public void setOid(String oid) {
						this.oid = oid;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public Param getParam() {
						return this.param;
					}

					public void setParam(Param param) {
						this.param = param;
					}

					public static class Param {

						private Boolean inSentence;

						private List<String> keywords;

						public Boolean getInSentence() {
							return this.inSentence;
						}

						public void setInSentence(Boolean inSentence) {
							this.inSentence = inSentence;
						}

						public List<String> getKeywords() {
							return this.keywords;
						}

						public void setKeywords(List<String> keywords) {
							this.keywords = keywords;
						}
					}
				}

				public static class CheckRange {

					private Integer roleId;

					private String role;

					private Anchor anchor;

					private Range range;

					public Integer getRoleId() {
						return this.roleId;
					}

					public void setRoleId(Integer roleId) {
						this.roleId = roleId;
					}

					public String getRole() {
						return this.role;
					}

					public void setRole(String role) {
						this.role = role;
					}

					public Anchor getAnchor() {
						return this.anchor;
					}

					public void setAnchor(Anchor anchor) {
						this.anchor = anchor;
					}

					public Range getRange() {
						return this.range;
					}

					public void setRange(Range range) {
						this.range = range;
					}

					public static class Anchor {

						private String cid;

						private String location;

						private Integer hitTime;

						public String getCid() {
							return this.cid;
						}

						public void setCid(String cid) {
							this.cid = cid;
						}

						public String getLocation() {
							return this.location;
						}

						public void setLocation(String location) {
							this.location = location;
						}

						public Integer getHitTime() {
							return this.hitTime;
						}

						public void setHitTime(Integer hitTime) {
							this.hitTime = hitTime;
						}
					}

					public static class Range {

						private Integer from;

						private Integer to;

						public Integer getFrom() {
							return this.from;
						}

						public void setFrom(Integer from) {
							this.from = from;
						}

						public Integer getTo() {
							return this.to;
						}

						public void setTo(Integer to) {
							this.to = to;
						}
					}
				}
			}

			public static class RuleBasicInfo {

				private Integer externalProperty;

				private String lambda;

				private String rid;

				public Integer getExternalProperty() {
					return this.externalProperty;
				}

				public void setExternalProperty(Integer externalProperty) {
					this.externalProperty = externalProperty;
				}

				public String getLambda() {
					return this.lambda;
				}

				public void setLambda(String lambda) {
					this.lambda = lambda;
				}

				public String getRid() {
					return this.rid;
				}

				public void setRid(String rid) {
					this.rid = rid;
				}
			}
		}
	}

	@Override
	public ConfigDataSetResponse getInstance(UnmarshallerContext context) {
		return	ConfigDataSetResponseUnmarshaller.unmarshall(this, context);
	}
}
