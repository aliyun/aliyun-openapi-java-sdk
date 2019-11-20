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
import com.aliyuncs.mts.transform.v20140618.QueryCoverJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCoverJobListResponse extends AcsResponse {

	private String requestId;

	private String nextPageToken;

	private List<CoverJob> coverJobList;

	private List<String> nonExistIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public List<CoverJob> getCoverJobList() {
		return this.coverJobList;
	}

	public void setCoverJobList(List<CoverJob> coverJobList) {
		this.coverJobList = coverJobList;
	}

	public List<String> getNonExistIds() {
		return this.nonExistIds;
	}

	public void setNonExistIds(List<String> nonExistIds) {
		this.nonExistIds = nonExistIds;
	}

	public static class CoverJob {

		private String id;

		private String userData;

		private String pipelineId;

		private String state;

		private String code;

		private String message;

		private String creationTime;

		private List<CoverImage> coverImageList;

		private Input input;

		private CoverConfig coverConfig;

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

		public List<CoverImage> getCoverImageList() {
			return this.coverImageList;
		}

		public void setCoverImageList(List<CoverImage> coverImageList) {
			this.coverImageList = coverImageList;
		}

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public CoverConfig getCoverConfig() {
			return this.coverConfig;
		}

		public void setCoverConfig(CoverConfig coverConfig) {
			this.coverConfig = coverConfig;
		}

		public static class CoverImage {

			private String score;

			private String url;

			private String time;

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
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

		public static class CoverConfig {

			private OutputFile outputFile;

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
	}

	@Override
	public QueryCoverJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryCoverJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
