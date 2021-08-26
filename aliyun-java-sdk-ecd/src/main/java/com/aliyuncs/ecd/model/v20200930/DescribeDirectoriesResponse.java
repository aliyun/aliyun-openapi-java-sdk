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

		private Boolean enableInternetAccess;

		private String vpcId;

		private String creationTime;

		private String status;

		private String domainPassword;

		private Boolean enableAdminAccess;

		private String subDomainName;

		private String domainUserName;

		private Boolean enableCrossDesktopAccess;

		private String customSecurityGroupId;

		private String desktopVpcEndpoint;

		private Boolean ssoEnabled;

		private String domainName;

		private String desktopAccessType;

		private Boolean mfaEnabled;

		private String directoryType;

		private String dnsUserName;

		private String trustPassword;

		private String ouName;

		private String name;

		private String directoryId;

		private List<ADConnector> aDConnectors;

		private List<Log> logs;

		private List<String> vSwitchIds;

		private List<String> fileSystemIds;

		private List<String> subDnsAddress;

		private List<String> dnsAddress;

		public Boolean getEnableInternetAccess() {
			return this.enableInternetAccess;
		}

		public void setEnableInternetAccess(Boolean enableInternetAccess) {
			this.enableInternetAccess = enableInternetAccess;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDomainPassword() {
			return this.domainPassword;
		}

		public void setDomainPassword(String domainPassword) {
			this.domainPassword = domainPassword;
		}

		public Boolean getEnableAdminAccess() {
			return this.enableAdminAccess;
		}

		public void setEnableAdminAccess(Boolean enableAdminAccess) {
			this.enableAdminAccess = enableAdminAccess;
		}

		public String getSubDomainName() {
			return this.subDomainName;
		}

		public void setSubDomainName(String subDomainName) {
			this.subDomainName = subDomainName;
		}

		public String getDomainUserName() {
			return this.domainUserName;
		}

		public void setDomainUserName(String domainUserName) {
			this.domainUserName = domainUserName;
		}

		public Boolean getEnableCrossDesktopAccess() {
			return this.enableCrossDesktopAccess;
		}

		public void setEnableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
			this.enableCrossDesktopAccess = enableCrossDesktopAccess;
		}

		public String getCustomSecurityGroupId() {
			return this.customSecurityGroupId;
		}

		public void setCustomSecurityGroupId(String customSecurityGroupId) {
			this.customSecurityGroupId = customSecurityGroupId;
		}

		public String getDesktopVpcEndpoint() {
			return this.desktopVpcEndpoint;
		}

		public void setDesktopVpcEndpoint(String desktopVpcEndpoint) {
			this.desktopVpcEndpoint = desktopVpcEndpoint;
		}

		public Boolean getSsoEnabled() {
			return this.ssoEnabled;
		}

		public void setSsoEnabled(Boolean ssoEnabled) {
			this.ssoEnabled = ssoEnabled;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getDesktopAccessType() {
			return this.desktopAccessType;
		}

		public void setDesktopAccessType(String desktopAccessType) {
			this.desktopAccessType = desktopAccessType;
		}

		public Boolean getMfaEnabled() {
			return this.mfaEnabled;
		}

		public void setMfaEnabled(Boolean mfaEnabled) {
			this.mfaEnabled = mfaEnabled;
		}

		public String getDirectoryType() {
			return this.directoryType;
		}

		public void setDirectoryType(String directoryType) {
			this.directoryType = directoryType;
		}

		public String getDnsUserName() {
			return this.dnsUserName;
		}

		public void setDnsUserName(String dnsUserName) {
			this.dnsUserName = dnsUserName;
		}

		public String getTrustPassword() {
			return this.trustPassword;
		}

		public void setTrustPassword(String trustPassword) {
			this.trustPassword = trustPassword;
		}

		public String getOuName() {
			return this.ouName;
		}

		public void setOuName(String ouName) {
			this.ouName = ouName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
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

		public List<String> getSubDnsAddress() {
			return this.subDnsAddress;
		}

		public void setSubDnsAddress(List<String> subDnsAddress) {
			this.subDnsAddress = subDnsAddress;
		}

		public List<String> getDnsAddress() {
			return this.dnsAddress;
		}

		public void setDnsAddress(List<String> dnsAddress) {
			this.dnsAddress = dnsAddress;
		}

		public static class ADConnector {

			private String connectorStatus;

			private String vSwitchId;

			private String aDConnectorAddress;

			private String trustKey;

			private String networkInterfaceId;

			public String getConnectorStatus() {
				return this.connectorStatus;
			}

			public void setConnectorStatus(String connectorStatus) {
				this.connectorStatus = connectorStatus;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getADConnectorAddress() {
				return this.aDConnectorAddress;
			}

			public void setADConnectorAddress(String aDConnectorAddress) {
				this.aDConnectorAddress = aDConnectorAddress;
			}

			public String getTrustKey() {
				return this.trustKey;
			}

			public void setTrustKey(String trustKey) {
				this.trustKey = trustKey;
			}

			public String getNetworkInterfaceId() {
				return this.networkInterfaceId;
			}

			public void setNetworkInterfaceId(String networkInterfaceId) {
				this.networkInterfaceId = networkInterfaceId;
			}
		}

		public static class Log {

			private String step;

			private String message;

			private String timeStamp;

			private String level;

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

			public String getTimeStamp() {
				return this.timeStamp;
			}

			public void setTimeStamp(String timeStamp) {
				this.timeStamp = timeStamp;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
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
