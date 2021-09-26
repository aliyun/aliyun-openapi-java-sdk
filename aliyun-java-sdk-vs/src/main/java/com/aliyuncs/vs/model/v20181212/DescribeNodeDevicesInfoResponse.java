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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeNodeDevicesInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNodeDevicesInfoResponse extends AcsResponse {

	private String requestId;

	private List<NodeDevice> nodeDevices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NodeDevice> getNodeDevices() {
		return this.nodeDevices;
	}

	public void setNodeDevices(List<NodeDevice> nodeDevices) {
		this.nodeDevices = nodeDevices;
	}

	public static class NodeDevice {

		private String nodeName;

		private List<DeviceInfo> deviceInfos;

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public List<DeviceInfo> getDeviceInfos() {
			return this.deviceInfos;
		}

		public void setDeviceInfos(List<DeviceInfo> deviceInfos) {
			this.deviceInfos = deviceInfos;
		}

		public static class DeviceInfo {

			private String instanceId;

			private String name;

			private String iP;

			private String server;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getIP() {
				return this.iP;
			}

			public void setIP(String iP) {
				this.iP = iP;
			}

			public String getServer() {
				return this.server;
			}

			public void setServer(String server) {
				this.server = server;
			}
		}
	}

	@Override
	public DescribeNodeDevicesInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeNodeDevicesInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
