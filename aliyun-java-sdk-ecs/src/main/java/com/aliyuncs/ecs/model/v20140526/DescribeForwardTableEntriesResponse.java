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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeForwardTableEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeForwardTableEntriesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ForwardTableEntry> forwardTableEntries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<ForwardTableEntry> getForwardTableEntries() {
		return this.forwardTableEntries;
	}

	public void setForwardTableEntries(List<ForwardTableEntry> forwardTableEntries) {
		this.forwardTableEntries = forwardTableEntries;
	}

	public static class ForwardTableEntry {

		private String forwardTableId;

		private String forwardEntryId;

		private String externalIp;

		private String externalPort;

		private String ipProtocol;

		private String internalIp;

		private String internalPort;

		private String status;

		public String getForwardTableId() {
			return this.forwardTableId;
		}

		public void setForwardTableId(String forwardTableId) {
			this.forwardTableId = forwardTableId;
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

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeForwardTableEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeForwardTableEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
