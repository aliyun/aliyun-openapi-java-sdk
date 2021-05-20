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
import com.aliyuncs.mts.transform.v20140618.QueryTagJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTagJobListResponse extends AcsResponse {

	private String requestId;

	private List<TagJob> tagJobList;

	private List<String> nonExistIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TagJob> getTagJobList() {
		return this.tagJobList;
	}

	public void setTagJobList(List<TagJob> tagJobList) {
		this.tagJobList = tagJobList;
	}

	public List<String> getNonExistIds() {
		return this.nonExistIds;
	}

	public void setNonExistIds(List<String> nonExistIds) {
		this.nonExistIds = nonExistIds;
	}

	public static class TagJob {

		private String creationTime;

		private String state;

		private String userData;

		private String code;

		private String message;

		private String pipelineId;

		private String id;

		private VideoTagResult videoTagResult;

		private Input input;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
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

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public VideoTagResult getVideoTagResult() {
			return this.videoTagResult;
		}

		public void setVideoTagResult(VideoTagResult videoTagResult) {
			this.videoTagResult = videoTagResult;
		}

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public static class VideoTagResult {

			private String details;

			private List<TagAnResult> tagAnResults;

			private List<TagFrResult> tagFrResults;

			public String getDetails() {
				return this.details;
			}

			public void setDetails(String details) {
				this.details = details;
			}

			public List<TagAnResult> getTagAnResults() {
				return this.tagAnResults;
			}

			public void setTagAnResults(List<TagAnResult> tagAnResults) {
				this.tagAnResults = tagAnResults;
			}

			public List<TagFrResult> getTagFrResults() {
				return this.tagFrResults;
			}

			public void setTagFrResults(List<TagFrResult> tagFrResults) {
				this.tagFrResults = tagFrResults;
			}

			public static class TagAnResult {

				private String score;

				private String label;

				public String getScore() {
					return this.score;
				}

				public void setScore(String score) {
					this.score = score;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}
			}

			public static class TagFrResult {

				private String time;

				private List<TagFace> tagFaces;

				public String getTime() {
					return this.time;
				}

				public void setTime(String time) {
					this.time = time;
				}

				public List<TagFace> getTagFaces() {
					return this.tagFaces;
				}

				public void setTagFaces(List<TagFace> tagFaces) {
					this.tagFaces = tagFaces;
				}

				public static class TagFace {

					private String score;

					private String name;

					private String target;

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getTarget() {
						return this.target;
					}

					public void setTarget(String target) {
						this.target = target;
					}
				}
			}
		}

		public static class Input {

			private String object;

			private String location;

			private String bucket;

			public String getObject() {
				return this.object;
			}

			public void setObject(String object) {
				this.object = object;
			}

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
		}
	}

	@Override
	public QueryTagJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryTagJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
