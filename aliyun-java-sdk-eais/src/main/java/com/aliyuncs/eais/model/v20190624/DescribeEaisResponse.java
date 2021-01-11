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

package com.aliyuncs.eais.model.v20190624;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eais.transform.v20190624.DescribeEaisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEaisResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private List<Instance> instances;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String regionId;

		private String zoneId;

		private String creationTime;

		private String instanceName;

		private String description;

		private String status;

		private String elasticAcceleratedInstanceId;

		private String clientInstanceId;

		private String instanceType;

		private String clientInstanceType;

		private String clientInstanceName;

		private List<Tag> tags;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getElasticAcceleratedInstanceId() {
			return this.elasticAcceleratedInstanceId;
		}

		public void setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
			this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
		}

		public String getClientInstanceId() {
			return this.clientInstanceId;
		}

		public void setClientInstanceId(String clientInstanceId) {
			this.clientInstanceId = clientInstanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getClientInstanceType() {
			return this.clientInstanceType;
		}

		public void setClientInstanceType(String clientInstanceType) {
			this.clientInstanceType = clientInstanceType;
		}

		public String getClientInstanceName() {
			return this.clientInstanceName;
		}

		public void setClientInstanceName(String clientInstanceName) {
			this.clientInstanceName = clientInstanceName;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String tagValue;

			private String tagKey;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}
		}
	}

	@Override
	public DescribeEaisResponse getInstance(UnmarshallerContext context) {
		return	DescribeEaisResponseUnmarshaller.unmarshall(this, context);
	}
}
