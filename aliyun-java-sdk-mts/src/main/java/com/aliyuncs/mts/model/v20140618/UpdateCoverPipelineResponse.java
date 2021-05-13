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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.UpdateCoverPipelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateCoverPipelineResponse extends AcsResponse {

	private String requestId;

	private Pipeline pipeline;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Pipeline getPipeline() {
		return this.pipeline;
	}

	public void setPipeline(Pipeline pipeline) {
		this.pipeline = pipeline;
	}

	public static class Pipeline {

		private String state;

		private Integer priority;

		private String role;

		private String name;

		private String id;

		private NotifyConfig notifyConfig;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public NotifyConfig getNotifyConfig() {
			return this.notifyConfig;
		}

		public void setNotifyConfig(NotifyConfig notifyConfig) {
			this.notifyConfig = notifyConfig;
		}

		public static class NotifyConfig {

			private String topic;

			private String queue;

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public String getQueue() {
				return this.queue;
			}

			public void setQueue(String queue) {
				this.queue = queue;
			}
		}
	}

	@Override
	public UpdateCoverPipelineResponse getInstance(UnmarshallerContext context) {
		return	UpdateCoverPipelineResponseUnmarshaller.unmarshall(this, context);
	}
}
