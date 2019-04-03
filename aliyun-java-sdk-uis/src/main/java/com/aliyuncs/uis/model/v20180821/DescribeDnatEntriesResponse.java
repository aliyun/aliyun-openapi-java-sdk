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

package com.aliyuncs.uis.model.v20180821;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.uis.transform.v20180821.DescribeDnatEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnatEntriesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<UisDnatEntry> uisDnatEntries;

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

	public List<UisDnatEntry> getUisDnatEntries() {
		return this.uisDnatEntries;
	}

	public void setUisDnatEntries(List<UisDnatEntry> uisDnatEntries) {
		this.uisDnatEntries = uisDnatEntries;
	}

	public static class UisDnatEntry {

		private String uisDnatId;

		private String destinationIp;

		private Integer destinationPort;

		private String originalIp;

		private Integer originalPort;

		private String ipProtocol;

		public String getUisDnatId() {
			return this.uisDnatId;
		}

		public void setUisDnatId(String uisDnatId) {
			this.uisDnatId = uisDnatId;
		}

		public String getDestinationIp() {
			return this.destinationIp;
		}

		public void setDestinationIp(String destinationIp) {
			this.destinationIp = destinationIp;
		}

		public Integer getDestinationPort() {
			return this.destinationPort;
		}

		public void setDestinationPort(Integer destinationPort) {
			this.destinationPort = destinationPort;
		}

		public String getOriginalIp() {
			return this.originalIp;
		}

		public void setOriginalIp(String originalIp) {
			this.originalIp = originalIp;
		}

		public Integer getOriginalPort() {
			return this.originalPort;
		}

		public void setOriginalPort(Integer originalPort) {
			this.originalPort = originalPort;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}
	}

	@Override
	public DescribeDnatEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnatEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
