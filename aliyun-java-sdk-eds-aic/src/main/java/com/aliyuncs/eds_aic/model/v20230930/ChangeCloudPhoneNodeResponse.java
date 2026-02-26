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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.ChangeCloudPhoneNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ChangeCloudPhoneNodeResponse extends AcsResponse {

	private String requestId;

	private List<NodeInfosItem> nodeInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NodeInfosItem> getNodeInfos() {
		return this.nodeInfos;
	}

	public void setNodeInfos(List<NodeInfosItem> nodeInfos) {
		this.nodeInfos = nodeInfos;
	}

	public static class NodeInfosItem {

		private String nodeId;

		private List<InstanceIds> instanceInfos;

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public List<InstanceIds> getInstanceInfos() {
			return this.instanceInfos;
		}

		public void setInstanceInfos(List<InstanceIds> instanceInfos) {
			this.instanceInfos = instanceInfos;
		}

		public static class InstanceIds {

			private String instanceId;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}
		}
	}

	@Override
	public ChangeCloudPhoneNodeResponse getInstance(UnmarshallerContext context) {
		return	ChangeCloudPhoneNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
