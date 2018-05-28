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
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeLogicInstanceTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogicInstanceTopologyResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private List<NodeInfo> redisProxyList;

	private List<NodeInfo> redisShardList;

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

	public List<NodeInfo> getRedisProxyList() {
		return this.redisProxyList;
	}

	public void setRedisProxyList(List<NodeInfo> redisProxyList) {
		this.redisProxyList = redisProxyList;
	}

	public List<NodeInfo> getRedisShardList() {
		return this.redisShardList;
	}

	public void setRedisShardList(List<NodeInfo> redisShardList) {
		this.redisShardList = redisShardList;
	}

	public static class NodeInfo {

		private String nodeId;

		private String connection;

		private String bandwidth;

		private String capacity;

		private String nodeType;

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getConnection() {
			return this.connection;
		}

		public void setConnection(String connection) {
			this.connection = connection;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getCapacity() {
			return this.capacity;
		}

		public void setCapacity(String capacity) {
			this.capacity = capacity;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}
	}

	@Override
	public DescribeLogicInstanceTopologyResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogicInstanceTopologyResponseUnmarshaller.unmarshall(this, context);
	}
}
