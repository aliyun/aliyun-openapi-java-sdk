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

package com.aliyuncs.petadata.model.v20160101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.petadata.transform.v20160101.DescribeDatabasePartitionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabasePartitionsResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String dBName;

	private List<Partition> partitions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getDBName() {
		return this.dBName;
	}

	public void setDBName(String dBName) {
		this.dBName = dBName;
	}

	public List<Partition> getPartitions() {
		return this.partitions;
	}

	public void setPartitions(List<Partition> partitions) {
		this.partitions = partitions;
	}

	public static class Partition {

		private String partitionId;

		private Integer diskCapacity;

		private String diskUsed;

		public String getPartitionId() {
			return this.partitionId;
		}

		public void setPartitionId(String partitionId) {
			this.partitionId = partitionId;
		}

		public Integer getDiskCapacity() {
			return this.diskCapacity;
		}

		public void setDiskCapacity(Integer diskCapacity) {
			this.diskCapacity = diskCapacity;
		}

		public String getDiskUsed() {
			return this.diskUsed;
		}

		public void setDiskUsed(String diskUsed) {
			this.diskUsed = diskUsed;
		}
	}

	@Override
	public DescribeDatabasePartitionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabasePartitionsResponseUnmarshaller.unmarshall(this, context);
	}
}
