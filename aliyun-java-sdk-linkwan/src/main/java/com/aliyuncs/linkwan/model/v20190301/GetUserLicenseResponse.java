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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.GetUserLicenseResponseUnmarshaller;
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

		private Long relayLimit;

		private Long relayCount;

		private Long gatewayPrePayCount;

		private Long nodeTupleRelayLimit;

		private Long nodeTupleRelayCount;

		private Long nodeTupleStandardLimit;

		private Long nodeTupleStandardCount;

		private Long gatewayTupleHybridLimit;

		private Long gatewayTupleHybridCount;

		private Long gatewayTupleSingleChannelLimit;

		private Long gatewayTupleSingleChannelCount;

		private Long gatewayTupleStandardLimit;

		private Long gatewayTupleStandardCount;

		private Long gatewayDingTalkCount;

		private Long gatewayDingTalkLimit;

		private Long gatewayProfessionalCount;

		private Long gatewayProfessionalLimit;

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

		public Long getRelayLimit() {
			return this.relayLimit;
		}

		public void setRelayLimit(Long relayLimit) {
			this.relayLimit = relayLimit;
		}

		public Long getRelayCount() {
			return this.relayCount;
		}

		public void setRelayCount(Long relayCount) {
			this.relayCount = relayCount;
		}

		public Long getGatewayPrePayCount() {
			return this.gatewayPrePayCount;
		}

		public void setGatewayPrePayCount(Long gatewayPrePayCount) {
			this.gatewayPrePayCount = gatewayPrePayCount;
		}

		public Long getNodeTupleRelayLimit() {
			return this.nodeTupleRelayLimit;
		}

		public void setNodeTupleRelayLimit(Long nodeTupleRelayLimit) {
			this.nodeTupleRelayLimit = nodeTupleRelayLimit;
		}

		public Long getNodeTupleRelayCount() {
			return this.nodeTupleRelayCount;
		}

		public void setNodeTupleRelayCount(Long nodeTupleRelayCount) {
			this.nodeTupleRelayCount = nodeTupleRelayCount;
		}

		public Long getNodeTupleStandardLimit() {
			return this.nodeTupleStandardLimit;
		}

		public void setNodeTupleStandardLimit(Long nodeTupleStandardLimit) {
			this.nodeTupleStandardLimit = nodeTupleStandardLimit;
		}

		public Long getNodeTupleStandardCount() {
			return this.nodeTupleStandardCount;
		}

		public void setNodeTupleStandardCount(Long nodeTupleStandardCount) {
			this.nodeTupleStandardCount = nodeTupleStandardCount;
		}

		public Long getGatewayTupleHybridLimit() {
			return this.gatewayTupleHybridLimit;
		}

		public void setGatewayTupleHybridLimit(Long gatewayTupleHybridLimit) {
			this.gatewayTupleHybridLimit = gatewayTupleHybridLimit;
		}

		public Long getGatewayTupleHybridCount() {
			return this.gatewayTupleHybridCount;
		}

		public void setGatewayTupleHybridCount(Long gatewayTupleHybridCount) {
			this.gatewayTupleHybridCount = gatewayTupleHybridCount;
		}

		public Long getGatewayTupleSingleChannelLimit() {
			return this.gatewayTupleSingleChannelLimit;
		}

		public void setGatewayTupleSingleChannelLimit(Long gatewayTupleSingleChannelLimit) {
			this.gatewayTupleSingleChannelLimit = gatewayTupleSingleChannelLimit;
		}

		public Long getGatewayTupleSingleChannelCount() {
			return this.gatewayTupleSingleChannelCount;
		}

		public void setGatewayTupleSingleChannelCount(Long gatewayTupleSingleChannelCount) {
			this.gatewayTupleSingleChannelCount = gatewayTupleSingleChannelCount;
		}

		public Long getGatewayTupleStandardLimit() {
			return this.gatewayTupleStandardLimit;
		}

		public void setGatewayTupleStandardLimit(Long gatewayTupleStandardLimit) {
			this.gatewayTupleStandardLimit = gatewayTupleStandardLimit;
		}

		public Long getGatewayTupleStandardCount() {
			return this.gatewayTupleStandardCount;
		}

		public void setGatewayTupleStandardCount(Long gatewayTupleStandardCount) {
			this.gatewayTupleStandardCount = gatewayTupleStandardCount;
		}

		public Long getGatewayDingTalkCount() {
			return this.gatewayDingTalkCount;
		}

		public void setGatewayDingTalkCount(Long gatewayDingTalkCount) {
			this.gatewayDingTalkCount = gatewayDingTalkCount;
		}

		public Long getGatewayDingTalkLimit() {
			return this.gatewayDingTalkLimit;
		}

		public void setGatewayDingTalkLimit(Long gatewayDingTalkLimit) {
			this.gatewayDingTalkLimit = gatewayDingTalkLimit;
		}

		public Long getGatewayProfessionalCount() {
			return this.gatewayProfessionalCount;
		}

		public void setGatewayProfessionalCount(Long gatewayProfessionalCount) {
			this.gatewayProfessionalCount = gatewayProfessionalCount;
		}

		public Long getGatewayProfessionalLimit() {
			return this.gatewayProfessionalLimit;
		}

		public void setGatewayProfessionalLimit(Long gatewayProfessionalLimit) {
			this.gatewayProfessionalLimit = gatewayProfessionalLimit;
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
