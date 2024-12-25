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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeSnatTableEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnatTableEntriesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private Integer pageSize;

	private List<SnatTableEntry> snatTableEntries;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<SnatTableEntry> getSnatTableEntries() {
		return this.snatTableEntries;
	}

	public void setSnatTableEntries(List<SnatTableEntry> snatTableEntries) {
		this.snatTableEntries = snatTableEntries;
	}

	public static class SnatTableEntry {

		private String natGatewayId;

		private String snatEntryId;

		private String snatIp;

		private String sourceCIDR;

		private String snatEntryName;

		private String status;

		private String standbySnatIp;

		private String standbyStatus;

		private String type;

		private Integer idleTimeout;

		private String destCIDR;

		private Boolean ispAffinity;

		private List<SnatIp> snatIps;

		public String getNatGatewayId() {
			return this.natGatewayId;
		}

		public void setNatGatewayId(String natGatewayId) {
			this.natGatewayId = natGatewayId;
		}

		public String getSnatEntryId() {
			return this.snatEntryId;
		}

		public void setSnatEntryId(String snatEntryId) {
			this.snatEntryId = snatEntryId;
		}

		public String getSnatIp() {
			return this.snatIp;
		}

		public void setSnatIp(String snatIp) {
			this.snatIp = snatIp;
		}

		public String getSourceCIDR() {
			return this.sourceCIDR;
		}

		public void setSourceCIDR(String sourceCIDR) {
			this.sourceCIDR = sourceCIDR;
		}

		public String getSnatEntryName() {
			return this.snatEntryName;
		}

		public void setSnatEntryName(String snatEntryName) {
			this.snatEntryName = snatEntryName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStandbySnatIp() {
			return this.standbySnatIp;
		}

		public void setStandbySnatIp(String standbySnatIp) {
			this.standbySnatIp = standbySnatIp;
		}

		public String getStandbyStatus() {
			return this.standbyStatus;
		}

		public void setStandbyStatus(String standbyStatus) {
			this.standbyStatus = standbyStatus;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getIdleTimeout() {
			return this.idleTimeout;
		}

		public void setIdleTimeout(Integer idleTimeout) {
			this.idleTimeout = idleTimeout;
		}

		public String getDestCIDR() {
			return this.destCIDR;
		}

		public void setDestCIDR(String destCIDR) {
			this.destCIDR = destCIDR;
		}

		public Boolean getIspAffinity() {
			return this.ispAffinity;
		}

		public void setIspAffinity(Boolean ispAffinity) {
			this.ispAffinity = ispAffinity;
		}

		public List<SnatIp> getSnatIps() {
			return this.snatIps;
		}

		public void setSnatIps(List<SnatIp> snatIps) {
			this.snatIps = snatIps;
		}

		public static class SnatIp {

			private String ip;

			private String isp;

			private String ensRegionId;

			private Boolean standby;

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}

			public String getEnsRegionId() {
				return this.ensRegionId;
			}

			public void setEnsRegionId(String ensRegionId) {
				this.ensRegionId = ensRegionId;
			}

			public Boolean getStandby() {
				return this.standby;
			}

			public void setStandby(Boolean standby) {
				this.standby = standby;
			}
		}
	}

	@Override
	public DescribeSnatTableEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSnatTableEntriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
