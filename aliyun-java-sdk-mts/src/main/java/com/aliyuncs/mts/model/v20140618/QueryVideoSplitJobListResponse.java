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
import com.aliyuncs.mts.transform.v20140618.QueryVideoSplitJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryVideoSplitJobListResponse extends AcsResponse {

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

		private String creationTime;

		private String state;

		private String userData;

		private String code;

		private String message;

		private String pipelineId;

		private String id;

		private VideoSplitResult videoSplitResult;

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

		public VideoSplitResult getVideoSplitResult() {
			return this.videoSplitResult;
		}

		public void setVideoSplitResult(VideoSplitResult videoSplitResult) {
			this.videoSplitResult = videoSplitResult;
		}

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public static class VideoSplitResult {

			private List<VideoSplit> videoSplitList;

			public List<VideoSplit> getVideoSplitList() {
				return this.videoSplitList;
			}

			public void setVideoSplitList(List<VideoSplit> videoSplitList) {
				this.videoSplitList = videoSplitList;
			}

			public static class VideoSplit {

				private String endTime;

				private String startTime;

				private String path;

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
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
	public QueryVideoSplitJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryVideoSplitJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
