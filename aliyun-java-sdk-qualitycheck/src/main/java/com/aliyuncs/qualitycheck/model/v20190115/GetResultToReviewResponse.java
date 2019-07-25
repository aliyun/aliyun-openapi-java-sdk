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
import com.aliyuncs.qualitycheck.transform.v20190115.GetResultToReviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResultToReviewResponse extends AcsResponse {

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

		private Boolean audio;

		private String audioScheme;

		private String audioURL;

		private Integer businessType;

		private Boolean deleted;

		private String fileMergeName;

		private Integer hitNumber;

		private Integer reviewNumber;

		private Integer totalScore;

		private String vid;

		private String comments;

		private String fileId;

		private List<Dialogue> dialogues;

		private List<ScorePo> handScoreInfoList;

		private List<HitRuleReviewInfo> hitRuleReviewInfoList;

		private List<String> manualScoreMappingList;

		public Boolean getAudio() {
			return this.audio;
		}

		public void setAudio(Boolean audio) {
			this.audio = audio;
		}

		public String getAudioScheme() {
			return this.audioScheme;
		}

		public void setAudioScheme(String audioScheme) {
			this.audioScheme = audioScheme;
		}

		public String getAudioURL() {
			return this.audioURL;
		}

		public void setAudioURL(String audioURL) {
			this.audioURL = audioURL;
		}

		public Integer getBusinessType() {
			return this.businessType;
		}

		public void setBusinessType(Integer businessType) {
			this.businessType = businessType;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getFileMergeName() {
			return this.fileMergeName;
		}

		public void setFileMergeName(String fileMergeName) {
			this.fileMergeName = fileMergeName;
		}

		public Integer getHitNumber() {
			return this.hitNumber;
		}

		public void setHitNumber(Integer hitNumber) {
			this.hitNumber = hitNumber;
		}

		public Integer getReviewNumber() {
			return this.reviewNumber;
		}

		public void setReviewNumber(Integer reviewNumber) {
			this.reviewNumber = reviewNumber;
		}

		public Integer getTotalScore() {
			return this.totalScore;
		}

		public void setTotalScore(Integer totalScore) {
			this.totalScore = totalScore;
		}

		public String getVid() {
			return this.vid;
		}

		public void setVid(String vid) {
			this.vid = vid;
		}

		public String getComments() {
			return this.comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public List<Dialogue> getDialogues() {
			return this.dialogues;
		}

		public void setDialogues(List<Dialogue> dialogues) {
			this.dialogues = dialogues;
		}

		public List<ScorePo> getHandScoreInfoList() {
			return this.handScoreInfoList;
		}

		public void setHandScoreInfoList(List<ScorePo> handScoreInfoList) {
			this.handScoreInfoList = handScoreInfoList;
		}

		public List<HitRuleReviewInfo> getHitRuleReviewInfoList() {
			return this.hitRuleReviewInfoList;
		}

		public void setHitRuleReviewInfoList(List<HitRuleReviewInfo> hitRuleReviewInfoList) {
			this.hitRuleReviewInfoList = hitRuleReviewInfoList;
		}

		public List<String> getManualScoreMappingList() {
			return this.manualScoreMappingList;
		}

		public void setManualScoreMappingList(List<String> manualScoreMappingList) {
			this.manualScoreMappingList = manualScoreMappingList;
		}

		public static class Dialogue {

			private Long begin;

			private String beginTime;

			private Integer emotionValue;

			private Long end;

			private String hourMinSec;

			private String identity;

			private String role;

			private Integer silenceDuration;

			private Integer speechRate;

			private String words;

			public Long getBegin() {
				return this.begin;
			}

			public void setBegin(Long begin) {
				this.begin = begin;
			}

			public String getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(String beginTime) {
				this.beginTime = beginTime;
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

			public String getHourMinSec() {
				return this.hourMinSec;
			}

			public void setHourMinSec(String hourMinSec) {
				this.hourMinSec = hourMinSec;
			}

			public String getIdentity() {
				return this.identity;
			}

			public void setIdentity(String identity) {
				this.identity = identity;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public Integer getSilenceDuration() {
				return this.silenceDuration;
			}

			public void setSilenceDuration(Integer silenceDuration) {
				this.silenceDuration = silenceDuration;
			}

			public Integer getSpeechRate() {
				return this.speechRate;
			}

			public void setSpeechRate(Integer speechRate) {
				this.speechRate = speechRate;
			}

			public String getWords() {
				return this.words;
			}

			public void setWords(String words) {
				this.words = words;
			}
		}

		public static class ScorePo {

			private Long scoreId;

			private String scoreName;

			private List<ScoreParam> scoreInfos;

			public Long getScoreId() {
				return this.scoreId;
			}

			public void setScoreId(Long scoreId) {
				this.scoreId = scoreId;
			}

			public String getScoreName() {
				return this.scoreName;
			}

			public void setScoreName(String scoreName) {
				this.scoreName = scoreName;
			}

			public List<ScoreParam> getScoreInfos() {
				return this.scoreInfos;
			}

			public void setScoreInfos(List<ScoreParam> scoreInfos) {
				this.scoreInfos = scoreInfos;
			}

			public static class ScoreParam {

				private Integer hit;

				private Integer scoreNum;

				private Long scoreSubId;

				private String scoreSubName;

				private Integer scoreType;

				public Integer getHit() {
					return this.hit;
				}

				public void setHit(Integer hit) {
					this.hit = hit;
				}

				public Integer getScoreNum() {
					return this.scoreNum;
				}

				public void setScoreNum(Integer scoreNum) {
					this.scoreNum = scoreNum;
				}

				public Long getScoreSubId() {
					return this.scoreSubId;
				}

				public void setScoreSubId(Long scoreSubId) {
					this.scoreSubId = scoreSubId;
				}

				public String getScoreSubName() {
					return this.scoreSubName;
				}

				public void setScoreSubName(String scoreSubName) {
					this.scoreSubName = scoreSubName;
				}

				public Integer getScoreType() {
					return this.scoreType;
				}

				public void setScoreType(Integer scoreType) {
					this.scoreType = scoreType;
				}
			}
		}

		public static class HitRuleReviewInfo {

			private Integer autoReview;

			private Long rid;

			private String ruleName;

			private Integer ruleScoreType;

			private Integer ruleType;

			private Long scoreId;

			private Long scoreSubId;

			private Integer totalNumber;

			private List<ConditionHitInfo> conditionHitInfoList;

			private ReviewInfo reviewInfo;

			public Integer getAutoReview() {
				return this.autoReview;
			}

			public void setAutoReview(Integer autoReview) {
				this.autoReview = autoReview;
			}

			public Long getRid() {
				return this.rid;
			}

			public void setRid(Long rid) {
				this.rid = rid;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public Integer getRuleScoreType() {
				return this.ruleScoreType;
			}

			public void setRuleScoreType(Integer ruleScoreType) {
				this.ruleScoreType = ruleScoreType;
			}

			public Integer getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(Integer ruleType) {
				this.ruleType = ruleType;
			}

			public Long getScoreId() {
				return this.scoreId;
			}

			public void setScoreId(Long scoreId) {
				this.scoreId = scoreId;
			}

			public Long getScoreSubId() {
				return this.scoreSubId;
			}

			public void setScoreSubId(Long scoreSubId) {
				this.scoreSubId = scoreSubId;
			}

			public Integer getTotalNumber() {
				return this.totalNumber;
			}

			public void setTotalNumber(Integer totalNumber) {
				this.totalNumber = totalNumber;
			}

			public List<ConditionHitInfo> getConditionHitInfoList() {
				return this.conditionHitInfoList;
			}

			public void setConditionHitInfoList(List<ConditionHitInfo> conditionHitInfoList) {
				this.conditionHitInfoList = conditionHitInfoList;
			}

			public ReviewInfo getReviewInfo() {
				return this.reviewInfo;
			}

			public void setReviewInfo(ReviewInfo reviewInfo) {
				this.reviewInfo = reviewInfo;
			}

			public static class ConditionHitInfo {

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

					private Integer emotionValue;

					private String words;

					private Long end;

					private Integer pid;

					private Long begin;

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

					public Integer getEmotionValue() {
						return this.emotionValue;
					}

					public void setEmotionValue(Integer emotionValue) {
						this.emotionValue = emotionValue;
					}

					public String getWords() {
						return this.words;
					}

					public void setWords(String words) {
						this.words = words;
					}

					public Long getEnd() {
						return this.end;
					}

					public void setEnd(Long end) {
						this.end = end;
					}

					public Integer getPid() {
						return this.pid;
					}

					public void setPid(Integer pid) {
						this.pid = pid;
					}

					public Long getBegin() {
						return this.begin;
					}

					public void setBegin(Long begin) {
						this.begin = begin;
					}
				}
			}

			public static class ReviewInfo {

				private String hitId;

				private Long rid;

				private Integer reviewResult;

				private String reviewer;

				private String reviewTime;

				public String getHitId() {
					return this.hitId;
				}

				public void setHitId(String hitId) {
					this.hitId = hitId;
				}

				public Long getRid() {
					return this.rid;
				}

				public void setRid(Long rid) {
					this.rid = rid;
				}

				public Integer getReviewResult() {
					return this.reviewResult;
				}

				public void setReviewResult(Integer reviewResult) {
					this.reviewResult = reviewResult;
				}

				public String getReviewer() {
					return this.reviewer;
				}

				public void setReviewer(String reviewer) {
					this.reviewer = reviewer;
				}

				public String getReviewTime() {
					return this.reviewTime;
				}

				public void setReviewTime(String reviewTime) {
					this.reviewTime = reviewTime;
				}
			}
		}
	}

	@Override
	public GetResultToReviewResponse getInstance(UnmarshallerContext context) {
		return	GetResultToReviewResponseUnmarshaller.unmarshall(this, context);
	}
}
