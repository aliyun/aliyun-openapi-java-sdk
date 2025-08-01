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
import com.aliyuncs.eds_aic.transform.v20230930.CreateCloudPhoneNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateCloudPhoneNodeResponse extends AcsResponse {

	private String requestId;

	private String orderId;

	private List<NodeInfosItem> nodeInfos;

	private NetworkPackageOrderModel networkPackageOrderModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<NodeInfosItem> getNodeInfos() {
		return this.nodeInfos;
	}

	public void setNodeInfos(List<NodeInfosItem> nodeInfos) {
		this.nodeInfos = nodeInfos;
	}

	public NetworkPackageOrderModel getNetworkPackageOrderModel() {
		return this.networkPackageOrderModel;
	}

	public void setNetworkPackageOrderModel(NetworkPackageOrderModel networkPackageOrderModel) {
		this.networkPackageOrderModel = networkPackageOrderModel;
	}

	public static class NodeInfosItem {

		private String nodeId;

		private List<String> instanceIds;

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public List<String> getInstanceIds() {
			return this.instanceIds;
		}

		public void setInstanceIds(List<String> instanceIds) {
			this.instanceIds = instanceIds;
		}
	}

	public static class NetworkPackageOrderModel {

		private String bandwidthPackageOrderId;

		private String bandwidthPackageId;

		public String getBandwidthPackageOrderId() {
			return this.bandwidthPackageOrderId;
		}

		public void setBandwidthPackageOrderId(String bandwidthPackageOrderId) {
			this.bandwidthPackageOrderId = bandwidthPackageOrderId;
		}

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
		}
	}

	@Override
	public CreateCloudPhoneNodeResponse getInstance(UnmarshallerContext context) {
		return	CreateCloudPhoneNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
