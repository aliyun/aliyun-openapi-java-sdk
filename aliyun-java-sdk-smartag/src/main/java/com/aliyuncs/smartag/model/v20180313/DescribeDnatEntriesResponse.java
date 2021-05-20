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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeDnatEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnatEntriesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<DnatEntry> dnatEntries;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<DnatEntry> getDnatEntries() {
		return this.dnatEntries;
	}

	public void setDnatEntries(List<DnatEntry> dnatEntries) {
		this.dnatEntries = dnatEntries;
	}

	public static class DnatEntry {

		private String externalPort;

		private String type;

		private String externalIp;

		private String ipProtocol;

		private String internalPort;

		private String sagId;

		private String internalIp;

		private String dnatEntryId;

		public String getExternalPort() {
			return this.externalPort;
		}

		public void setExternalPort(String externalPort) {
			this.externalPort = externalPort;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getExternalIp() {
			return this.externalIp;
		}

		public void setExternalIp(String externalIp) {
			this.externalIp = externalIp;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getInternalPort() {
			return this.internalPort;
		}

		public void setInternalPort(String internalPort) {
			this.internalPort = internalPort;
		}

		public String getSagId() {
			return this.sagId;
		}

		public void setSagId(String sagId) {
			this.sagId = sagId;
		}

		public String getInternalIp() {
			return this.internalIp;
		}

		public void setInternalIp(String internalIp) {
			this.internalIp = internalIp;
		}

		public String getDnatEntryId() {
			return this.dnatEntryId;
		}

		public void setDnatEntryId(String dnatEntryId) {
			this.dnatEntryId = dnatEntryId;
		}
	}

	@Override
	public DescribeDnatEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnatEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
