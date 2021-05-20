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
import com.aliyuncs.mts.transform.v20140618.QueryMediaWorkflowExecutionListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMediaWorkflowExecutionListResponse extends AcsResponse {

	private String requestId;

	private List<MediaWorkflowExecution> mediaWorkflowExecutionList;

	private List<String> nonExistRunIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MediaWorkflowExecution> getMediaWorkflowExecutionList() {
		return this.mediaWorkflowExecutionList;
	}

	public void setMediaWorkflowExecutionList(List<MediaWorkflowExecution> mediaWorkflowExecutionList) {
		this.mediaWorkflowExecutionList = mediaWorkflowExecutionList;
	}

	public List<String> getNonExistRunIds() {
		return this.nonExistRunIds;
	}

	public void setNonExistRunIds(List<String> nonExistRunIds) {
		this.nonExistRunIds = nonExistRunIds;
	}

	public static class MediaWorkflowExecution {

		private String creationTime;

		private String mediaWorkflowId;

		private String state;

		private String name;

		private String mediaId;

		private String runId;

		private List<Activity> activityList;

		private Input input;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getMediaWorkflowId() {
			return this.mediaWorkflowId;
		}

		public void setMediaWorkflowId(String mediaWorkflowId) {
			this.mediaWorkflowId = mediaWorkflowId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getRunId() {
			return this.runId;
		}

		public void setRunId(String runId) {
			this.runId = runId;
		}

		public List<Activity> getActivityList() {
			return this.activityList;
		}

		public void setActivityList(List<Activity> activityList) {
			this.activityList = activityList;
		}

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public static class Activity {

			private String endTime;

			private String type;

			private String startTime;

			private String state;

			private String jobId;

			private String code;

			private String message;

			private String name;

			private MNSMessageResult mNSMessageResult;

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
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

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public MNSMessageResult getMNSMessageResult() {
				return this.mNSMessageResult;
			}

			public void setMNSMessageResult(MNSMessageResult mNSMessageResult) {
				this.mNSMessageResult = mNSMessageResult;
			}

			public static class MNSMessageResult {

				private String messageId;

				private String errorMessage;

				private String errorCode;

				public String getMessageId() {
					return this.messageId;
				}

				public void setMessageId(String messageId) {
					this.messageId = messageId;
				}

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}
			}
		}

		public static class Input {

			private String userData;

			private InputFile inputFile;

			public String getUserData() {
				return this.userData;
			}

			public void setUserData(String userData) {
				this.userData = userData;
			}

			public InputFile getInputFile() {
				return this.inputFile;
			}

			public void setInputFile(InputFile inputFile) {
				this.inputFile = inputFile;
			}

			public static class InputFile {

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
	}

	@Override
	public QueryMediaWorkflowExecutionListResponse getInstance(UnmarshallerContext context) {
		return	QueryMediaWorkflowExecutionListResponseUnmarshaller.unmarshall(this, context);
	}
}
