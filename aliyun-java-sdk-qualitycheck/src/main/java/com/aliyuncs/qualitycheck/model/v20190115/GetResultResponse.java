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
import com.aliyuncs.qualitycheck.transform.v20190115.GetResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResultResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String resultCountId;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer count;

	private List<ResultInfo> data;

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

	public String getResultCountId() {
		return this.resultCountId;
	}

	public void setResultCountId(String resultCountId) {
		this.resultCountId = resultCountId;
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<ResultInfo> getData() {
		return this.data;
	}

	public void setData(List<ResultInfo> data) {
		this.data = data;
	}

	public static class ResultInfo {

		private Integer status;

		private String assignmentTime;

		private String lastDataId;

		private String errorMessage;

		private String reviewer;

		private String createTime;

		private Integer reviewStatus;

		private String reviewTimeLong;

		private String taskName;

		private Integer reviewResult;

		private Integer score;

		private String createTimeLong;

		private String reviewTime;

		private String comments;

		private String taskId;

		private Integer reviewType;

		private String resolver;

		private String vid;

		private List<AsrResultItem> asrResult;

		private List<HitResultItem> hitResult;

		private List<HitScoreItem> hitScore;

		private List<ReviewHistory> reviewHistoryList;

		private List<ReviewTypeIdListItem> reviewTypeIdList;

		private List<Long> schemeIdList;

		private List<String> schemeNameList;

		private Recording recording;

		private Agent agent;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getAssignmentTime() {
			return this.assignmentTime;
		}

		public void setAssignmentTime(String assignmentTime) {
			this.assignmentTime = assignmentTime;
		}

		public String getLastDataId() {
			return this.lastDataId;
		}

		public void setLastDataId(String lastDataId) {
			this.lastDataId = lastDataId;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getReviewer() {
			return this.reviewer;
		}

		public void setReviewer(String reviewer) {
			this.reviewer = reviewer;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getReviewStatus() {
			return this.reviewStatus;
		}

		public void setReviewStatus(Integer reviewStatus) {
			this.reviewStatus = reviewStatus;
		}

		public String getReviewTimeLong() {
			return this.reviewTimeLong;
		}

		public void setReviewTimeLong(String reviewTimeLong) {
			this.reviewTimeLong = reviewTimeLong;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public Integer getReviewResult() {
			return this.reviewResult;
		}

		public void setReviewResult(Integer reviewResult) {
			this.reviewResult = reviewResult;
		}

		public Integer getScore() {
			return this.score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}

		public String getCreateTimeLong() {
			return this.createTimeLong;
		}

		public void setCreateTimeLong(String createTimeLong) {
			this.createTimeLong = createTimeLong;
		}

		public String getReviewTime() {
			return this.reviewTime;
		}

		public void setReviewTime(String reviewTime) {
			this.reviewTime = reviewTime;
		}

		public String getComments() {
			return this.comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Integer getReviewType() {
			return this.reviewType;
		}

		public void setReviewType(Integer reviewType) {
			this.reviewType = reviewType;
		}

		public String getResolver() {
			return this.resolver;
		}

		public void setResolver(String resolver) {
			this.resolver = resolver;
		}

		public String getVid() {
			return this.vid;
		}

		public void setVid(String vid) {
			this.vid = vid;
		}

		public List<AsrResultItem> getAsrResult() {
			return this.asrResult;
		}

		public void setAsrResult(List<AsrResultItem> asrResult) {
			this.asrResult = asrResult;
		}

		public List<HitResultItem> getHitResult() {
			return this.hitResult;
		}

		public void setHitResult(List<HitResultItem> hitResult) {
			this.hitResult = hitResult;
		}

		public List<HitScoreItem> getHitScore() {
			return this.hitScore;
		}

		public void setHitScore(List<HitScoreItem> hitScore) {
			this.hitScore = hitScore;
		}

		public List<ReviewHistory> getReviewHistoryList() {
			return this.reviewHistoryList;
		}

		public void setReviewHistoryList(List<ReviewHistory> reviewHistoryList) {
			this.reviewHistoryList = reviewHistoryList;
		}

		public List<ReviewTypeIdListItem> getReviewTypeIdList() {
			return this.reviewTypeIdList;
		}

		public void setReviewTypeIdList(List<ReviewTypeIdListItem> reviewTypeIdList) {
			this.reviewTypeIdList = reviewTypeIdList;
		}

		public List<Long> getSchemeIdList() {
			return this.schemeIdList;
		}

		public void setSchemeIdList(List<Long> schemeIdList) {
			this.schemeIdList = schemeIdList;
		}

		public List<String> getSchemeNameList() {
			return this.schemeNameList;
		}

		public void setSchemeNameList(List<String> schemeNameList) {
			this.schemeNameList = schemeNameList;
		}

		public Recording getRecording() {
			return this.recording;
		}

		public void setRecording(Recording recording) {
			this.recording = recording;
		}

		public Agent getAgent() {
			return this.agent;
		}

		public void setAgent(Agent agent) {
			this.agent = agent;
		}

		public static class AsrResultItem {

			private String words;

			private Long begin;

			private Integer emotionValue;

			private Long end;

			private Integer speechRate;

			private String role;

			private String identity;

			public String getWords() {
				return this.words;
			}

			public void setWords(String words) {
				this.words = words;
			}

			public Long getBegin() {
				return this.begin;
			}

			public void setBegin(Long begin) {
				this.begin = begin;
			}

			public Integer getEmotionValue() {
				return this.emotionValue;
			}

			public void setEmotionValue(Integer emotionValue) {
				this.emotionValue = emotionValue;
			}

			public Long getEnd() {
				return this.end;
			}

			public void setEnd(Long end) {
				this.end = end;
			}

			public Integer getSpeechRate() {
				return this.speechRate;
			}

			public void setSpeechRate(Integer speechRate) {
				this.speechRate = speechRate;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getIdentity() {
				return this.identity;
			}

			public void setIdentity(String identity) {
				this.identity = identity;
			}
		}

		public static class HitResultItem {

			private String type;

			private Integer reviewResult;

			private String name;

			private String rid;

			private Long schemeId;

			private Long schemeVersion;

			private Integer score;

			private List<Hit> hits;

			private List<ConditionsItem> conditions;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Integer getReviewResult() {
				return this.reviewResult;
			}

			public void setReviewResult(Integer reviewResult) {
				this.reviewResult = reviewResult;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRid() {
				return this.rid;
			}

			public void setRid(String rid) {
				this.rid = rid;
			}

			public Long getSchemeId() {
				return this.schemeId;
			}

			public void setSchemeId(Long schemeId) {
				this.schemeId = schemeId;
			}

			public Long getSchemeVersion() {
				return this.schemeVersion;
			}

			public void setSchemeVersion(Long schemeVersion) {
				this.schemeVersion = schemeVersion;
			}

			public Integer getScore() {
				return this.score;
			}

			public void setScore(Integer score) {
				this.score = score;
			}

			public List<Hit> getHits() {
				return this.hits;
			}

			public void setHits(List<Hit> hits) {
				this.hits = hits;
			}

			public List<ConditionsItem> getConditions() {
				return this.conditions;
			}

			public void setConditions(List<ConditionsItem> conditions) {
				this.conditions = conditions;
			}

			public static class Hit {

				private List<KeyWord> keyWords;

				private List<String> cid;

				private Phrase phrase;

				public List<KeyWord> getKeyWords() {
					return this.keyWords;
				}

				public void setKeyWords(List<KeyWord> keyWords) {
					this.keyWords = keyWords;
				}

				public List<String> getCid() {
					return this.cid;
				}

				public void setCid(List<String> cid) {
					this.cid = cid;
				}

				public Phrase getPhrase() {
					return this.phrase;
				}

				public void setPhrase(Phrase phrase) {
					this.phrase = phrase;
				}

				public static class KeyWord {

					private Integer from;

					private Integer to;

					private String val;

					private String cid;

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

					public String getVal() {
						return this.val;
					}

					public void setVal(String val) {
						this.val = val;
					}

					public String getCid() {
						return this.cid;
					}

					public void setCid(String cid) {
						this.cid = cid;
					}
				}

				public static class Phrase {

					private Integer emotionValue;

					private Integer end;

					private String words;

					private String role;

					private Long begin;

					public Integer getEmotionValue() {
						return this.emotionValue;
					}

					public void setEmotionValue(Integer emotionValue) {
						this.emotionValue = emotionValue;
					}

					public Integer getEnd() {
						return this.end;
					}

					public void setEnd(Integer end) {
						this.end = end;
					}

					public String getWords() {
						return this.words;
					}

					public void setWords(String words) {
						this.words = words;
					}

					public String getRole() {
						return this.role;
					}

					public void setRole(String role) {
						this.role = role;
					}

					public Long getBegin() {
						return this.begin;
					}

					public void setBegin(Long begin) {
						this.begin = begin;
					}
				}
			}

			public static class ConditionsItem {

				private String cid;

				private Long id;

				private String rid;

				private String lambda;

				private Integer exclusion;

				private List<Operator> operators;

				private Check_range check_range;

				public String getCid() {
					return this.cid;
				}

				public void setCid(String cid) {
					this.cid = cid;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getRid() {
					return this.rid;
				}

				public void setRid(String rid) {
					this.rid = rid;
				}

				public String getLambda() {
					return this.lambda;
				}

				public void setLambda(String lambda) {
					this.lambda = lambda;
				}

				public Integer getExclusion() {
					return this.exclusion;
				}

				public void setExclusion(Integer exclusion) {
					this.exclusion = exclusion;
				}

				public List<Operator> getOperators() {
					return this.operators;
				}

				public void setOperators(List<Operator> operators) {
					this.operators = operators;
				}

				public Check_range getCheck_range() {
					return this.check_range;
				}

				public void setCheck_range(Check_range check_range) {
					this.check_range = check_range;
				}

				public static class Operator {

					private String oid;

					private Long id;

					private String type;

					private String name;

					private Param param;

					public String getOid() {
						return this.oid;
					}

					public void setOid(String oid) {
						this.oid = oid;
					}

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Param getParam() {
						return this.param;
					}

					public void setParam(Param param) {
						this.param = param;
					}

					public static class Param {

						private String regex;

						private String notRegex;

						private String phrase;

						private Integer interval;

						private Integer intervalEnd;

						private Float threshold;

						private Boolean in_sentence;

						private Integer target;

						private Boolean from_end;

						private Integer keywordExtension;

						private Boolean case_sensitive;

						private Boolean near_dialogue;

						private Integer minWordSize;

						private Integer hit_time;

						private Integer from;

						private Boolean checkFirstSentence;

						private Boolean average;

						private String beginType;

						private String endType;

						private String compareOperator;

						private Boolean contextChatMatch;

						private Integer keywordMatchSize;

						private Integer maxEmotionChangeValue;

						private Integer checkType;

						private Integer delayTime;

						private List<String> keywords;

						private List<String> excludes;

						private FlowNodePrerequisiteParam flowNodePrerequisiteParam;

						private IntentModelCheckParm intentModelCheckParm;

						public String getRegex() {
							return this.regex;
						}

						public void setRegex(String regex) {
							this.regex = regex;
						}

						public String getNotRegex() {
							return this.notRegex;
						}

						public void setNotRegex(String notRegex) {
							this.notRegex = notRegex;
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

						public Integer getIntervalEnd() {
							return this.intervalEnd;
						}

						public void setIntervalEnd(Integer intervalEnd) {
							this.intervalEnd = intervalEnd;
						}

						public Float getThreshold() {
							return this.threshold;
						}

						public void setThreshold(Float threshold) {
							this.threshold = threshold;
						}

						public Boolean getIn_sentence() {
							return this.in_sentence;
						}

						public void setIn_sentence(Boolean in_sentence) {
							this.in_sentence = in_sentence;
						}

						public Integer getTarget() {
							return this.target;
						}

						public void setTarget(Integer target) {
							this.target = target;
						}

						public Boolean getFrom_end() {
							return this.from_end;
						}

						public void setFrom_end(Boolean from_end) {
							this.from_end = from_end;
						}

						public Integer getKeywordExtension() {
							return this.keywordExtension;
						}

						public void setKeywordExtension(Integer keywordExtension) {
							this.keywordExtension = keywordExtension;
						}

						public Boolean getCase_sensitive() {
							return this.case_sensitive;
						}

						public void setCase_sensitive(Boolean case_sensitive) {
							this.case_sensitive = case_sensitive;
						}

						public Boolean getNear_dialogue() {
							return this.near_dialogue;
						}

						public void setNear_dialogue(Boolean near_dialogue) {
							this.near_dialogue = near_dialogue;
						}

						public Integer getMinWordSize() {
							return this.minWordSize;
						}

						public void setMinWordSize(Integer minWordSize) {
							this.minWordSize = minWordSize;
						}

						public Integer getHit_time() {
							return this.hit_time;
						}

						public void setHit_time(Integer hit_time) {
							this.hit_time = hit_time;
						}

						public Integer getFrom() {
							return this.from;
						}

						public void setFrom(Integer from) {
							this.from = from;
						}

						public Boolean getCheckFirstSentence() {
							return this.checkFirstSentence;
						}

						public void setCheckFirstSentence(Boolean checkFirstSentence) {
							this.checkFirstSentence = checkFirstSentence;
						}

						public Boolean getAverage() {
							return this.average;
						}

						public void setAverage(Boolean average) {
							this.average = average;
						}

						public String getBeginType() {
							return this.beginType;
						}

						public void setBeginType(String beginType) {
							this.beginType = beginType;
						}

						public String getEndType() {
							return this.endType;
						}

						public void setEndType(String endType) {
							this.endType = endType;
						}

						public String getCompareOperator() {
							return this.compareOperator;
						}

						public void setCompareOperator(String compareOperator) {
							this.compareOperator = compareOperator;
						}

						public Boolean getContextChatMatch() {
							return this.contextChatMatch;
						}

						public void setContextChatMatch(Boolean contextChatMatch) {
							this.contextChatMatch = contextChatMatch;
						}

						public Integer getKeywordMatchSize() {
							return this.keywordMatchSize;
						}

						public void setKeywordMatchSize(Integer keywordMatchSize) {
							this.keywordMatchSize = keywordMatchSize;
						}

						public Integer getMaxEmotionChangeValue() {
							return this.maxEmotionChangeValue;
						}

						public void setMaxEmotionChangeValue(Integer maxEmotionChangeValue) {
							this.maxEmotionChangeValue = maxEmotionChangeValue;
						}

						public Integer getCheckType() {
							return this.checkType;
						}

						public void setCheckType(Integer checkType) {
							this.checkType = checkType;
						}

						public Integer getDelayTime() {
							return this.delayTime;
						}

						public void setDelayTime(Integer delayTime) {
							this.delayTime = delayTime;
						}

						public List<String> getKeywords() {
							return this.keywords;
						}

						public void setKeywords(List<String> keywords) {
							this.keywords = keywords;
						}

						public List<String> getExcludes() {
							return this.excludes;
						}

						public void setExcludes(List<String> excludes) {
							this.excludes = excludes;
						}

						public FlowNodePrerequisiteParam getFlowNodePrerequisiteParam() {
							return this.flowNodePrerequisiteParam;
						}

						public void setFlowNodePrerequisiteParam(FlowNodePrerequisiteParam flowNodePrerequisiteParam) {
							this.flowNodePrerequisiteParam = flowNodePrerequisiteParam;
						}

						public IntentModelCheckParm getIntentModelCheckParm() {
							return this.intentModelCheckParm;
						}

						public void setIntentModelCheckParm(IntentModelCheckParm intentModelCheckParm) {
							this.intentModelCheckParm = intentModelCheckParm;
						}

						public static class FlowNodePrerequisiteParam {

							private Long nodeId;

							private String nodeName;

							private Integer nodeMatchStatus;

							public Long getNodeId() {
								return this.nodeId;
							}

							public void setNodeId(Long nodeId) {
								this.nodeId = nodeId;
							}

							public String getNodeName() {
								return this.nodeName;
							}

							public void setNodeName(String nodeName) {
								this.nodeName = nodeName;
							}

							public Integer getNodeMatchStatus() {
								return this.nodeMatchStatus;
							}

							public void setNodeMatchStatus(Integer nodeMatchStatus) {
								this.nodeMatchStatus = nodeMatchStatus;
							}
						}

						public static class IntentModelCheckParm {

							private String modelScene;

							private List<Intent> intents;

							public String getModelScene() {
								return this.modelScene;
							}

							public void setModelScene(String modelScene) {
								this.modelScene = modelScene;
							}

							public List<Intent> getIntents() {
								return this.intents;
							}

							public void setIntents(List<Intent> intents) {
								this.intents = intents;
							}

							public static class Intent {

								private Long id;

								private String name;

								public Long getId() {
									return this.id;
								}

								public void setId(Long id) {
									this.id = id;
								}

								public String getName() {
									return this.name;
								}

								public void setName(String name) {
									this.name = name;
								}
							}
						}
					}
				}

				public static class Check_range {

					private Integer roleId;

					private String role;

					private Boolean absolute;

					private Boolean allSentencesSatisfy;

					private Anchor anchor;

					private Range range;

					private TimeRange timeRange;

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

					public Boolean getAbsolute() {
						return this.absolute;
					}

					public void setAbsolute(Boolean absolute) {
						this.absolute = absolute;
					}

					public Boolean getAllSentencesSatisfy() {
						return this.allSentencesSatisfy;
					}

					public void setAllSentencesSatisfy(Boolean allSentencesSatisfy) {
						this.allSentencesSatisfy = allSentencesSatisfy;
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

					public TimeRange getTimeRange() {
						return this.timeRange;
					}

					public void setTimeRange(TimeRange timeRange) {
						this.timeRange = timeRange;
					}

					public static class Anchor {

						private String cid;

						private String location;

						private Integer hit_time;

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

						public Integer getHit_time() {
							return this.hit_time;
						}

						public void setHit_time(Integer hit_time) {
							this.hit_time = hit_time;
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

					public static class TimeRange {

						private Long from;

						private Long to;

						public Long getFrom() {
							return this.from;
						}

						public void setFrom(Long from) {
							this.from = from;
						}

						public Long getTo() {
							return this.to;
						}

						public void setTo(Long to) {
							this.to = to;
						}
					}
				}
			}
		}

		public static class HitScoreItem {

			private String scoreName;

			private String scoreNumber;

			private String scoreId;

			private String ruleId;

			public String getScoreName() {
				return this.scoreName;
			}

			public void setScoreName(String scoreName) {
				this.scoreName = scoreName;
			}

			public String getScoreNumber() {
				return this.scoreNumber;
			}

			public void setScoreNumber(String scoreNumber) {
				this.scoreNumber = scoreNumber;
			}

			public String getScoreId() {
				return this.scoreId;
			}

			public void setScoreId(String scoreId) {
				this.scoreId = scoreId;
			}

			public String getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(String ruleId) {
				this.ruleId = ruleId;
			}
		}

		public static class ReviewHistory {

			private Integer type;

			private String operatorName;

			private String timeStr;

			private Integer score;

			private Integer reviewResult;

			private Integer complainResult;

			private Integer oldScore;

			private String reviewManagerType;

			private Long time;

			private String comments;

			private Long operator;

			private List<ReviewRightRuleItem> reviewRightRule;

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public String getOperatorName() {
				return this.operatorName;
			}

			public void setOperatorName(String operatorName) {
				this.operatorName = operatorName;
			}

			public String getTimeStr() {
				return this.timeStr;
			}

			public void setTimeStr(String timeStr) {
				this.timeStr = timeStr;
			}

			public Integer getScore() {
				return this.score;
			}

			public void setScore(Integer score) {
				this.score = score;
			}

			public Integer getReviewResult() {
				return this.reviewResult;
			}

			public void setReviewResult(Integer reviewResult) {
				this.reviewResult = reviewResult;
			}

			public Integer getComplainResult() {
				return this.complainResult;
			}

			public void setComplainResult(Integer complainResult) {
				this.complainResult = complainResult;
			}

			public Integer getOldScore() {
				return this.oldScore;
			}

			public void setOldScore(Integer oldScore) {
				this.oldScore = oldScore;
			}

			public String getReviewManagerType() {
				return this.reviewManagerType;
			}

			public void setReviewManagerType(String reviewManagerType) {
				this.reviewManagerType = reviewManagerType;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public String getComments() {
				return this.comments;
			}

			public void setComments(String comments) {
				this.comments = comments;
			}

			public Long getOperator() {
				return this.operator;
			}

			public void setOperator(Long operator) {
				this.operator = operator;
			}

			public List<ReviewRightRuleItem> getReviewRightRule() {
				return this.reviewRightRule;
			}

			public void setReviewRightRule(List<ReviewRightRuleItem> reviewRightRule) {
				this.reviewRightRule = reviewRightRule;
			}

			public static class ReviewRightRuleItem {

				private String ruleName;

				private Long rid;

				public String getRuleName() {
					return this.ruleName;
				}

				public void setRuleName(String ruleName) {
					this.ruleName = ruleName;
				}

				public Long getRid() {
					return this.rid;
				}

				public void setRid(Long rid) {
					this.rid = rid;
				}
			}
		}

		public static class ReviewTypeIdListItem {

			private Long reviewTypeId;

			private List<Long> reviewKeyIdList;

			public Long getReviewTypeId() {
				return this.reviewTypeId;
			}

			public void setReviewTypeId(Long reviewTypeId) {
				this.reviewTypeId = reviewTypeId;
			}

			public List<Long> getReviewKeyIdList() {
				return this.reviewKeyIdList;
			}

			public void setReviewKeyIdList(List<Long> reviewKeyIdList) {
				this.reviewKeyIdList = reviewKeyIdList;
			}
		}

		public static class Recording {

			private String remark13;

			private String callee;

			private Integer dialogueSize;

			private String primaryId;

			private String remark12;

			private String remark1;

			private String remark7;

			private String remark8;

			private String remark2;

			private String callId;

			private String remark9;

			private String name;

			private String remark6;

			private String remark10;

			private String business;

			private String remark3;

			private String url;

			private String remark11;

			private String remark4;

			private Integer callType;

			private String caller;

			private String dataSetName;

			private Long duration;

			private Long remark5;

			private String id;

			private String callTime;

			private Long taskConfigId;

			private String taskConfigName;

			private String customerName;

			public String getRemark13() {
				return this.remark13;
			}

			public void setRemark13(String remark13) {
				this.remark13 = remark13;
			}

			public String getCallee() {
				return this.callee;
			}

			public void setCallee(String callee) {
				this.callee = callee;
			}

			public Integer getDialogueSize() {
				return this.dialogueSize;
			}

			public void setDialogueSize(Integer dialogueSize) {
				this.dialogueSize = dialogueSize;
			}

			public String getPrimaryId() {
				return this.primaryId;
			}

			public void setPrimaryId(String primaryId) {
				this.primaryId = primaryId;
			}

			public String getRemark12() {
				return this.remark12;
			}

			public void setRemark12(String remark12) {
				this.remark12 = remark12;
			}

			public String getRemark1() {
				return this.remark1;
			}

			public void setRemark1(String remark1) {
				this.remark1 = remark1;
			}

			public String getRemark7() {
				return this.remark7;
			}

			public void setRemark7(String remark7) {
				this.remark7 = remark7;
			}

			public String getRemark8() {
				return this.remark8;
			}

			public void setRemark8(String remark8) {
				this.remark8 = remark8;
			}

			public String getRemark2() {
				return this.remark2;
			}

			public void setRemark2(String remark2) {
				this.remark2 = remark2;
			}

			public String getCallId() {
				return this.callId;
			}

			public void setCallId(String callId) {
				this.callId = callId;
			}

			public String getRemark9() {
				return this.remark9;
			}

			public void setRemark9(String remark9) {
				this.remark9 = remark9;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRemark6() {
				return this.remark6;
			}

			public void setRemark6(String remark6) {
				this.remark6 = remark6;
			}

			public String getRemark10() {
				return this.remark10;
			}

			public void setRemark10(String remark10) {
				this.remark10 = remark10;
			}

			public String getBusiness() {
				return this.business;
			}

			public void setBusiness(String business) {
				this.business = business;
			}

			public String getRemark3() {
				return this.remark3;
			}

			public void setRemark3(String remark3) {
				this.remark3 = remark3;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getRemark11() {
				return this.remark11;
			}

			public void setRemark11(String remark11) {
				this.remark11 = remark11;
			}

			public String getRemark4() {
				return this.remark4;
			}

			public void setRemark4(String remark4) {
				this.remark4 = remark4;
			}

			public Integer getCallType() {
				return this.callType;
			}

			public void setCallType(Integer callType) {
				this.callType = callType;
			}

			public String getCaller() {
				return this.caller;
			}

			public void setCaller(String caller) {
				this.caller = caller;
			}

			public String getDataSetName() {
				return this.dataSetName;
			}

			public void setDataSetName(String dataSetName) {
				this.dataSetName = dataSetName;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public Long getRemark5() {
				return this.remark5;
			}

			public void setRemark5(Long remark5) {
				this.remark5 = remark5;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getCallTime() {
				return this.callTime;
			}

			public void setCallTime(String callTime) {
				this.callTime = callTime;
			}

			public Long getTaskConfigId() {
				return this.taskConfigId;
			}

			public void setTaskConfigId(Long taskConfigId) {
				this.taskConfigId = taskConfigId;
			}

			public String getTaskConfigName() {
				return this.taskConfigName;
			}

			public void setTaskConfigName(String taskConfigName) {
				this.taskConfigName = taskConfigName;
			}

			public String getCustomerName() {
				return this.customerName;
			}

			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}
		}

		public static class Agent {

			private String name;

			private String skillGroup;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSkillGroup() {
				return this.skillGroup;
			}

			public void setSkillGroup(String skillGroup) {
				this.skillGroup = skillGroup;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public GetResultResponse getInstance(UnmarshallerContext context) {
		return	GetResultResponseUnmarshaller.unmarshall(this, context);
	}
}
