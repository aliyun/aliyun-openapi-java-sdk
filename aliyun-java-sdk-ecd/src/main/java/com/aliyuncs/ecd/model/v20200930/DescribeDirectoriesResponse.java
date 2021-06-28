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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeDirectoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDirectoriesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<Directory> directories;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Directory> getDirectories() {
		return this.directories;
	}

	public void setDirectories(List<Directory> directories) {
		this.directories = directories;
	}

	public static class Directory {

		private String directoryId;

		private String status;

		private String directoryType;

		private String creationTime;

		private String name;

		private String vpcId;

		private String customSecurityGroupId;

		private String dnsUserName;

		private Boolean enableInternetAccess;

		private Boolean enableCrossDesktopAccess;

		private Boolean enableAdminAccess;

		private String desktopAccessType;

		private String desktopVpcEndpoint;

		private String trustPassword;

		private String domainName;

		private String domainUserName;

		private String domainPassword;

		private String subDomainName;

		private Boolean mfaEnabled;

		private Boolean ssoEnabled;

		private List<ADConnector> aDConnectors;

		private List<Log> logs;

		private List<String> dnsAddress;

		private List<String> subDnsAddress;

		private List<String> vSwitchIds;

		private List<String> fileSystemIds;

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDirectoryType() {
			return this.directoryType;
		}

		public void setDirectoryType(String directoryType) {
			this.directoryType = directoryType;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCustomSecurityGroupId() {
			return this.customSecurityGroupId;
		}

		public void setCustomSecurityGroupId(String customSecurityGroupId) {
			this.customSecurityGroupId = customSecurityGroupId;
		}

		public String getDnsUserName() {
			return this.dnsUserName;
		}

		public void setDnsUserName(String dnsUserName) {
			this.dnsUserName = dnsUserName;
		}

		public Boolean getEnableInternetAccess() {
			return this.enableInternetAccess;
		}

		public void setEnableInternetAccess(Boolean enableInternetAccess) {
			this.enableInternetAccess = enableInternetAccess;
		}

		public Boolean getEnableCrossDesktopAccess() {
			return this.enableCrossDesktopAccess;
		}

		public void setEnableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
			this.enableCrossDesktopAccess = enableCrossDesktopAccess;
		}

		public Boolean getEnableAdminAccess() {
			return this.enableAdminAccess;
		}

		public void setEnableAdminAccess(Boolean enableAdminAccess) {
			this.enableAdminAccess = enableAdminAccess;
		}

		public String getDesktopAccessType() {
			return this.desktopAccessType;
		}

		public void setDesktopAccessType(String desktopAccessType) {
			this.desktopAccessType = desktopAccessType;
		}

		public String getDesktopVpcEndpoint() {
			return this.desktopVpcEndpoint;
		}

		public void setDesktopVpcEndpoint(String desktopVpcEndpoint) {
			this.desktopVpcEndpoint = desktopVpcEndpoint;
		}

		public String getTrustPassword() {
			return this.trustPassword;
		}

		public void setTrustPassword(String trustPassword) {
			this.trustPassword = trustPassword;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getDomainUserName() {
			return this.domainUserName;
		}

		public void setDomainUserName(String domainUserName) {
			this.domainUserName = domainUserName;
		}

		public String getDomainPassword() {
			return this.domainPassword;
		}

		public void setDomainPassword(String domainPassword) {
			this.domainPassword = domainPassword;
		}

		public String getSubDomainName() {
			return this.subDomainName;
		}

		public void setSubDomainName(String subDomainName) {
			this.subDomainName = subDomainName;
		}

		public Boolean getMfaEnabled() {
			return this.mfaEnabled;
		}

		public void setMfaEnabled(Boolean mfaEnabled) {
			this.mfaEnabled = mfaEnabled;
		}

		public Boolean getSsoEnabled() {
			return this.ssoEnabled;
		}

		public void setSsoEnabled(Boolean ssoEnabled) {
			this.ssoEnabled = ssoEnabled;
		}

		public List<ADConnector> getADConnectors() {
			return this.aDConnectors;
		}

		public void setADConnectors(List<ADConnector> aDConnectors) {
			this.aDConnectors = aDConnectors;
		}

		public List<Log> getLogs() {
			return this.logs;
		}

		public void setLogs(List<Log> logs) {
			this.logs = logs;
		}

		public List<String> getDnsAddress() {
			return this.dnsAddress;
		}

		public void setDnsAddress(List<String> dnsAddress) {
			this.dnsAddress = dnsAddress;
		}

		public List<String> getSubDnsAddress() {
			return this.subDnsAddress;
		}

		public void setSubDnsAddress(List<String> subDnsAddress) {
			this.subDnsAddress = subDnsAddress;
		}

		public List<String> getVSwitchIds() {
			return this.vSwitchIds;
		}

		public void setVSwitchIds(List<String> vSwitchIds) {
			this.vSwitchIds = vSwitchIds;
		}

		public List<String> getFileSystemIds() {
			return this.fileSystemIds;
		}

		public void setFileSystemIds(List<String> fileSystemIds) {
			this.fileSystemIds = fileSystemIds;
		}

		public static class ADConnector {

			private String aDConnectorAddress;

			private String vSwitchId;

			private String connectorStatus;

			private String networkInterfaceId;

			public String getADConnectorAddress() {
				return this.aDConnectorAddress;
			}

			public void setADConnectorAddress(String aDConnectorAddress) {
				this.aDConnectorAddress = aDConnectorAddress;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getConnectorStatus() {
				return this.connectorStatus;
			}

			public void setConnectorStatus(String connectorStatus) {
				this.connectorStatus = connectorStatus;
			}

			public String getNetworkInterfaceId() {
				return this.networkInterfaceId;
			}

			public void setNetworkInterfaceId(String networkInterfaceId) {
				this.networkInterfaceId = networkInterfaceId;
			}
		}

		public static class Log {

			private String level;

			private String timeStamp;

			private String step;

			private String message;

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getTimeStamp() {
				return this.timeStamp;
			}

			public void setTimeStamp(String timeStamp) {
				this.timeStamp = timeStamp;
			}

			public String getStep() {
				return this.step;
			}

			public void setStep(String step) {
				this.step = step;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
		}
	}

	@Override
	public DescribeDirectoriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDirectoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
