/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.qualitycheck.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20160801.GetResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResultResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

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

		private String tid;

		private List<RuleHitInfo> rules;

		public String getTid() {
			return this.tid;
		}

		public void setTid(String tid) {
			this.tid = tid;
		}

		public List<RuleHitInfo> getRules() {
			return this.rules;
		}

		public void setRules(List<RuleHitInfo> rules) {
			this.rules = rules;
		}

		public static class RuleHitInfo {

			private String rid;

			private List<ConditionHitInfo> hit;

			private List<ConditionBasicInfo> conditionInfo;

			public String getRid() {
				return this.rid;
			}

			public void setRid(String rid) {
				this.rid = rid;
			}

			public List<ConditionHitInfo> getHit() {
				return this.hit;
			}

			public void setHit(List<ConditionHitInfo> hit) {
				this.hit = hit;
			}

			public List<ConditionBasicInfo> getConditionInfo() {
				return this.conditionInfo;
			}

			public void setConditionInfo(List<ConditionBasicInfo> conditionInfo) {
				this.conditionInfo = conditionInfo;
			}

			public static class ConditionHitInfo {

				private List<HitKeyWord> hitKeyWords;

				private List<String> hitCids;

				private Phrase phrase;

				public List<HitKeyWord> getHitKeyWords() {
					return this.hitKeyWords;
				}

				public void setHitKeyWords(List<HitKeyWord> hitKeyWords) {
					this.hitKeyWords = hitKeyWords;
				}

				public List<String> getHitCids() {
					return this.hitCids;
				}

				public void setHitCids(List<String> hitCids) {
					this.hitCids = hitCids;
				}

				public Phrase getPhrase() {
					return this.phrase;
				}

				public void setPhrase(Phrase phrase) {
					this.phrase = phrase;
				}

				public static class HitKeyWord {

					private String val;

					private Integer pid;

					private Integer from;

					private Integer to;

					private String tid;

					public String getVal() {
						return this.val;
					}

					public void setVal(String val) {
						this.val = val;
					}

					public Integer getPid() {
						return this.pid;
					}

					public void setPid(Integer pid) {
						this.pid = pid;
					}

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

					public String getTid() {
						return this.tid;
					}

					public void setTid(String tid) {
						this.tid = tid;
					}
				}

				public static class Phrase {

					private String role;

					private String identity;

					private String words;

					private Long begin;

					private Long end;

					private String beginTime;

					private String hourMinSec;

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

					public Long getEnd() {
						return this.end;
					}

					public void setEnd(Long end) {
						this.end = end;
					}

					public String getBeginTime() {
						return this.beginTime;
					}

					public void setBeginTime(String beginTime) {
						this.beginTime = beginTime;
					}

					public String gethourMinSec() {
						return this.hourMinSec;
					}

					public void sethourMinSec(String hourMinSec) {
						this.hourMinSec = hourMinSec;
					}
				}
			}

			public static class ConditionBasicInfo {

				private String conditionInfoCid;

				private String lambda;

				private List<OperatorBasicInfo> operators;

				private CheckRange checkRange;

				public String getConditionInfoCid() {
					return this.conditionInfoCid;
				}

				public void setConditionInfoCid(String conditionInfoCid) {
					this.conditionInfoCid = conditionInfoCid;
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

					private String name;

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
		}
	}

	@Override
	public GetResultResponse getInstance(UnmarshallerContext context) {
		return	GetResultResponseUnmarshaller.unmarshall(this, context);
	}
}
