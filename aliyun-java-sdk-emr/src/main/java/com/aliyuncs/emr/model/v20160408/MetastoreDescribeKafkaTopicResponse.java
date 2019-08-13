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
import com.aliyuncs.emr.transform.v20160408.MetastoreDescribeKafkaTopicResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MetastoreDescribeKafkaTopicResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String dataSourceId;

	private String topicName;

	private Integer numPartitions;

	private Integer replicationFactor;

	private Long gmtCreate;

	private Long gmtModified;

	private Integer brokerTotal;

	private Integer numUsingBrokers;

	private String brokersLeaderSkewPercentage;

	private String underReplicatedPercentage;

	private String preferredReplicasPercentage;

	private String status;

	private String reassignId;

	private List<AdvancedConfig> advancedConfigList;

	private List<Summary> summaryList;

	private List<Distribution> distributionList;

	private Cluster cluster;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
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

	public Long getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(Long gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Integer getBrokerTotal() {
		return this.brokerTotal;
	}

	public void setBrokerTotal(Integer brokerTotal) {
		this.brokerTotal = brokerTotal;
	}

	public Integer getNumUsingBrokers() {
		return this.numUsingBrokers;
	}

	public void setNumUsingBrokers(Integer numUsingBrokers) {
		this.numUsingBrokers = numUsingBrokers;
	}

	public String getBrokersLeaderSkewPercentage() {
		return this.brokersLeaderSkewPercentage;
	}

	public void setBrokersLeaderSkewPercentage(String brokersLeaderSkewPercentage) {
		this.brokersLeaderSkewPercentage = brokersLeaderSkewPercentage;
	}

	public String getUnderReplicatedPercentage() {
		return this.underReplicatedPercentage;
	}

	public void setUnderReplicatedPercentage(String underReplicatedPercentage) {
		this.underReplicatedPercentage = underReplicatedPercentage;
	}

	public String getPreferredReplicasPercentage() {
		return this.preferredReplicasPercentage;
	}

	public void setPreferredReplicasPercentage(String preferredReplicasPercentage) {
		this.preferredReplicasPercentage = preferredReplicasPercentage;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReassignId() {
		return this.reassignId;
	}

	public void setReassignId(String reassignId) {
		this.reassignId = reassignId;
	}

	public List<AdvancedConfig> getAdvancedConfigList() {
		return this.advancedConfigList;
	}

	public void setAdvancedConfigList(List<AdvancedConfig> advancedConfigList) {
		this.advancedConfigList = advancedConfigList;
	}

	public List<Summary> getSummaryList() {
		return this.summaryList;
	}

	public void setSummaryList(List<Summary> summaryList) {
		this.summaryList = summaryList;
	}

	public List<Distribution> getDistributionList() {
		return this.distributionList;
	}

	public void setDistributionList(List<Distribution> distributionList) {
		this.distributionList = distributionList;
	}

	public Cluster getCluster() {
		return this.cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}

	public static class AdvancedConfig {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Summary {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Distribution {

		private Integer partition;

		private Long offset;

		private Integer leader;

		private Boolean preferredLeader;

		private Boolean underReplicated;

		private Long logEndOffset;

		private List<String> isrList;

		private List<String> replicaList;

		public Integer getPartition() {
			return this.partition;
		}

		public void setPartition(Integer partition) {
			this.partition = partition;
		}

		public Long getOffset() {
			return this.offset;
		}

		public void setOffset(Long offset) {
			this.offset = offset;
		}

		public Integer getLeader() {
			return this.leader;
		}

		public void setLeader(Integer leader) {
			this.leader = leader;
		}

		public Boolean getPreferredLeader() {
			return this.preferredLeader;
		}

		public void setPreferredLeader(Boolean preferredLeader) {
			this.preferredLeader = preferredLeader;
		}

		public Boolean getUnderReplicated() {
			return this.underReplicated;
		}

		public void setUnderReplicated(Boolean underReplicated) {
			this.underReplicated = underReplicated;
		}

		public Long getLogEndOffset() {
			return this.logEndOffset;
		}

		public void setLogEndOffset(Long logEndOffset) {
			this.logEndOffset = logEndOffset;
		}

		public List<String> getIsrList() {
			return this.isrList;
		}

		public void setIsrList(List<String> isrList) {
			this.isrList = isrList;
		}

		public List<String> getReplicaList() {
			return this.replicaList;
		}

		public void setReplicaList(List<String> replicaList) {
			this.replicaList = replicaList;
		}
	}

	public static class Cluster {

		private String clusterBizId;

		private String clusterName;

		private String clusterStatus;

		public String getClusterBizId() {
			return this.clusterBizId;
		}

		public void setClusterBizId(String clusterBizId) {
			this.clusterBizId = clusterBizId;
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

	@Override
	public MetastoreDescribeKafkaTopicResponse getInstance(UnmarshallerContext context) {
		return	MetastoreDescribeKafkaTopicResponseUnmarshaller.unmarshall(this, context);
	}
}
