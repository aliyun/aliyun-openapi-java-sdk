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
import com.aliyuncs.r_kvstore.transform.v20150101.CreateShardingInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateShardingInstanceResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String orderId;

	private List<Shard> shardList;

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

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<Shard> getShardList() {
		return this.shardList;
	}

	public void setShardList(List<Shard> shardList) {
		this.shardList = shardList;
	}

	public static class Shard {

		private String shardId;

		private String replicaClass;

		private String storageQuantity;

		private String replicaQuantity;

		public String getShardId() {
			return this.shardId;
		}

		public void setShardId(String shardId) {
			this.shardId = shardId;
		}

		public String getReplicaClass() {
			return this.replicaClass;
		}

		public void setReplicaClass(String replicaClass) {
			this.replicaClass = replicaClass;
		}

		public String getStorageQuantity() {
			return this.storageQuantity;
		}

		public void setStorageQuantity(String storageQuantity) {
			this.storageQuantity = storageQuantity;
		}

		public String getReplicaQuantity() {
			return this.replicaQuantity;
		}

		public void setReplicaQuantity(String replicaQuantity) {
			this.replicaQuantity = replicaQuantity;
		}
	}

	@Override
	public CreateShardingInstanceResponse getInstance(UnmarshallerContext context) {
		return	CreateShardingInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
