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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.QueryMediaDetailJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMediaDetailJobListResponse extends AcsResponse {

	private String requestId;

	private List<Job> jobList;

	private List<String> nonExistIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Job> getJobList() {
		return this.jobList;
	}

	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}

	public List<String> getNonExistIds() {
		return this.nonExistIds;
	}

	public void setNonExistIds(List<String> nonExistIds) {
		this.nonExistIds = nonExistIds;
	}

	public static class Job {

		private String id;

		private String userData;

		private String pipelineId;

		private String state;

		private String code;

		private String message;

		private String creationTime;

		private Input input;

		private MediaDetailConfig mediaDetailConfig;

		private MediaDetailResult mediaDetailResult;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
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

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public MediaDetailConfig getMediaDetailConfig() {
			return this.mediaDetailConfig;
		}

		public void setMediaDetailConfig(MediaDetailConfig mediaDetailConfig) {
			this.mediaDetailConfig = mediaDetailConfig;
		}

		public MediaDetailResult getMediaDetailResult() {
			return this.mediaDetailResult;
		}

		public void setMediaDetailResult(MediaDetailResult mediaDetailResult) {
			this.mediaDetailResult = mediaDetailResult;
		}

		public static class Input {

			private String bucket;

			private String location;

			private String object;

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getObject() {
				return this.object;
			}

			public void setObject(String object) {
				this.object = object;
			}
		}

		public static class MediaDetailConfig {

			private String scenario;

			private String detailType;

			private OutputFile outputFile;

			public String getScenario() {
				return this.scenario;
			}

			public void setScenario(String scenario) {
				this.scenario = scenario;
			}

			public String getDetailType() {
				return this.detailType;
			}

			public void setDetailType(String detailType) {
				this.detailType = detailType;
			}

			public OutputFile getOutputFile() {
				return this.outputFile;
			}

			public void setOutputFile(OutputFile outputFile) {
				this.outputFile = outputFile;
			}

			public static class OutputFile {

				private String bucket;

				private String location;

				private String object;

				public String getBucket() {
					return this.bucket;
				}

				public void setBucket(String bucket) {
					this.bucket = bucket;
				}

				public String getLocation() {
					return this.location;
				}

				public void setLocation(String location) {
					this.location = location;
				}

				public String getObject() {
					return this.object;
				}

				public void setObject(String object) {
					this.object = object;
				}
			}
		}

		public static class MediaDetailResult {

			private String status;

			private List<MediaDetailRecgResult> mediaDetailRecgResults;

			private List<String> tags;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<MediaDetailRecgResult> getMediaDetailRecgResults() {
				return this.mediaDetailRecgResults;
			}

			public void setMediaDetailRecgResults(List<MediaDetailRecgResult> mediaDetailRecgResults) {
				this.mediaDetailRecgResults = mediaDetailRecgResults;
			}

			public List<String> getTags() {
				return this.tags;
			}

			public void setTags(List<String> tags) {
				this.tags = tags;
			}

			public static class MediaDetailRecgResult {

				private String imageUrl;

				private String time;

				private String ocrText;

				private List<Celebrity> celebrities;

				private List<Sensitive> sensitives;

				private List<Politician> politicians;

				private List<FrameTagInfo> frameTagInfos;

				private List<Custom> customs;

				private List<String> frameTags;

				public String getImageUrl() {
					return this.imageUrl;
				}

				public void setImageUrl(String imageUrl) {
					this.imageUrl = imageUrl;
				}

				public String getTime() {
					return this.time;
				}

				public void setTime(String time) {
					this.time = time;
				}

				public String getOcrText() {
					return this.ocrText;
				}

				public void setOcrText(String ocrText) {
					this.ocrText = ocrText;
				}

				public List<Celebrity> getCelebrities() {
					return this.celebrities;
				}

				public void setCelebrities(List<Celebrity> celebrities) {
					this.celebrities = celebrities;
				}

				public List<Sensitive> getSensitives() {
					return this.sensitives;
				}

				public void setSensitives(List<Sensitive> sensitives) {
					this.sensitives = sensitives;
				}

				public List<Politician> getPoliticians() {
					return this.politicians;
				}

				public void setPoliticians(List<Politician> politicians) {
					this.politicians = politicians;
				}

				public List<FrameTagInfo> getFrameTagInfos() {
					return this.frameTagInfos;
				}

				public void setFrameTagInfos(List<FrameTagInfo> frameTagInfos) {
					this.frameTagInfos = frameTagInfos;
				}

				public List<Custom> getCustoms() {
					return this.customs;
				}

				public void setCustoms(List<Custom> customs) {
					this.customs = customs;
				}

				public List<String> getFrameTags() {
					return this.frameTags;
				}

				public void setFrameTags(List<String> frameTags) {
					this.frameTags = frameTags;
				}

				public static class Celebrity {

					private String name;

					private String score;

					private String target;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTarget() {
						return this.target;
					}

					public void setTarget(String target) {
						this.target = target;
					}
				}

				public static class Sensitive {

					private String name;

					private String score;

					private String target;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTarget() {
						return this.target;
					}

					public void setTarget(String target) {
						this.target = target;
					}
				}

				public static class Politician {

					private String name;

					private String score;

					private String target;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTarget() {
						return this.target;
					}

					public void setTarget(String target) {
						this.target = target;
					}
				}

				public static class FrameTagInfo {

					private String tag;

					private String score;

					private String category;

					public String getTag() {
						return this.tag;
					}

					public void setTag(String tag) {
						this.tag = tag;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getCategory() {
						return this.category;
					}

					public void setCategory(String category) {
						this.category = category;
					}
				}

				public static class Custom {

					private String name;

					private List<Clip> clips;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public List<Clip> getClips() {
						return this.clips;
					}

					public void setClips(List<Clip> clips) {
						this.clips = clips;
					}

					public static class Clip {

						private String minScore;

						private String maxScore;

						private String avgScore;

						private String startTarget;

						private String endTarget;

						private String startTime;

						private String endTime;

						public String getMinScore() {
							return this.minScore;
						}

						public void setMinScore(String minScore) {
							this.minScore = minScore;
						}

						public String getMaxScore() {
							return this.maxScore;
						}

						public void setMaxScore(String maxScore) {
							this.maxScore = maxScore;
						}

						public String getAvgScore() {
							return this.avgScore;
						}

						public void setAvgScore(String avgScore) {
							this.avgScore = avgScore;
						}

						public String getStartTarget() {
							return this.startTarget;
						}

						public void setStartTarget(String startTarget) {
							this.startTarget = startTarget;
						}

						public String getEndTarget() {
							return this.endTarget;
						}

						public void setEndTarget(String endTarget) {
							this.endTarget = endTarget;
						}

						public String getStartTime() {
							return this.startTime;
						}

						public void setStartTime(String startTime) {
							this.startTime = startTime;
						}

						public String getEndTime() {
							return this.endTime;
						}

						public void setEndTime(String endTime) {
							this.endTime = endTime;
						}
					}
				}
			}
		}
	}

	@Override
	public QueryMediaDetailJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryMediaDetailJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
