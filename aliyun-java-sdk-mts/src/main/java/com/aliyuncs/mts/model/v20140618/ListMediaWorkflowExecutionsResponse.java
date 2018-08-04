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
import com.aliyuncs.mts.transform.v20140618.ListMediaWorkflowExecutionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMediaWorkflowExecutionsResponse extends AcsResponse {

	private String requestId;

	private String nextPageToken;

	private List<MediaWorkflowExecution> mediaWorkflowExecutionList;

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

	public List<MediaWorkflowExecution> getMediaWorkflowExecutionList() {
		return this.mediaWorkflowExecutionList;
	}

	public void setMediaWorkflowExecutionList(List<MediaWorkflowExecution> mediaWorkflowExecutionList) {
		this.mediaWorkflowExecutionList = mediaWorkflowExecutionList;
	}

	public static class MediaWorkflowExecution {

		private String runId;

		private String mediaWorkflowId;

		private String name;

		private String state;

		private String mediaId;

		private String creationTime;

		private List<Activity> activityList;

		private Input input;

		public String getRunId() {
			return this.runId;
		}

		public void setRunId(String runId) {
			this.runId = runId;
		}

		public String getMediaWorkflowId() {
			return this.mediaWorkflowId;
		}

		public void setMediaWorkflowId(String mediaWorkflowId) {
			this.mediaWorkflowId = mediaWorkflowId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
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

			private String name;

			private String type;

			private String jobId;

			private String state;

			private String code;

			private String message;

			private String startTime;

			private String endTime;

			private MNSMessageResult mNSMessageResult;

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

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
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
	public ListMediaWorkflowExecutionsResponse getInstance(UnmarshallerContext context) {
		return	ListMediaWorkflowExecutionsResponseUnmarshaller.unmarshall(this, context);
	}
}
