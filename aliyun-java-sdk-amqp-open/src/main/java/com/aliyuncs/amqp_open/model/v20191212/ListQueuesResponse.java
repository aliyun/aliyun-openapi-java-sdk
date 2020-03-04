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

package com.aliyuncs.amqp_open.model.v20191212;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.amqp_open.transform.v20191212.ListQueuesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQueuesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private Integer maxResults;

		private List<QueueVO> queues;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public List<QueueVO> getQueues() {
			return this.queues;
		}

		public void setQueues(List<QueueVO> queues) {
			this.queues = queues;
		}

		public static class QueueVO {

			private String name;

			private String ownerId;

			private String vHostName;

			private Boolean autoDeleteState;

			private Boolean exclusiveState;

			private Long createTime;

			private Long lastConsumeTime;

			private Map<Object,Object> attributes;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getVHostName() {
				return this.vHostName;
			}

			public void setVHostName(String vHostName) {
				this.vHostName = vHostName;
			}

			public Boolean getAutoDeleteState() {
				return this.autoDeleteState;
			}

			public void setAutoDeleteState(Boolean autoDeleteState) {
				this.autoDeleteState = autoDeleteState;
			}

			public Boolean getExclusiveState() {
				return this.exclusiveState;
			}

			public void setExclusiveState(Boolean exclusiveState) {
				this.exclusiveState = exclusiveState;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getLastConsumeTime() {
				return this.lastConsumeTime;
			}

			public void setLastConsumeTime(Long lastConsumeTime) {
				this.lastConsumeTime = lastConsumeTime;
			}

			public Map<Object,Object> getAttributes() {
				return this.attributes;
			}

			public void setAttributes(Map<Object,Object> attributes) {
				this.attributes = attributes;
			}
		}
	}

	@Override
	public ListQueuesResponse getInstance(UnmarshallerContext context) {
		return	ListQueuesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
