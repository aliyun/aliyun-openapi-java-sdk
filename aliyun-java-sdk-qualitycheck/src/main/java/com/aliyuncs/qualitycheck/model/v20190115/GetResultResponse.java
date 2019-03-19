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

		private Integer score;

		private Integer status;

		private String taskId;

		private List<AsrResultItem> asrResult;

		private List<HitResultItem> hitResult;

		private Recording recording;

		public Integer getScore() {
			return this.score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
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

		public Recording getRecording() {
			return this.recording;
		}

		public void setRecording(Recording recording) {
			this.recording = recording;
		}

		public static class AsrResultItem {

			private String role;

			private String words;

			private Long begin;

			private Long end;

			private Integer emotionValue;

			private Integer silenceDuration;

			private Integer speechRate;

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
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
		}

		public static class HitResultItem {

			private String rid;

			private String name;

			private String type;

			private List<Hit> hits;

			public String getRid() {
				return this.rid;
			}

			public void setRid(String rid) {
				this.rid = rid;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<Hit> getHits() {
				return this.hits;
			}

			public void setHits(List<Hit> hits) {
				this.hits = hits;
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

					private String cid;

					private Integer from;

					private Integer to;

					private String val;

					public String getCid() {
						return this.cid;
					}

					public void setCid(String cid) {
						this.cid = cid;
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

					public String getVal() {
						return this.val;
					}

					public void setVal(String val) {
						this.val = val;
					}
				}

				public static class Phrase {

					private String role;

					private String words;

					private Long begin;

					private Integer end;

					private Integer emotionValue;

					private Integer silenceDuration;

					private Integer speechRate;

					public String getRole() {
						return this.role;
					}

					public void setRole(String role) {
						this.role = role;
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

					public Integer getEnd() {
						return this.end;
					}

					public void setEnd(Integer end) {
						this.end = end;
					}

					public Integer getEmotionValue() {
						return this.emotionValue;
					}

					public void setEmotionValue(Integer emotionValue) {
						this.emotionValue = emotionValue;
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
				}
			}
		}

		public static class Recording {

			private String id;

			private String name;

			private String url;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getBizUrl() {
				return this.url;
			}

			public void setBizUrl(String url) {
				this.url = url;
			}

			/**
			 * @deprecated use getBizUrl instead of this.
			 */
			@Deprecated
			public String getUrl() {
				return this.url;
			}

			/**
			 * @deprecated use setBizUrl instead of this.
			 */
			@Deprecated
			public void setUrl(String url) {
				this.url = url;
			}
		}
	}

	@Override
	public GetResultResponse getInstance(UnmarshallerContext context) {
		return	GetResultResponseUnmarshaller.unmarshall(this, context);
	}
}
