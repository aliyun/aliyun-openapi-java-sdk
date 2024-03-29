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
import com.aliyuncs.vpc.transform.v20160428.DescribeIPv6TranslatorEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIPv6TranslatorEntriesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<Ipv6TranslatorEntry> ipv6TranslatorEntries;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Ipv6TranslatorEntry> getIpv6TranslatorEntries() {
		return this.ipv6TranslatorEntries;
	}

	public void setIpv6TranslatorEntries(List<Ipv6TranslatorEntry> ipv6TranslatorEntries) {
		this.ipv6TranslatorEntries = ipv6TranslatorEntries;
	}

	public static class Ipv6TranslatorEntry {

		private String aclType;

		private String entryStatus;

		private String transProtocol;

		private String ipv6TranslatorId;

		private String entryDescription;

		private String ipv6TranslatorEntryId;

		private Integer allocateIpv6Port;

		private String backendIpv4Addr;

		private String backendIpv4Port;

		private String regionId;

		private String entryBandwidth;

		private String aclId;

		private String entryName;

		private String aclStatus;

		private String allocateIpv6Addr;

		public String getAclType() {
			return this.aclType;
		}

		public void setAclType(String aclType) {
			this.aclType = aclType;
		}

		public String getEntryStatus() {
			return this.entryStatus;
		}

		public void setEntryStatus(String entryStatus) {
			this.entryStatus = entryStatus;
		}

		public String getTransProtocol() {
			return this.transProtocol;
		}

		public void setTransProtocol(String transProtocol) {
			this.transProtocol = transProtocol;
		}

		public String getIpv6TranslatorId() {
			return this.ipv6TranslatorId;
		}

		public void setIpv6TranslatorId(String ipv6TranslatorId) {
			this.ipv6TranslatorId = ipv6TranslatorId;
		}

		public String getEntryDescription() {
			return this.entryDescription;
		}

		public void setEntryDescription(String entryDescription) {
			this.entryDescription = entryDescription;
		}

		public String getIpv6TranslatorEntryId() {
			return this.ipv6TranslatorEntryId;
		}

		public void setIpv6TranslatorEntryId(String ipv6TranslatorEntryId) {
			this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
		}

		public Integer getAllocateIpv6Port() {
			return this.allocateIpv6Port;
		}

		public void setAllocateIpv6Port(Integer allocateIpv6Port) {
			this.allocateIpv6Port = allocateIpv6Port;
		}

		public String getBackendIpv4Addr() {
			return this.backendIpv4Addr;
		}

		public void setBackendIpv4Addr(String backendIpv4Addr) {
			this.backendIpv4Addr = backendIpv4Addr;
		}

		public String getBackendIpv4Port() {
			return this.backendIpv4Port;
		}

		public void setBackendIpv4Port(String backendIpv4Port) {
			this.backendIpv4Port = backendIpv4Port;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEntryBandwidth() {
			return this.entryBandwidth;
		}

		public void setEntryBandwidth(String entryBandwidth) {
			this.entryBandwidth = entryBandwidth;
		}

		public String getAclId() {
			return this.aclId;
		}

		public void setAclId(String aclId) {
			this.aclId = aclId;
		}

		public String getEntryName() {
			return this.entryName;
		}

		public void setEntryName(String entryName) {
			this.entryName = entryName;
		}

		public String getAclStatus() {
			return this.aclStatus;
		}

		public void setAclStatus(String aclStatus) {
			this.aclStatus = aclStatus;
		}

		public String getAllocateIpv6Addr() {
			return this.allocateIpv6Addr;
		}

		public void setAllocateIpv6Addr(String allocateIpv6Addr) {
			this.allocateIpv6Addr = allocateIpv6Addr;
		}
	}

	@Override
	public DescribeIPv6TranslatorEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeIPv6TranslatorEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
