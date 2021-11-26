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
import com.aliyuncs.qualitycheck.transform.v20190115.GetRuleDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRuleDetailResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageSize;

		private Integer pageNumber;

		private Integer count;

		private List<ConditionBasicInfo> conditions;

		private List<RuleBasicInfo> rules;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

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

				private String type;

				private String oid;

				private String operName;

				private Param param;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getOid() {
					return this.oid;
				}

				public void setOid(String oid) {
					this.oid = oid;
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

					private Boolean differentRole;

					private String regex;

					private String targetRole;

					private Integer velocityInMint;

					private Boolean average;

					private Boolean keywordExtension;

					private Integer score;

					private String notRegex;

					private String compareOperator;

					private Integer delayTime;

					private Integer keywordMatchSize;

					private Integer hitTime;

					private String beginType;

					private Integer target;

					private Integer maxEmotionChangeValue;

					private Float threshold;

					private Integer from;

					private Boolean fromEnd;

					private Integer minWordSize;

					private Boolean inSentence;

					private String phrase;

					private Float similarity_threshold;

					private Integer checkType;

					private Integer interval;

					private Boolean contextChatMatch;

					private List<String> excludes;

					private List<String> antModelInfo;

					private List<String> pvalues;

					private List<String> references;

					private List<String> similarlySentences;

					private List<String> operKeyWords;

					public Boolean getDifferentRole() {
						return this.differentRole;
					}

					public void setDifferentRole(Boolean differentRole) {
						this.differentRole = differentRole;
					}

					public String getRegex() {
						return this.regex;
					}

					public void setRegex(String regex) {
						this.regex = regex;
					}

					public String getTargetRole() {
						return this.targetRole;
					}

					public void setTargetRole(String targetRole) {
						this.targetRole = targetRole;
					}

					public Integer getVelocityInMint() {
						return this.velocityInMint;
					}

					public void setVelocityInMint(Integer velocityInMint) {
						this.velocityInMint = velocityInMint;
					}

					public Boolean getAverage() {
						return this.average;
					}

					public void setAverage(Boolean average) {
						this.average = average;
					}

					public Boolean getKeywordExtension() {
						return this.keywordExtension;
					}

					public void setKeywordExtension(Boolean keywordExtension) {
						this.keywordExtension = keywordExtension;
					}

					public Integer getScore() {
						return this.score;
					}

					public void setScore(Integer score) {
						this.score = score;
					}

					public String getNotRegex() {
						return this.notRegex;
					}

					public void setNotRegex(String notRegex) {
						this.notRegex = notRegex;
					}

					public String getCompareOperator() {
						return this.compareOperator;
					}

					public void setCompareOperator(String compareOperator) {
						this.compareOperator = compareOperator;
					}

					public Integer getDelayTime() {
						return this.delayTime;
					}

					public void setDelayTime(Integer delayTime) {
						this.delayTime = delayTime;
					}

					public Integer getKeywordMatchSize() {
						return this.keywordMatchSize;
					}

					public void setKeywordMatchSize(Integer keywordMatchSize) {
						this.keywordMatchSize = keywordMatchSize;
					}

					public Integer getHitTime() {
						return this.hitTime;
					}

					public void setHitTime(Integer hitTime) {
						this.hitTime = hitTime;
					}

					public String getBeginType() {
						return this.beginType;
					}

					public void setBeginType(String beginType) {
						this.beginType = beginType;
					}

					public Integer getTarget() {
						return this.target;
					}

					public void setTarget(Integer target) {
						this.target = target;
					}

					public Integer getMaxEmotionChangeValue() {
						return this.maxEmotionChangeValue;
					}

					public void setMaxEmotionChangeValue(Integer maxEmotionChangeValue) {
						this.maxEmotionChangeValue = maxEmotionChangeValue;
					}

					public Float getThreshold() {
						return this.threshold;
					}

					public void setThreshold(Float threshold) {
						this.threshold = threshold;
					}

					public Integer getFrom() {
						return this.from;
					}

					public void setFrom(Integer from) {
						this.from = from;
					}

					public Boolean getFromEnd() {
						return this.fromEnd;
					}

					public void setFromEnd(Boolean fromEnd) {
						this.fromEnd = fromEnd;
					}

					public Integer getMinWordSize() {
						return this.minWordSize;
					}

					public void setMinWordSize(Integer minWordSize) {
						this.minWordSize = minWordSize;
					}

					public Boolean getInSentence() {
						return this.inSentence;
					}

					public void setInSentence(Boolean inSentence) {
						this.inSentence = inSentence;
					}

					public String getPhrase() {
						return this.phrase;
					}

					public void setPhrase(String phrase) {
						this.phrase = phrase;
					}

					public Float getSimilarity_threshold() {
						return this.similarity_threshold;
					}

					public void setSimilarity_threshold(Float similarity_threshold) {
						this.similarity_threshold = similarity_threshold;
					}

					public Integer getCheckType() {
						return this.checkType;
					}

					public void setCheckType(Integer checkType) {
						this.checkType = checkType;
					}

					public Integer getInterval() {
						return this.interval;
					}

					public void setInterval(Integer interval) {
						this.interval = interval;
					}

					public Boolean getContextChatMatch() {
						return this.contextChatMatch;
					}

					public void setContextChatMatch(Boolean contextChatMatch) {
						this.contextChatMatch = contextChatMatch;
					}

					public List<String> getExcludes() {
						return this.excludes;
					}

					public void setExcludes(List<String> excludes) {
						this.excludes = excludes;
					}

					public List<String> getAntModelInfo() {
						return this.antModelInfo;
					}

					public void setAntModelInfo(List<String> antModelInfo) {
						this.antModelInfo = antModelInfo;
					}

					public List<String> getPvalues() {
						return this.pvalues;
					}

					public void setPvalues(List<String> pvalues) {
						this.pvalues = pvalues;
					}

					public List<String> getReferences() {
						return this.references;
					}

					public void setReferences(List<String> references) {
						this.references = references;
					}

					public List<String> getSimilarlySentences() {
						return this.similarlySentences;
					}

					public void setSimilarlySentences(List<String> similarlySentences) {
						this.similarlySentences = similarlySentences;
					}

					public List<String> getOperKeyWords() {
						return this.operKeyWords;
					}

					public void setOperKeyWords(List<String> operKeyWords) {
						this.operKeyWords = operKeyWords;
					}
				}
			}

			public static class CheckRange {

				private Boolean absolute;

				private String role;

				private Anchor anchor;

				private Range range;

				public Boolean getAbsolute() {
					return this.absolute;
				}

				public void setAbsolute(Boolean absolute) {
					this.absolute = absolute;
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

					private Integer hitTime;

					private String location;

					private String anchorCid;

					public Integer getHitTime() {
						return this.hitTime;
					}

					public void setHitTime(Integer hitTime) {
						this.hitTime = hitTime;
					}

					public String getLocation() {
						return this.location;
					}

					public void setLocation(String location) {
						this.location = location;
					}

					public String getAnchorCid() {
						return this.anchorCid;
					}

					public void setAnchorCid(String anchorCid) {
						this.anchorCid = anchorCid;
					}
				}

				public static class Range {

					private Integer to;

					private Integer from;

					public Integer getTo() {
						return this.to;
					}

					public void setTo(Integer to) {
						this.to = to;
					}

					public Integer getFrom() {
						return this.from;
					}

					public void setFrom(Integer from) {
						this.from = from;
					}
				}
			}
		}

		public static class RuleBasicInfo {

			private String ruleLambda;

			private String rid;

			private List<BusinessCategoryBasicInfo> businessCategories;

			private List<String> triggers;

			public String getRuleLambda() {
				return this.ruleLambda;
			}

			public void setRuleLambda(String ruleLambda) {
				this.ruleLambda = ruleLambda;
			}

			public String getRid() {
				return this.rid;
			}

			public void setRid(String rid) {
				this.rid = rid;
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

				private String businessName;

				private Integer serviceType;

				private Integer bid;

				public String getBusinessName() {
					return this.businessName;
				}

				public void setBusinessName(String businessName) {
					this.businessName = businessName;
				}

				public Integer getServiceType() {
					return this.serviceType;
				}

				public void setServiceType(Integer serviceType) {
					this.serviceType = serviceType;
				}

				public Integer getBid() {
					return this.bid;
				}

				public void setBid(Integer bid) {
					this.bid = bid;
				}
			}
		}
	}

	@Override
	public GetRuleDetailResponse getInstance(UnmarshallerContext context) {
		return	GetRuleDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
