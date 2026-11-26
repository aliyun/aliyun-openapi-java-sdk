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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListAINodePoolsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAINodePoolsResponse extends AcsResponse {

	private String requestId;

	private List<AINodePoolInfosItem> aINodePoolInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AINodePoolInfosItem> getAINodePoolInfos() {
		return this.aINodePoolInfos;
	}

	public void setAINodePoolInfos(List<AINodePoolInfosItem> aINodePoolInfos) {
		this.aINodePoolInfos = aINodePoolInfos;
	}

	public static class AINodePoolInfosItem {

		private String nodeNum;

		private String aINodePoolId;

		private List<AINodeInfosItem> aINodeInfos;

		public String getNodeNum() {
			return this.nodeNum;
		}

		public void setNodeNum(String nodeNum) {
			this.nodeNum = nodeNum;
		}

		public String getAINodePoolId() {
			return this.aINodePoolId;
		}

		public void setAINodePoolId(String aINodePoolId) {
			this.aINodePoolId = aINodePoolId;
		}

		public List<AINodeInfosItem> getAINodeInfos() {
			return this.aINodeInfos;
		}

		public void setAINodeInfos(List<AINodeInfosItem> aINodeInfos) {
			this.aINodeInfos = aINodeInfos;
		}

		public static class AINodeInfosItem {

			private String zoneId;

			private String nodeName;

			private String nodeSpec;

			private String createTime;

			private String updateTime;

			private String bindObject;

			private String bindStatus;

			private String namespace;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getNodeSpec() {
				return this.nodeSpec;
			}

			public void setNodeSpec(String nodeSpec) {
				this.nodeSpec = nodeSpec;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getBindObject() {
				return this.bindObject;
			}

			public void setBindObject(String bindObject) {
				this.bindObject = bindObject;
			}

			public String getBindStatus() {
				return this.bindStatus;
			}

			public void setBindStatus(String bindStatus) {
				this.bindStatus = bindStatus;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}
		}
	}

	@Override
	public ListAINodePoolsResponse getInstance(UnmarshallerContext context) {
		return	ListAINodePoolsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
