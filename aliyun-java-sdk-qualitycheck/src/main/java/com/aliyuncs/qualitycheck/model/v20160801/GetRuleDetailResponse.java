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

package com.aliyuncs.qualitycheck.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20160801.GetRuleDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRuleDetailResponse extends AcsResponse {

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

			private String conditionInfoCid;

			private String operLambda;

			private List<OperatorBasicInfo> operators;

			private CheckRange checkRange;

			public String getConditionInfoCid() {
				return this.conditionInfoCid;
			}

			public void setConditionInfoCid(String conditionInfoCid) {
				this.conditionInfoCid = conditionInfoCid;
			}

			public String getOperLambda() {
				return this.operLambda;
			}

			public void setOperLambda(String operLambda) {
				this.operLambda = operLambda;
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

				private String operName;

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

				public String getOperName() {
					return this.operName;
				}

				public void setOperName(String operName) {
					this.operName = operName;
				}

				public Param getParam() {
					return this.param;
				}

				public void setParam(Param param) {
					this.param = param;
				}

				public static class Param {

					private String regex;

					private String phrase;

					private Integer interval;

					private Float threshold;

					private Boolean inSentence;

					private Integer target;

					private Boolean fromEnd;

					private Boolean differentRole;

					private String targetRole;

					private List<String> operKeyWords;

					private List<String> references;

					public String getRegex() {
						return this.regex;
					}

					public void setRegex(String regex) {
						this.regex = regex;
					}

					public String getPhrase() {
						return this.phrase;
					}

					public void setPhrase(String phrase) {
						this.phrase = phrase;
					}

					public Integer getInterval() {
						return this.interval;
					}

					public void setInterval(Integer interval) {
						this.interval = interval;
					}

					public Float getThreshold() {
						return this.threshold;
					}

					public void setThreshold(Float threshold) {
						this.threshold = threshold;
					}

					public Boolean getInSentence() {
						return this.inSentence;
					}

					public void setInSentence(Boolean inSentence) {
						this.inSentence = inSentence;
					}

					public Integer getTarget() {
						return this.target;
					}

					public void setTarget(Integer target) {
						this.target = target;
					}

					public Boolean getFromEnd() {
						return this.fromEnd;
					}

					public void setFromEnd(Boolean fromEnd) {
						this.fromEnd = fromEnd;
					}

					public Boolean getDifferentRole() {
						return this.differentRole;
					}

					public void setDifferentRole(Boolean differentRole) {
						this.differentRole = differentRole;
					}

					public String getTargetRole() {
						return this.targetRole;
					}

					public void setTargetRole(String targetRole) {
						this.targetRole = targetRole;
					}

					public List<String> getOperKeyWords() {
						return this.operKeyWords;
					}

					public void setOperKeyWords(List<String> operKeyWords) {
						this.operKeyWords = operKeyWords;
					}

					public List<String> getReferences() {
						return this.references;
					}

					public void setReferences(List<String> references) {
						this.references = references;
					}
				}
			}

			public static class CheckRange {

				private String role;

				private Anchor anchor;

				private Range range;

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

					private String anchorCid;

					private String location;

					private Integer hitTime;

					public String getAnchorCid() {
						return this.anchorCid;
					}

					public void setAnchorCid(String anchorCid) {
						this.anchorCid = anchorCid;
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

			private String rid;

			private String ruleLambda;

			private List<BusinessCategoryBasicInfo> businessCategories;

			private List<String> triggers;

			public String getRid() {
				return this.rid;
			}

			public void setRid(String rid) {
				this.rid = rid;
			}

			public String getRuleLambda() {
				return this.ruleLambda;
			}

			public void setRuleLambda(String ruleLambda) {
				this.ruleLambda = ruleLambda;
			}

			public List<BusinessCategoryBasicInfo> getBusinessCategories() {
				return this.businessCategories;
			}

			public void setBusinessCategories(List<BusinessCategoryBasicInfo> businessCategories) {
				this.businessCategories = businessCategories;
			}

			public List<String> getTriggers() {
				return this.triggers;
			}

			public void setTriggers(List<String> triggers) {
				this.triggers = triggers;
			}

			public static class BusinessCategoryBasicInfo {

				private Integer bid;

				private Integer serviceType;

				private String businessName;

				public Integer getBid() {
					return this.bid;
				}

				public void setBid(Integer bid) {
					this.bid = bid;
				}

				public Integer getServiceType() {
					return this.serviceType;
				}

				public void setServiceType(Integer serviceType) {
					this.serviceType = serviceType;
				}

				public String getBusinessName() {
					return this.businessName;
				}

				public void setBusinessName(String businessName) {
					this.businessName = businessName;
				}
			}
		}
	}

	@Override
	public GetRuleDetailResponse getInstance(UnmarshallerContext context) {
		return	GetRuleDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
