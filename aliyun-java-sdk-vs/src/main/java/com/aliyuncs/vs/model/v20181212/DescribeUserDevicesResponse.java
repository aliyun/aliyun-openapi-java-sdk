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
import com.aliyuncs.vs.transform.v20181212.DescribeUserDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserDevicesResponse extends AcsResponse {

	private String requestId;

	private List<UserDevice> list;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UserDevice> getList() {
		return this.list;
	}

	public void setList(List<UserDevice> list) {
		this.list = list;
	}

	public static class UserDevice {

		private String status;

		private String specification;

		private String macAddress;

		private String matrixId;

		private String aliUid;

		private String edgeNodeName;

		private String server;

		private String instanceId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSpecification() {
			return this.specification;
		}

		public void setSpecification(String specification) {
			this.specification = specification;
		}

		public String getMacAddress() {
			return this.macAddress;
		}

		public void setMacAddress(String macAddress) {
			this.macAddress = macAddress;
		}

		public String getMatrixId() {
			return this.matrixId;
		}

		public void setMatrixId(String matrixId) {
			this.matrixId = matrixId;
		}

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getEdgeNodeName() {
			return this.edgeNodeName;
		}

		public void setEdgeNodeName(String edgeNodeName) {
			this.edgeNodeName = edgeNodeName;
		}

		public String getServer() {
			return this.server;
		}

		public void setServer(String server) {
			this.server = server;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public DescribeUserDevicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
