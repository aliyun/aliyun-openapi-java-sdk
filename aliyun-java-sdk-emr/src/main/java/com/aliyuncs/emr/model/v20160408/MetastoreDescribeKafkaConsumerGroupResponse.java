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
import com.aliyuncs.emr.transform.v20160408.MetastoreDescribeKafkaConsumerGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MetastoreDescribeKafkaConsumerGroupResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String dataSourceId;

	private String consumerGroup;

	private String consumerType;

	private Integer totalLag;

	private Long gmtCreate;

	private Long gmtModified;

	private List<Partition> partitionList;

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

	public String getConsumerGroup() {
		return this.consumerGroup;
	}

	public void setConsumerGroup(String consumerGroup) {
		this.consumerGroup = consumerGroup;
	}

	public String getConsumerType() {
		return this.consumerType;
	}

	public void setConsumerType(String consumerType) {
		this.consumerType = consumerType;
	}

	public Integer getTotalLag() {
		return this.totalLag;
	}

	public void setTotalLag(Integer totalLag) {
		this.totalLag = totalLag;
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

	public List<Partition> getPartitionList() {
		return this.partitionList;
	}

	public void setPartitionList(List<Partition> partitionList) {
		this.partitionList = partitionList;
	}

	public static class Partition {

		private String dataSourceId;

		private String topicId;

		private String consumerGroupId;

		private Integer partitionId;

		private Long consumeOffset;

		private Long logEndOffset;

		private Long lag;

		private String consumerInstanceOwner;

		private Long gmtCreate;

		private Long gmtModified;

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

		public String getConsumerGroupId() {
			return this.consumerGroupId;
		}

		public void setConsumerGroupId(String consumerGroupId) {
			this.consumerGroupId = consumerGroupId;
		}

		public Integer getPartitionId() {
			return this.partitionId;
		}

		public void setPartitionId(Integer partitionId) {
			this.partitionId = partitionId;
		}

		public Long getConsumeOffset() {
			return this.consumeOffset;
		}

		public void setConsumeOffset(Long consumeOffset) {
			this.consumeOffset = consumeOffset;
		}

		public Long getLogEndOffset() {
			return this.logEndOffset;
		}

		public void setLogEndOffset(Long logEndOffset) {
			this.logEndOffset = logEndOffset;
		}

		public Long getLag() {
			return this.lag;
		}

		public void setLag(Long lag) {
			this.lag = lag;
		}

		public String getConsumerInstanceOwner() {
			return this.consumerInstanceOwner;
		}

		public void setConsumerInstanceOwner(String consumerInstanceOwner) {
			this.consumerInstanceOwner = consumerInstanceOwner;
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
	}

	@Override
	public MetastoreDescribeKafkaConsumerGroupResponse getInstance(UnmarshallerContext context) {
		return	MetastoreDescribeKafkaConsumerGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
