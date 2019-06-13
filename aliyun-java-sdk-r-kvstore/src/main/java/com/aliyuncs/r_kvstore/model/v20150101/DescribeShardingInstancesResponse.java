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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeShardingInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeShardingInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<Instance> instances;

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

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String instanceId;

		private List<Shard> shardList;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<Shard> getShardList() {
			return this.shardList;
		}

		public void setShardList(List<Shard> shardList) {
			this.shardList = shardList;
		}

		public static class Shard {

			private String nodeId;

			private String shardReplicaClass;

			private String shardStorageQuantity;

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getShardReplicaClass() {
				return this.shardReplicaClass;
			}

			public void setShardReplicaClass(String shardReplicaClass) {
				this.shardReplicaClass = shardReplicaClass;
			}

			public String getShardStorageQuantity() {
				return this.shardStorageQuantity;
			}

			public void setShardStorageQuantity(String shardStorageQuantity) {
				this.shardStorageQuantity = shardStorageQuantity;
			}
		}
	}

	@Override
	public DescribeShardingInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeShardingInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
