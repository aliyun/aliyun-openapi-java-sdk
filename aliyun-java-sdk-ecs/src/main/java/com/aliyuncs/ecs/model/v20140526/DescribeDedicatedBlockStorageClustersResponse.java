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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeDedicatedBlockStorageClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedBlockStorageClustersResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<DedicatedBlockStorageCluster> dedicatedBlockStorageClusters;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DedicatedBlockStorageCluster> getDedicatedBlockStorageClusters() {
		return this.dedicatedBlockStorageClusters;
	}

	public void setDedicatedBlockStorageClusters(List<DedicatedBlockStorageCluster> dedicatedBlockStorageClusters) {
		this.dedicatedBlockStorageClusters = dedicatedBlockStorageClusters;
	}

	public static class DedicatedBlockStorageCluster {

		private String status;

		private String type;

		private String description;

		private String expiredTime;

		private String createTime;

		private String zoneId;

		private String category;

		private String dedicatedBlockStorageClusterName;

		private String dedicatedBlockStorageClusterId;

		private DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getDedicatedBlockStorageClusterName() {
			return this.dedicatedBlockStorageClusterName;
		}

		public void setDedicatedBlockStorageClusterName(String dedicatedBlockStorageClusterName) {
			this.dedicatedBlockStorageClusterName = dedicatedBlockStorageClusterName;
		}

		public String getDedicatedBlockStorageClusterId() {
			return this.dedicatedBlockStorageClusterId;
		}

		public void setDedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
			this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
		}

		public DedicatedBlockStorageClusterCapacity getDedicatedBlockStorageClusterCapacity() {
			return this.dedicatedBlockStorageClusterCapacity;
		}

		public void setDedicatedBlockStorageClusterCapacity(DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity) {
			this.dedicatedBlockStorageClusterCapacity = dedicatedBlockStorageClusterCapacity;
		}

		public static class DedicatedBlockStorageClusterCapacity {

			private Long totalCapacity;

			private Long availableCapacity;

			public Long getTotalCapacity() {
				return this.totalCapacity;
			}

			public void setTotalCapacity(Long totalCapacity) {
				this.totalCapacity = totalCapacity;
			}

			public Long getAvailableCapacity() {
				return this.availableCapacity;
			}

			public void setAvailableCapacity(Long availableCapacity) {
				this.availableCapacity = availableCapacity;
			}
		}
	}

	@Override
	public DescribeDedicatedBlockStorageClustersResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedBlockStorageClustersResponseUnmarshaller.unmarshall(this, context);
	}
}
