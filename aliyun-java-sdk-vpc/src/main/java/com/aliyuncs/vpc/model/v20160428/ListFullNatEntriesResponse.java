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
import com.aliyuncs.vpc.transform.v20160428.ListFullNatEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFullNatEntriesResponse extends AcsResponse {

	private String requestId;

	private String natGatewayId;

	private String fullNatTableId;

	private Long totalCount;

	private String nextToken;

	private Long maxResults;

	private List<FullNatEntry> fullNatEntries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
	}

	public String getFullNatTableId() {
		return this.fullNatTableId;
	}

	public void setFullNatTableId(String fullNatTableId) {
		this.fullNatTableId = fullNatTableId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public List<FullNatEntry> getFullNatEntries() {
		return this.fullNatEntries;
	}

	public void setFullNatEntries(List<FullNatEntry> fullNatEntries) {
		this.fullNatEntries = fullNatEntries;
	}

	public static class FullNatEntry {

		private String natIp;

		private String natIpPort;

		private String accessIp;

		private String accessPort;

		private String ipProtocol;

		private String networkInterfaceId;

		private String networkInterfaceType;

		private String fullNatEntryName;

		private String fullNatEntryDescription;

		private String creationTime;

		private String fullNatEntryId;

		private String fullNatEntryStatus;

		private String fullNatTableId;

		private String accessDomain;

		private String domainResolve;

		public String getNatIp() {
			return this.natIp;
		}

		public void setNatIp(String natIp) {
			this.natIp = natIp;
		}

		public String getNatIpPort() {
			return this.natIpPort;
		}

		public void setNatIpPort(String natIpPort) {
			this.natIpPort = natIpPort;
		}

		public String getAccessIp() {
			return this.accessIp;
		}

		public void setAccessIp(String accessIp) {
			this.accessIp = accessIp;
		}

		public String getAccessPort() {
			return this.accessPort;
		}

		public void setAccessPort(String accessPort) {
			this.accessPort = accessPort;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public String getNetworkInterfaceType() {
			return this.networkInterfaceType;
		}

		public void setNetworkInterfaceType(String networkInterfaceType) {
			this.networkInterfaceType = networkInterfaceType;
		}

		public String getFullNatEntryName() {
			return this.fullNatEntryName;
		}

		public void setFullNatEntryName(String fullNatEntryName) {
			this.fullNatEntryName = fullNatEntryName;
		}

		public String getFullNatEntryDescription() {
			return this.fullNatEntryDescription;
		}

		public void setFullNatEntryDescription(String fullNatEntryDescription) {
			this.fullNatEntryDescription = fullNatEntryDescription;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getFullNatEntryId() {
			return this.fullNatEntryId;
		}

		public void setFullNatEntryId(String fullNatEntryId) {
			this.fullNatEntryId = fullNatEntryId;
		}

		public String getFullNatEntryStatus() {
			return this.fullNatEntryStatus;
		}

		public void setFullNatEntryStatus(String fullNatEntryStatus) {
			this.fullNatEntryStatus = fullNatEntryStatus;
		}

		public String getFullNatTableId() {
			return this.fullNatTableId;
		}

		public void setFullNatTableId(String fullNatTableId) {
			this.fullNatTableId = fullNatTableId;
		}

		public String getAccessDomain() {
			return this.accessDomain;
		}

		public void setAccessDomain(String accessDomain) {
			this.accessDomain = accessDomain;
		}

		public String getDomainResolve() {
			return this.domainResolve;
		}

		public void setDomainResolve(String domainResolve) {
			this.domainResolve = domainResolve;
		}
	}

	@Override
	public ListFullNatEntriesResponse getInstance(UnmarshallerContext context) {
		return	ListFullNatEntriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
