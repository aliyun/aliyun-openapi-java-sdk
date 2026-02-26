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
import com.aliyuncs.live.transform.v20161101.SetLiveStreamPreloadTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetLiveStreamPreloadTasksResponse extends AcsResponse {

	private Integer failedURL;

	private String requestId;

	private String status;

	private Integer successURL;

	private Integer totalURL;

	private List<PreloadTasksMessage> preloadTasksMessages;

	public Integer getFailedURL() {
		return this.failedURL;
	}

	public void setFailedURL(Integer failedURL) {
		this.failedURL = failedURL;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getSuccessURL() {
		return this.successURL;
	}

	public void setSuccessURL(Integer successURL) {
		this.successURL = successURL;
	}

	public Integer getTotalURL() {
		return this.totalURL;
	}

	public void setTotalURL(Integer totalURL) {
		this.totalURL = totalURL;
	}

	public List<PreloadTasksMessage> getPreloadTasksMessages() {
		return this.preloadTasksMessages;
	}

	public void setPreloadTasksMessages(List<PreloadTasksMessage> preloadTasksMessages) {
		this.preloadTasksMessages = preloadTasksMessages;
	}

	public static class PreloadTasksMessage {

		private String description;

		private String playUrl;

		private String taskId;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPlayUrl() {
			return this.playUrl;
		}

		public void setPlayUrl(String playUrl) {
			this.playUrl = playUrl;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public SetLiveStreamPreloadTasksResponse getInstance(UnmarshallerContext context) {
		return	SetLiveStreamPreloadTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
