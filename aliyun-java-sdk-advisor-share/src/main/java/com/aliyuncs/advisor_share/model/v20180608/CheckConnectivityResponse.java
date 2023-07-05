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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.CheckConnectivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckConnectivityResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private String checkId;

		private ResourceStatusResult resourceStatusResult;

		private ResourceNetworkResult resourceNetworkResult;

		private RdsWhiteListResult rdsWhiteListResult;

		private SecurityGroupResult securityGroupResult;

		private SecurityPunishResult securityPunishResult;

		public String getCheckId() {
			return this.checkId;
		}

		public void setCheckId(String checkId) {
			this.checkId = checkId;
		}

		public ResourceStatusResult getResourceStatusResult() {
			return this.resourceStatusResult;
		}

		public void setResourceStatusResult(ResourceStatusResult resourceStatusResult) {
			this.resourceStatusResult = resourceStatusResult;
		}

		public ResourceNetworkResult getResourceNetworkResult() {
			return this.resourceNetworkResult;
		}

		public void setResourceNetworkResult(ResourceNetworkResult resourceNetworkResult) {
			this.resourceNetworkResult = resourceNetworkResult;
		}

		public RdsWhiteListResult getRdsWhiteListResult() {
			return this.rdsWhiteListResult;
		}

		public void setRdsWhiteListResult(RdsWhiteListResult rdsWhiteListResult) {
			this.rdsWhiteListResult = rdsWhiteListResult;
		}

		public SecurityGroupResult getSecurityGroupResult() {
			return this.securityGroupResult;
		}

		public void setSecurityGroupResult(SecurityGroupResult securityGroupResult) {
			this.securityGroupResult = securityGroupResult;
		}

		public SecurityPunishResult getSecurityPunishResult() {
			return this.securityPunishResult;
		}

		public void setSecurityPunishResult(SecurityPunishResult securityPunishResult) {
			this.securityPunishResult = securityPunishResult;
		}

		public static class ResourceStatusResult {

			private Integer severity;

			private String errorCode;

			private SrcStatus srcStatus;

			private DstStatus dstStatus;

			public Integer getSeverity() {
				return this.severity;
			}

			public void setSeverity(Integer severity) {
				this.severity = severity;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public SrcStatus getSrcStatus() {
				return this.srcStatus;
			}

			public void setSrcStatus(SrcStatus srcStatus) {
				this.srcStatus = srcStatus;
			}

			public DstStatus getDstStatus() {
				return this.dstStatus;
			}

			public void setDstStatus(DstStatus dstStatus) {
				this.dstStatus = dstStatus;
			}

			public static class SrcStatus {

				private String status;

				private String ipAddress;

				private String resourceId;

				private String errorCode;

				private String product;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getIpAddress() {
					return this.ipAddress;
				}

				public void setIpAddress(String ipAddress) {
					this.ipAddress = ipAddress;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}

				public String getProduct() {
					return this.product;
				}

				public void setProduct(String product) {
					this.product = product;
				}
			}

			public static class DstStatus {

				private String status;

				private String ipAddress;

				private String resourceId;

				private String errorCode;

				private String product;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getIpAddress() {
					return this.ipAddress;
				}

				public void setIpAddress(String ipAddress) {
					this.ipAddress = ipAddress;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}

				public String getProduct() {
					return this.product;
				}

				public void setProduct(String product) {
					this.product = product;
				}
			}
		}

		public static class ResourceNetworkResult {

			private Integer severity;

			private String errorCode;

			private SrcNetwork srcNetwork;

			private DstNetwork dstNetwork;

			public Integer getSeverity() {
				return this.severity;
			}

			public void setSeverity(Integer severity) {
				this.severity = severity;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public SrcNetwork getSrcNetwork() {
				return this.srcNetwork;
			}

			public void setSrcNetwork(SrcNetwork srcNetwork) {
				this.srcNetwork = srcNetwork;
			}

			public DstNetwork getDstNetwork() {
				return this.dstNetwork;
			}

			public void setDstNetwork(DstNetwork dstNetwork) {
				this.dstNetwork = dstNetwork;
			}

			public static class SrcNetwork {

				private String vpcId;

				private String ipType;

				private String ipAddress;

				private String errorCode;

				private String product;

				private String networkType;

				private String resourceId;

				private String regionId;

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}

				public String getIpType() {
					return this.ipType;
				}

				public void setIpType(String ipType) {
					this.ipType = ipType;
				}

				public String getIpAddress() {
					return this.ipAddress;
				}

				public void setIpAddress(String ipAddress) {
					this.ipAddress = ipAddress;
				}

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}

				public String getProduct() {
					return this.product;
				}

				public void setProduct(String product) {
					this.product = product;
				}

				public String getNetworkType() {
					return this.networkType;
				}

				public void setNetworkType(String networkType) {
					this.networkType = networkType;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}
			}

			public static class DstNetwork {

				private String vpcId;

				private String ipType;

				private String ipAddress;

				private String errorCode;

				private String product;

				private String networkType;

				private String resourceId;

				private String regionId;

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}

				public String getIpType() {
					return this.ipType;
				}

				public void setIpType(String ipType) {
					this.ipType = ipType;
				}

				public String getIpAddress() {
					return this.ipAddress;
				}

				public void setIpAddress(String ipAddress) {
					this.ipAddress = ipAddress;
				}

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}

				public String getProduct() {
					return this.product;
				}

				public void setProduct(String product) {
					this.product = product;
				}

				public String getNetworkType() {
					return this.networkType;
				}

				public void setNetworkType(String networkType) {
					this.networkType = networkType;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}
			}
		}

		public static class RdsWhiteListResult {

			private Integer severity;

			private String rdsWhiteList;

			private String rdsResourceId;

			private String errorCode;

			public Integer getSeverity() {
				return this.severity;
			}

			public void setSeverity(Integer severity) {
				this.severity = severity;
			}

			public String getRdsWhiteList() {
				return this.rdsWhiteList;
			}

			public void setRdsWhiteList(String rdsWhiteList) {
				this.rdsWhiteList = rdsWhiteList;
			}

			public String getRdsResourceId() {
				return this.rdsResourceId;
			}

			public void setRdsResourceId(String rdsResourceId) {
				this.rdsResourceId = rdsResourceId;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}
		}

		public static class SecurityGroupResult {

			private String dstCheckResult;

			private Integer severity;

			private String srcSecurityGroupRule;

			private String srcResourceId;

			private String errorCode;

			private String dstSecurityGroupRule;

			private String srcCheckResult;

			private String dstResourceId;

			public String getDstCheckResult() {
				return this.dstCheckResult;
			}

			public void setDstCheckResult(String dstCheckResult) {
				this.dstCheckResult = dstCheckResult;
			}

			public Integer getSeverity() {
				return this.severity;
			}

			public void setSeverity(Integer severity) {
				this.severity = severity;
			}

			public String getSrcSecurityGroupRule() {
				return this.srcSecurityGroupRule;
			}

			public void setSrcSecurityGroupRule(String srcSecurityGroupRule) {
				this.srcSecurityGroupRule = srcSecurityGroupRule;
			}

			public String getSrcResourceId() {
				return this.srcResourceId;
			}

			public void setSrcResourceId(String srcResourceId) {
				this.srcResourceId = srcResourceId;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getDstSecurityGroupRule() {
				return this.dstSecurityGroupRule;
			}

			public void setDstSecurityGroupRule(String dstSecurityGroupRule) {
				this.dstSecurityGroupRule = dstSecurityGroupRule;
			}

			public String getSrcCheckResult() {
				return this.srcCheckResult;
			}

			public void setSrcCheckResult(String srcCheckResult) {
				this.srcCheckResult = srcCheckResult;
			}

			public String getDstResourceId() {
				return this.dstResourceId;
			}

			public void setDstResourceId(String dstResourceId) {
				this.dstResourceId = dstResourceId;
			}
		}

		public static class SecurityPunishResult {

			private Integer severity;

			private String securityPunishList;

			private String errorCode;

			public Integer getSeverity() {
				return this.severity;
			}

			public void setSeverity(Integer severity) {
				this.severity = severity;
			}

			public String getSecurityPunishList() {
				return this.securityPunishList;
			}

			public void setSecurityPunishList(String securityPunishList) {
				this.securityPunishList = securityPunishList;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}
		}
	}

	@Override
	public CheckConnectivityResponse getInstance(UnmarshallerContext context) {
		return	CheckConnectivityResponseUnmarshaller.unmarshall(this, context);
	}
}
