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
import com.aliyuncs.mts.transform.v20140618.QueryPornPipelineListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPornPipelineListResponse extends AcsResponse {

	private String requestId;

	private List<Pipeline> pipelineList;

	private List<String> nonExistIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Pipeline> getPipelineList() {
		return this.pipelineList;
	}

	public void setPipelineList(List<Pipeline> pipelineList) {
		this.pipelineList = pipelineList;
	}

	public List<String> getNonExistIds() {
		return this.nonExistIds;
	}

	public void setNonExistIds(List<String> nonExistIds) {
		this.nonExistIds = nonExistIds;
	}

	public static class Pipeline {

		private String state;

		private String priority;

		private String name;

		private String id;

		private NotifyConfig notifyConfig;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
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
	public QueryPornPipelineListResponse getInstance(UnmarshallerContext context) {
		return	QueryPornPipelineListResponseUnmarshaller.unmarshall(this, context);
	}
}
