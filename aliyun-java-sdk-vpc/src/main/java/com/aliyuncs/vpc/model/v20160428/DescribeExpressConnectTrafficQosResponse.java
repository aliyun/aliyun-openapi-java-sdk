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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeExpressConnectTrafficQosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpressConnectTrafficQosResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private Integer totalCount;

	private String count;

	private List<QosListItem> qosList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getCount() {
		return this.count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public List<QosListItem> getQosList() {
		return this.qosList;
	}

	public void setQosList(List<QosListItem> qosList) {
		this.qosList = qosList;
	}

	public static class QosListItem {

		private String qosId;

		private String qosName;

		private String qosDescription;

		private String status;

		private Integer progressing;

		private List<AssociatedInstanceListItem> associatedInstanceList;

		private List<QueueListItem> queueList;

		public String getQosId() {
			return this.qosId;
		}

		public void setQosId(String qosId) {
			this.qosId = qosId;
		}

		public String getQosName() {
			return this.qosName;
		}

		public void setQosName(String qosName) {
			this.qosName = qosName;
		}

		public String getQosDescription() {
			return this.qosDescription;
		}

		public void setQosDescription(String qosDescription) {
			this.qosDescription = qosDescription;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getProgressing() {
			return this.progressing;
		}

		public void setProgressing(Integer progressing) {
			this.progressing = progressing;
		}

		public List<AssociatedInstanceListItem> getAssociatedInstanceList() {
			return this.associatedInstanceList;
		}

		public void setAssociatedInstanceList(List<AssociatedInstanceListItem> associatedInstanceList) {
			this.associatedInstanceList = associatedInstanceList;
		}

		public List<QueueListItem> getQueueList() {
			return this.queueList;
		}

		public void setQueueList(List<QueueListItem> queueList) {
			this.queueList = queueList;
		}

		public static class AssociatedInstanceListItem {

			private String instanceId;

			private String instanceType;

			private String instanceStatus;

			private Integer instanceProgressing;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getInstanceStatus() {
				return this.instanceStatus;
			}

			public void setInstanceStatus(String instanceStatus) {
				this.instanceStatus = instanceStatus;
			}

			public Integer getInstanceProgressing() {
				return this.instanceProgressing;
			}

			public void setInstanceProgressing(Integer instanceProgressing) {
				this.instanceProgressing = instanceProgressing;
			}
		}

		public static class QueueListItem {

			private String qosId;

			private String queueId;

			private String queueType;

			private String bandwidthPercent;

			private String queueName;

			private String queueDescription;

			private String status;

			public String getQosId() {
				return this.qosId;
			}

			public void setQosId(String qosId) {
				this.qosId = qosId;
			}

			public String getQueueId() {
				return this.queueId;
			}

			public void setQueueId(String queueId) {
				this.queueId = queueId;
			}

			public String getQueueType() {
				return this.queueType;
			}

			public void setQueueType(String queueType) {
				this.queueType = queueType;
			}

			public String getBandwidthPercent() {
				return this.bandwidthPercent;
			}

			public void setBandwidthPercent(String bandwidthPercent) {
				this.bandwidthPercent = bandwidthPercent;
			}

			public String getQueueName() {
				return this.queueName;
			}

			public void setQueueName(String queueName) {
				this.queueName = queueName;
			}

			public String getQueueDescription() {
				return this.queueDescription;
			}

			public void setQueueDescription(String queueDescription) {
				this.queueDescription = queueDescription;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribeExpressConnectTrafficQosResponse getInstance(UnmarshallerContext context) {
		return	DescribeExpressConnectTrafficQosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
