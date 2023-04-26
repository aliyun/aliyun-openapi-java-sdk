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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeDiskReplicaPairsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiskReplicaPairsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<DiskReplicaPair> diskReplicaPairs;

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

	public List<DiskReplicaPair> getDiskReplicaPairs() {
		return this.diskReplicaPairs;
	}

	public void setDiskReplicaPairs(List<DiskReplicaPair> diskReplicaPairs) {
		this.diskReplicaPairs = diskReplicaPairs;
	}

	public static class DiskReplicaPair {

		private String status;

		private String replicaPairId;

		private Integer asyncCycle;

		private Long totalCopiedSize;

		private String healthStatus;

		private String destinationDiskId;

		private String sourceDiskId;

		private Integer bandwidth;

		private String description;

		private String destinationRegion;

		private String pairName;

		private String sourceRegion;

		private String rpoTime;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getReplicaPairId() {
			return this.replicaPairId;
		}

		public void setReplicaPairId(String replicaPairId) {
			this.replicaPairId = replicaPairId;
		}

		public Integer getAsyncCycle() {
			return this.asyncCycle;
		}

		public void setAsyncCycle(Integer asyncCycle) {
			this.asyncCycle = asyncCycle;
		}

		public Long getTotalCopiedSize() {
			return this.totalCopiedSize;
		}

		public void setTotalCopiedSize(Long totalCopiedSize) {
			this.totalCopiedSize = totalCopiedSize;
		}

		public String getHealthStatus() {
			return this.healthStatus;
		}

		public void setHealthStatus(String healthStatus) {
			this.healthStatus = healthStatus;
		}

		public String getDestinationDiskId() {
			return this.destinationDiskId;
		}

		public void setDestinationDiskId(String destinationDiskId) {
			this.destinationDiskId = destinationDiskId;
		}

		public String getSourceDiskId() {
			return this.sourceDiskId;
		}

		public void setSourceDiskId(String sourceDiskId) {
			this.sourceDiskId = sourceDiskId;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDestinationRegion() {
			return this.destinationRegion;
		}

		public void setDestinationRegion(String destinationRegion) {
			this.destinationRegion = destinationRegion;
		}

		public String getPairName() {
			return this.pairName;
		}

		public void setPairName(String pairName) {
			this.pairName = pairName;
		}

		public String getSourceRegion() {
			return this.sourceRegion;
		}

		public void setSourceRegion(String sourceRegion) {
			this.sourceRegion = sourceRegion;
		}

		public String getRpoTime() {
			return this.rpoTime;
		}

		public void setRpoTime(String rpoTime) {
			this.rpoTime = rpoTime;
		}
	}

	@Override
	public DescribeDiskReplicaPairsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiskReplicaPairsResponseUnmarshaller.unmarshall(this, context);
	}
}
