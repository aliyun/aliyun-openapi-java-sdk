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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetAIMediaAuditJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAIMediaAuditJobResponse extends AcsResponse {

	private String requestId;

	private MediaAuditJob mediaAuditJob;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MediaAuditJob getMediaAuditJob() {
		return this.mediaAuditJob;
	}

	public void setMediaAuditJob(MediaAuditJob mediaAuditJob) {
		this.mediaAuditJob = mediaAuditJob;
	}

	public static class MediaAuditJob {

		private String jobId;

		private String mediaId;

		private String type;

		private String status;

		private String code;

		private String message;

		private String creationTime;

		private String completeTime;

		private Data data;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(String completeTime) {
			this.completeTime = completeTime;
		}

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private String suggestion;

			private String abnormalModules;

			private String label;

			private List<ImageResultItem> imageResult;

			private List<TextResultItem> textResult;

			private VideoResult videoResult;

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}

			public String getAbnormalModules() {
				return this.abnormalModules;
			}

			public void setAbnormalModules(String abnormalModules) {
				this.abnormalModules = abnormalModules;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public List<ImageResultItem> getImageResult() {
				return this.imageResult;
			}

			public void setImageResult(List<ImageResultItem> imageResult) {
				this.imageResult = imageResult;
			}

			public List<TextResultItem> getTextResult() {
				return this.textResult;
			}

			public void setTextResult(List<TextResultItem> textResult) {
				this.textResult = textResult;
			}

			public VideoResult getVideoResult() {
				return this.videoResult;
			}

			public void setVideoResult(VideoResult videoResult) {
				this.videoResult = videoResult;
			}

			public static class ImageResultItem {

				private String suggestion;

				private String label;

				private String type;

				private String url;

				private List<ResultItem> result;

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getUrl() {
					return this.url;
				}

				public void setUrl(String url) {
					this.url = url;
				}

				public List<ResultItem> getResult() {
					return this.result;
				}

				public void setResult(List<ResultItem> result) {
					this.result = result;
				}

				public static class ResultItem {

					private String suggestion;

					private String label;

					private String score;

					private String scene;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getScene() {
						return this.scene;
					}

					public void setScene(String scene) {
						this.scene = scene;
					}
				}
			}

			public static class TextResultItem {

				private String suggestion;

				private String label;

				private String score;

				private String scene;

				private String type;

				private String content;

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getScore() {
					return this.score;
				}

				public void setScore(String score) {
					this.score = score;
				}

				public String getScene() {
					return this.scene;
				}

				public void setScene(String scene) {
					this.scene = scene;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}
			}

			public static class VideoResult {

				private String suggestion;

				private String label;

				private TerrorismResult terrorismResult;

				private PornResult pornResult;

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public TerrorismResult getTerrorismResult() {
					return this.terrorismResult;
				}

				public void setTerrorismResult(TerrorismResult terrorismResult) {
					this.terrorismResult = terrorismResult;
				}

				public PornResult getPornResult() {
					return this.pornResult;
				}

				public void setPornResult(PornResult pornResult) {
					this.pornResult = pornResult;
				}

				public static class TerrorismResult {

					private String suggestion;

					private String label;

					private String maxScore;

					private String averageScore;

					private List<CounterListItem> counterList;

					private List<TopListItem> topList;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public String getMaxScore() {
						return this.maxScore;
					}

					public void setMaxScore(String maxScore) {
						this.maxScore = maxScore;
					}

					public String getAverageScore() {
						return this.averageScore;
					}

					public void setAverageScore(String averageScore) {
						this.averageScore = averageScore;
					}

					public List<CounterListItem> getCounterList() {
						return this.counterList;
					}

					public void setCounterList(List<CounterListItem> counterList) {
						this.counterList = counterList;
					}

					public List<TopListItem> getTopList() {
						return this.topList;
					}

					public void setTopList(List<TopListItem> topList) {
						this.topList = topList;
					}

					public static class CounterListItem {

						private String label;

						private Integer count;

						public String getLabel() {
							return this.label;
						}

						public void setLabel(String label) {
							this.label = label;
						}

						public Integer getCount() {
							return this.count;
						}

						public void setCount(Integer count) {
							this.count = count;
						}
					}

					public static class TopListItem {

						private String label;

						private String score;

						private String timestamp;

						private String url;

						public String getLabel() {
							return this.label;
						}

						public void setLabel(String label) {
							this.label = label;
						}

						public String getScore() {
							return this.score;
						}

						public void setScore(String score) {
							this.score = score;
						}

						public String getTimestamp() {
							return this.timestamp;
						}

						public void setTimestamp(String timestamp) {
							this.timestamp = timestamp;
						}

						public String getUrl() {
							return this.url;
						}

						public void setUrl(String url) {
							this.url = url;
						}
					}
				}

				public static class PornResult {

					private String suggestion;

					private String label;

					private String maxScore;

					private String averageScore;

					private List<CounterListItem3> counterList1;

					private List<TopListItem4> topList2;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public String getMaxScore() {
						return this.maxScore;
					}

					public void setMaxScore(String maxScore) {
						this.maxScore = maxScore;
					}

					public String getAverageScore() {
						return this.averageScore;
					}

					public void setAverageScore(String averageScore) {
						this.averageScore = averageScore;
					}

					public List<CounterListItem3> getCounterList1() {
						return this.counterList1;
					}

					public void setCounterList1(List<CounterListItem3> counterList1) {
						this.counterList1 = counterList1;
					}

					public List<TopListItem4> getTopList2() {
						return this.topList2;
					}

					public void setTopList2(List<TopListItem4> topList2) {
						this.topList2 = topList2;
					}

					public static class CounterListItem3 {

						private String label;

						private Integer count;

						public String getLabel() {
							return this.label;
						}

						public void setLabel(String label) {
							this.label = label;
						}

						public Integer getCount() {
							return this.count;
						}

						public void setCount(Integer count) {
							this.count = count;
						}
					}

					public static class TopListItem4 {

						private String label;

						private String score;

						private String timestamp;

						private String url;

						public String getLabel() {
							return this.label;
						}

						public void setLabel(String label) {
							this.label = label;
						}

						public String getScore() {
							return this.score;
						}

						public void setScore(String score) {
							this.score = score;
						}

						public String getTimestamp() {
							return this.timestamp;
						}

						public void setTimestamp(String timestamp) {
							this.timestamp = timestamp;
						}

						public String getUrl() {
							return this.url;
						}

						public void setUrl(String url) {
							this.url = url;
						}
					}
				}
			}
		}
	}

	@Override
	public GetAIMediaAuditJobResponse getInstance(UnmarshallerContext context) {
		return	GetAIMediaAuditJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
