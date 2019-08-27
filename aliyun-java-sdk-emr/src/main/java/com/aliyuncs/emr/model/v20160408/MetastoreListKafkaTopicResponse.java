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
import com.aliyuncs.emr.transform.v20160408.MetastoreListKafkaTopicResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MetastoreListKafkaTopicResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Topic> topicList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Topic> getTopicList() {
		return this.topicList;
	}

	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}

	public static class Topic {

		private String id;

		private String dataSourceId;

		private String topicName;

		private Integer numPartitions;

		private Integer replicationFactor;

		private Long gmtCreate;

		private Long gmtModified;

		private String status;

		private String reassignId;

		private List<AdvancedConfig> advancedConfigList;

		private Cluster cluster;

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
	}

	@Override
	public MetastoreListKafkaTopicResponse getInstance(UnmarshallerContext context) {
		return	MetastoreListKafkaTopicResponseUnmarshaller.unmarshall(this, context);
	}
}
