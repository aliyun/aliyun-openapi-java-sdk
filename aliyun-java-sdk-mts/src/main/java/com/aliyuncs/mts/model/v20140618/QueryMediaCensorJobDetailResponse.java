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
import com.aliyuncs.mts.transform.v20140618.QueryMediaCensorJobDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMediaCensorJobDetailResponse extends AcsResponse {

	private String requestId;

	private MediaCensorJobDetail mediaCensorJobDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MediaCensorJobDetail getMediaCensorJobDetail() {
		return this.mediaCensorJobDetail;
	}

	public void setMediaCensorJobDetail(MediaCensorJobDetail mediaCensorJobDetail) {
		this.mediaCensorJobDetail = mediaCensorJobDetail;
	}

	public static class MediaCensorJobDetail {

		private String id;

		private String userData;

		private String pipelineId;

		private String state;

		private String code;

		private String suggestion;

		private String message;

		private String creationTime;

		private List<CoverImageCensorResult> coverImageCensorResults;

		private TitleCensorResult titleCensorResult;

		private DescCensorResult descCensorResult;

		private BarrageCensorResult barrageCensorResult;

		private Input input;

		private VideoCensorConfig videoCensorConfig;

		private VensorCensorResult vensorCensorResult;

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

		public String getSuggestion() {
			return this.suggestion;
		}

		public void setSuggestion(String suggestion) {
			this.suggestion = suggestion;
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

		public List<CoverImageCensorResult> getCoverImageCensorResults() {
			return this.coverImageCensorResults;
		}

		public void setCoverImageCensorResults(List<CoverImageCensorResult> coverImageCensorResults) {
			this.coverImageCensorResults = coverImageCensorResults;
		}

		public TitleCensorResult getTitleCensorResult() {
			return this.titleCensorResult;
		}

		public void setTitleCensorResult(TitleCensorResult titleCensorResult) {
			this.titleCensorResult = titleCensorResult;
		}

		public DescCensorResult getDescCensorResult() {
			return this.descCensorResult;
		}

		public void setDescCensorResult(DescCensorResult descCensorResult) {
			this.descCensorResult = descCensorResult;
		}

		public BarrageCensorResult getBarrageCensorResult() {
			return this.barrageCensorResult;
		}

		public void setBarrageCensorResult(BarrageCensorResult barrageCensorResult) {
			this.barrageCensorResult = barrageCensorResult;
		}

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public VideoCensorConfig getVideoCensorConfig() {
			return this.videoCensorConfig;
		}

		public void setVideoCensorConfig(VideoCensorConfig videoCensorConfig) {
			this.videoCensorConfig = videoCensorConfig;
		}

		public VensorCensorResult getVensorCensorResult() {
			return this.vensorCensorResult;
		}

		public void setVensorCensorResult(VensorCensorResult vensorCensorResult) {
			this.vensorCensorResult = vensorCensorResult;
		}

		public static class CoverImageCensorResult {

			private String location;

			private String bucket;

			private String object;

			private List<Result> results;

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}

			public String getObject() {
				return this.object;
			}

			public void setObject(String object) {
				this.object = object;
			}

			public List<Result> getResults() {
				return this.results;
			}

			public void setResults(List<Result> results) {
				this.results = results;
			}

			public static class Result {

				private String rate;

				private String scene;

				private String label;

				private String suggestion;

				public String getRate() {
					return this.rate;
				}

				public void setRate(String rate) {
					this.rate = rate;
				}

				public String getScene() {
					return this.scene;
				}

				public void setScene(String scene) {
					this.scene = scene;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}
			}
		}

		public static class TitleCensorResult {

			private String rate;

			private String scene;

			private String label;

			private String suggestion;

			public String getRate() {
				return this.rate;
			}

			public void setRate(String rate) {
				this.rate = rate;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}
		}

		public static class DescCensorResult {

			private String rate;

			private String scene;

			private String label;

			private String suggestion;

			public String getRate() {
				return this.rate;
			}

			public void setRate(String rate) {
				this.rate = rate;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}
		}

		public static class BarrageCensorResult {

			private String rate;

			private String scene;

			private String label;

			private String suggestion;

			public String getRate() {
				return this.rate;
			}

			public void setRate(String rate) {
				this.rate = rate;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}
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

		public static class VideoCensorConfig {

			private String bizType;

			private String videoCensor;

			private OutputFile outputFile;

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
			}

			public String getVideoCensor() {
				return this.videoCensor;
			}

			public void setVideoCensor(String videoCensor) {
				this.videoCensor = videoCensor;
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

		public static class VensorCensorResult {

			private String nextPageToken;

			private List<CensorResult> censorResults;

			private List<VideoTimeline> videoTimelines;

			public String getNextPageToken() {
				return this.nextPageToken;
			}

			public void setNextPageToken(String nextPageToken) {
				this.nextPageToken = nextPageToken;
			}

			public List<CensorResult> getCensorResults() {
				return this.censorResults;
			}

			public void setCensorResults(List<CensorResult> censorResults) {
				this.censorResults = censorResults;
			}

			public List<VideoTimeline> getVideoTimelines() {
				return this.videoTimelines;
			}

			public void setVideoTimelines(List<VideoTimeline> videoTimelines) {
				this.videoTimelines = videoTimelines;
			}

			public static class CensorResult {

				private String rate;

				private String scene;

				private String label;

				private String suggestion;

				public String getRate() {
					return this.rate;
				}

				public void setRate(String rate) {
					this.rate = rate;
				}

				public String getScene() {
					return this.scene;
				}

				public void setScene(String scene) {
					this.scene = scene;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}
			}

			public static class VideoTimeline {

				private String object;

				private String timestamp;

				private List<CensorResult2> censorResults1;

				public String getObject() {
					return this.object;
				}

				public void setObject(String object) {
					this.object = object;
				}

				public String getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(String timestamp) {
					this.timestamp = timestamp;
				}

				public List<CensorResult2> getCensorResults1() {
					return this.censorResults1;
				}

				public void setCensorResults1(List<CensorResult2> censorResults1) {
					this.censorResults1 = censorResults1;
				}

				public static class CensorResult2 {

					private String rate;

					private String scene;

					private String label;

					private String suggestion;

					public String getRate() {
						return this.rate;
					}

					public void setRate(String rate) {
						this.rate = rate;
					}

					public String getScene() {
						return this.scene;
					}

					public void setScene(String scene) {
						this.scene = scene;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}
				}
			}
		}
	}

	@Override
	public QueryMediaCensorJobDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryMediaCensorJobDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
