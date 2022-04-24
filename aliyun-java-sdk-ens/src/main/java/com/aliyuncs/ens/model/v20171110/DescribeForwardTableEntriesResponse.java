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
import com.aliyuncs.ens.transform.v20171110.DescribeForwardTableEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeForwardTableEntriesResponse extends AcsResponse {

	private String requestId;

	private String pageNumber;

	private String totalCount;

	private String pageSize;

	private List<ForwardTableEntry> forwardTableEntries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<ForwardTableEntry> getForwardTableEntries() {
		return this.forwardTableEntries;
	}

	public void setForwardTableEntries(List<ForwardTableEntry> forwardTableEntries) {
		this.forwardTableEntries = forwardTableEntries;
	}

	public static class ForwardTableEntry {

		private String natGatewayId;

		private String forwardEntryId;

		private String externalIp;

		private String externalPort;

		private String internalIp;

		private String internalPort;

		private String forwardEntryName;

		private String status;

		private String ipProtocol;

		public String getNatGatewayId() {
			return this.natGatewayId;
		}

		public void setNatGatewayId(String natGatewayId) {
			this.natGatewayId = natGatewayId;
		}

		public String getForwardEntryId() {
			return this.forwardEntryId;
		}

		public void setForwardEntryId(String forwardEntryId) {
			this.forwardEntryId = forwardEntryId;
		}

		public String getExternalIp() {
			return this.externalIp;
		}

		public void setExternalIp(String externalIp) {
			this.externalIp = externalIp;
		}

		public String getExternalPort() {
			return this.externalPort;
		}

		public void setExternalPort(String externalPort) {
			this.externalPort = externalPort;
		}

		public String getInternalIp() {
			return this.internalIp;
		}

		public void setInternalIp(String internalIp) {
			this.internalIp = internalIp;
		}

		public String getInternalPort() {
			return this.internalPort;
		}

		public void setInternalPort(String internalPort) {
			this.internalPort = internalPort;
		}

		public String getForwardEntryName() {
			return this.forwardEntryName;
		}

		public void setForwardEntryName(String forwardEntryName) {
			this.forwardEntryName = forwardEntryName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}
	}

	@Override
	public DescribeForwardTableEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeForwardTableEntriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
