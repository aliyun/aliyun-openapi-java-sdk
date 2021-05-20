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
import com.aliyuncs.ecs.transform.v20140526.DescribeDiskReplicaPairsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiskReplicaPairsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<DiskReplicaPair> diskReplicaPairs;

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

	public List<DiskReplicaPair> getDiskReplicaPairs() {
		return this.diskReplicaPairs;
	}

	public void setDiskReplicaPairs(List<DiskReplicaPair> diskReplicaPairs) {
		this.diskReplicaPairs = diskReplicaPairs;
	}

	public static class DiskReplicaPair {

		private String replicaPairId;

		private String sourceRegion;

		private String sourceDiskId;

		private String destinationRegion;

		private String destinationDiskId;

		private String pairName;

		private String description;

		private String status;

		public String getReplicaPairId() {
			return this.replicaPairId;
		}

		public void setReplicaPairId(String replicaPairId) {
			this.replicaPairId = replicaPairId;
		}

		public String getSourceRegion() {
			return this.sourceRegion;
		}

		public void setSourceRegion(String sourceRegion) {
			this.sourceRegion = sourceRegion;
		}

		public String getSourceDiskId() {
			return this.sourceDiskId;
		}

		public void setSourceDiskId(String sourceDiskId) {
			this.sourceDiskId = sourceDiskId;
		}

		public String getDestinationRegion() {
			return this.destinationRegion;
		}

		public void setDestinationRegion(String destinationRegion) {
			this.destinationRegion = destinationRegion;
		}

		public String getDestinationDiskId() {
			return this.destinationDiskId;
		}

		public void setDestinationDiskId(String destinationDiskId) {
			this.destinationDiskId = destinationDiskId;
		}

		public String getPairName() {
			return this.pairName;
		}

		public void setPairName(String pairName) {
			this.pairName = pairName;
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
	}

	@Override
	public DescribeDiskReplicaPairsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiskReplicaPairsResponseUnmarshaller.unmarshall(this, context);
	}
}
