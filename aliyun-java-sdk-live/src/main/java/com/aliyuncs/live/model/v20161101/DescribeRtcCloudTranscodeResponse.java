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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeRtcCloudTranscodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcCloudTranscodeResponse extends AcsResponse {

	private String requestId;

	private TaskInfo taskInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TaskInfo getTaskInfo() {
		return this.taskInfo;
	}

	public void setTaskInfo(TaskInfo taskInfo) {
		this.taskInfo = taskInfo;
	}

	public static class TaskInfo {

		private String appId;

		private String channelId;

		private String taskId;

		private String status;

		private Long maxIdleTime;

		private List<OutputParam> outputParams;

		private InputParam inputParam;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getMaxIdleTime() {
			return this.maxIdleTime;
		}

		public void setMaxIdleTime(Long maxIdleTime) {
			this.maxIdleTime = maxIdleTime;
		}

		public List<OutputParam> getOutputParams() {
			return this.outputParams;
		}

		public void setOutputParams(List<OutputParam> outputParams) {
			this.outputParams = outputParams;
		}

		public InputParam getInputParam() {
			return this.inputParam;
		}

		public void setInputParam(InputParam inputParam) {
			this.inputParam = inputParam;
		}

		public static class OutputParam {

			private String channelId;

			private String userId;

			private String userToken;

			private String transcodeTemplate;

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserToken() {
				return this.userToken;
			}

			public void setUserToken(String userToken) {
				this.userToken = userToken;
			}

			public String getTranscodeTemplate() {
				return this.transcodeTemplate;
			}

			public void setTranscodeTemplate(String transcodeTemplate) {
				this.transcodeTemplate = transcodeTemplate;
			}
		}

		public static class InputParam {

			private SingleSubUserParam singleSubUserParam;

			public SingleSubUserParam getSingleSubUserParam() {
				return this.singleSubUserParam;
			}

			public void setSingleSubUserParam(SingleSubUserParam singleSubUserParam) {
				this.singleSubUserParam = singleSubUserParam;
			}

			public static class SingleSubUserParam {

				private String userId;

				private Long streamType;

				private Long sourceType;

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public Long getStreamType() {
					return this.streamType;
				}

				public void setStreamType(Long streamType) {
					this.streamType = streamType;
				}

				public Long getSourceType() {
					return this.sourceType;
				}

				public void setSourceType(Long sourceType) {
					this.sourceType = sourceType;
				}
			}
		}
	}

	@Override
	public DescribeRtcCloudTranscodeResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcCloudTranscodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
