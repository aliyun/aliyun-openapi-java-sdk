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
import com.aliyuncs.qualitycheck.transform.v20190115.UploadDataSyncResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UploadDataSyncResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

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

	public List<ResultInfo> getData() {
		return this.data;
	}

	public void setData(List<ResultInfo> data) {
		this.data = data;
	}

	public static class ResultInfo {

		private Integer score;

		private List<RuleHitInfo> rules;

		private List<String> handScoreIdList;

		public Integer getScore() {
			return this.score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}

		public List<RuleHitInfo> getRules() {
			return this.rules;
		}

		public void setRules(List<RuleHitInfo> rules) {
			this.rules = rules;
		}

		public List<String> getHandScoreIdList() {
			return this.handScoreIdList;
		}

		public void setHandScoreIdList(List<String> handScoreIdList) {
			this.handScoreIdList = handScoreIdList;
		}

		public static class RuleHitInfo {

			private String rid;

			private String tid;

			private List<ConditionHitInfo> hit;

			private List<ConditionBasicInfo> conditionInfo;

			public String getRid() {
				return this.rid;
			}

			public void setRid(String rid) {
				this.rid = rid;
			}

			public String getTid() {
				return this.tid;
			}

			public void setTid(String tid) {
				this.tid = tid;
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
				}
			}

			public static class ConditionBasicInfo {

				private String conditionInfoCid;

				public String getConditionInfoCid() {
					return this.conditionInfoCid;
				}

				public void setConditionInfoCid(String conditionInfoCid) {
					this.conditionInfoCid = conditionInfoCid;
				}
			}
		}
	}

	@Override
	public UploadDataSyncResponse getInstance(UnmarshallerContext context) {
		return	UploadDataSyncResponseUnmarshaller.unmarshall(this, context);
	}
}
