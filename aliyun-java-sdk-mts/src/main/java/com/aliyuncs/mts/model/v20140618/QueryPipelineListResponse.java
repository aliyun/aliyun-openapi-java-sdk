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
import com.aliyuncs.mts.transform.v20140618.QueryPipelineListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPipelineListResponse extends AcsResponse {

	private String requestId;

	private List<Pipeline> pipelineList;

	private List<String> nonExistPids;

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

	public List<String> getNonExistPids() {
		return this.nonExistPids;
	}

	public void setNonExistPids(List<String> nonExistPids) {
		this.nonExistPids = nonExistPids;
	}

	public static class Pipeline {

		private String id;

		private String name;

		private String state;

		private String speed;

		private Long speedLevel;

		private Long quotaAllocate;

		private String role;

		private NotifyConfig notifyConfig;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
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

		public String getSpeed() {
			return this.speed;
		}

		public void setSpeed(String speed) {
			this.speed = speed;
		}

		public Long getSpeedLevel() {
			return this.speedLevel;
		}

		public void setSpeedLevel(Long speedLevel) {
			this.speedLevel = speedLevel;
		}

		public Long getQuotaAllocate() {
			return this.quotaAllocate;
		}

		public void setQuotaAllocate(Long quotaAllocate) {
			this.quotaAllocate = quotaAllocate;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public NotifyConfig getNotifyConfig() {
			return this.notifyConfig;
		}

		public void setNotifyConfig(NotifyConfig notifyConfig) {
			this.notifyConfig = notifyConfig;
		}

		public static class NotifyConfig {

			private String topic;

			private String queueName;

			private String mqTopic;

			private String mqTag;

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public String getQueueName() {
				return this.queueName;
			}

			public void setQueueName(String queueName) {
				this.queueName = queueName;
			}

			public String getMqTopic() {
				return this.mqTopic;
			}

			public void setMqTopic(String mqTopic) {
				this.mqTopic = mqTopic;
			}

			public String getMqTag() {
				return this.mqTag;
			}

			public void setMqTag(String mqTag) {
				this.mqTag = mqTag;
			}
		}
	}

	@Override
	public QueryPipelineListResponse getInstance(UnmarshallerContext context) {
		return	QueryPipelineListResponseUnmarshaller.unmarshall(this, context);
	}
}
