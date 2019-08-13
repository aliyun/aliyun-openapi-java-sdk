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
import com.aliyuncs.emr.transform.v20160408.MetastoreListKafkaConsumerGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MetastoreListKafkaConsumerGroupResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ConsumerGroup> consumerGroupList;

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

	public List<ConsumerGroup> getConsumerGroupList() {
		return this.consumerGroupList;
	}

	public void setConsumerGroupList(List<ConsumerGroup> consumerGroupList) {
		this.consumerGroupList = consumerGroupList;
	}

	public static class ConsumerGroup {

		private String id;

		private String dataSourceId;

		private String consumerGroup;

		private String consumerType;

		private Long totalLag;

		private Long gmtCreate;

		private Long gmtModified;

		private String partitionProportion;

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

		public Long getTotalLag() {
			return this.totalLag;
		}

		public void setTotalLag(Long totalLag) {
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

		public String getPartitionProportion() {
			return this.partitionProportion;
		}

		public void setPartitionProportion(String partitionProportion) {
			this.partitionProportion = partitionProportion;
		}
	}

	@Override
	public MetastoreListKafkaConsumerGroupResponse getInstance(UnmarshallerContext context) {
		return	MetastoreListKafkaConsumerGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
