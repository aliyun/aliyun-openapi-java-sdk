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
import com.aliyuncs.qualitycheck.transform.v20190115.SyncQualityCheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SyncQualityCheckResponse extends AcsResponse {

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

		private Integer score;

		private String tid;

		private Long beginTime;

		private String taskId;

		private List<RuleHitInfo> rules;

		public Integer getScore() {
			return this.score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}

		public String getTid() {
			return this.tid;
		}

		public void setTid(String tid) {
			this.tid = tid;
		}

		public Long getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public List<RuleHitInfo> getRules() {
			return this.rules;
		}

		public void setRules(List<RuleHitInfo> rules) {
			this.rules = rules;
		}

		public static class RuleHitInfo {

			private String rid;

			private String ruleName;

			private List<ConditionHitInfo> hit;

			public String getRid() {
				return this.rid;
			}

			public void setRid(String rid) {
				this.rid = rid;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public List<ConditionHitInfo> getHit() {
				return this.hit;
			}

			public void setHit(List<ConditionHitInfo> hit) {
				this.hit = hit;
			}

			public static class ConditionHitInfo {

				private List<HitKeyWord> hitKeyWords;

				private Phrase phrase;

				public List<HitKeyWord> getHitKeyWords() {
					return this.hitKeyWords;
				}

				public void setHitKeyWords(List<HitKeyWord> hitKeyWords) {
					this.hitKeyWords = hitKeyWords;
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

					private Integer cid;

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

					public Integer getCid() {
						return this.cid;
					}

					public void setCid(Integer cid) {
						this.cid = cid;
					}
				}

				public static class Phrase {

					private String role;

					private String identity;

					private String words;

					private Long begin;

					private Long end;

					private Integer emotionValue;

					private Integer speechRate;

					private Integer silenceDuration;

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

					public Integer getEmotionValue() {
						return this.emotionValue;
					}

					public void setEmotionValue(Integer emotionValue) {
						this.emotionValue = emotionValue;
					}

					public Integer getSpeechRate() {
						return this.speechRate;
					}

					public void setSpeechRate(Integer speechRate) {
						this.speechRate = speechRate;
					}

					public Integer getSilenceDuration() {
						return this.silenceDuration;
					}

					public void setSilenceDuration(Integer silenceDuration) {
						this.silenceDuration = silenceDuration;
					}
				}
			}
		}
	}

	@Override
	public SyncQualityCheckResponse getInstance(UnmarshallerContext context) {
		return	SyncQualityCheckResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
