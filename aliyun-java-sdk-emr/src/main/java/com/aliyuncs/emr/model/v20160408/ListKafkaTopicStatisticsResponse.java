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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListKafkaTopicStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListKafkaTopicStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Topic> topicList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Topic> getTopicList() {
		return this.topicList;
	}

	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}

	public static class Topic {

		private String dataSourceId;

		private String topicId;

		private String topicName;

		private Integer numPartitions;

		private Long offsetSum;

		private String offsetRate;

		private String underReplicatedPercentage;

		private String messageRate;

		private String bytesInPerSecondRate;

		private String bytesOutPerSecondRate;

		private Cluster cluster;

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getTopicId() {
			return this.topicId;
		}

		public void setTopicId(String topicId) {
			this.topicId = topicId;
		}

		public String getTopicName() {
			return this.topicName;
		}

		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}

		public Integer getNumPartitions() {
			return this.numPartitions;
		}

		public void setNumPartitions(Integer numPartitions) {
			this.numPartitions = numPartitions;
		}

		public Long getOffsetSum() {
			return this.offsetSum;
		}

		public void setOffsetSum(Long offsetSum) {
			this.offsetSum = offsetSum;
		}

		public String getOffsetRate() {
			return this.offsetRate;
		}

		public void setOffsetRate(String offsetRate) {
			this.offsetRate = offsetRate;
		}

		public String getUnderReplicatedPercentage() {
			return this.underReplicatedPercentage;
		}

		public void setUnderReplicatedPercentage(String underReplicatedPercentage) {
			this.underReplicatedPercentage = underReplicatedPercentage;
		}

		public String getMessageRate() {
			return this.messageRate;
		}

		public void setMessageRate(String messageRate) {
			this.messageRate = messageRate;
		}

		public String getBytesInPerSecondRate() {
			return this.bytesInPerSecondRate;
		}

		public void setBytesInPerSecondRate(String bytesInPerSecondRate) {
			this.bytesInPerSecondRate = bytesInPerSecondRate;
		}

		public String getBytesOutPerSecondRate() {
			return this.bytesOutPerSecondRate;
		}

		public void setBytesOutPerSecondRate(String bytesOutPerSecondRate) {
			this.bytesOutPerSecondRate = bytesOutPerSecondRate;
		}

		public Cluster getCluster() {
			return this.cluster;
		}

		public void setCluster(Cluster cluster) {
			this.cluster = cluster;
		}

		public static class Cluster {

			private String clusterId;

			private String clusterName;

			private String clusterStatus;

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public String getClusterStatus() {
				return this.clusterStatus;
			}

			public void setClusterStatus(String clusterStatus) {
				this.clusterStatus = clusterStatus;
			}
		}
	}

	@Override
	public ListKafkaTopicStatisticsResponse getInstance(UnmarshallerContext context) {
		return	ListKafkaTopicStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
