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
import com.aliyuncs.mts.transform.v20140618.QueryAnnotationJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAnnotationJobListResponse extends AcsResponse {

	private String requestId;

	private List<AnnotationJob> annotationJobList;

	private List<String> nonExistIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AnnotationJob> getAnnotationJobList() {
		return this.annotationJobList;
	}

	public void setAnnotationJobList(List<AnnotationJob> annotationJobList) {
		this.annotationJobList = annotationJobList;
	}

	public List<String> getNonExistIds() {
		return this.nonExistIds;
	}

	public void setNonExistIds(List<String> nonExistIds) {
		this.nonExistIds = nonExistIds;
	}

	public static class AnnotationJob {

		private String creationTime;

		private String state;

		private String userData;

		private String code;

		private String message;

		private String pipelineId;

		private String id;

		private Input input;

		private VideoAnnotationResult videoAnnotationResult;

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

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public VideoAnnotationResult getVideoAnnotationResult() {
			return this.videoAnnotationResult;
		}

		public void setVideoAnnotationResult(VideoAnnotationResult videoAnnotationResult) {
			this.videoAnnotationResult = videoAnnotationResult;
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

		public static class VideoAnnotationResult {

			private String details;

			private List<Annotation> annotations;

			public String getDetails() {
				return this.details;
			}

			public void setDetails(String details) {
				this.details = details;
			}

			public List<Annotation> getAnnotations() {
				return this.annotations;
			}

			public void setAnnotations(List<Annotation> annotations) {
				this.annotations = annotations;
			}

			public static class Annotation {

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
		}
	}

	@Override
	public QueryAnnotationJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryAnnotationJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
