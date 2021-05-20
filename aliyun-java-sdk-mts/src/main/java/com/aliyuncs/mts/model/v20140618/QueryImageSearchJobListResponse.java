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
import com.aliyuncs.mts.transform.v20140618.QueryImageSearchJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryImageSearchJobListResponse extends AcsResponse {

	private String requestId;

	private List<ImageSearchJob> imageSearchJobList;

	private List<String> nonExistIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageSearchJob> getImageSearchJobList() {
		return this.imageSearchJobList;
	}

	public void setImageSearchJobList(List<ImageSearchJob> imageSearchJobList) {
		this.imageSearchJobList = imageSearchJobList;
	}

	public List<String> getNonExistIds() {
		return this.nonExistIds;
	}

	public void setNonExistIds(List<String> nonExistIds) {
		this.nonExistIds = nonExistIds;
	}

	public static class ImageSearchJob {

		private String creationTime;

		private String finishTime;

		private String state;

		private String userData;

		private String code;

		private String message;

		private String pipelineId;

		private String id;

		private Result result;

		private InputImage inputImage;

		private InputVideo inputVideo;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
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

		public Result getResult() {
			return this.result;
		}

		public void setResult(Result result) {
			this.result = result;
		}

		public InputImage getInputImage() {
			return this.inputImage;
		}

		public void setInputImage(InputImage inputImage) {
			this.inputImage = inputImage;
		}

		public InputVideo getInputVideo() {
			return this.inputVideo;
		}

		public void setInputVideo(InputVideo inputVideo) {
			this.inputVideo = inputVideo;
		}

		public static class Result {

			private List<ImageSearchShotsItem> imageSearchShots;

			public List<ImageSearchShotsItem> getImageSearchShots() {
				return this.imageSearchShots;
			}

			public void setImageSearchShots(List<ImageSearchShotsItem> imageSearchShots) {
				this.imageSearchShots = imageSearchShots;
			}

			public static class ImageSearchShotsItem {

				private String matchedFrame;

				private String matchedTimestamp;

				private String similarity;

				public String getMatchedFrame() {
					return this.matchedFrame;
				}

				public void setMatchedFrame(String matchedFrame) {
					this.matchedFrame = matchedFrame;
				}

				public String getMatchedTimestamp() {
					return this.matchedTimestamp;
				}

				public void setMatchedTimestamp(String matchedTimestamp) {
					this.matchedTimestamp = matchedTimestamp;
				}

				public String getSimilarity() {
					return this.similarity;
				}

				public void setSimilarity(String similarity) {
					this.similarity = similarity;
				}
			}
		}

		public static class InputImage {

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

		public static class InputVideo {

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
	public QueryImageSearchJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryImageSearchJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
