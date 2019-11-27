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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeVirtualBorderRoutersForPhysicalConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVirtualBorderRoutersForPhysicalConnectionResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VirtualBorderRouterForPhysicalConnectionType> getVirtualBorderRouterForPhysicalConnectionSet() {
		return this.virtualBorderRouterForPhysicalConnectionSet;
	}

	public void setVirtualBorderRouterForPhysicalConnectionSet(List<VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionSet) {
		this.virtualBorderRouterForPhysicalConnectionSet = virtualBorderRouterForPhysicalConnectionSet;
	}

	public static class VirtualBorderRouterForPhysicalConnectionType {

		private String vbrId;

		private Long vbrOwnerUid;

		private String eccId;

		private String type;

		private String creationTime;

		private String activationTime;

		private String terminationTime;

		private String recoveryTime;

		private Integer vlanId;

		private String status;

		private String circuitCode;

		private String localGatewayIp;

		private String peerGatewayIp;

		private String peeringSubnetMask;

		private String pConnVbrChargeType;

		private String pConnVbrExpireTime;

		private String pConnVbrBussinessStatus;

		private String bandwidth;

		public String getVbrId() {
			return this.vbrId;
		}

		public void setVbrId(String vbrId) {
			this.vbrId = vbrId;
		}

		public Long getVbrOwnerUid() {
			return this.vbrOwnerUid;
		}

		public void setVbrOwnerUid(Long vbrOwnerUid) {
			this.vbrOwnerUid = vbrOwnerUid;
		}

		public String getEccId() {
			return this.eccId;
		}

		public void setEccId(String eccId) {
			this.eccId = eccId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getActivationTime() {
			return this.activationTime;
		}

		public void setActivationTime(String activationTime) {
			this.activationTime = activationTime;
		}

		public String getTerminationTime() {
			return this.terminationTime;
		}

		public void setTerminationTime(String terminationTime) {
			this.terminationTime = terminationTime;
		}

		public String getRecoveryTime() {
			return this.recoveryTime;
		}

		public void setRecoveryTime(String recoveryTime) {
			this.recoveryTime = recoveryTime;
		}

		public Integer getVlanId() {
			return this.vlanId;
		}

		public void setVlanId(Integer vlanId) {
			this.vlanId = vlanId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCircuitCode() {
			return this.circuitCode;
		}

		public void setCircuitCode(String circuitCode) {
			this.circuitCode = circuitCode;
		}

		public String getLocalGatewayIp() {
			return this.localGatewayIp;
		}

		public void setLocalGatewayIp(String localGatewayIp) {
			this.localGatewayIp = localGatewayIp;
		}

		public String getPeerGatewayIp() {
			return this.peerGatewayIp;
		}

		public void setPeerGatewayIp(String peerGatewayIp) {
			this.peerGatewayIp = peerGatewayIp;
		}

		public String getPeeringSubnetMask() {
			return this.peeringSubnetMask;
		}

		public void setPeeringSubnetMask(String peeringSubnetMask) {
			this.peeringSubnetMask = peeringSubnetMask;
		}

		public String getPConnVbrChargeType() {
			return this.pConnVbrChargeType;
		}

		public void setPConnVbrChargeType(String pConnVbrChargeType) {
			this.pConnVbrChargeType = pConnVbrChargeType;
		}

		public String getPConnVbrExpireTime() {
			return this.pConnVbrExpireTime;
		}

		public void setPConnVbrExpireTime(String pConnVbrExpireTime) {
			this.pConnVbrExpireTime = pConnVbrExpireTime;
		}

		public String getPConnVbrBussinessStatus() {
			return this.pConnVbrBussinessStatus;
		}

		public void setPConnVbrBussinessStatus(String pConnVbrBussinessStatus) {
			this.pConnVbrBussinessStatus = pConnVbrBussinessStatus;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}
	}

	@Override
	public DescribeVirtualBorderRoutersForPhysicalConnectionResponse getInstance(UnmarshallerContext context) {
		return	DescribeVirtualBorderRoutersForPhysicalConnectionResponseUnmarshaller.unmarshall(this, context);
	}
}
