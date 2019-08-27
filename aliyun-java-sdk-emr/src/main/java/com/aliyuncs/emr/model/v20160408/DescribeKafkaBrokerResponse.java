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
import com.aliyuncs.emr.transform.v20160408.DescribeKafkaBrokerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeKafkaBrokerResponse extends AcsResponse {

	private String requestId;

	private Integer brokerId;

	private String hostId;

	private String hostName;

	private String hostIp;

	private String status;

	private Integer partitionCount;

	private Integer leaderCount;

	private Integer topicCount;

	private String diskUnbalanceRate;

	private String diskUsageMean;

	private String diskUsageMax;

	private Integer diskCapacity;

	private String traffic;

	private List<Topic> topicList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getBrokerId() {
		return this.brokerId;
	}

	public void setBrokerId(Integer brokerId) {
		this.brokerId = brokerId;
	}

	public String getHostId() {
		return this.hostId;
	}

	public void setHostId(String hostId) {
		this.hostId = hostId;
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getHostIp() {
		return this.hostIp;
	}

	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPartitionCount() {
		return this.partitionCount;
	}

	public void setPartitionCount(Integer partitionCount) {
		this.partitionCount = partitionCount;
	}

	public Integer getLeaderCount() {
		return this.leaderCount;
	}

	public void setLeaderCount(Integer leaderCount) {
		this.leaderCount = leaderCount;
	}

	public Integer getTopicCount() {
		return this.topicCount;
	}

	public void setTopicCount(Integer topicCount) {
		this.topicCount = topicCount;
	}

	public String getDiskUnbalanceRate() {
		return this.diskUnbalanceRate;
	}

	public void setDiskUnbalanceRate(String diskUnbalanceRate) {
		this.diskUnbalanceRate = diskUnbalanceRate;
	}

	public String getDiskUsageMean() {
		return this.diskUsageMean;
	}

	public void setDiskUsageMean(String diskUsageMean) {
		this.diskUsageMean = diskUsageMean;
	}

	public String getDiskUsageMax() {
		return this.diskUsageMax;
	}

	public void setDiskUsageMax(String diskUsageMax) {
		this.diskUsageMax = diskUsageMax;
	}

	public Integer getDiskCapacity() {
		return this.diskCapacity;
	}

	public void setDiskCapacity(Integer diskCapacity) {
		this.diskCapacity = diskCapacity;
	}

	public String getTraffic() {
		return this.traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public List<Topic> getTopicList() {
		return this.topicList;
	}

	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}

	public static class Topic {

		private String topicId;

		private String topicName;

		private Integer numPartitions;

		private Integer replicationFactor;

		private Integer brokerNumPartitions;

		private Integer leaderCount;

		private List<String> partitionList;

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

		public Integer getReplicationFactor() {
			return this.replicationFactor;
		}

		public void setReplicationFactor(Integer replicationFactor) {
			this.replicationFactor = replicationFactor;
		}

		public Integer getBrokerNumPartitions() {
			return this.brokerNumPartitions;
		}

		public void setBrokerNumPartitions(Integer brokerNumPartitions) {
			this.brokerNumPartitions = brokerNumPartitions;
		}

		public Integer getLeaderCount() {
			return this.leaderCount;
		}

		public void setLeaderCount(Integer leaderCount) {
			this.leaderCount = leaderCount;
		}

		public List<String> getPartitionList() {
			return this.partitionList;
		}

		public void setPartitionList(List<String> partitionList) {
			this.partitionList = partitionList;
		}
	}

	@Override
	public DescribeKafkaBrokerResponse getInstance(UnmarshallerContext context) {
		return	DescribeKafkaBrokerResponseUnmarshaller.unmarshall(this, context);
	}
}
