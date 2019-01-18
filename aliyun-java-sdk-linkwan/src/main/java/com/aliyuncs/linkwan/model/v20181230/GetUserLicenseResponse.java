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

package com.aliyuncs.linkwan.model.v20181230;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.GetUserLicenseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserLicenseResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String oui;

		private Long gatewayTupleLimit;

		private Long gatewayTupleCount;

		private Long nodeTupleLimit;

		private Long nodeTupleCount;

		private Long gatewayLimit;

		private Long gatewayCount;

		private Long localJoinPermissionLimit;

		private Long localJoinPermissionCount;

		private Long nodeLimit;

		private Long nodeCount;

		private Long roamingJoinPermissionLimit;

		private Long roamingJoinPermissionCount;

		private Long gatewayTupleFreeLimit;

		private Long nodeTupleFreeLimit;

		private Long gatewayFreeLimit;

		private Long localJoinPermissionFreeLimit;

		private Long roamingJoinPermissionFreeLimit;

		private Long nodeFreeLimit;

		public String getOui() {
			return this.oui;
		}

		public void setOui(String oui) {
			this.oui = oui;
		}

		public Long getGatewayTupleLimit() {
			return this.gatewayTupleLimit;
		}

		public void setGatewayTupleLimit(Long gatewayTupleLimit) {
			this.gatewayTupleLimit = gatewayTupleLimit;
		}

		public Long getGatewayTupleCount() {
			return this.gatewayTupleCount;
		}

		public void setGatewayTupleCount(Long gatewayTupleCount) {
			this.gatewayTupleCount = gatewayTupleCount;
		}

		public Long getNodeTupleLimit() {
			return this.nodeTupleLimit;
		}

		public void setNodeTupleLimit(Long nodeTupleLimit) {
			this.nodeTupleLimit = nodeTupleLimit;
		}

		public Long getNodeTupleCount() {
			return this.nodeTupleCount;
		}

		public void setNodeTupleCount(Long nodeTupleCount) {
			this.nodeTupleCount = nodeTupleCount;
		}

		public Long getGatewayLimit() {
			return this.gatewayLimit;
		}

		public void setGatewayLimit(Long gatewayLimit) {
			this.gatewayLimit = gatewayLimit;
		}

		public Long getGatewayCount() {
			return this.gatewayCount;
		}

		public void setGatewayCount(Long gatewayCount) {
			this.gatewayCount = gatewayCount;
		}

		public Long getLocalJoinPermissionLimit() {
			return this.localJoinPermissionLimit;
		}

		public void setLocalJoinPermissionLimit(Long localJoinPermissionLimit) {
			this.localJoinPermissionLimit = localJoinPermissionLimit;
		}

		public Long getLocalJoinPermissionCount() {
			return this.localJoinPermissionCount;
		}

		public void setLocalJoinPermissionCount(Long localJoinPermissionCount) {
			this.localJoinPermissionCount = localJoinPermissionCount;
		}

		public Long getNodeLimit() {
			return this.nodeLimit;
		}

		public void setNodeLimit(Long nodeLimit) {
			this.nodeLimit = nodeLimit;
		}

		public Long getNodeCount() {
			return this.nodeCount;
		}

		public void setNodeCount(Long nodeCount) {
			this.nodeCount = nodeCount;
		}

		public Long getRoamingJoinPermissionLimit() {
			return this.roamingJoinPermissionLimit;
		}

		public void setRoamingJoinPermissionLimit(Long roamingJoinPermissionLimit) {
			this.roamingJoinPermissionLimit = roamingJoinPermissionLimit;
		}

		public Long getRoamingJoinPermissionCount() {
			return this.roamingJoinPermissionCount;
		}

		public void setRoamingJoinPermissionCount(Long roamingJoinPermissionCount) {
			this.roamingJoinPermissionCount = roamingJoinPermissionCount;
		}

		public Long getGatewayTupleFreeLimit() {
			return this.gatewayTupleFreeLimit;
		}

		public void setGatewayTupleFreeLimit(Long gatewayTupleFreeLimit) {
			this.gatewayTupleFreeLimit = gatewayTupleFreeLimit;
		}

		public Long getNodeTupleFreeLimit() {
			return this.nodeTupleFreeLimit;
		}

		public void setNodeTupleFreeLimit(Long nodeTupleFreeLimit) {
			this.nodeTupleFreeLimit = nodeTupleFreeLimit;
		}

		public Long getGatewayFreeLimit() {
			return this.gatewayFreeLimit;
		}

		public void setGatewayFreeLimit(Long gatewayFreeLimit) {
			this.gatewayFreeLimit = gatewayFreeLimit;
		}

		public Long getLocalJoinPermissionFreeLimit() {
			return this.localJoinPermissionFreeLimit;
		}

		public void setLocalJoinPermissionFreeLimit(Long localJoinPermissionFreeLimit) {
			this.localJoinPermissionFreeLimit = localJoinPermissionFreeLimit;
		}

		public Long getRoamingJoinPermissionFreeLimit() {
			return this.roamingJoinPermissionFreeLimit;
		}

		public void setRoamingJoinPermissionFreeLimit(Long roamingJoinPermissionFreeLimit) {
			this.roamingJoinPermissionFreeLimit = roamingJoinPermissionFreeLimit;
		}

		public Long getNodeFreeLimit() {
			return this.nodeFreeLimit;
		}

		public void setNodeFreeLimit(Long nodeFreeLimit) {
			this.nodeFreeLimit = nodeFreeLimit;
		}
	}

	@Override
	public GetUserLicenseResponse getInstance(UnmarshallerContext context) {
		return	GetUserLicenseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
