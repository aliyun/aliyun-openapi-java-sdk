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
import com.aliyuncs.vpc.transform.v20160428.DescribeSnatTableEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnatTableEntriesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<SnatTableEntry> snatTableEntries;

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

	public List<SnatTableEntry> getSnatTableEntries() {
		return this.snatTableEntries;
	}

	public void setSnatTableEntries(List<SnatTableEntry> snatTableEntries) {
		this.snatTableEntries = snatTableEntries;
	}

	public static class SnatTableEntry {

		private String status;

		private String snatEntryName;

		private String sourceVSwitchId;

		private String sourceCIDR;

		private String snatEntryId;

		private String snatTableId;

		private String snatIp;

		private String natGatewayId;

		private String networkInterfaceId;

		private String eipAffinity;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSnatEntryName() {
			return this.snatEntryName;
		}

		public void setSnatEntryName(String snatEntryName) {
			this.snatEntryName = snatEntryName;
		}

		public String getSourceVSwitchId() {
			return this.sourceVSwitchId;
		}

		public void setSourceVSwitchId(String sourceVSwitchId) {
			this.sourceVSwitchId = sourceVSwitchId;
		}

		public String getSourceCIDR() {
			return this.sourceCIDR;
		}

		public void setSourceCIDR(String sourceCIDR) {
			this.sourceCIDR = sourceCIDR;
		}

		public String getSnatEntryId() {
			return this.snatEntryId;
		}

		public void setSnatEntryId(String snatEntryId) {
			this.snatEntryId = snatEntryId;
		}

		public String getSnatTableId() {
			return this.snatTableId;
		}

		public void setSnatTableId(String snatTableId) {
			this.snatTableId = snatTableId;
		}

		public String getSnatIp() {
			return this.snatIp;
		}

		public void setSnatIp(String snatIp) {
			this.snatIp = snatIp;
		}

		public String getNatGatewayId() {
			return this.natGatewayId;
		}

		public void setNatGatewayId(String natGatewayId) {
			this.natGatewayId = natGatewayId;
		}

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public String getEipAffinity() {
			return this.eipAffinity;
		}

		public void setEipAffinity(String eipAffinity) {
			this.eipAffinity = eipAffinity;
		}
	}

	@Override
	public DescribeSnatTableEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSnatTableEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
